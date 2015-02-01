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
 * The DB meta of VENDOR_LARGE_DATA. (Singleton)
 * @author oracleman
 */
public class VendorLargeDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataDbm _instance = new VendorLargeDataDbm();
    private VendorLargeDataDbm() {}
    public static VendorLargeDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getLargeDataId(), (et, vl) -> ((VendorLargeData)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getStringIndex(), (et, vl) -> ((VendorLargeData)et).setStringIndex((String)vl), "stringIndex");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getStringNoIndex(), (et, vl) -> ((VendorLargeData)et).setStringNoIndex((String)vl), "stringNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getStringUniqueIndex(), (et, vl) -> ((VendorLargeData)et).setStringUniqueIndex((String)vl), "stringUniqueIndex");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getIntflgIndex(), (et, vl) -> ((VendorLargeData)et).setIntflgIndex(cti(vl)), "intflgIndex");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getNumericIntegerIndex(), (et, vl) -> ((VendorLargeData)et).setNumericIntegerIndex(cti(vl)), "numericIntegerIndex");
        setupEpg(_epgMap, et -> ((VendorLargeData)et).getNumericIntegerNoIndex(), (et, vl) -> ((VendorLargeData)et).setNumericIntegerNoIndex(cti(vl)), "numericIntegerNoIndex");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_DATA";
    protected final String _tableDispName = "VENDOR_LARGE_DATA";
    protected final String _tablePropertyName = "vendorLargeData";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_DATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataId = cci("LARGE_DATA_ID", "LARGE_DATA_ID", null, null, Long.class, "largeDataId", null, true, false, true, "NUMBER", 12, 0, null, false, null, null, null, "vendorLargeDataRefList", null, false);
    protected final ColumnInfo _columnStringIndex = cci("STRING_INDEX", "STRING_INDEX", null, null, String.class, "stringIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStringNoIndex = cci("STRING_NO_INDEX", "STRING_NO_INDEX", null, null, String.class, "stringNoIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStringUniqueIndex = cci("STRING_UNIQUE_INDEX", "STRING_UNIQUE_INDEX", null, null, String.class, "stringUniqueIndex", null, false, false, true, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIntflgIndex = cci("INTFLG_INDEX", "INTFLG_INDEX", null, null, Integer.class, "intflgIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumericIntegerIndex = cci("NUMERIC_INTEGER_INDEX", "NUMERIC_INTEGER_INDEX", null, null, Integer.class, "numericIntegerIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumericIntegerNoIndex = cci("NUMERIC_INTEGER_NO_INDEX", "NUMERIC_INTEGER_NO_INDEX", null, null, Integer.class, "numericIntegerNoIndex", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);

    /**
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringIndex() { return _columnStringIndex; }
    /**
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringNoIndex() { return _columnStringNoIndex; }
    /**
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStringUniqueIndex() { return _columnStringUniqueIndex; }
    /**
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntflgIndex() { return _columnIntflgIndex; }
    /**
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumericIntegerIndex() { return _columnNumericIntegerIndex; }
    /**
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumericIntegerNoIndex() { return _columnNumericIntegerNoIndex; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataId());
        ls.add(columnStringIndex());
        ls.add(columnStringNoIndex());
        ls.add(columnStringUniqueIndex());
        ls.add(columnIntflgIndex());
        ls.add(columnNumericIntegerIndex());
        ls.add(columnNumericIntegerNoIndex());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnStringUniqueIndex()); }

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
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataRefDbm.getInstance().columnLargeDataId());
        return cri("FK_VENDOR_LARGE_DATA_REF_DATA", "vendorLargeDataRefList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeData");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.VendorLargeData"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.VendorLargeDataCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.VendorLargeDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeData> getEntityType() { return VendorLargeData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeData newEntity() { return new VendorLargeData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
