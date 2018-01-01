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
 * The DB meta of NESTED_FOO_BEAN. (Singleton)
 * @author oracleman
 */
public class NestedFooBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NestedFooBeanDbm _instance = new NestedFooBeanDbm();
    private NestedFooBeanDbm() {}
    public static NestedFooBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getFooId(), (et, vl) -> ((NestedFooBean)et).setFooId(cti(vl)), "fooId");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getFooName(), (et, vl) -> ((NestedFooBean)et).setFooName((String)vl), "fooName");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getFooDate(), (et, vl) -> ((NestedFooBean)et).setFooDate(ctld(vl)), "fooDate");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getBarBean(), (et, vl) -> ((NestedFooBean)et).setBarBean((NestedBarBean)vl), "barBean");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getQuxList(), (et, vl) -> ((NestedFooBean)et).setQuxList((List<java.math.BigDecimal>)vl), "quxList");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getQuuxList(), (et, vl) -> ((NestedFooBean)et).setQuuxList((List<java.math.BigDecimal>)vl), "quuxList");
        setupEpg(_epgMap, et -> ((NestedFooBean)et).getCorgeList(), (et, vl) -> ((NestedFooBean)et).setCorgeList((List<CorgeBean>)vl), "corgeList");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NESTED_FOO_BEAN";
    protected final String _tableDispName = "NESTED_FOO_BEAN";
    protected final String _tablePropertyName = "nestedFooBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NESTED_FOO_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("FOO_ID", "FOO_ID", null, null, Integer.class, "fooId", null, false, false, false, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooName = cci("FOO_NAME", "FOO_NAME", null, null, String.class, "fooName", null, false, false, false, "VARCHAR2", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooDate = cci("FOO_DATE", "FOO_DATE", null, null, java.time.LocalDate.class, "fooDate", null, false, false, false, "DATE", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarBean = cci("BAR_BEAN", "BAR_BEAN", null, null, NestedBarBean.class, "barBean", null, false, false, false, "NESTED_BAR_BEAN", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuxList = cci("QUX_LIST", "QUX_LIST", null, null, List.class, "quxList", null, false, false, false, "QUX_TABLE", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuuxList = cci("QUUX_LIST", "QUUX_LIST", null, null, List.class, "quuxList", null, false, false, false, "QUUX_TABLE", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeList = cci("CORGE_LIST", "CORGE_LIST", null, null, List.class, "corgeList", null, false, false, false, "CORGE_TABLE", null, null, null, null, false, null, null, null, null, null, false);

    /**
     * FOO_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooId() { return _columnFooId; }
    /**
     * FOO_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooName() { return _columnFooName; }
    /**
     * FOO_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    /**
     * BAR_BEAN: {NESTED_BAR_BEAN}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarBean() { return _columnBarBean; }
    /**
     * QUX_LIST: {QUX_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuxList() { return _columnQuxList; }
    /**
     * QUUX_LIST: {QUUX_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuuxList() { return _columnQuuxList; }
    /**
     * CORGE_LIST: {CORGE_TABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeList() { return _columnCorgeList; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnFooDate());
        ls.add(columnBarBean());
        ls.add(columnQuxList());
        ls.add(columnQuuxList());
        ls.add(columnCorgeList());
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.NestedFooBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NestedFooBean> getEntityType() { return NestedFooBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NestedFooBean newEntity() { return new NestedFooBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NestedFooBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NestedFooBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
