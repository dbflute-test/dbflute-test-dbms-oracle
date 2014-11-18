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
 * The DB meta of SYNONYM_MEMBER_LOGIN. (Singleton)
 * @author oracleman
 */
public class SynonymMemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymMemberLoginDbm _instance = new SynonymMemberLoginDbm();
    private SynonymMemberLoginDbm() {}
    public static SynonymMemberLoginDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
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
        setupEpg(_epgMap, et -> ((SynonymMemberLogin)et).getMemberLoginId(), (et, vl) -> ((SynonymMemberLogin)et).setMemberLoginId(ctl(vl)), "memberLoginId");
        setupEpg(_epgMap, et -> ((SynonymMemberLogin)et).getMemberId(), (et, vl) -> ((SynonymMemberLogin)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((SynonymMemberLogin)et).getLoginDatetime(), (et, vl) -> ((SynonymMemberLogin)et).setLoginDatetime((java.time.LocalDateTime)vl), "loginDatetime");
        setupEpg(_epgMap, et -> ((SynonymMemberLogin)et).getMobileLoginFlg(), (et, vl) -> {
            ColumnInfo col = columnMobileLoginFlg();
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((SynonymMemberLogin)et).setMobileLoginFlgAsFlg(cls);
            } else {
                ((SynonymMemberLogin)et).mynativeMappingMobileLoginFlg(ctn(vl, Integer.class));
            }
        }, "mobileLoginFlg");
        setupEpg(_epgMap, et -> ((SynonymMemberLogin)et).getLoginMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnLoginMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((SynonymMemberLogin)et).setLoginMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((SynonymMemberLogin)et).mynativeMappingLoginMemberStatusCode((String)vl);
            }
        }, "loginMemberStatusCode");
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
        setupEfpg(_efpgMap, et -> ((SynonymMemberLogin)et).getMemberStatus(), (et, vl) -> ((SynonymMemberLogin)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((SynonymMemberLogin)et).getMemberVendorSynonym(), (et, vl) -> ((SynonymMemberLogin)et).setMemberVendorSynonym((OptionalEntity<MemberVendorSynonym>)vl), "memberVendorSynonym");
        setupEfpg(_efpgMap, et -> ((SynonymMemberLogin)et).getSynonymMember(), (et, vl) -> ((SynonymMemberLogin)et).setSynonymMember((OptionalEntity<SynonymMember>)vl), "synonymMember");
        setupEfpg(_efpgMap, et -> ((SynonymMemberLogin)et).getVendorSynonymMember(), (et, vl) -> ((SynonymMemberLogin)et).setVendorSynonymMember((OptionalEntity<VendorSynonymMember>)vl), "vendorSynonymMember");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_MEMBER_LOGIN";
    protected final String _tablePropertyName = "synonymMemberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ログイン";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "ログインの度にInsertされる";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, null, Long.class, "memberLoginId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "NUMBER", 9, 0, null, false, null, null, "memberVendorSynonym,synonymMember,vendorSynonymMember", null, null, false);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, null, java.time.LocalDateTime.class, "loginDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, null, Integer.class, "mobileLoginFlg", null, false, false, true, "NUMBER", 1, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, null, String.class, "loginMemberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);

    /**
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    /**
     * MOBILE_LOGIN_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
    /**
     * LOGIN_MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginMemberStatusCode() { return _columnLoginMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberLoginId());
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        ls.add(columnMobileLoginFlg());
        ls.add(columnLoginMemberStatusCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberLoginId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "synonymMemberLoginList", false);
    }
    /**
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberVendorSynonym() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberVendorSynonymDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM1", "memberVendorSynonym", this, MemberVendorSynonymDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "synonymMemberLoginList", false);
    }
    /**
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), SynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM2", "synonymMember", this, SynonymMemberDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "synonymMemberLoginList", false);
    }
    /**
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorSynonymMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), VendorSynonymMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER_SYNONYM3", "vendorSynonymMember", this, VendorSynonymMemberDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "synonymMemberLoginList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.SynonymMemberLogin"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.SynonymMemberLoginCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.SynonymMemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymMemberLogin> getEntityType() { return SynonymMemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SynonymMemberLogin newEntity() { return new SynonymMemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymMemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymMemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
