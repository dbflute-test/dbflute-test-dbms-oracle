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
 * The DB meta of WHITE_SAME_NAME. (Singleton)
 * @author oracleman
 */
public class WhiteSameNameDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSameNameDbm _instance = new WhiteSameNameDbm();
    private WhiteSameNameDbm() {}
    public static WhiteSameNameDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSameName)et).getSameNameId(), (et, vl) -> ((WhiteSameName)et).setSameNameId(ctl(vl)), "sameNameId");
        setupEpg(_epgMap, et -> ((WhiteSameName)et).getSameNameName(), (et, vl) -> ((WhiteSameName)et).setSameNameName((String)vl), "sameNameName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_SAME_NAME";
    protected final String _tableDispName = "WHITE_SAME_NAME";
    protected final String _tablePropertyName = "whiteSameName";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SAME_NAME", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameId = cci("SAME_NAME_ID", "SAME_NAME_ID", null, null, Long.class, "sameNameId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSameNameName = cci("SAME_NAME_NAME", "SAME_NAME_NAME", null, null, String.class, "sameNameName", null, false, false, true, "VARCHAR2", 50, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SAME_NAME_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    /**
     * SAME_NAME_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameName() { return _columnSameNameName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameId());
        ls.add(columnSameNameName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteSameName"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteSameNameCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteSameNameBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSameName> getEntityType() { return WhiteSameName.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSameName newEntity() { return new WhiteSameName(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSameName)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSameName)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
