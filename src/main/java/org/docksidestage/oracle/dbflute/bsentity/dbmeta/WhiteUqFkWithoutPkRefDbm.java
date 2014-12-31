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
 * The DB meta of WHITE_UQ_FK_WITHOUT_PK_REF. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkWithoutPkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkWithoutPkRefDbm _instance = new WhiteUqFkWithoutPkRefDbm();
    private WhiteUqFkWithoutPkRefDbm() {}
    public static WhiteUqFkWithoutPkRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqFkWithoutPkRef)et).getUqFkRefId(), (et, vl) -> ((WhiteUqFkWithoutPkRef)et).setUqFkRefId(ctl(vl)), "uqFkRefId");
        setupEpg(_epgMap, et -> ((WhiteUqFkWithoutPkRef)et).getFkToUqCode(), (et, vl) -> ((WhiteUqFkWithoutPkRef)et).setFkToUqCode((String)vl), "fkToUqCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteUqFkWithoutPkRef)et).getWhiteUqFkWithoutPk(), (et, vl) -> ((WhiteUqFkWithoutPkRef)et).setWhiteUqFkWithoutPk((OptionalEntity<WhiteUqFkWithoutPk>)vl), "whiteUqFkWithoutPk");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_WITHOUT_PK_REF";
    protected final String _tablePropertyName = "whiteUqFkWithoutPkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_WITHOUT_PK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, Long.class, "uqFkRefId", null, false, false, true, "NUMBER", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, String.class, "fkToUqCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whiteUqFkWithoutPk", null, null, false);

    /**
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    /**
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefId());
        ls.add(columnFkToUqCode());
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
    /**
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteUqFkWithoutPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkWithoutPkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_WITHOUT_PK_REF", "whiteUqFkWithoutPk", this, WhiteUqFkWithoutPkDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteUqFkWithoutPkRefList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteUqFkWithoutPkRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteUqFkWithoutPkRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkWithoutPkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkWithoutPkRef> getEntityType() { return WhiteUqFkWithoutPkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqFkWithoutPkRef newEntity() { return new WhiteUqFkWithoutPkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkWithoutPkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkWithoutPkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
