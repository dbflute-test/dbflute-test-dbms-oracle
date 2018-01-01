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
 * The DB meta of VENDOR_LARGE_DATA_REF. (Singleton)
 * @author oracleman
 */
public class VendorLargeDataRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataRefDbm _instance = new VendorLargeDataRefDbm();
    private VendorLargeDataRefDbm() {}
    public static VendorLargeDataRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataRefId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataRefId(ctl(vl)), "largeDataRefId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateIndex(ctld(vl)), "dateIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateNoIndex(ctld(vl)), "dateNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampIndex(ctldt(vl)), "timestampIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampNoIndex(ctldt(vl)), "timestampNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalIndex(ctb(vl)), "nullableDecimalIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalNoIndex(ctb(vl)), "nullableDecimalNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getSelfParentId(), (et, vl) -> ((VendorLargeDataRef)et).setSelfParentId(ctl(vl)), "selfParentId");
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
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeData(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeData((OptionalEntity<VendorLargeData>)vl), "vendorLargeData");
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeDataRefSelf(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeDataRefSelf((OptionalEntity<VendorLargeDataRef>)vl), "vendorLargeDataRefSelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_DATA_REF";
    protected final String _tableDispName = "VENDOR_LARGE_DATA_REF";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("LARGE_DATA_REF_ID", "LARGE_DATA_REF_ID", null, null, Long.class, "largeDataRefId", null, true, false, true, "NUMBER", 12, 0, null, null, false, null, null, null, "vendorLargeDataRefSelfList", null, false);
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, false, false, true, "NUMBER", 12, 0, null, null, false, null, null, "vendorLargeData", null, null, false);
    protected final ColumnInfo _columnDateIndex = cci("DATE_INDEX", "DATE_INDEX", null, null, java.time.LocalDate.class, "dateIndex", null, false, false, true, "DATE", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateNoIndex = cci("DATE_NO_INDEX", "DATE_NO_INDEX", null, null, java.time.LocalDate.class, "dateNoIndex", null, false, false, true, "DATE", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampIndex = cci("TIMESTAMP_INDEX", "TIMESTAMP_INDEX", null, null, java.time.LocalDateTime.class, "timestampIndex", null, false, false, true, "TIMESTAMP(6)", 11, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampNoIndex = cci("TIMESTAMP_NO_INDEX", "TIMESTAMP_NO_INDEX", null, null, java.time.LocalDateTime.class, "timestampNoIndex", null, false, false, true, "TIMESTAMP(6)", 11, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("NULLABLE_DECIMAL_INDEX", "NULLABLE_DECIMAL_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "NUMBER", 12, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("NULLABLE_DECIMAL_NO_INDEX", "NULLABLE_DECIMAL_NO_INDEX", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "NUMBER", 12, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelfParentId = cci("SELF_PARENT_ID", "SELF_PARENT_ID", null, null, Long.class, "selfParentId", null, false, false, false, "NUMBER", 12, 0, null, null, false, null, null, "vendorLargeDataRefSelf", null, null, false);

    /**
     * LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * DATE_INDEX: {IX, NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * DATE_NO_INDEX: {NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfParentId() { return _columnSelfParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataRefId());
        ls.add(columnLargeDataId());
        ls.add(columnDateIndex());
        ls.add(columnDateNoIndex());
        ls.add(columnTimestampIndex());
        ls.add(columnTimestampNoIndex());
        ls.add(columnNullableDecimalIndex());
        ls.add(columnNullableDecimalNoIndex());
        ls.add(columnSelfParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataRefId()); }
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
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorLargeDataRefList", false);
    }
    /**
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("FK_VENDOR_LARGE_DATA_REF_SELF", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.VendorLargeDataRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeDataRef> getEntityType() { return VendorLargeDataRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeDataRef newEntity() { return new VendorLargeDataRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeDataRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeDataRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
