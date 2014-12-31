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
 * The DB meta of NEXT_SCHEMA_PRODUCT. (Singleton)
 * @author oracleman
 */
public class NextSchemaProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextSchemaProductDbm _instance = new NextSchemaProductDbm();
    private NextSchemaProductDbm() {}
    public static NextSchemaProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getProductId(), (et, vl) -> ((NextSchemaProduct)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getProductName(), (et, vl) -> ((NextSchemaProduct)et).setProductName((String)vl), "productName");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getProductHandleCode(), (et, vl) -> ((NextSchemaProduct)et).setProductHandleCode((String)vl), "productHandleCode");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getProductStatusCode(), (et, vl) -> ((NextSchemaProduct)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getRegisterDatetime(), (et, vl) -> ((NextSchemaProduct)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getRegisterUser(), (et, vl) -> ((NextSchemaProduct)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getRegisterProcess(), (et, vl) -> ((NextSchemaProduct)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getUpdateDatetime(), (et, vl) -> ((NextSchemaProduct)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getUpdateUser(), (et, vl) -> ((NextSchemaProduct)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getUpdateProcess(), (et, vl) -> ((NextSchemaProduct)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((NextSchemaProduct)et).getVersionNo(), (et, vl) -> ((NextSchemaProduct)et).setVersionNo(ctb(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((NextSchemaProduct)et).getNextSchemaProductStatus(), (et, vl) -> ((NextSchemaProduct)et).setNextSchemaProductStatus((OptionalEntity<NextSchemaProductStatus>)vl), "nextSchemaProductStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_SCHEMA_PRODUCT";
    protected final String _tablePropertyName = "nextSchemaProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEWURAYASUDB.NEXT_SCHEMA_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "隣のスキーマ";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "隣のベーシックなテーブル";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, "隣の商品ID", Long.class, "productId", null, true, false, true, "NUMBER", 16, 0, null, false, null, "隣のベーシックなPK", null, null, null, false);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, "隣の商品名称", String.class, "productName", null, false, false, true, "VARCHAR2", 50, 0, null, false, null, "隣のベーシックなName", null, null, null, false);
    protected final ColumnInfo _columnProductHandleCode = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, null, String.class, "productHandleCode", null, false, false, true, "VARCHAR2", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductStatusCode = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, String.class, "productStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "nextSchemaProductStatus", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "VARCHAR2", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, java.math.BigDecimal.class, "versionNo", null, false, false, true, "NUMBER", 38, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    /**
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductStatusCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'nextSchemaProductStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignNextSchemaProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), NextSchemaProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("FK_NEXT_SCHEMA_PRODUCT", "nextSchemaProductStatus", this, NextSchemaProductStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "nextSchemaProductList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "NEWURAYASUDB.SEQ_NEXT_SCHEMA_PRODUCT"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return 36; }
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.NextSchemaProduct"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.NextSchemaProductCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.NextSchemaProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextSchemaProduct> getEntityType() { return NextSchemaProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NextSchemaProduct newEntity() { return new NextSchemaProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextSchemaProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextSchemaProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
