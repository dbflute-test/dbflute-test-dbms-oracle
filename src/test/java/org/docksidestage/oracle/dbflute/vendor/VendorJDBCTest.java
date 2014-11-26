package org.docksidestage.oracle.dbflute.vendor;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.dbflute.bhv.proposal.callback.SimpleTraceableSqlStringFilter;
import org.dbflute.bhv.proposal.callback.TraceableSqlAdditionalInfoProvider;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.CDef;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.oracle.dbflute.cbean.MemberCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberBhv;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.oracle.dbflute.exentity.Member;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4D (2013/06/16 Sunday)
 */
public class VendorJDBCTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Query Timeout
    //                                                                       =============
    public void test_QueryTimeout_insert() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                final long threadId = Thread.currentThread().getId();
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberName("lock");
                    member.setMemberAccount("same");
                    member.setMemberStatusCode_Formalized();
                    memberBhv.insert(member);
                    sleep(5000); // more 2 seconds because of Oracle in VM
                } else {
                    Member member = new Member();
                    member.setMemberName("wait");
                    member.setMemberAccount("same"); // same value to wait for lock
                    member.setMemberStatusCode_Formalized();
                    sleep(1000);
                    memberBhv.varyingInsert(member, op -> op.configure(conf -> conf.queryTimeout(1)));
                }
            }
        }, new CannonballOption().threadCount(2).repeatCount(1).expectExceptionAny("ORA-01013"));
    }

    // ===================================================================================
    //                                                                  First Line Comment 
    //                                                                  ==================
    public void test_FirstLineComment_all_front() throws Exception {
        doTest_FirstLineComment_all(true);
    }

    public void test_FirstLineComment_all_rear() throws Exception {
        doTest_FirstLineComment_all(false);
    }

    protected void doTest_FirstLineComment_all(boolean front) throws Exception {
        // ## Arrange ##
        final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                infoList.add(info);
            }
        });
        Method actionMethod = MemberDbm.getInstance().columnBirthdate().getWriteMethod();
        SimpleTraceableSqlStringFilter filter = new SimpleTraceableSqlStringFilter(actionMethod,
                new TraceableSqlAdditionalInfoProvider() {
                    public String provide() {
                        // {} is NG on Oracle so filtered
                        // ' (single quotation) is NG when update on Oracle (why?)
                        return "marks:{Q*@;+()[]'&%$#\"!\\>=<_^~-|.,}1234567890";
                    }
                }) {

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }
        };
        if (front) {
            filter.markingAtFront();
        }
        CallbackContext.setSqlStringFilterOnThread(filter);

        try {
            // ## Act ##
            {
                MemberCB cb = new MemberCB();
                memberBhv.selectList(cb);
            }
            {
                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentLocalDate());
                memberBhv.updateNonstrict(member);
            }
            {
                MemberCB cb = new MemberCB();
                cb.query().setMemberStatusCode_Equal_Provisional();
                Member member = new Member();
                memberBhv.queryUpdate(member, cb);
            }
            {
                PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();
                pmb.paging(3, 2);
                memberBhv.outsideSql().selectPage(pmb);
            }
            {
                SpInOutParameterPmb spPmb = new SpInOutParameterPmb();
                spPmb.setVInVarchar("foo");
                spPmb.setVInoutVarchar("bar");
                try {
                    memberBhv.outsideSql().call(spPmb);
                    if (front) {
                        fail();
                    }
                } catch (SQLFailureException e) {
                    if (!front) {
                        throw e;
                    }
                    log(e.getMessage());
                }
            }
            // ## Assert ##
        } finally {
            CallbackContext.clearSqlStringFilterOnThread();
        }
    }

    // ===================================================================================
    //                                                                  Plain ENUM Binding
    //                                                                  ==================
    public void test_plain_enum_binding() throws SQLException {
        // ## Arrange ##
        List<Integer> prepared = executeEnumBindSql(CDef.MemberStatus.Formalized.code());
        assertFalse(prepared.isEmpty());
        log(prepared);

        // ## Act ##
        try {
            executeEnumBindSql(TestPlainStatus.FML);

            // ## Assert ##
            fail();
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        }
    }

    private List<Integer> executeEnumBindSql(Object value) throws SQLException {
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ds.getConnection();
            String sql = "select * from MEMBER where MEMBER_STATUS_CODE = ?";
            log(sql);
            ps = conn.prepareStatement(sql);
            ps.setObject(1, value);
            rs = ps.executeQuery();
            List<Integer> idList = new ArrayList<Integer>();
            while (rs.next()) {
                idList.add(rs.getInt("MEMBER_ID"));
            }
            return idList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static enum TestPlainStatus {
        FML, PRV, WDL
    }

    // ===================================================================================
    //                                                                     Cursor Handling
    //                                                                     ===============
    public void test_insert_in_plainCursor() throws Exception {
        // ## Arrange ##
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps4insert = null;
        ResultSet rs = null;
        try {
            // ## Act ##
            conn = ds.getConnection();
            String selectSql = "select * from MEMBER_STATUS";
            log(selectSql);
            ps = conn.prepareStatement(selectSql);
            rs = ps.executeQuery();
            assertTrue(rs.next());
            assertNotNull(rs.getString("MEMBER_STATUS_NAME"));
            String insertSql = "insert into MEMBER_STATUS values('FOO', 'BAR', 'DES', 999)";
            log(insertSql);
            ps4insert = conn.prepareStatement(insertSql);
            ps4insert.executeUpdate();

            // ## Assert ##
            assertTrue(rs.next());
            assertNotNull(rs.getString("MEMBER_STATUS_NAME"));
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (ps4insert != null) {
                ps4insert.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // ===================================================================================
    //                                                                   PreparedStatement
    //                                                                   =================
    public void test_PreparedStatement_insert() throws Exception {
        // ## Arrange ##
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // ## Act ##
            conn = ds.getConnection();
            conn.setAutoCommit(false);
            StringBuilder sb = new StringBuilder();
            sb.append("insert into MEMBER");
            sb.append(" (MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE");
            sb.append(", FORMALIZED_DATETIME, BIRTHDATE");
            sb.append(", REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS");
            sb.append(", UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO, MEMBER_ID)");
            sb.append(" values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            String sql = sb.toString();
            log(sql);
            ps = conn.prepareStatement(sql);
            ps.setString(1, "JFlute");
            ps.setString(2, "jflute");
            ps.setString(3, "FML");
            ps.setTimestamp(4, DfTypeUtil.toTimestamp("2007/12/01 11:01:10"));
            ps.setTimestamp(5, DfTypeUtil.toTimestamp("1965/03/03"));
            ps.setTimestamp(6, DfTypeUtil.toTimestamp(currentTimestamp()));
            ps.setString(7, "foo");
            ps.setString(8, "bar");
            ps.setTimestamp(9, DfTypeUtil.toTimestamp(currentTimestamp()));
            ps.setString(10, "foo");
            ps.setString(11, "bar");
            ps.setInt(12, 3);
            ps.setInt(13, 99999);

            // ## Assert ##
            ps.execute(); // expect no exception
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                // can be rolled-back without this
                //conn.rollback();
                conn.close();
            }
        }
    }

    public void test_PreparedStatement_bindDate_timeHandling() throws Exception {
        // ## Arrange ##
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ds.getConnection();
            conn.setAutoCommit(false);
            try {
                ps = conn.prepareStatement("update MEMBER set BIRTHDATE = ? where MEMBER_ID = 3");
                ps.setTimestamp(1, DfTypeUtil.toTimestamp("2010/10/20 23:46:57"));
                ps.execute();
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }

            // ## Act ##
            try {
                String sql = "select MEMBER_NAME, BIRTHDATE from MEMBER where MEMBER_ID = 3 and BIRTHDATE < ?";
                ps = conn.prepareStatement(sql);
                long targetMillis = DfTypeUtil.toDate("2010/10/20 23:46:58").getTime();
                {
                    ps.setDate(1, new java.sql.Date(targetMillis));
                    ResultSet rs = ps.executeQuery();

                    // ## Assert ##
                    boolean exists = false;
                    while (rs.next()) {
                        exists = true;
                        log(DfTypeUtil.toString(rs.getDate(2), "yyyy/MM/dd HH:mm:ss.SSS"));
                    }
                    assertFalse(exists);
                }
                {
                    ps.setTimestamp(1, new java.sql.Timestamp(targetMillis));
                    ResultSet rs = ps.executeQuery();

                    // ## Assert ##
                    boolean exists = false;
                    while (rs.next()) {
                        exists = true;
                        String asSqlDate = DfTypeUtil.toString(rs.getDate(2), "yyyy/MM/dd HH:mm:ss.SSS");
                        String asTimestamp = DfTypeUtil.toString(rs.getTimestamp(2), "yyyy/MM/dd HH:mm:ss.SSS");
                        log("get as SqlDate   = " + asSqlDate);
                        log("get as Timestamp = " + asTimestamp);
                        assertEquals("2010/10/20 00:00:00.000", asSqlDate);
                        assertEquals("2010/10/20 23:46:57.000", asTimestamp);
                    }
                    assertTrue(exists);
                }
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } finally {
            if (conn != null) {
                // can be rolled-back without this
                //conn.rollback();
                conn.close();
            }
        }
    }

    // ===================================================================================
    //                                                                   CallableStatement
    //                                                                   =================
    // -----------------------------------------------------
    //                                                 ARRAY
    //                                                 -----
    public void test_CallableStatement_ARRAY_Table_manual_basic() throws Exception {
        // ## Arrange ##
        String typeName = "VARCHAR2_TABLE";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_TABLE_MANUAL_PARAMETER(?, ?)}");
            log(conn.getClass());
            Connection physConn = digUpPhysicalConnection(conn);
            ArrayDescriptor oracleDesc = ArrayDescriptor.createDescriptor(typeName, physConn);
            ARRAY oracleArray = new ARRAY(oracleDesc, physConn, new String[] { "foo", "bar" });
            cs.setObject(1, oracleArray, Types.ARRAY);
            cs.registerOutParameter(2, Types.ARRAY, typeName);

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            assertFalse(executed);
            Array array = cs.getArray(2);
            String[] realArray = (String[]) ((oracle.sql.ARRAY) array).getArray();
            List<String> realList = Arrays.asList(realArray);
            log(realList);
            assertEquals(Arrays.asList("foo", "bar"), realList);
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    public void test_CallableStatement_ARRAY_Table_manual_null() throws Exception {
        // ## Arrange ##
        String typeName = "VARCHAR2_TABLE";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_TABLE_MANUAL_PARAMETER(?, ?)}");
            cs.setNull(1, Types.ARRAY, typeName);
            cs.registerOutParameter(2, Types.ARRAY, typeName);

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            assertFalse(executed);
            Array array = cs.getArray(2);
            assertNull(array);
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    public void test_CallableStatement_ARRAY_Table_packed() throws Exception {
        // ## Arrange ##
        String typeName = "NUMBER_TABLE";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_TABLE_PACKED_PARAMETER(?, ?)}");
            Connection physConn = digUpPhysicalConnection(conn);
            try {
                ArrayDescriptor oracleDesc = ArrayDescriptor.createDescriptor(typeName, physConn);
                fail("oracleDesc=" + oracleDesc);
            } catch (SQLException e) {
                // Why?
                log(e.getMessage());
            }
            //            ARRAY oracleArray = new ARRAY(oracleDesc, physConn, new Integer[] { 1, 2 });
            //            cs.setObject(1, oracleArray, Types.ARRAY);
            //            cs.registerOutParameter(2, Types.ARRAY, typeName);
            //
            //            // ## Act ##
            //            boolean executed = cs.execute();
            //
            //            // ## Assert ##
            //            assertFalse(executed);
            //            Array array = cs.getArray(2);
            //            String[] realArray = (String[]) ((oracle.sql.ARRAY) array).getArray();
            //            List<String> realList = Arrays.asList(realArray);
            //            log(realList);
            //            assertEquals(Arrays.asList(1, 2), realList);
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    public void test_CallableStatement_ARRAY_Table_various_clob() throws Exception {
        // ## Arrange ##
        String typeName = "CLOB_TABLE";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_TABLE_VARIOUS_PARAMETER(?, ?)}");
            Connection physConn = digUpPhysicalConnection(conn);
            ArrayDescriptor oracleDesc = ArrayDescriptor.createDescriptor(typeName, physConn);
            try {
                ARRAY oracleArray = new ARRAY(oracleDesc, physConn, new String[] { "foo", "bar" });

                fail("oracleArray=" + oracleArray);
            } catch (SQLException e) {
                // Why?
                log(e.getMessage());
            }
            //            cs.setObject(1, oracleArray, Types.ARRAY);
            //            cs.registerOutParameter(2, Types.ARRAY, typeName);
            //
            //            // ## Act ##
            //            boolean executed = cs.execute();
            //
            //            // ## Assert ##
            //            assertFalse(executed);
            //            Array array = cs.getArray(2);
            //            String[] realArray = (String[]) ((oracle.sql.ARRAY) array).getArray();
            //            List<String> realList = Arrays.asList(realArray);
            //            log(realList);
            //            assertEquals(Arrays.asList("foo", "bar"), realList);
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    // -----------------------------------------------------
    //                                                STRUCT
    //                                                ------
    public void test_CallableStatement_STRUCT_next_basic() throws Exception {
        // ## Arrange ##
        String typeName = "NEWURAYASUDB.NEXT_FOO_BEAN";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_STRUCT_NEXT_PARAMETER(?, ?)}");
            Connection physConn = digUpPhysicalConnection(conn);
            StructDescriptor oracleDesc = StructDescriptor.createDescriptor(typeName, physConn);
            Object[] attrs = new Object[] { 1, "next", new BigDecimal("2.3"), null, null, null };
            STRUCT oracleStruct = new STRUCT(oracleDesc, physConn, attrs);
            cs.setObject(1, oracleStruct, Types.STRUCT);
            cs.registerOutParameter(2, Types.STRUCT, typeName);

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            assertFalse(executed);
            Object obj = cs.getObject(2);
            Object[] actualAttrs = (Object[]) ((STRUCT) obj).getAttributes();
            List<Object> actualList = Arrays.asList(actualAttrs);
            log(actualList);
            assertEquals("next", actualList.get(1));
            assertEquals("2.3", actualList.get(2).toString());
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    public void test_CallableStatement_STRUCT_synonym_basic() throws Exception {
        // ## Arrange ##
        String typeName = "SYNONYM_FOO_BEAN";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_STRUCT_SYNONYM_PARAMETER(?, ?)}");
            Connection physConn = digUpPhysicalConnection(conn);
            StructDescriptor oracleDesc = StructDescriptor.createDescriptor(typeName, physConn);
            Object[] attrs = new Object[] { 1, "synonym", new BigDecimal("2.3"), null, null, null };
            STRUCT oracleStruct = new STRUCT(oracleDesc, physConn, attrs);
            cs.setObject(1, oracleStruct, Types.STRUCT);
            cs.registerOutParameter(2, Types.STRUCT, typeName);

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            assertFalse(executed);
            Object obj = cs.getObject(2);
            Object[] actualAttrs = (Object[]) ((STRUCT) obj).getAttributes();
            List<Object> actualList = Arrays.asList(actualAttrs);
            log(actualList);
            assertEquals("synonym", actualList.get(1));
            assertEquals("2.3", actualList.get(2).toString());
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    // -----------------------------------------------------
    //                                          Strange CHAR
    //                                          ------------
    public void test_CallableStatement_charParameterEscapeProblem_escape() throws Exception {
        // ## Arrange ##
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_ORACLE_CHAR_INOUT_PARAMETER(?)}");
            cs.registerOutParameter(1, Types.VARCHAR); // varchar OK
            cs.setObject(1, "0");

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            fail("executed=" + executed);
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    public void test_CallableStatement_charParameterEscapeProblem_notEscape() throws Exception {
        // ## Arrange ##
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("call SP_ORACLE_CHAR_INOUT_PARAMETER(?)");
            cs.registerOutParameter(1, Types.VARCHAR); // varchar OK
            cs.setObject(1, "0");

            // ## Act ##
            boolean executed = cs.execute();

            // ## Assert ##
            log("executed = " + executed);
            String parameter = cs.getString(1);
            log("parameter = " + parameter);
        } finally {
            closeResource(rs, cs, conn);
        }
    }

    // ===================================================================================
    //                                                                           ResultSet
    //                                                                           =========
    public void test_ResultSet_defaultResultSetType() throws SQLException {
        String sql = "select * from VENDOR_CHECK";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int resultSetType = rs.getType();
            log("/* * * * * * * * * * * * * * * * * *");
            if (resultSetType == ResultSet.TYPE_FORWARD_ONLY) {
                log("resultSetType=TYPE_FORWARD_ONLY");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_INSENSITIVE) {
                log("resultSetType=TYPE_SCROLL_INSENSITIVE");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_SENSITIVE) {
                log("resultSetType=TYPE_SCROLL_SENSITIVE");
            } else {
                log("resultSetType=UNKNOWN:" + resultSetType);
            }
            log("* * * * * * * * * */");
            assertEquals(ResultSet.TYPE_FORWARD_ONLY, resultSetType);
        } finally {
            closeResource(rs, st, conn);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void closeResource(ResultSet rs, Statement st, Connection conn) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
