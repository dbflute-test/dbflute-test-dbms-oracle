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
 * The DB meta of WHITE_UQ_FK_REF_NEST. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkRefNestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkRefNestDbm _instance = new WhiteUqFkRefNestDbm();
    private WhiteUqFkRefNestDbm() {}
    public static WhiteUqFkRefNestDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqFkRefNest)et).getUqFkRefNestId(), (et, vl) -> ((WhiteUqFkRefNest)et).setUqFkRefNestId(ctl(vl)), "uqFkRefNestId");
        setupEpg(_epgMap, et -> ((WhiteUqFkRefNest)et).getCompoundUqFirstCode(), (et, vl) -> ((WhiteUqFkRefNest)et).setCompoundUqFirstCode((String)vl), "compoundUqFirstCode");
        setupEpg(_epgMap, et -> ((WhiteUqFkRefNest)et).getCompoundUqSecondCode(), (et, vl) -> ((WhiteUqFkRefNest)et).setCompoundUqSecondCode((String)vl), "compoundUqSecondCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteUqFkRefNest)et).getWhiteUqFkRef(), (et, vl) -> ((WhiteUqFkRefNest)et).setWhiteUqFkRef((OptionalEntity<WhiteUqFkRef>)vl), "whiteUqFkRef");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_REF_NEST";
    protected final String _tablePropertyName = "whiteUqFkRefNest";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_REF_NEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefNestId = cci("UQ_FK_REF_NEST_ID", "UQ_FK_REF_NEST_ID", null, null, Long.class, "uqFkRefNestId", null, true, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, String.class, "compoundUqFirstCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whiteUqFkRef", null, null, false);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, String.class, "compoundUqSecondCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whiteUqFkRef", null, null, false);

    /**
     * UQ_FK_REF_NEST_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkRefNestId() { return _columnUqFkRefNestId; }
    /**
     * COMPOUND_UQ_FIRST_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    /**
     * COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefNestId());
        ls.add(columnCompoundUqFirstCode());
        ls.add(columnCompoundUqSecondCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqFkRefNestId()); }
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
     * WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkRef() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCompoundUqFirstCode(), WhiteUqFkRefDbm.getInstance().columnCompoundUqFirstCode());
        mp.put(columnCompoundUqSecondCode(), WhiteUqFkRefDbm.getInstance().columnCompoundUqSecondCode());
        return cfi("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRef", this, WhiteUqFkRefDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteUqFkRefNestList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteUqFkRefNest"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteUqFkRefNestCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkRefNestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkRefNest> getEntityType() { return WhiteUqFkRefNest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqFkRefNest newEntity() { return new WhiteUqFkRefNest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkRefNest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkRefNest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
