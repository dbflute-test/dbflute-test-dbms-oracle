package org.docksidestage.oracle.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.DfTypeUtil;
import org.dbflute.util.Srl;
import org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.VendorCheckDbm;
import org.docksidestage.oracle.dbflute.cbean.MemberCB;
import org.docksidestage.oracle.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.oracle.dbflute.cbean.PurchaseCB;
import org.docksidestage.oracle.dbflute.cbean.VendorCheckCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.oracle.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.CompareDatePmb;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import org.docksidestage.oracle.dbflute.exentity.Member;
import org.docksidestage.oracle.dbflute.exentity.MemberWithdrawal;
import org.docksidestage.oracle.dbflute.exentity.Purchase;
import org.docksidestage.oracle.dbflute.exentity.VendorCheck;
import org.docksidestage.oracle.dbflute.exentity.customize.SimpleVendorCheck;
import org.docksidestage.oracle.dbflute.exentity.customize.VendorCheckDecimalSum;
import org.docksidestage.oracle.dbflute.exentity.customize.VendorCheckIntegerSum;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorDataTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private DataSource dataSource;

    // ===================================================================================
    //                                                                         String Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                  CLOB
    //                                                  ----
    public void test_CLOB_largeSize() {
        // ## Arrange ##
        MemberWithdrawal withdrawal = new MemberWithdrawal();
        withdrawal.setMemberId(3);
        withdrawal.setWithdrawalDatetime(currentLocalDateTime());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("1234567890");
        }
        withdrawal.setWithdrawalReasonInputText(sb.toString());
        memberWithdrawalBhv.insertOrUpdateNonstrict(withdrawal);

        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        MemberWithdrawal actualWithdrawal = memberWithdrawalBhv.selectEntity(cb).get();

        // ## Assert ##
        assertNotNull(actualWithdrawal);
        String actualText = actualWithdrawal.getWithdrawalReasonInputText();
        assertNotNull(actualText);
        assertEquals(sb.toString().length(), actualText.length());
    }

    public void test_CLOB_union_unsupported_at_Oracle() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.union(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        try {
            // ## Act ##
            memberWithdrawalBhv.selectList(cb);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_CLOB_union_resolved_by_myselfInScopeSubQuery() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.query().myselfExists(new SubQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB subCB) {
                subCB.useInScopeSubQuery();
                subCB.union(new UnionQuery<MemberWithdrawalCB>() {
                    public void query(MemberWithdrawalCB unionCB) {
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    public void test_CLOB_unionAll() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.unionAll(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    public void test_NCLOB_largeSize() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("1234567890");
        }
        vendorCheck.setTypeOfNclob(sb.toString());
        vendorCheckBhv.insert(vendorCheck);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();

        // ## Assert ##
        assertNotNull(actual);
        String actualText = actual.getTypeOfNclob();
        assertNotNull(actualText);
        assertEquals(sb.toString().length(), actualText.length());
    }

    // -----------------------------------------------------
    //                                                  LONG
    //                                                  ----
    public void test_LONG_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfLong("test");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("test", actual.getTypeOfLong());
        //try {
        //    vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        //
        //    // LONG column should be accessed first in selected columns on JDBC process 
        //    fail("LONG should be unsupported!");
        //} catch (SQLFailureException e) {
        //    // OK
        //    log(e.getMessage());
        //}
    }

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========
    public void test_NUMBER_AutoMapping_DomainEntity() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();

        // ## Act & Assert ##
        final Integer typeOfNumberInteger = vendorCheck.getTypeOfNumberInteger();
        final Long typeOfNumberBigint = vendorCheck.getTypeOfNumberBigint();
        final BigDecimal typeOfNumberDecimal = vendorCheck.getTypeOfNumberDecimal();
        final Integer typeOfNumberIntegerMin = vendorCheck.getTypeOfNumberIntegerMin();
        final Integer typeOfNumberIntegerMax = vendorCheck.getTypeOfNumberIntegerMax();
        final Long typeOfNumberBigintMin = vendorCheck.getTypeOfNumberBigintMin();
        final Long typeOfNumberBigintMax = vendorCheck.getTypeOfNumberBigintMax();
        final BigDecimal typeOfNumberSuperintMin = vendorCheck.getTypeOfNumberSuperintMin();
        final BigDecimal typeOfNumberSuperintMax = vendorCheck.getTypeOfNumberSuperintMax();
        assertNull(typeOfNumberBigint);
        assertNull(typeOfNumberInteger);
        assertNull(typeOfNumberDecimal);
        assertNull(typeOfNumberIntegerMin);
        assertNull(typeOfNumberIntegerMax);
        assertNull(typeOfNumberBigintMin);
        assertNull(typeOfNumberBigintMax);
        assertNull(typeOfNumberSuperintMin);
        assertNull(typeOfNumberSuperintMax);
    }

    public void test_NUMBER_AutoMapping_CustomizeEntity() throws Exception {
        // ## Arrange ##
        SimpleVendorCheck vendorCheck = new SimpleVendorCheck();

        // ## Act & Assert ##
        final Integer typeOfNumberInteger = vendorCheck.getTypeOfNumberInteger();
        final Long typeOfNumberBigint = vendorCheck.getTypeOfNumberBigint();
        final BigDecimal typeOfNumberDecimal = vendorCheck.getTypeOfNumberDecimal();
        final Integer typeOfNumberIntegerMin = vendorCheck.getTypeOfNumberIntegerMin();
        final Integer typeOfNumberIntegerMax = vendorCheck.getTypeOfNumberIntegerMax();
        final Long typeOfNumberBigintMin = vendorCheck.getTypeOfNumberBigintMin();
        final Long typeOfNumberBigintMax = vendorCheck.getTypeOfNumberBigintMax();
        final BigDecimal typeOfNumberSuperintMin = vendorCheck.getTypeOfNumberSuperintMin();
        final BigDecimal typeOfNumberSuperintMax = vendorCheck.getTypeOfNumberSuperintMax();
        assertNull(typeOfNumberBigint);
        assertNull(typeOfNumberInteger);
        assertNull(typeOfNumberDecimal);
        assertNull(typeOfNumberIntegerMin);
        assertNull(typeOfNumberIntegerMax);
        assertNull(typeOfNumberBigintMin);
        assertNull(typeOfNumberBigintMax);
        assertNull(typeOfNumberSuperintMin);
        assertNull(typeOfNumberSuperintMax);
    }

    public void test_Generate_DecimalDigit_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnDecimalDigit = VendorCheckDbm.getInstance().columnTypeOfNumberDecimal();

        // ## Act ##
        final Integer columnSize = columnDecimalDigit.getColumnSize();
        final Integer columnDecimalDigits = columnDecimalDigit.getDecimalDigits();
        final Class<?> propertyType = columnDecimalDigit.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnDecimalDigits);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberDecimal().getPropertyAccessType(), propertyType);
        final BigDecimal decimalDigit = new VendorCheck().getTypeOfNumberDecimal();
        assertNull(decimalDigit);
    }

    public void test_Generate_TypeOfNumberInteger_is_Integer() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberInteger = VendorCheckDbm.getInstance().columnTypeOfNumberInteger();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberInteger.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberInteger.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberInteger.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberInteger);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberInteger().getPropertyAccessType(), propertyType);
        final Integer integerNonDigit = new VendorCheck().getTypeOfNumberInteger();
        assertNull(integerNonDigit);
    }

    public void test_Generate_TypeOfNumberBigint_is_Long() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberBigint = VendorCheckDbm.getInstance().columnTypeOfNumberBigint();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberBigint.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberBigint.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberBigint.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberBigint);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberBigint().getPropertyAccessType(), propertyType);
        final Long bigintNonDigit = new VendorCheck().getTypeOfNumberBigint();
        assertNull(bigintNonDigit);
    }

    public void test_Generate_TypeOfNumberSuperint_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberSuperint = VendorCheckDbm.getInstance().columnTypeOfNumberSuperintMax();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberSuperint.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberSuperint.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberSuperint.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberSuperint);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberSuperintMax().getPropertyAccessType(), propertyType);
        final BigDecimal bigintNonDigit = new VendorCheck().getTypeOfNumberSuperintMax();
        assertNull(bigintNonDigit);
    }

    public void test_Sql2Entity_DecimalDigit_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnDecimalDigit = SimpleVendorCheckDbm.getInstance().columnTypeOfNumberDecimal();

        // ## Act ##
        final Integer columnSize = columnDecimalDigit.getColumnSize();
        final Integer columnDecimalDigits = columnDecimalDigit.getDecimalDigits();
        final Class<?> propertyType = columnDecimalDigit.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnDecimalDigits);
        assertEquals(VendorCheckDbm.getInstance().columnTypeOfNumberDecimal().getPropertyAccessType(), propertyType);
        final BigDecimal decimalDigit = new SimpleVendorCheck().getTypeOfNumberDecimal();
        assertNull(decimalDigit);
    }

    public void test_Sql2Entity_TypeOfNumberInteger_is_Integer() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberInteger = SimpleVendorCheckDbm.getInstance().columnTypeOfNumberInteger();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberInteger.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberInteger.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberInteger.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberInteger);
        assertEquals(VendorCheckDbm.getInstance().columnTypeOfNumberInteger().getPropertyAccessType(), propertyType);
        final Integer integerNonDigit = new SimpleVendorCheck().getTypeOfNumberInteger();
        assertNull(integerNonDigit);
    }

    public void test_Sql2Entity_Selectable() throws Exception {
        // ## Arrange ##
        deleteAll();
        final VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        final BigDecimal expectedDecimalDigit = new BigDecimal("12.345");
        vendorCheck.setTypeOfNumberDecimal(expectedDecimalDigit);
        final Integer expectedTypeOfNumberInteger = 3;
        vendorCheck.setTypeOfNumberInteger(expectedTypeOfNumberInteger);
        vendorCheck.setTypeOfClob("test");
        vendorCheckBhv.insert(vendorCheck);

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectSimpleVendorCheck;
        final Class<SimpleVendorCheck> entityType = SimpleVendorCheck.class;

        // ## Act ##
        final SimpleVendorCheck entity = vendorCheckBhv.outsideSql().traditionalStyle().selectEntity(path, null, entityType).get();

        // ## Assert ##
        final BigDecimal actualDecimalDigit = entity.getTypeOfNumberDecimal();
        final Integer actualTypeOfNumberInteger = entity.getTypeOfNumberInteger();
        log("Selected decimalDigit is " + actualDecimalDigit);
        log("Selected integerNonDigit is " + actualTypeOfNumberInteger);
        assertNotNull(actualDecimalDigit);
        assertEquals(expectedDecimalDigit, actualDecimalDigit);
        assertEquals(expectedTypeOfNumberInteger, actualTypeOfNumberInteger);
    }

    public void test_Sql2Entity_IntegerSum() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckIntegerSum;
        final Class<VendorCheckIntegerSum> entityType = VendorCheckIntegerSum.class;

        // ## Act ##
        final VendorCheckIntegerSum sum = vendorCheckBhv.outsideSql().traditionalStyle().selectEntity(path, null, entityType).get();

        // ## Assert ##
        assertNotNull(sum);
        log("sum.getTypeOfNumberIntegerSum()=" + sum.getIntegerNonDigitSum());
        assertNotNull(sum.getIntegerNonDigitSum());
        BigDecimal actual = sum.getIntegerNonDigitSum();
        assertEquals(new BigDecimal("12"), actual);
    }

    public void test_Sql2Entity_DecimalSum() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckDecimalSum;
        final Class<VendorCheckDecimalSum> entityType = VendorCheckDecimalSum.class;

        // ## Act ##
        final VendorCheckDecimalSum sum = vendorCheckBhv.outsideSql().traditionalStyle().selectEntity(path, null, entityType).get();

        // ## Assert ##
        assertNotNull(sum);
        log("sum.getDecimalDigitSum()=" + sum.getDecimalDigitSum());
        assertNotNull(sum.getDecimalDigitSum());

        BigDecimal actual = sum.getDecimalDigitSum();
        assertEquals(new BigDecimal("70.701"), actual);
    }

    public void test_Sql2Entity_DecimalSum_byDirectType() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckDecimalSum;
        final Class<BigDecimal> entityType = BigDecimal.class;

        // ## Act ##
        final BigDecimal sum = vendorCheckBhv.outsideSql().traditionalStyle().selectEntity(path, null, entityType).get();

        // ## Assert ##
        assertNotNull(sum);
        log("sum=" + sum);
        assertEquals(new BigDecimal("70.701"), sum);
    }

    public void test_OracleDateColumn() throws Exception {
        Class<?> type = VendorCheckDbm.getInstance().columnTypeOfDate().getPropertyAccessType();
        assertEquals(LocalDate.class, type);
    }

    protected void deleteAll() {
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), op -> op.allowNonQueryDelete());
    }

    protected void registerSimpleTestData() {
        deleteAll();
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99991L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("12.345"));
            vendorCheck.setTypeOfNumberInteger(3);
            vendorCheck.setTypeOfClob("test1");
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99992L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("23.567"));
            vendorCheck.setTypeOfNumberInteger(4);
            vendorCheck.setTypeOfClob("test2");
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99993L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("34.789"));
            vendorCheck.setTypeOfNumberInteger(5);
            vendorCheck.setTypeOfClob("test3");
            vendorCheckBhv.insert(vendorCheck);
        }
    }

    public void test_PreparedStatement_with_DifferenceType() throws Exception {
        // ## Arrange ##
        registerDigitTestData();

        final String sql = "select * from VENDOR_CHECK where TYPE_OF_NUMBER_DECIMAL > ?";
        final Connection conn = dataSource.getConnection();
        final PreparedStatement ps = conn.prepareStatement(sql);

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // DECIMAL_DIGIT is BigDecimal but it uses setString() of PreparedStatement!
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        ps.setString(1, "2");
        // ps.setBigDecimal(1 ,new BigDecimal("1"));

        // ## Act ##
        log(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String id = rs.getString("VENDOR_CHECK_ID");
            String digit = rs.getString("TYPE_OF_NUMBER_DECIMAL");
            log("VENDOR_CHECK_ID=" + id + ", TYPE_OF_NUMBER_DECIMAL=" + digit);
        }
    }

    protected void registerDigitTestData() {
        deleteAll();
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(999L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal(1));
            vendorCheck.setTypeOfNumberInteger(2);
            vendorCheck.setTypeOfDate(currentLocalDate());
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(9999L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal(3));
            vendorCheck.setTypeOfNumberInteger(22);
            vendorCheck.setTypeOfDate(currentLocalDate());
            vendorCheckBhv.insert(vendorCheck);
        }
    }

    public void test_Timestamp_Millisecond() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            LocalDateTime purchaseDatetime = purchase.getPurchaseDatetime();
            log(purchase.getProductId(), purchaseDatetime);
            Integer millis = toInteger(toString(purchaseDatetime, "SSS"));
            if (millis > 0) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                                BINARY
    //                                                ------
    public void test_BINARY_FLOAT_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBinaryFloat("123.45");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals(vendorCheck.getTypeOfBinaryFloat(), actual.getTypeOfBinaryFloat());
    }

    public void test_BINARY_DOUBLE_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBinaryDouble("123.45");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("123.45", actual.getTypeOfBinaryDouble());
    }

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    public void test_DATE_HHmmss_conditionBean() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        Member member = new Member();
        member.setMemberId(3);
        LocalDate targetDate = toLocalDate(cal);
        member.setBirthdate(targetDate);
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57); // plus one second
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);
            assertEquals(targetDate, actual.getBirthdate());
            // treated as date
            //try {
            //    memberBhv.selectEntityWithDeletedCheck(cb);
            //    // ## Assert ##
            //    fail();
            //} catch (EntityAlreadyDeletedException e) {
            //    // OK
            //    // Because Oracle Date type have time parts. 
            //}
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);
            assertEquals(targetDate, actual.getBirthdate());
            // treated as date
            //try {
            //    memberBhv.selectEntityWithDeletedCheck(cb);
            //    // ## Assert ##
            //    fail();
            //} catch (EntityAlreadyDeletedException e) {
            //    // OK
            //    // Because java.sql.Date is converted to java.util.Date in ConditionBean. 
            //}
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);
            assertEquals(targetDate, actual.getBirthdate());
            // treated as date
            //try {
            //    memberBhv.selectEntityWithDeletedCheck(cb);
            //    // ## Assert ##
            //    fail();
            //} catch (EntityAlreadyDeletedException e) {
            //    // OK
            //    // Because Oracle Date type have time parts. 
            //}
        }
        cal.set(2008, 5, 15, 12, 34, 56); // just time
        cal.set(Calendar.MILLISECOND, 0); // Don't format!
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(targetDate);

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
    }

    public void test_DATE_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        LocalDate targetDate = toLocalDate(cal);
        member.setBirthdate(targetDate);
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 12, 34, 56);
        pmb.setBirthdateFrom(targetDate);

        Class<Member> entityType = Member.class;

        // ## Act ##
        {
            Member actual = memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();
            assertEquals(targetDate, actual.getBirthdate());
        }
        // treated as date
        //try {
        //    memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();
        //
        //    // ## Assert ##
        //    fail();
        //} catch (EntityAlreadyDeletedException e) {
        //    // OK
        //    // Because Oracle Date type have time parts. 
        //}
        cal.set(9001, 5, 15, 0, 0, 0); // just time
        {
            pmb.setBirthdateFrom(targetDate);

            // ## Act ##
            Member actual = memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("9001/06/15", formatted);
        }
    }

    public void test_DATE_selectPureDate() { // *Important!
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            LocalDate birthdate = member.getBirthdate();
            assertTrue(LocalDate.class.equals(birthdate.getClass()));
            assertTrue(birthdate instanceof LocalDate);
        }
    }

    public void test_DATE_SqlDate_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        LocalDate targetDate = toLocalDate(cal);
        member.setBirthdate(targetDate);
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(targetDate);

        Class<Member> entityType = Member.class;

        // ## Act ##
        {
            Member actual = memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();
            assertEquals(targetDate, actual.getBirthdate());
        }
        //try {
        //    memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();
        //
        //    // ## Assert ##
        //    fail();
        //} catch (EntityAlreadyDeletedException e) {
        //    // OK
        //    // Because Oracle Date type have time parts. 
        //}
        cal.set(9001, 5, 15, 12, 34, 56); // just time
        {
            pmb.setBirthdateFrom(targetDate);

            // ## Act ##
            Member actual = memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("9001/06/15", formatted);
        }
    }

    // -----------------------------------------------------
    //                                               DATE BC
    //                                               -------
    public void test_DATE_BC_date() {
        // ## Arrange ##
        Member member = memberBhv.selectEntity(cb -> {
            cb.query().setBirthdate_IsNotNull();
            cb.fetchFirst(1);
            cb.addOrderBy_PK_Asc();
        }).get();
        member.setBirthdate(toLocalDate("BC1234/12/25"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPK(member.getMemberId()).get();
        LocalDate birthdate = actual.getBirthdate();
        log(birthdate, birthdate.getYear(), birthdate.getMonth(), birthdate.getDayOfMonth());
        assertTrue(DfTypeUtil.isDateBC(toUtilDate(birthdate))); // can handle BC date
        String formatted = toString(birthdate, "yyyy/MM/dd");
        assertEquals("1235/12/25", formatted); // 1235? why?
    }

    public void test_DATE_BC_datetime() {
        // ## Arrange ##
        Member member = memberBhv.selectEntity(cb -> {
            cb.query().setFormalizedDatetime_IsNotNull();
            cb.fetchFirst(1);
            cb.addOrderBy_PK_Asc();
        }).get();
        member.setFormalizedDatetime(toLocalDateTime("BC1234/12/25 12:34:56.147"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPK(member.getMemberId()).get();
        LocalDateTime formalizedDatetime = actual.getFormalizedDatetime();
        log(formalizedDatetime);
        assertTrue(DfTypeUtil.isDateBC(toUtilDate(formalizedDatetime))); // can handle BC date
        String formatted = toString(formalizedDatetime, "yyyy/MM/dd");
        assertEquals("1235/12/25", formatted); // 1235 why?
    }

    public void test_BC_test_JDBC_direct() {
        final Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(1, 0, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long beforeMillis = cal.getTimeInMillis() - 1L;
        Timestamp expected = new Timestamp(beforeMillis);
        Connection conn = null;
        PreparedStatement psUpdate = null;
        PreparedStatement psSelect = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            psUpdate = conn.prepareStatement("update MEMBER set BIRTHDATE = ? where MEMBER_ID = 3");
            psUpdate.setTimestamp(1, expected);
            psUpdate.executeUpdate();

            psSelect = conn.prepareStatement("select * from MEMBER where MEMBER_ID = 3");
            rs = psSelect.executeQuery();
            rs.next();
            Timestamp actual = rs.getTimestamp("BIRTHDATE");
            log(actual);
            log("expected time = " + expected.getTime());
            log("actual   time = " + actual.getTime());
            assertNotSame(expected.getTime(), actual.getTime()); // Oops!?
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignored) {}
            }
        }
    }

    // -----------------------------------------------------
    //                                           Oracle Date
    //                                           -----------
    public void test_Oracle_Date_HHmmss() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57);
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_LessThan(toLocalDate(cal));
            try {
                memberBhv.selectEntityWithDeletedCheck(cb);
                fail();
            } catch (EntityAlreadyDeletedException e) {
                log(e.getMessage());
            }
            // treated as date
            //// ## Assert ##
            //LocalDate actualValue = actual.getBirthdate();
            //String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            //log("actualValue = " + formatted);
            //assertEquals("2008/06/15 12:34:56.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_LessThan(toLocalDate(cal));
            try {
                memberBhv.selectEntityWithDeletedCheck(cb);
                fail();
            } catch (EntityAlreadyDeletedException e) {
                log(e.getMessage());
            }
            // treated as date
            //// ## Assert ##
            //LocalDate actualValue = actual.getBirthdate();
            //String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            //log("actualValue = " + formatted);
            //assertEquals("2008/06/15 12:34:56.000", formatted);
        }
    }

    public void test_Oracle_Timestamp_FromToByDate_HHmmss() {
        // ## Arrange ##
        final VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfNumberDecimal(new BigDecimal("12.345"));
        vendorCheck.setTypeOfNumberInteger(3);
        vendorCheck.setTypeOfClob("test1");
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        vendorCheck.setTypeOfTimestamp(toLocalDateTime(cal));
        vendorCheckBhv.insert(vendorCheck);

        // ## Act ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cal.set(2008, 5, 15, 12, 34, 55);
        LocalDateTime fromDate = toLocalDateTime(cal);
        cal.set(2008, 5, 15, 12, 34, 57);
        LocalDateTime toDate = toLocalDateTime(cal);
        cb.query().setTypeOfTimestamp_FromTo(fromDate, toDate, op -> op.greaterThan().lessThan());
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String formatted = DfTypeUtil.toString(actual.getTypeOfTimestamp(), "yyyy/MM/dd HH:mm:ss.SSS");
        log("actualValue = " + formatted);
        assertEquals("2008/06/15 12:34:56.123", formatted);
    }

    public void test_Oracle_Date_GreaterEqual() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0); // *Required!
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(toLocalDate(cal));
            memberBhv.selectEntityWithDeletedCheck(cb);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(toLocalDate(cal));
            memberBhv.selectEntityWithDeletedCheck(cb);
        }
    }

    public void test_pmbcheck_selectCompareDate_Date() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0); // *Required!
        pmb.setBirthdateFrom(toLocalDate(cal));

        Class<Member> entityType = Member.class;

        // ## Act ##
        List<Member> memberList = memberBhv.outsideSql().traditionalStyle().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member actual : memberList) {
            log(actual.getMemberName() + " : " + actual.getBirthdate());
        }
    }

    // -----------------------------------------------------
    //                                              INTERVAL
    //                                              --------
    public void test_INTERVAL_YEAR_TO_MONTH_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfIntervalYearToMonth("32-10");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("32-10", actual.getTypeOfIntervalYearToMonth());
    }

    public void test_INTERVAL_DAY_TO_SECOND_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfIntervalDayToSecond("1 0:0:1.0");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("1 0:0:1.0", actual.getTypeOfIntervalDayToSecond());
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                 BFILE
    //                                                 -----
    // mapping to Object type, unsupported yet
    //public void test_BFILE_procedure_basic() {
    //    // ## Arrange ##
    //    SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
    //    pmb.setVInVarchar("foo");
    //    pmb.setVOutNvarchar("bar");
    //    pmb.setVOutChar("baz");
    //    StringBuilder sb = new StringBuilder();
    //    for (int i = 0; i < 10; i++) {
    //        sb.append("0123456789");
    //    }
    //    byte[] largeBytes = serialize(sb.toString());
    //    pmb.setVvvvInBfile(largeBytes);
    //
    //    // ## Act ##
    //    vendorCheckBhv.outsideSql().call(pmb);
    //
    //    // ## Assert ##
    //    byte[] selectedBytes = pmb.getVvvvOutBfile();
    //    assertNotNull(selectedBytes);
    //    log("selectedBytes.length:{}", selectedBytes.length);
    //    String deserialized = (String) deserialize(selectedBytes);
    //    log("deserialized={}", Srl.cut(deserialized, 1000));
    //    assertEquals(sb.length(), deserialized.length());
    //}

    // -----------------------------------------------------
    //                                                  BLOB
    //                                                  ----
    public void test_BLOB_insert_select_basic() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPK(3).get();
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBlob(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfBlob();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    public void test_BLOB_insert_select_large_handling() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        StringBuilder sb = new StringBuilder();
        // large style
        //for (int i = 0; i < 10000000; i++) {
        for (int i = 0; i < 4000; i++) {
            sb.append("0123456789");
        }
        byte[] largeBytes = serialize(sb.toString());
        vendorCheck.setTypeOfBlob(largeBytes);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] selectedBytes = selected.getTypeOfBlob();
        assertNotNull(selectedBytes);
        log("selectedBytes.length:{}", selectedBytes.length);
        String deserialized = (String) deserialize(selectedBytes);
        log("deserialized={}", Srl.cut(deserialized, 1000));
        assertEquals(sb.length(), deserialized.length());
    }

    public void test_BLOB_procedure_large_handling() {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutNvarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3277; i++) { // border is 32kb if BinaryType
            sb.append("0123456789");
        }
        byte[] largeBytes = serialize(sb.toString());
        pmb.setVvvvInBlob(largeBytes);

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        byte[] selectedBytes = pmb.getVvvvOutBlob();
        assertNotNull(selectedBytes);
        log("selectedBytes.length:{}", selectedBytes.length);
        String deserialized = (String) deserialize(selectedBytes);
        log("deserialized={}", Srl.cut(deserialized, 1000));
        assertEquals(sb.length(), deserialized.length());
    }

    // -----------------------------------------------------
    //                                                  RAW
    //                                                 -----
    public void test_RAW_procedure() {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutNvarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) { // cannot large data for data type specification...?
            sb.append("0123456789");
        }
        byte[] largeBytes = serialize(sb.toString());
        pmb.setVvvvInRaw(largeBytes);

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        byte[] selectedBytes = pmb.getVvvvOutRaw();
        assertNotNull(selectedBytes);
        log("selectedBytes.length:{}", selectedBytes.length);
        String deserialized = (String) deserialize(selectedBytes);
        log("deserialized={}", Srl.cut(deserialized, 1000));
        assertEquals(sb.length(), deserialized.length());
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    public void test_ROWID_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfRowid("123456789012345678");

        // ## Act ##
        try {
            vendorCheckBhv.insert(vendorCheck);

            // ## Assert ##
            fail("Now unsupported");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                         SUM(function)
    //                                         -------------
    @SuppressWarnings("unused")
    public void test_SUM_of_function() throws Exception {
        {
            VendorCheckDecimalSum vendorCheck = new VendorCheckDecimalSum();
            BigDecimal decimalDigit = vendorCheck.getDecimalDigitSum();
        }
        {
            VendorCheckIntegerSum vendorCheck = new VendorCheckIntegerSum();
            BigDecimal integerNonDigit = vendorCheck.getIntegerNonDigitSum();
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected VendorCheck createVendorCheck() {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        return vendorCheck;
    }

    protected VendorCheck createVendorCheck(Integer id) {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(id));
        return vendorCheck;
    }

    protected byte[] serialize(Serializable obj) {
        return DfTypeUtil.toBinary(obj);
    }

    protected Serializable deserialize(byte[] bytes) {
        return DfTypeUtil.toSerializable(bytes);
    }
}
