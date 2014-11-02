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
 * The base condition-query of VENDOR_LARGE_NAME_90123456_REF.
 * @author oracleman
 */
public class BsVendorLargeName90123456RefCQ extends AbstractBsVendorLargeName90123456RefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeName90123456RefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeName90123456RefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from VENDOR_LARGE_NAME_90123456_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeName90123456RefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeName90123456RefCIQ xcreateCIQ() {
        VendorLargeName90123456RefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeName90123456RefCIQ xnewCIQ() {
        return new VendorLargeName90123456RefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join VENDOR_LARGE_NAME_90123456_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeName90123456RefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeName90123456RefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorLargeName90123RefId;
    public ConditionValue xdfgetVendorLargeName90123RefId()
    { if (_vendorLargeName90123RefId == null) { _vendorLargeName90123RefId = nCV(); }
      return _vendorLargeName90123RefId; }
    protected ConditionValue xgetCValueVendorLargeName90123RefId() { return xdfgetVendorLargeName90123RefId(); }

    /** 
     * Add order-by as ascend. <br>
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName90123RefId_Asc() { regOBA("VENDOR_LARGE_NAME_90123_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_LARGE_NAME_90123_REF_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName90123RefId_Desc() { regOBD("VENDOR_LARGE_NAME_90123_REF_ID"); return this; }

    protected ConditionValue _vendorLargeName901RefName;
    public ConditionValue xdfgetVendorLargeName901RefName()
    { if (_vendorLargeName901RefName == null) { _vendorLargeName901RefName = nCV(); }
      return _vendorLargeName901RefName; }
    protected ConditionValue xgetCValueVendorLargeName901RefName() { return xdfgetVendorLargeName901RefName(); }

    /** 
     * Add order-by as ascend. <br>
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901RefName_Asc() { regOBA("VENDOR_LARGE_NAME_901_REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_LARGE_NAME_901_REF_NAME: {NotNull, VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901RefName_Desc() { regOBD("VENDOR_LARGE_NAME_901_REF_NAME"); return this; }

    protected ConditionValue _vendorLargeName901234567Id;
    public ConditionValue xdfgetVendorLargeName901234567Id()
    { if (_vendorLargeName901234567Id == null) { _vendorLargeName901234567Id = nCV(); }
      return _vendorLargeName901234567Id; }
    protected ConditionValue xgetCValueVendorLargeName901234567Id() { return xdfgetVendorLargeName901234567Id(); }

    /** 
     * Add order-by as ascend. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901234567Id_Asc() { regOBA("VENDOR_LARGE_NAME_901234567_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {NUMBER(16), FK to VENDOR_LARGE_NAME_901234567890}
     * @return this. (NotNull)
     */
    public BsVendorLargeName90123456RefCQ addOrderBy_VendorLargeName901234567Id_Desc() { regOBD("VENDOR_LARGE_NAME_901234567_ID"); return this; }

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
    public BsVendorLargeName90123456RefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorLargeName90123456RefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        VendorLargeName90123456RefCQ bq = (VendorLargeName90123456RefCQ)bqs;
        VendorLargeName90123456RefCQ uq = (VendorLargeName90123456RefCQ)uqs;
        if (bq.hasConditionQueryVendorLargeName901234567890()) {
            uq.queryVendorLargeName901234567890().reflectRelationOnUnionQuery(bq.queryVendorLargeName901234567890(), uq.queryVendorLargeName901234567890());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * VENDOR_LARGE_NAME_901234567890 by my VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName901234567890'.
     * @return The instance of condition-query. (NotNull)
     */
    public VendorLargeName901234567890CQ queryVendorLargeName901234567890() {
        return xdfgetConditionQueryVendorLargeName901234567890();
    }
    public VendorLargeName901234567890CQ xdfgetConditionQueryVendorLargeName901234567890() {
        String prop = "vendorLargeName901234567890";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorLargeName901234567890()); xsetupOuterJoinVendorLargeName901234567890(); }
        return xgetQueRlMap(prop);
    }
    protected VendorLargeName901234567890CQ xcreateQueryVendorLargeName901234567890() {
        String nrp = xresolveNRP("VENDOR_LARGE_NAME_90123456_REF", "vendorLargeName901234567890"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new VendorLargeName901234567890CQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorLargeName901234567890", nrp);
    }
    protected void xsetupOuterJoinVendorLargeName901234567890() { xregOutJo("vendorLargeName901234567890"); }
    public boolean hasConditionQueryVendorLargeName901234567890() { return xhasQueRlMap("vendorLargeName901234567890"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, VendorLargeName90123456RefCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorLargeName90123456RefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorLargeName90123456RefCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorLargeName90123456RefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorLargeName90123456RefCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorLargeName90123456RefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorLargeName90123456RefCQ> _myselfExistsMap;
    public Map<String, VendorLargeName90123456RefCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorLargeName90123456RefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorLargeName90123456RefCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorLargeName90123456RefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeName90123456RefCB.class.getName(); }
    protected String xCQ() { return VendorLargeName90123456RefCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
