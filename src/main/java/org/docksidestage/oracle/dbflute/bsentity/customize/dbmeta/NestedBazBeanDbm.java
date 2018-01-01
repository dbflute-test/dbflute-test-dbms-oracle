package org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The DB meta of NESTED_BAZ_BEAN. (Singleton)
 * @author oracleman
 */
public class NestedBazBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NestedBazBeanDbm _instance = new NestedBazBeanDbm();
    private NestedBazBeanDbm() {}
    public static NestedBazBeanDbm getInstance() { return _instance; }

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
    @SuppressWarnings("unchecked")
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((NestedBazBean)et).getBazId(), (et, vl) -> ((NestedBazBean)et).setBazId(cti(vl)), "bazId");
        setupEpg(_epgMap, et -> ((NestedBazBean)et).getBazName(), (et, vl) -> ((NestedBazBean)et).setBazName((String)vl), "bazName");
        setupEpg(_epgMap, et -> ((NestedBazBean)et).getBazDate(), (et, vl) -> ((NestedBazBean)et).setBazDate(ctld(vl)), "bazDate");
        setupEpg(_epgMap, et -> ((NestedBazBean)et).getBazList(), (et, vl) -> ((NestedBazBean)et).setBazList((List<List<BarBean>>)vl), "bazList");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NESTED_BAZ_BEAN";
    protected final String _tableDispName = "NESTED_BAZ_BEAN";
    protected final String _tablePropertyName = "nestedBazBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NESTED_BAZ_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBazId = cci("BAZ_ID", "BAZ_ID", null, null, Integer.class, "bazId", null, false, false, false, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBazName = cci("BAZ_NAME", "BAZ_NAME", null, null, String.class, "bazName", null, false, false, false, "VARCHAR2", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBazDate = cci("BAZ_DATE", "BAZ_DATE", null, null, java.time.LocalDate.class, "bazDate", null, false, false, false, "DATE", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBazList = cci("BAZ_LIST", "BAZ_LIST", null, null, List.class, "bazList", null, false, false, false, "BAZ_TABLE", null, null, null, null, false, null, null, null, null, null, false);

    /**
     * BAZ_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazId() { return _columnBazId; }
    /**
     * BAZ_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazName() { return _columnBazName; }
    /**
     * BAZ_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazDate() { return _columnBazDate; }
    /**
     * BAZ_LIST: {BAZ_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBazList() { return _columnBazList; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBazId());
        ls.add(columnBazName());
        ls.add(columnBazDate());
        ls.add(columnBazList());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.NestedBazBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NestedBazBean> getEntityType() { return NestedBazBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NestedBazBean newEntity() { return new NestedBazBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NestedBazBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NestedBazBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
