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
 * The base condition-query of SYNONYM_NEXT_LINK_SYNONYM.
 * @author oracleman
 */
public class BsSynonymNextLinkSynonymCQ extends AbstractBsSynonymNextLinkSynonymCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymNextLinkSynonymCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymNextLinkSynonymCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SYNONYM_NEXT_LINK_SYNONYM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SynonymNextLinkSynonymCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SynonymNextLinkSynonymCIQ xcreateCIQ() {
        SynonymNextLinkSynonymCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SynonymNextLinkSynonymCIQ xnewCIQ() {
        return new SynonymNextLinkSynonymCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SYNONYM_NEXT_LINK_SYNONYM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SynonymNextLinkSynonymCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SynonymNextLinkSynonymCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue xdfgetProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue xgetCValueProductName() { return xdfgetProductName(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue xdfgetProductHandleCode()
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected ConditionValue xgetCValueProductHandleCode() { return xdfgetProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsSynonymNextLinkSynonymCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsSynonymNextLinkSynonymCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSynonymNextLinkSynonymCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SynonymNextLinkSynonymCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SynonymNextLinkSynonymCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SynonymNextLinkSynonymCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SynonymNextLinkSynonymCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SynonymNextLinkSynonymCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SynonymNextLinkSynonymCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SynonymNextLinkSynonymCQ> _myselfExistsMap;
    public Map<String, SynonymNextLinkSynonymCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SynonymNextLinkSynonymCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SynonymNextLinkSynonymCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SynonymNextLinkSynonymCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SynonymNextLinkSynonymCB.class.getName(); }
    protected String xCQ() { return SynonymNextLinkSynonymCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
