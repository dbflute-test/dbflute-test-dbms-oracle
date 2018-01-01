package org.docksidestage.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.oracle.dbflute.cbean.cq.ciq.*;
import org.docksidestage.oracle.dbflute.cbean.*;
import org.docksidestage.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class BsSynonymMemberWithdrawalCQ extends AbstractBsSynonymMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SYNONYM_MEMBER_WITHDRAWAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymMemberWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymMemberWithdrawalCIQ xcreateCIQ() {
        SynonymMemberWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymMemberWithdrawalCIQ xnewCIQ() {
        return new SynonymMemberWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SYNONYM_MEMBER_WITHDRAWAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymMemberWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymMemberWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue xdfgetWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return xdfgetWithdrawalReasonCode(); }

    /**
     * Add order-by as ascend. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue xdfgetWithdrawalReasonInputText()
    { if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
      return _withdrawalReasonInputText; }
    protected ConditionValue xgetCValueWithdrawalReasonInputText() { return xdfgetWithdrawalReasonInputText(); }

    /**
     * Add order-by as ascend. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue xdfgetWithdrawalDatetime()
    { if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
      return _withdrawalDatetime; }
    protected ConditionValue xgetCValueWithdrawalDatetime() { return xdfgetWithdrawalDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("WITHDRAWAL_DATETIME"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSynonymMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SynonymMemberWithdrawalCQ bq = (SynonymMemberWithdrawalCQ)bqs;
        SynonymMemberWithdrawalCQ uq = (SynonymMemberWithdrawalCQ)uqs;
        if (bq.hasConditionQueryMemberVendorSynonym()) {
            uq.queryMemberVendorSynonym().reflectRelationOnUnionQuery(bq.queryMemberVendorSynonym(), uq.queryMemberVendorSynonym());
        }
        if (bq.hasConditionQueryWithdrawalReason()) {
            uq.queryWithdrawalReason().reflectRelationOnUnionQuery(bq.queryWithdrawalReason(), uq.queryWithdrawalReason());
        }
        if (bq.hasConditionQuerySynonymMember()) {
            uq.querySynonymMember().reflectRelationOnUnionQuery(bq.querySynonymMember(), uq.querySynonymMember());
        }
        if (bq.hasConditionQueryVendorSynonymMember()) {
            uq.queryVendorSynonymMember().reflectRelationOnUnionQuery(bq.queryVendorSynonymMember(), uq.queryVendorSynonymMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberVendorSynonymCQ queryMemberVendorSynonym() {
        return xdfgetConditionQueryMemberVendorSynonym();
    }
    public MemberVendorSynonymCQ xdfgetConditionQueryMemberVendorSynonym() {
        String prop = "memberVendorSynonym";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberVendorSynonym()); xsetupOuterJoinMemberVendorSynonym(); }
        return xgetQueRlMap(prop);
    }
    protected MemberVendorSynonymCQ xcreateQueryMemberVendorSynonym() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_WITHDRAWAL", "memberVendorSynonym"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberVendorSynonymCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberVendorSynonym", nrp);
    }
    protected void xsetupOuterJoinMemberVendorSynonym() { xregOutJo("memberVendorSynonym"); }
    public boolean hasConditionQueryMemberVendorSynonym() { return xhasQueRlMap("memberVendorSynonym"); }

    /**
     * Get the condition-query for relation table. <br>
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The instance of condition-query. (NotNull)
     */
    public WithdrawalReasonCQ queryWithdrawalReason() {
        return xdfgetConditionQueryWithdrawalReason();
    }
    public WithdrawalReasonCQ xdfgetConditionQueryWithdrawalReason() {
        String prop = "withdrawalReason";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWithdrawalReason()); xsetupOuterJoinWithdrawalReason(); }
        return xgetQueRlMap(prop);
    }
    protected WithdrawalReasonCQ xcreateQueryWithdrawalReason() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_WITHDRAWAL", "withdrawalReason"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WithdrawalReasonCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "withdrawalReason", nrp);
    }
    protected void xsetupOuterJoinWithdrawalReason() { xregOutJo("withdrawalReason"); }
    public boolean hasConditionQueryWithdrawalReason() { return xhasQueRlMap("withdrawalReason"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberCQ querySynonymMember() {
        return xdfgetConditionQuerySynonymMember();
    }
    public SynonymMemberCQ xdfgetConditionQuerySynonymMember() {
        String prop = "synonymMember";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySynonymMember()); xsetupOuterJoinSynonymMember(); }
        return xgetQueRlMap(prop);
    }
    protected SynonymMemberCQ xcreateQuerySynonymMember() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_WITHDRAWAL", "synonymMember"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SynonymMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "synonymMember", nrp);
    }
    protected void xsetupOuterJoinSynonymMember() { xregOutJo("synonymMember"); }
    public boolean hasConditionQuerySynonymMember() { return xhasQueRlMap("synonymMember"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorSynonymMemberCQ queryVendorSynonymMember() {
        return xdfgetConditionQueryVendorSynonymMember();
    }
    public VendorSynonymMemberCQ xdfgetConditionQueryVendorSynonymMember() {
        String prop = "vendorSynonymMember";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorSynonymMember()); xsetupOuterJoinVendorSynonymMember(); }
        return xgetQueRlMap(prop);
    }
    protected VendorSynonymMemberCQ xcreateQueryVendorSynonymMember() {
        String nrp = xresolveNRP("SYNONYM_MEMBER_WITHDRAWAL", "vendorSynonymMember"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorSynonymMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorSynonymMember", nrp);
    }
    protected void xsetupOuterJoinVendorSynonymMember() { xregOutJo("vendorSynonymMember"); }
    public boolean hasConditionQueryVendorSynonymMember() { return xhasQueRlMap("vendorSynonymMember"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SynonymMemberWithdrawalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SynonymMemberWithdrawalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SynonymMemberWithdrawalCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SynonymMemberWithdrawalCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SynonymMemberWithdrawalCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SynonymMemberWithdrawalCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymMemberWithdrawalCQ> _myselfExistsMap;
    public Map<String, SynonymMemberWithdrawalCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SynonymMemberWithdrawalCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SynonymMemberWithdrawalCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SynonymMemberWithdrawalCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymMemberWithdrawalCB.class.getName(); }
    protected String xCQ() { return SynonymMemberWithdrawalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
