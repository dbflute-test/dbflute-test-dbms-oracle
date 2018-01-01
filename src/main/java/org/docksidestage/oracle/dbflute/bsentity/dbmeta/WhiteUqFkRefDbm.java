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
 * The DB meta of WHITE_UQ_FK_REF. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkRefDbm _instance = new WhiteUqFkRefDbm();
    private WhiteUqFkRefDbm() {}
    public static WhiteUqFkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqFkRef)et).getUqFkRefId(), (et, vl) -> ((WhiteUqFkRef)et).setUqFkRefId(ctl(vl)), "uqFkRefId");
        setupEpg(_epgMap, et -> ((WhiteUqFkRef)et).getFkToPkId(), (et, vl) -> ((WhiteUqFkRef)et).setFkToPkId(ctl(vl)), "fkToPkId");
        setupEpg(_epgMap, et -> ((WhiteUqFkRef)et).getFkToUqCode(), (et, vl) -> ((WhiteUqFkRef)et).setFkToUqCode((String)vl), "fkToUqCode");
        setupEpg(_epgMap, et -> ((WhiteUqFkRef)et).getCompoundUqFirstCode(), (et, vl) -> ((WhiteUqFkRef)et).setCompoundUqFirstCode((String)vl), "compoundUqFirstCode");
        setupEpg(_epgMap, et -> ((WhiteUqFkRef)et).getCompoundUqSecondCode(), (et, vl) -> ((WhiteUqFkRef)et).setCompoundUqSecondCode((String)vl), "compoundUqSecondCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteUqFkRef)et).getWhiteUqFkByFkToPkId(), (et, vl) -> ((WhiteUqFkRef)et).setWhiteUqFkByFkToPkId((OptionalEntity<WhiteUqFk>)vl), "whiteUqFkByFkToPkId");
        setupEfpg(_efpgMap, et -> ((WhiteUqFkRef)et).getWhiteUqFkByFkToUqCode(), (et, vl) -> ((WhiteUqFkRef)et).setWhiteUqFkByFkToUqCode((OptionalEntity<WhiteUqFk>)vl), "whiteUqFkByFkToUqCode");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_REF";
    protected final String _tableDispName = "WHITE_UQ_FK_REF";
    protected final String _tablePropertyName = "whiteUqFkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, Long.class, "uqFkRefId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFkToPkId = cci("FK_TO_PK_ID", "FK_TO_PK_ID", null, null, Long.class, "fkToPkId", null, false, false, true, "NUMBER", 16, 0, null, null, false, null, null, "whiteUqFkByFkToPkId", null, null, false);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, String.class, "fkToUqCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, "whiteUqFkByFkToUqCode", null, null, false);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, String.class, "compoundUqFirstCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "whiteUqFkRefNestList", null, false);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, String.class, "compoundUqSecondCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "whiteUqFkRefNestList", null, false);

    /**
     * UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    /**
     * FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFkToPkId() { return _columnFkToPkId; }
    /**
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }
    /**
     * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    /**
     * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefId());
        ls.add(columnFkToPkId());
        ls.add(columnFkToUqCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnUqFkRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCompoundUqFirstCode());
        ls.add(columnCompoundUqSecondCode());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkByFkToPkId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToPkId(), WhiteUqFkDbm.getInstance().columnUqFkId());
        return cfi("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkByFkToPkId", this, WhiteUqFkDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteUqFkRefByFkToPkIdList", false);
    }
    /**
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkByFkToUqCode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkByFkToUqCode", this, WhiteUqFkDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteUqFkRefByFkToUqCodeList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteUqFkRefNestList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCompoundUqFirstCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqFirstCode());
        mp.put(columnCompoundUqSecondCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqSecondCode());
        return cri("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRefNestList", this, WhiteUqFkRefNestDbm.getInstance(), mp, false, "whiteUqFkRef");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteUqFkRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteUqFkRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkRef> getEntityType() { return WhiteUqFkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqFkRef newEntity() { return new WhiteUqFkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
