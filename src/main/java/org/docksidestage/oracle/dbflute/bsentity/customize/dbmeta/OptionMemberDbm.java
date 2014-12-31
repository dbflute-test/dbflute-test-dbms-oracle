package org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of OptionMember. (Singleton)
 * @author oracleman
 */
public class OptionMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OptionMemberDbm _instance = new OptionMemberDbm();
    private OptionMemberDbm() {}
    public static OptionMemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberId(), (et, vl) -> ((OptionMember)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberName(), (et, vl) -> ((OptionMember)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getBirthdate(), (et, vl) -> ((OptionMember)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((OptionMember)et).getFormalizedDatetime(), (et, vl) -> ((OptionMember)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((OptionMember)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((OptionMember)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusName(), (et, vl) -> ((OptionMember)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getStatusDisplayOrder(), (et, vl) -> ((OptionMember)et).setStatusDisplayOrder(cti(vl)), "statusDisplayOrder");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyFlg(), (et, vl) -> {
            ColumnInfo col = columnDummyFlg();
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((OptionMember)et).setDummyFlgAsFlg(cls);
            } else {
                ((OptionMember)et).mynativeMappingDummyFlg(ctn(vl, java.math.BigDecimal.class));
            }
        }, "dummyFlg");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyNoflg(), (et, vl) -> ((OptionMember)et).setDummyNoflg(ctb(vl)), "dummyNoflg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "OptionMember";
    protected final String _tablePropertyName = "optionMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("OptionMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "NUMBER", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 7, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "TIMESTAMP", 11, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, "// cls(MemberStatus)", null, null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatusDisplayOrder = cci("STATUS_DISPLAY_ORDER", "STATUS_DISPLAY_ORDER", null, null, Integer.class, "statusDisplayOrder", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDummyFlg = cci("DUMMY_FLG", "DUMMY_FLG", null, null, java.math.BigDecimal.class, "dummyFlg", null, false, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDummyNoflg = cci("DUMMY_NOFLG", "DUMMY_NOFLG", null, null, java.math.BigDecimal.class, "dummyNoflg", null, false, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null, false);

    /**
     * MEMBER_ID: {NUMBER(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * BIRTHDATE: {DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * FORMALIZED_DATETIME: {TIMESTAMP(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * MEMBER_STATUS_CODE: {CHAR(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * MEMBER_STATUS_NAME: {VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * STATUS_DISPLAY_ORDER: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusDisplayOrder() { return _columnStatusDisplayOrder; }
    /**
     * DUMMY_FLG: {NUMBER(22), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyFlg() { return _columnDummyFlg; }
    /**
     * DUMMY_NOFLG: {NUMBER(22)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyNoflg() { return _columnDummyNoflg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnStatusDisplayOrder());
        ls.add(columnDummyFlg());
        ls.add(columnDummyNoflg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.OptionMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OptionMember> getEntityType() { return OptionMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OptionMember newEntity() { return new OptionMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OptionMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OptionMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
