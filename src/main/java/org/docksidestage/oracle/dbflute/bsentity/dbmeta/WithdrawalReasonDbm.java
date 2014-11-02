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
 * The DB meta of WITHDRAWAL_REASON. (Singleton)
 * @author oracleman
 */
public class WithdrawalReasonDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WithdrawalReasonDbm _instance = new WithdrawalReasonDbm();
    private WithdrawalReasonDbm() {}
    public static WithdrawalReasonDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
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
        setupEpg(_epgMap, et -> ((WithdrawalReason)et).getWithdrawalReasonCode(), (et, vl) -> {
            ColumnInfo col = columnWithdrawalReasonCode();
            CDef.WithdrawalReason cls = (CDef.WithdrawalReason)gcls(col, vl);
            if (cls != null) {
                ((WithdrawalReason)et).setWithdrawalReasonCodeAsWithdrawalReason(cls);
            } else {
                ((WithdrawalReason)et).mynativeMappingWithdrawalReasonCode((String)vl);
            }
        }, "withdrawalReasonCode");
        setupEpg(_epgMap, et -> ((WithdrawalReason)et).getWithdrawalReasonText(), (et, vl) -> ((WithdrawalReason)et).setWithdrawalReasonText((String)vl), "withdrawalReasonText");
        setupEpg(_epgMap, et -> ((WithdrawalReason)et).getDisplayOrder(), (et, vl) -> ((WithdrawalReason)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WITHDRAWAL_REASON";
    protected final String _tablePropertyName = "withdrawalReason";
    protected final TableSqlName _tableSqlName = new TableSqlName("WITHDRAWAL_REASON", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, String.class, "withdrawalReasonCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberWithdrawalList,synonymMemberWithdrawalList", CDef.DefMeta.WithdrawalReason);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, String.class, "withdrawalReasonText", null, false, false, true, "CLOB", 4000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "NUMBER", 8, 0, null, false, null, null, null, null, null);

    /**
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    /**
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    /**
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWithdrawalReasonCode()); }
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
    /**
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMemberWithdrawalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), MemberWithdrawalDbm.getInstance().columnWithdrawalReasonCode());
        return cri("FK_MEMBER_WITHDRAWAL_REASON", "memberWithdrawalList", this, MemberWithdrawalDbm.getInstance(), mp, false, "withdrawalReason");
    }
    /**
     * SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSynonymMemberWithdrawalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), SynonymMemberWithdrawalDbm.getInstance().columnWithdrawalReasonCode());
        return cri("FK_MEMBER_WITHDRAWAL_REASON", "synonymMemberWithdrawalList", this, SynonymMemberWithdrawalDbm.getInstance(), mp, false, "withdrawalReason");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.WithdrawalReason"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.WithdrawalReasonCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.WithdrawalReasonBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WithdrawalReason> getEntityType() { return WithdrawalReason.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WithdrawalReason newEntity() { return new WithdrawalReason(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WithdrawalReason)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WithdrawalReason)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
