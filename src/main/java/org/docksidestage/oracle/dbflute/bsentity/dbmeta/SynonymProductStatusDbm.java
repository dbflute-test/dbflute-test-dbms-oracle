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
 * The DB meta of SYNONYM_PRODUCT_STATUS. (Singleton)
 * @author oracleman
 */
public class SynonymProductStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymProductStatusDbm _instance = new SynonymProductStatusDbm();
    private SynonymProductStatusDbm() {}
    public static SynonymProductStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SynonymProductStatus)et).getProductStatusCode(), (et, vl) -> ((SynonymProductStatus)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((SynonymProductStatus)et).getProductStatusName(), (et, vl) -> ((SynonymProductStatus)et).setProductStatusName((String)vl), "productStatusName");
        setupEpg(_epgMap, et -> ((SynonymProductStatus)et).getDisplayOrder(), (et, vl) -> ((SynonymProductStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_PRODUCT_STATUS";
    protected final String _tableDispName = "SYNONYM_PRODUCT_STATUS";
    protected final String _tablePropertyName = "synonymProductStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableComment = "商品ステータス";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "synonymProductList", null, false);
    protected final ColumnInfo _columnProductStatusName = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, null, String.class, "productStatusName", null, false, false, true, "VARCHAR2", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusName() { return _columnProductStatusName; }
    /**
     * DISPLAY_ORDER: {NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnProductStatusName()); }

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
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), SynonymProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_PRODUCT_PRODUCT_STATUS_SYNONYM1", "synonymProductList", this, SynonymProductDbm.getInstance(), mp, false, "synonymProductStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.SynonymProductStatus"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.SynonymProductStatusCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.SynonymProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymProductStatus> getEntityType() { return SynonymProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SynonymProductStatus newEntity() { return new SynonymProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymProductStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymProductStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
