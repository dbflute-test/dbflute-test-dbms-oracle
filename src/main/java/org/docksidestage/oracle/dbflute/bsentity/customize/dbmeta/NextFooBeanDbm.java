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
 * The DB meta of NEXT_FOO_BEAN. (Singleton)
 * @author oracleman
 */
public class NextFooBeanDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextFooBeanDbm _instance = new NextFooBeanDbm();
    private NextFooBeanDbm() {}
    public static NextFooBeanDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooId(), (et, vl) -> ((NextFooBean)et).setFooId(cti(vl)), "fooId");
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooName(), (et, vl) -> ((NextFooBean)et).setFooName((String)vl), "fooName");
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooDecimal(), (et, vl) -> ((NextFooBean)et).setFooDecimal(ctb(vl)), "fooDecimal");
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooDate(), (et, vl) -> ((NextFooBean)et).setFooDate(ctld(vl)), "fooDate");
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooTimestamp(), (et, vl) -> ((NextFooBean)et).setFooTimestamp(ctldt(vl)), "fooTimestamp");
        setupEpg(_epgMap, et -> ((NextFooBean)et).getFooClob(), (et, vl) -> ((NextFooBean)et).setFooClob((String)vl), "fooClob");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_FOO_BEAN";
    protected final String _tablePropertyName = "nextFooBean";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEWURAYASUDB.NEXT_FOO_BEAN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFooId = cci("FOO_ID", "FOO_ID", null, null, Integer.class, "fooId", null, false, false, false, "NUMBER", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooName = cci("FOO_NAME", "FOO_NAME", null, null, String.class, "fooName", null, false, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooDecimal = cci("FOO_DECIMAL", "FOO_DECIMAL", null, null, java.math.BigDecimal.class, "fooDecimal", null, false, false, false, "NUMBER", 5, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooDate = cci("FOO_DATE", "FOO_DATE", null, null, java.time.LocalDate.class, "fooDate", null, false, false, false, "DATE", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooTimestamp = cci("FOO_TIMESTAMP", "FOO_TIMESTAMP", null, null, java.time.LocalDateTime.class, "fooTimestamp", null, false, false, false, "TIMESTAMP", null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFooClob = cci("FOO_CLOB", "FOO_CLOB", null, null, String.class, "fooClob", null, false, false, false, "CLOB", null, null, null, false, null, null, null, null, null, false);

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
     * FOO_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooDecimal() { return _columnFooDecimal; }
    /**
     * FOO_DATE: {DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooDate() { return _columnFooDate; }
    /**
     * FOO_TIMESTAMP: {TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooTimestamp() { return _columnFooTimestamp; }
    /**
     * FOO_CLOB: {CLOB}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFooClob() { return _columnFooClob; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFooId());
        ls.add(columnFooName());
        ls.add(columnFooDecimal());
        ls.add(columnFooDate());
        ls.add(columnFooTimestamp());
        ls.add(columnFooClob());
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.NextFooBean"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextFooBean> getEntityType() { return NextFooBean.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NextFooBean newEntity() { return new NextFooBean(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextFooBean)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextFooBean)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
