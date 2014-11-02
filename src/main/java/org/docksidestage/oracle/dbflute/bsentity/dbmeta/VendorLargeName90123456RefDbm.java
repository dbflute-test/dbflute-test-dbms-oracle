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
 * The DB meta of VENDOR_LARGE_NAME_90123456_REF. (Singleton)
 * @author oracleman
 */
public class VendorLargeName90123456RefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeName90123456RefDbm _instance = new VendorLargeName90123456RefDbm();
    private VendorLargeName90123456RefDbm() {}
    public static VendorLargeName90123456RefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorLargeName90123456Ref)et).getVendorLargeName90123RefId(), (et, vl) -> ((VendorLargeName90123456Ref)et).setVendorLargeName90123RefId(ctl(vl)), "vendorLargeName90123RefId");
        setupEpg(_epgMap, et -> ((VendorLargeName90123456Ref)et).getVendorLargeName901RefName(), (et, vl) -> ((VendorLargeName90123456Ref)et).setVendorLargeName901RefName((String)vl), "vendorLargeName901RefName");
        setupEpg(_epgMap, et -> ((VendorLargeName90123456Ref)et).getVendorLargeName901234567Id(), (et, vl) -> ((VendorLargeName90123456Ref)et).setVendorLargeName901234567Id(ctl(vl)), "vendorLargeName901234567Id");
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
        setupEfpg(_efpgMap, et -> ((VendorLargeName90123456Ref)et).getVendorLargeName901234567890(), (et, vl) -> ((VendorLargeName90123456Ref)et).setVendorLargeName901234567890((OptionalEntity<VendorLargeName901234567890>)vl), "vendorLargeName901234567890");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_LARGE_NAME_90123456_REF";
    protected final String _tablePropertyName = "vendorLargeName90123456Ref";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_LARGE_NAME_90123456_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorLargeName90123RefId = cci("VENDOR_LARGE_NAME_90123_REF_ID", "VENDOR_LARGE_NAME_90123_REF_ID", null, null, Long.class, "vendorLargeName90123RefId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendorLargeName901RefName = cci("VENDOR_LARGE_NAME_901_REF_NAME", "VENDOR_LARGE_NAME_901_REF_NAME", null, null, String.class, "vendorLargeName901RefName", null, false, false, true, "VARCHAR2", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendorLargeName901234567Id = cci("VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", null, null, Long.class, "vendorLargeName901234567Id", null, false, false, false, "NUMBER", 16, 0, null, false, null, null, "vendorLargeName901234567890", null, null);

    /**
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorLargeName90123RefId() { return _columnVendorLargeName90123RefId; }
    /**
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorLargeName901RefName() { return _columnVendorLargeName901RefName; }
    /**
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorLargeName901234567Id() { return _columnVendorLargeName901234567Id; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorLargeName90123RefId());
        ls.add(columnVendorLargeName901RefName());
        ls.add(columnVendorLargeName901234567Id());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorLargeName90123RefId()); }
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
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeName901234567890() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnVendorLargeName901234567Id(), VendorLargeName901234567890Dbm.getInstance().columnVendorLargeName901234567Id());
        return cfi("FK_VENDOR_LARGE_NAME_$$$_REF", "vendorLargeName901234567890", this, VendorLargeName901234567890Dbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorLargeName90123456RefList");
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.VendorLargeName90123456Ref"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.VendorLargeName90123456RefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.VendorLargeName90123456RefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeName90123456Ref> getEntityType() { return VendorLargeName90123456Ref.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeName90123456Ref newEntity() { return new VendorLargeName90123456Ref(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeName90123456Ref)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeName90123456Ref)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
