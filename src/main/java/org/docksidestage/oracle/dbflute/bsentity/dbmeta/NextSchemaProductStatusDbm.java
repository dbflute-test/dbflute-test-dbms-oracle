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
 * The DB meta of NEXT_SCHEMA_PRODUCT_STATUS. (Singleton)
 * @author oracleman
 */
public class NextSchemaProductStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextSchemaProductStatusDbm _instance = new NextSchemaProductStatusDbm();
    private NextSchemaProductStatusDbm() {}
    public static NextSchemaProductStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NextSchemaProductStatus)et).getProductStatusCode(), (et, vl) -> ((NextSchemaProductStatus)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((NextSchemaProductStatus)et).getProductStatusName(), (et, vl) -> ((NextSchemaProductStatus)et).setProductStatusName((String)vl), "productStatusName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_SCHEMA_PRODUCT_STATUS";
    protected final String _tableDispName = "NEXT_SCHEMA_PRODUCT_STATUS";
    protected final String _tablePropertyName = "nextSchemaProductStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEWURAYASUDB.NEXT_SCHEMA_PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "隣のスキステ";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "これのみえてよい";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, true, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "whiteRefNextTargetList,nextSchemaProductList", null, false);
    protected final ColumnInfo _columnProductStatusName = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, null, String.class, "productStatusName", null, false, false, true, "VARCHAR2", 50, 0, null, null, false, null, null, null, null, null, false);

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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
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
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteRefNextTargetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), WhiteRefNextTargetDbm.getInstance().columnNextTargetCode());
        return cri("FK_WHITE_REF_NEXT_TARGET", "whiteRefNextTargetList", this, WhiteRefNextTargetDbm.getInstance(), mp, false, "nextSchemaProductStatus");
    }
    /**
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerNextSchemaProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), NextSchemaProductDbm.getInstance().columnProductStatusCode());
        return cri("FK_NEXT_SCHEMA_PRODUCT", "nextSchemaProductList", this, NextSchemaProductDbm.getInstance(), mp, false, "nextSchemaProductStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.NextSchemaProductStatus"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.NextSchemaProductStatusCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.NextSchemaProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextSchemaProductStatus> getEntityType() { return NextSchemaProductStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NextSchemaProductStatus newEntity() { return new NextSchemaProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextSchemaProductStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextSchemaProductStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
