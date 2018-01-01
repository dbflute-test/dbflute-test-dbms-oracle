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
 * The DB meta of SYNONYM_REF_EXCEPT. (Singleton)
 * @author oracleman
 */
public class SynonymRefExceptDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SynonymRefExceptDbm _instance = new SynonymRefExceptDbm();
    private SynonymRefExceptDbm() {}
    public static SynonymRefExceptDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SynonymRefExcept)et).getRefExceptId(), (et, vl) -> ((SynonymRefExcept)et).setRefExceptId(ctl(vl)), "refExceptId");
        setupEpg(_epgMap, et -> ((SynonymRefExcept)et).getExceptId(), (et, vl) -> ((SynonymRefExcept)et).setExceptId(ctl(vl)), "exceptId");
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
        setupEfpg(_efpgMap, et -> ((SynonymRefExcept)et).getSynonymExcept(), (et, vl) -> ((SynonymRefExcept)et).setSynonymExcept((OptionalEntity<SynonymExcept>)vl), "synonymExcept");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SYNONYM_REF_EXCEPT";
    protected final String _tableDispName = "SYNONYM_REF_EXCEPT";
    protected final String _tablePropertyName = "synonymRefExcept";
    protected final TableSqlName _tableSqlName = new TableSqlName("SYNONYM_REF_EXCEPT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefExceptId = cci("REF_EXCEPT_ID", "REF_EXCEPT_ID", null, null, Long.class, "refExceptId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExceptId = cci("EXCEPT_ID", "EXCEPT_ID", null, null, Long.class, "exceptId", null, false, false, true, "NUMBER", 16, 0, null, null, false, null, null, "synonymExcept", null, null, false);

    /**
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefExceptId() { return _columnRefExceptId; }
    /**
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptId() { return _columnExceptId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefExceptId());
        ls.add(columnExceptId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefExceptId()); }
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
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSynonymExcept() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnExceptId(), SynonymExceptDbm.getInstance().columnExceptId());
        return cfi("FK_WHITE_REF_EXCEPT_SYNONYM1", "synonymExcept", this, SynonymExceptDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "synonymRefExceptList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.SynonymRefExcept"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.SynonymRefExceptCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.SynonymRefExceptBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SynonymRefExcept> getEntityType() { return SynonymRefExcept.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SynonymRefExcept newEntity() { return new SynonymRefExcept(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SynonymRefExcept)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SynonymRefExcept)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
