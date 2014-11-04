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
 * The DB meta of MEMBER_LOGIN. (Singleton)
 * @author oracleman
 */
public class MemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberLoginDbm _instance = new MemberLoginDbm();
    private MemberLoginDbm() {}
    public static MemberLoginDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMemberLoginId(), (et, vl) -> ((MemberLogin)et).setMemberLoginId(ctl(vl)), "memberLoginId");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMemberId(), (et, vl) -> ((MemberLogin)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getLoginDatetime(), (et, vl) -> ((MemberLogin)et).setLoginDatetime((java.time.LocalDateTime)vl), "loginDatetime");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMobileLoginFlg(), (et, vl) -> {
            ColumnInfo col = columnMobileLoginFlg();
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((MemberLogin)et).setMobileLoginFlgAsFlg(cls);
            } else {
                ((MemberLogin)et).mynativeMappingMobileLoginFlg(ctn(vl, Integer.class));
            }
        }, "mobileLoginFlg");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getLoginMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnLoginMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((MemberLogin)et).setLoginMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((MemberLogin)et).mynativeMappingLoginMemberStatusCode((String)vl);
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
        setupEfpg(_efpgMap, et -> ((MemberLogin)et).getMember(), (et, vl) -> ((MemberLogin)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((MemberLogin)et).getMemberStatus(), (et, vl) -> ((MemberLogin)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_LOGIN";
    protected final String _tablePropertyName = "memberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_LOGIN", _tableDbName);
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
    protected final ColumnInfo _columnMemberLoginId = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, null, Long.class, "memberLoginId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "NUMBER", 9, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnLoginDatetime = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, null, java.time.LocalDateTime.class, "loginDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMobileLoginFlg = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, null, Integer.class, "mobileLoginFlg", null, false, false, true, "NUMBER", 1, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, null, String.class, "loginMemberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

    /**
     * MEMBER_LOGIN_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER}
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
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberLoginList");
    }
    /**
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberLoginList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_MEMBER_LOGIN"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return 12; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.MemberLogin"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.MemberLoginCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.MemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberLogin> getEntityType() { return MemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberLogin newEntity() { return new MemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}