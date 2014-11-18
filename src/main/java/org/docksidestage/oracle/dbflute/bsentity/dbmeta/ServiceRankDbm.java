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
 * The DB meta of SERVICE_RANK. (Singleton)
 * @author oracleman
 */
public class ServiceRankDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ServiceRankDbm _instance = new ServiceRankDbm();
    private ServiceRankDbm() {}
    public static ServiceRankDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ServiceRank)et).getServiceRankCode(), (et, vl) -> {
            ColumnInfo col = columnServiceRankCode();
            CDef.ServiceRank cls = (CDef.ServiceRank)gcls(col, vl);
            if (cls != null) {
                ((ServiceRank)et).setServiceRankCodeAsServiceRank(cls);
            } else {
                ((ServiceRank)et).mynativeMappingServiceRankCode((String)vl);
            }
        }, "serviceRankCode");
        setupEpg(_epgMap, et -> ((ServiceRank)et).getServiceRankName(), (et, vl) -> ((ServiceRank)et).setServiceRankName((String)vl), "serviceRankName");
        setupEpg(_epgMap, et -> ((ServiceRank)et).getServicePointIncidence(), (et, vl) -> ((ServiceRank)et).setServicePointIncidence(ctb(vl)), "servicePointIncidence");
        setupEpg(_epgMap, et -> ((ServiceRank)et).getNewAcceptableFlg(), (et, vl) -> {
            ColumnInfo col = columnNewAcceptableFlg();
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((ServiceRank)et).setNewAcceptableFlgAsFlg(cls);
            } else {
                ((ServiceRank)et).mynativeMappingNewAcceptableFlg(ctn(vl, java.math.BigDecimal.class));
            }
        }, "newAcceptableFlg");
        setupEpg(_epgMap, et -> ((ServiceRank)et).getDescription(), (et, vl) -> ((ServiceRank)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((ServiceRank)et).getDisplayOrder(), (et, vl) -> ((ServiceRank)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SERVICE_RANK";
    protected final String _tablePropertyName = "serviceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, null, String.class, "serviceRankCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberServiceList", CDef.DefMeta.ServiceRank, false);
    protected final ColumnInfo _columnServiceRankName = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, null, String.class, "serviceRankName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnServicePointIncidence = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, null, java.math.BigDecimal.class, "servicePointIncidence", null, false, false, true, "NUMBER", 5, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, null, java.math.BigDecimal.class, "newAcceptableFlg", null, false, false, true, "NUMBER", 22, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);

    /**
     * SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    /**
     * SERVICE_RANK_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankName() { return _columnServiceRankName; }
    /**
     * SERVICE_POINT_INCIDENCE: {NotNull, NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServicePointIncidence() { return _columnServicePointIncidence; }
    /**
     * NEW_ACCEPTABLE_FLG: {NotNull, NUMBER(22), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewAcceptableFlg() { return _columnNewAcceptableFlg; }
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
        ls.add(columnServiceRankCode());
        ls.add(columnServiceRankName());
        ls.add(columnServicePointIncidence());
        ls.add(columnNewAcceptableFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnServiceRankCode()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), MemberServiceDbm.getInstance().columnServiceRankCode());
        return cri("FK_MEMBER_SERVICE_RANK_CODE", "memberServiceList", this, MemberServiceDbm.getInstance(), mp, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.ServiceRank"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.ServiceRankCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.ServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ServiceRank> getEntityType() { return ServiceRank.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ServiceRank newEntity() { return new ServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ServiceRank)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ServiceRank)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
