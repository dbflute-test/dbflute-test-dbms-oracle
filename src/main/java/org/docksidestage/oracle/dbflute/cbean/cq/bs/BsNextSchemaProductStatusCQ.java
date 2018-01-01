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
 * The base condition-query of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public class BsNextSchemaProductStatusCQ extends AbstractBsNextSchemaProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextSchemaProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from NEXT_SCHEMA_PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextSchemaProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextSchemaProductStatusCIQ xcreateCIQ() {
        NextSchemaProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextSchemaProductStatusCIQ xnewCIQ() {
        return new NextSchemaProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join NEXT_SCHEMA_PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextSchemaProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextSchemaProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productStatusCode;
    public ConditionValue xdfgetProductStatusCode()
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected ConditionValue xgetCValueProductStatusCode() { return xdfgetProductStatusCode(); }

    public Map<String, WhiteRefNextTargetCQ> xdfgetProductStatusCode_ExistsReferrer_WhiteRefNextTargetList() { return xgetSQueMap("productStatusCode_ExistsReferrer_WhiteRefNextTargetList"); }
    public String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_WhiteRefNextTargetList", sq); }

    public Map<String, NextSchemaProductCQ> xdfgetProductStatusCode_ExistsReferrer_NextSchemaProductList() { return xgetSQueMap("productStatusCode_ExistsReferrer_NextSchemaProductList"); }
    public String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq) { return xkeepSQue("productStatusCode_ExistsReferrer_NextSchemaProductList", sq); }

    public Map<String, WhiteRefNextTargetCQ> xdfgetProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_WhiteRefNextTargetList"); }
    public String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_WhiteRefNextTargetList", sq); }

    public Map<String, NextSchemaProductCQ> xdfgetProductStatusCode_NotExistsReferrer_NextSchemaProductList() { return xgetSQueMap("productStatusCode_NotExistsReferrer_NextSchemaProductList"); }
    public String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq) { return xkeepSQue("productStatusCode_NotExistsReferrer_NextSchemaProductList", sq); }

    public Map<String, WhiteRefNextTargetCQ> xdfgetProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList", sq); }

    public Map<String, NextSchemaProductCQ> xdfgetProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList() { return xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_NextSchemaProductList"); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq) { return xkeepSQue("productStatusCode_SpecifyDerivedReferrer_NextSchemaProductList", sq); }

    public Map<String, WhiteRefNextTargetCQ> xdfgetProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList", sq); }
    public Map<String, Object> xdfgetProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList", pm); }

    public Map<String, NextSchemaProductCQ> xdfgetProductStatusCode_QueryDerivedReferrer_NextSchemaProductList() { return xgetSQueMap("productStatusCode_QueryDerivedReferrer_NextSchemaProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq) { return xkeepSQue("productStatusCode_QueryDerivedReferrer_NextSchemaProductList", sq); }
    public Map<String, Object> xdfgetProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter() { return xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_NextSchemaProductList"); }
    public String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object pm) { return xkeepSQuePm("productStatusCode_QueryDerivedReferrer_NextSchemaProductList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue xdfgetProductStatusName()
    { if (_productStatusName == null) { _productStatusName = nCV(); }
      return _productStatusName; }
    protected ConditionValue xgetCValueProductStatusName() { return xdfgetProductStatusName(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

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
    public BsNextSchemaProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsNextSchemaProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, NextSchemaProductStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(NextSchemaProductStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, NextSchemaProductStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, NextSchemaProductStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(NextSchemaProductStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, NextSchemaProductStatusCQ> _myselfExistsMap;
    public Map<String, NextSchemaProductStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(NextSchemaProductStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, NextSchemaProductStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(NextSchemaProductStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextSchemaProductStatusCB.class.getName(); }
    protected String xCQ() { return NextSchemaProductStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
