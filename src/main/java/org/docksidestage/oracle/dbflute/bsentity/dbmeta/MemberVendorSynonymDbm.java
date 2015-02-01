package org.docksidestage.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_VENDOR_SYNONYM. (Singleton)
 * @author oracleman
 */
public class MemberVendorSynonymDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberVendorSynonymDbm _instance = new MemberVendorSynonymDbm();
    private MemberVendorSynonymDbm() {}
    public static MemberVendorSynonymDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getMemberId(), (et, vl) -> ((MemberVendorSynonym)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getMemberName(), (et, vl) -> ((MemberVendorSynonym)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getMemberAccount(), (et, vl) -> ((MemberVendorSynonym)et).setMemberAccount((String)vl), "memberAccount");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((MemberVendorSynonym)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((MemberVendorSynonym)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getFormalizedDatetime(), (et, vl) -> ((MemberVendorSynonym)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getBirthdate(), (et, vl) -> ((MemberVendorSynonym)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getRegisterDatetime(), (et, vl) -> ((MemberVendorSynonym)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getRegisterUser(), (et, vl) -> ((MemberVendorSynonym)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getRegisterProcess(), (et, vl) -> ((MemberVendorSynonym)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getUpdateDatetime(), (et, vl) -> ((MemberVendorSynonym)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getUpdateUser(), (et, vl) -> ((MemberVendorSynonym)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getUpdateProcess(), (et, vl) -> ((MemberVendorSynonym)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((MemberVendorSynonym)et).getVersionNo(), (et, vl) -> ((MemberVendorSynonym)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MemberVendorSynonym)et).getMemberStatus(), (et, vl) -> ((MemberVendorSynonym)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((MemberVendorSynonym)et).getSynonymMemberWithdrawalAsOne(), (et, vl) -> ((MemberVendorSynonym)et).setSynonymMemberWithdrawalAsOne((OptionalEntity<SynonymMemberWithdrawal>)vl), "synonymMemberWithdrawalAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_VENDOR_SYNONYM";
    protected final String _tableDispName = "MEMBER_VENDOR_SYNONYM";
    protected final String _tablePropertyName = "memberVendorSynonym";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_VENDOR_SYNONYM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員登録時にInsertされる。\n物理削除されることはない";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", Integer.class, "memberId", null, true, false, true, "NUMBER", 9, 0, null, false, null, "連番", null, "synonymMemberLoginList", null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", String.class, "memberName", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, "会員検索の条件となる。", null, null, null, false);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", String.class, "memberAccount", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, "ログインに利用。\n完全にユニークである", null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "TIMESTAMP(3)", 11, 3, null, false, null, "正式会員になったら値が格納される", null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 7, 0, null, false, null, "わからない場合はnull", null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザ", String.class, "registerUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, "登録プロセス", String.class, "registerProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", String.class, "updateUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, "更新プロセス", String.class, "updateProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョンNO", Long.class, "versionNo", null, false, false, true, "NUMBER", 16, 0, null, false, OptimisticLockType.VERSION_NO, "排他制御に利用される", null, null, null, false);

    /**
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    /**
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMemberAccount()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberVendorSynonymList", false);
    }
    /**
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignSynonymMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SynonymMemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER_SYNONYM1", "synonymMemberWithdrawalAsOne", this, SynonymMemberWithdrawalDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "memberVendorSynonym", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SynonymMemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER_SYNONYM1", "synonymMemberLoginList", this, SynonymMemberLoginDbm.getInstance(), mp, false, "memberVendorSynonym");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.MemberVendorSynonym"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.MemberVendorSynonymCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.MemberVendorSynonymBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberVendorSynonym> getEntityType() { return MemberVendorSynonym.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberVendorSynonym newEntity() { return new MemberVendorSynonym(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberVendorSynonym)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberVendorSynonym)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
