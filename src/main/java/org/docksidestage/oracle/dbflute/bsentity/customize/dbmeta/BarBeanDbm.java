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
 * The DB meta of BAR_BEAN. (Singleton)
 * @author oracleman
 */
public class BarBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BarBeanDbm _instance = new BarBeanDbm();
    private BarBeanDbm() {}
    public static BarBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BarBean)et).getBarId(), (et, vl) -> ((BarBean)et).setBarId(cti(vl)), "barId");
        setupEpg(_epgMap, et -> ((BarBean)et).getBarName(), (et, vl) -> ((BarBean)et).setBarName((String)vl), "barName");
        setupEpg(_epgMap, et -> ((BarBean)et).getBarDecimal(), (et, vl) -> ((BarBean)et).setBarDecimal(ctb(vl)), "barDecimal");
        setupEpg(_epgMap, et -> ((BarBean)et).getBarDate(), (et, vl) -> ((BarBean)et).setBarDate(ctld(vl)), "barDate");
        setupEpg(_epgMap, et -> ((BarBean)et).getBarTimestamp(), (et, vl) -> ((BarBean)et).setBarTimestamp(ctldt(vl)), "barTimestamp");
        setupEpg(_epgMap, et -> ((BarBean)et).getBarClob(), (et, vl) -> ((BarBean)et).setBarClob((String)vl), "barClob");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BAR_BEAN";
    protected final String _tablePropertyName = "barBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("BAR_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarId = cci("BAR_ID", "BAR_ID", null, null, Integer.class, "barId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarName = cci("BAR_NAME", "BAR_NAME", null, null, String.class, "barName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarDecimal = cci("BAR_DECIMAL", "BAR_DECIMAL", null, null, java.math.BigDecimal.class, "barDecimal", null, false, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarDate = cci("BAR_DATE", "BAR_DATE", null, null, java.time.LocalDate.class, "barDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarTimestamp = cci("BAR_TIMESTAMP", "BAR_TIMESTAMP", null, null, java.time.LocalDateTime.class, "barTimestamp", null, false, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarClob = cci("BAR_CLOB", "BAR_CLOB", null, null, String.class, "barClob", null, false, false, false, "CLOB", null, null, null, false, null, null, null, null, null, false);

    /**
     * BAR_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarId() { return _columnBarId; }
    /**
     * BAR_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarName() { return _columnBarName; }
    /**
     * BAR_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDecimal() { return _columnBarDecimal; }
    /**
     * BAR_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarDate() { return _columnBarDate; }
    /**
     * BAR_TIMESTAMP: {TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarTimestamp() { return _columnBarTimestamp; }
    /**
     * BAR_CLOB: {CLOB}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarClob() { return _columnBarClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBarId());
        ls.add(columnBarName());
        ls.add(columnBarDecimal());
        ls.add(columnBarDate());
        ls.add(columnBarTimestamp());
        ls.add(columnBarClob());
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.BarBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BarBean> getEntityType() { return BarBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BarBean newEntity() { return new BarBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BarBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BarBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
