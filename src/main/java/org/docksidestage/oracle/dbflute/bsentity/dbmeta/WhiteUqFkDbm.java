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
 * The DB meta of WHITE_UQ_FK. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkDbm _instance = new WhiteUqFkDbm();
    private WhiteUqFkDbm() {}
    public static WhiteUqFkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteUqFk)et).getUqFkId(), (et, vl) -> ((WhiteUqFk)et).setUqFkId(ctl(vl)), "uqFkId");
        setupEpg(_epgMap, et -> ((WhiteUqFk)et).getUqFkCode(), (et, vl) -> ((WhiteUqFk)et).setUqFkCode((String)vl), "uqFkCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK";
    protected final String _tableDispName = "WHITE_UQ_FK";
    protected final String _tablePropertyName = "whiteUqFk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkId = cci("UQ_FK_ID", "UQ_FK_ID", null, null, Long.class, "uqFkId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, "whiteUqFkRefByFkToPkIdList", null, false);
    protected final ColumnInfo _columnUqFkCode = cci("UQ_FK_CODE", "UQ_FK_CODE", null, null, String.class, "uqFkCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, "whiteUqFkRefByFkToUqCodeList", null, false);

    /**
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkId() { return _columnUqFkId; }
    /**
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUqFkCode() { return _columnUqFkCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkId());
        ls.add(columnUqFkCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqFkId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUqFkCode()); }

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
    /**
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteUqFkRefByFkToPkIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUqFkId(), WhiteUqFkRefDbm.getInstance().columnFkToPkId());
        return cri("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkRefByFkToPkIdList", this, WhiteUqFkRefDbm.getInstance(), mp, false, "whiteUqFkByFkToPkId");
    }
    /**
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteUqFkRefByFkToUqCodeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUqFkCode(), WhiteUqFkRefDbm.getInstance().columnFkToUqCode());
        return cri("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkRefByFkToUqCodeList", this, WhiteUqFkRefDbm.getInstance(), mp, false, "whiteUqFkByFkToUqCode");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WhiteUqFk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WhiteUqFkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFk> getEntityType() { return WhiteUqFk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteUqFk newEntity() { return new WhiteUqFk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
