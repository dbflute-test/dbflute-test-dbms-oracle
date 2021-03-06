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
 * The base condition-query of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public class BsVendorSynonymMemberCQ extends AbstractBsVendorSynonymMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorSynonymMemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorSynonymMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from VENDOR_SYNONYM_MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorSynonymMemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorSynonymMemberCIQ xcreateCIQ() {
        VendorSynonymMemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorSynonymMemberCIQ xnewCIQ() {
        return new VendorSynonymMemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join VENDOR_SYNONYM_MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorSynonymMemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorSynonymMemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberId_ExistsReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberId_ExistsReferrer_SynonymMemberLoginList"); }
    public String keepMemberId_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberId_ExistsReferrer_SynonymMemberLoginList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberId_NotExistsReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberId_NotExistsReferrer_SynonymMemberLoginList"); }
    public String keepMemberId_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_SynonymMemberLoginList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_SynonymMemberLoginList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberId_QueryDerivedReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberId_QueryDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_SynonymMemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_SynonymMemberLoginList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /**
     * Add order-by as ascend. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue xdfgetMemberAccount()
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected ConditionValue xgetCValueMemberAccount() { return xdfgetMemberAccount(); }

    /**
     * Add order-by as ascend. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    /**
     * Add order-by as ascend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue xdfgetFormalizedDatetime()
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected ConditionValue xgetCValueFormalizedDatetime() { return xdfgetFormalizedDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue xdfgetBirthdate()
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected ConditionValue xgetCValueBirthdate() { return xdfgetBirthdate(); }

    /**
     * Add order-by as ascend. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /**
     * Add order-by as ascend. <br>
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /**
     * Add order-by as ascend. <br>
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorSynonymMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsVendorSynonymMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorSynonymMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorSynonymMemberCQ bq = (VendorSynonymMemberCQ)bqs;
        VendorSynonymMemberCQ uq = (VendorSynonymMemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQuerySynonymMemberWithdrawalAsOne()) {
            uq.querySynonymMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.querySynonymMemberWithdrawalAsOne(), uq.querySynonymMemberWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public MemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("VENDOR_SYNONYM_MEMBER", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public SynonymMemberWithdrawalCQ querySynonymMemberWithdrawalAsOne() { return xdfgetConditionQuerySynonymMemberWithdrawalAsOne(); }
    public SynonymMemberWithdrawalCQ xdfgetConditionQuerySynonymMemberWithdrawalAsOne() {
        String prop = "synonymMemberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQuerySynonymMemberWithdrawalAsOne()); xsetupOuterJoinSynonymMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected SynonymMemberWithdrawalCQ xcreateQuerySynonymMemberWithdrawalAsOne() {
        String nrp = xresolveNRP("VENDOR_SYNONYM_MEMBER", "synonymMemberWithdrawalAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new SynonymMemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "synonymMemberWithdrawalAsOne", nrp);
    }
    protected void xsetupOuterJoinSynonymMemberWithdrawalAsOne() { xregOutJo("synonymMemberWithdrawalAsOne"); }
    public boolean hasConditionQuerySynonymMemberWithdrawalAsOne() { return xhasQueRlMap("synonymMemberWithdrawalAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorSynonymMemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorSynonymMemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorSynonymMemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorSynonymMemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorSynonymMemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorSynonymMemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorSynonymMemberCQ> _myselfExistsMap;
    public Map<String, VendorSynonymMemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorSynonymMemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorSynonymMemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorSynonymMemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorSynonymMemberCB.class.getName(); }
    protected String xCQ() { return VendorSynonymMemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
