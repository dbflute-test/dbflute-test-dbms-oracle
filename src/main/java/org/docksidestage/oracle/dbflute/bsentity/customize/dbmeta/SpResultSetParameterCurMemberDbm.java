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
 * The DB meta of SpResultSetParameterCurMember. (Singleton)
 * @author oracleman
 */
public class SpResultSetParameterCurMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpResultSetParameterCurMemberDbm _instance = new SpResultSetParameterCurMemberDbm();
    private SpResultSetParameterCurMemberDbm() {}
    public static SpResultSetParameterCurMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SpResultSetParameterCurMember)et).getMemberId(), (et, vl) -> ((SpResultSetParameterCurMember)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((SpResultSetParameterCurMember)et).getMemberName(), (et, vl) -> ((SpResultSetParameterCurMember)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((SpResultSetParameterCurMember)et).getBirthdate(), (et, vl) -> ((SpResultSetParameterCurMember)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((SpResultSetParameterCurMember)et).getFormalizedDatetime(), (et, vl) -> ((SpResultSetParameterCurMember)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((SpResultSetParameterCurMember)et).getMemberStatusCode(), (et, vl) -> ((SpResultSetParameterCurMember)et).setMemberStatusCode((String)vl), "memberStatusCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpResultSetParameterCurMember";
    protected final String _tableDispName = "SpResultSetParameterCurMember";
    protected final String _tablePropertyName = "spResultSetParameterCurMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpResultSetParameterCurMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, false, "NUMBER", 9, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, String.class, "memberName", null, false, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, java.time.LocalDate.class, "birthdate", null, false, false, false, "DATE", 7, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "TIMESTAMP", 11, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, String.class, "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null, false);

    /**
     * MEMBER_ID: {NUMBER(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * MEMBER_NAME: {VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * BIRTHDATE: {DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * FORMALIZED_DATETIME: {TIMESTAMP(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.customize.SpResultSetParameterCurMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpResultSetParameterCurMember> getEntityType() { return SpResultSetParameterCurMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpResultSetParameterCurMember newEntity() { return new SpResultSetParameterCurMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpResultSetParameterCurMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpResultSetParameterCurMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
