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
 * The DB meta of WHITE_DIFF_WORLD. (Singleton)
 * @author oracleman
 */
public class WhiteDiffWorldDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDiffWorldDbm _instance = new WhiteDiffWorldDbm();
    private WhiteDiffWorldDbm() {}
    public static WhiteDiffWorldDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDiffWorld)et).getDiffWorldId(), (et, vl) -> ((WhiteDiffWorld)et).setDiffWorldId(ctl(vl)), "diffWorldId");
        setupEpg(_epgMap, et -> ((WhiteDiffWorld)et).getDiffWorldName(), (et, vl) -> ((WhiteDiffWorld)et).setDiffWorldName((String)vl), "diffWorldName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DIFF_WORLD";
    protected final String _tableDispName = "WHITE_DIFF_WORLD";
    protected final String _tablePropertyName = "whiteDiffWorld";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DIFF_WORLD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDiffWorldId = cci("DIFF_WORLD_ID", "DIFF_WORLD_ID", null, null, Long.class, "diffWorldId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDiffWorldName = cci("DIFF_WORLD_NAME", "DIFF_WORLD_NAME", null, null, String.class, "diffWorldName", null, false, false, true, "VARCHAR2", 50, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffWorldId() { return _columnDiffWorldId; }
    /**
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiffWorldName() { return _columnDiffWorldName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDiffWorldId());
        ls.add(columnDiffWorldName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDiffWorldId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteDiffWorld"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteDiffWorldCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteDiffWorldBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDiffWorld> getEntityType() { return WhiteDiffWorld.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDiffWorld newEntity() { return new WhiteDiffWorld(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDiffWorld)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDiffWorld)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
