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
 * The DB meta of CORGE_BEAN. (Singleton)
 * @author oracleman
 */
public class CorgeBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CorgeBeanDbm _instance = new CorgeBeanDbm();
    private CorgeBeanDbm() {}
    public static CorgeBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeId(), (et, vl) -> ((CorgeBean)et).setCorgeId(cti(vl)), "corgeId");
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeName(), (et, vl) -> ((CorgeBean)et).setCorgeName((String)vl), "corgeName");
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeDecimal(), (et, vl) -> ((CorgeBean)et).setCorgeDecimal(ctb(vl)), "corgeDecimal");
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeDate(), (et, vl) -> ((CorgeBean)et).setCorgeDate(ctld(vl)), "corgeDate");
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeTimestamp(), (et, vl) -> ((CorgeBean)et).setCorgeTimestamp(ctldt(vl)), "corgeTimestamp");
        setupEpg(_epgMap, et -> ((CorgeBean)et).getCorgeClob(), (et, vl) -> ((CorgeBean)et).setCorgeClob((String)vl), "corgeClob");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CORGE_BEAN";
    protected final String _tableDispName = "CORGE_BEAN";
    protected final String _tablePropertyName = "corgeBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("CORGE_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCorgeId = cci("CORGE_ID", "CORGE_ID", null, null, Integer.class, "corgeId", null, false, false, false, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeName = cci("CORGE_NAME", "CORGE_NAME", null, null, String.class, "corgeName", null, false, false, false, "VARCHAR2", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeDecimal = cci("CORGE_DECIMAL", "CORGE_DECIMAL", null, null, java.math.BigDecimal.class, "corgeDecimal", null, false, false, false, "NUMBER", 5, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeDate = cci("CORGE_DATE", "CORGE_DATE", null, null, java.time.LocalDate.class, "corgeDate", null, false, false, false, "DATE", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeTimestamp = cci("CORGE_TIMESTAMP", "CORGE_TIMESTAMP", null, null, java.time.LocalDateTime.class, "corgeTimestamp", null, false, false, false, "TIMESTAMP", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorgeClob = cci("CORGE_CLOB", "CORGE_CLOB", null, null, String.class, "corgeClob", null, false, false, false, "CLOB", null, null, null, null, false, null, null, null, null, null, false);

    /**
     * CORGE_ID: {NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeId() { return _columnCorgeId; }
    /**
     * CORGE_NAME: {VARCHAR2(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeName() { return _columnCorgeName; }
    /**
     * CORGE_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeDecimal() { return _columnCorgeDecimal; }
    /**
     * CORGE_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeDate() { return _columnCorgeDate; }
    /**
     * CORGE_TIMESTAMP: {TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeTimestamp() { return _columnCorgeTimestamp; }
    /**
     * CORGE_CLOB: {CLOB}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorgeClob() { return _columnCorgeClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCorgeId());
        ls.add(columnCorgeName());
        ls.add(columnCorgeDecimal());
        ls.add(columnCorgeDate());
        ls.add(columnCorgeTimestamp());
        ls.add(columnCorgeClob());
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.CorgeBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CorgeBean> getEntityType() { return CorgeBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CorgeBean newEntity() { return new CorgeBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CorgeBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CorgeBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
