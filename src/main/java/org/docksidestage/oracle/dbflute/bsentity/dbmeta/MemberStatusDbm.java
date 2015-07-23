package org.docksidestage.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_STATUS. (Singleton)
 * @author oracleman
 */
public class MemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberStatusDbm _instance = new MemberStatusDbm();
    private MemberStatusDbm() {}
    public static MemberStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberStatus)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, col, vl);
            if (cls != null) {
                ((MemberStatus)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((MemberStatus)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((MemberStatus)et).getMemberStatusName(), (et, vl) -> ((MemberStatus)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((MemberStatus)et).getDescription(), (et, vl) -> ((MemberStatus)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((MemberStatus)et).getDisplayOrder(), (et, vl) -> ((MemberStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_STATUS";
    protected final String _tableDispName = "MEMBER_STATUS";
    protected final String _tablePropertyName = "memberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ステータス";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "固定の区分値";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberList,memberLoginList,memberVendorSynonymList,synonymMemberList,synonymMemberLoginList,vendorSynonymMemberList", CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, String.class, "memberStatusName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);

    /**
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOfDisplayOrder() { return hpcui(columnDisplayOrder()); }
    public UniqueInfo uniqueOfMemberStatusName() { return hpcui(columnMemberStatusName()); }

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
    /**
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "memberList", this, MemberDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberLoginDbm.getInstance().columnLoginMemberStatusCode());
        return cri("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberLoginList", this, MemberLoginDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberVendorSynonymList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberVendorSynonymDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "memberVendorSynonymList", this, MemberVendorSynonymDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), SynonymMemberDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "synonymMemberList", this, SynonymMemberDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), SynonymMemberLoginDbm.getInstance().columnLoginMemberStatusCode());
        return cri("FK_MEMBER_LOGIN_MEMBER_STATUS", "synonymMemberLoginList", this, SynonymMemberLoginDbm.getInstance(), mp, false, "memberStatus");
    }
    /**
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorSynonymMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), VendorSynonymMemberDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "vendorSynonymMemberList", this, VendorSynonymMemberDbm.getInstance(), mp, false, "memberStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.MemberStatus"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.MemberStatusCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.MemberStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberStatus> getEntityType() { return MemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberStatus newEntity() { return new MemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
