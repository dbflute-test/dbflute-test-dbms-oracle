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
 * The DB meta of WHITE_REF_TARGET. (Singleton)
 * @author oracleman
 */
public class WhiteRefTargetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteRefTargetDbm _instance = new WhiteRefTargetDbm();
    private WhiteRefTargetDbm() {}
    public static WhiteRefTargetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteRefTarget)et).getRefTargetId(), (et, vl) -> ((WhiteRefTarget)et).setRefTargetId(ctl(vl)), "refTargetId");
        setupEpg(_epgMap, et -> ((WhiteRefTarget)et).getTargetId(), (et, vl) -> ((WhiteRefTarget)et).setTargetId(ctl(vl)), "targetId");
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
        setupEfpg(_efpgMap, et -> ((WhiteRefTarget)et).getWhiteTarget(), (et, vl) -> ((WhiteRefTarget)et).setWhiteTarget((OptionalEntity<WhiteTarget>)vl), "whiteTarget");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_REF_TARGET";
    protected final String _tableDispName = "WHITE_REF_TARGET";
    protected final String _tablePropertyName = "whiteRefTarget";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_REF_TARGET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefTargetId = cci("REF_TARGET_ID", "REF_TARGET_ID", null, null, Long.class, "refTargetId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetId = cci("TARGET_ID", "TARGET_ID", null, null, Long.class, "targetId", null, false, false, true, "NUMBER", 16, 0, null, null, false, null, null, "whiteTarget", null, null, false);

    /**
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefTargetId() { return _columnRefTargetId; }
    /**
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetId() { return _columnTargetId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefTargetId());
        ls.add(columnTargetId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefTargetId()); }
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
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteTarget() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTargetId(), WhiteTargetDbm.getInstance().columnTargetId());
        return cfi("FK_WHITE_REF_TARGET", "whiteTarget", this, WhiteTargetDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteRefTargetList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteRefTarget"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteRefTargetCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteRefTargetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteRefTarget> getEntityType() { return WhiteRefTarget.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteRefTarget newEntity() { return new WhiteRefTarget(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteRefTarget)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteRefTarget)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
