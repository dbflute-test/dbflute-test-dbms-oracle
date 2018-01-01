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
 * The base condition-query of MEMBER_STATUS.
 * @author oracleman
 */
public class BsMemberStatusCQ extends AbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberStatusCIQ xcreateCIQ() {
        MemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberStatusCIQ xnewCIQ() {
        return new MemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    public Map<String, MemberCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberVendorSynonymCQ> xdfgetMemberStatusCode_ExistsReferrer_MemberVendorSynonymList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_MemberVendorSynonymList"); }
    public String keepMemberStatusCode_ExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_MemberVendorSynonymList", sq); }

    public Map<String, SynonymMemberCQ> xdfgetMemberStatusCode_ExistsReferrer_SynonymMemberList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_SynonymMemberList"); }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberList(SynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_SynonymMemberList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberStatusCode_ExistsReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_SynonymMemberLoginList"); }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_SynonymMemberLoginList", sq); }

    public Map<String, VendorSynonymMemberCQ> xdfgetMemberStatusCode_ExistsReferrer_VendorSynonymMemberList() { return xgetSQueMap("memberStatusCode_ExistsReferrer_VendorSynonymMemberList"); }
    public String keepMemberStatusCode_ExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_ExistsReferrer_VendorSynonymMemberList", sq); }

    public Map<String, MemberCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberLoginList", sq); }

    public Map<String, MemberVendorSynonymCQ> xdfgetMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberVendorSynonymList"); }
    public String keepMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_MemberVendorSynonymList", sq); }

    public Map<String, SynonymMemberCQ> xdfgetMemberStatusCode_NotExistsReferrer_SynonymMemberList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_SynonymMemberList"); }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberList(SynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_SynonymMemberList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_SynonymMemberLoginList"); }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_SynonymMemberLoginList", sq); }

    public Map<String, VendorSynonymMemberCQ> xdfgetMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList() { return xgetSQueMap("memberStatusCode_NotExistsReferrer_VendorSynonymMemberList"); }
    public String keepMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_NotExistsReferrer_VendorSynonymMemberList", sq); }

    public Map<String, MemberCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberList", sq); }

    public Map<String, MemberLoginCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList", sq); }

    public Map<String, MemberVendorSynonymCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList", sq); }

    public Map<String, SynonymMemberCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_SynonymMemberList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_SynonymMemberList", sq); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList", sq); }

    public Map<String, VendorSynonymMemberCQ> xdfgetMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList() { return xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList"); }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList", sq); }

    public Map<String, MemberCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberList", pm); }

    public Map<String, MemberLoginCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberLoginList", pm); }

    public Map<String, MemberVendorSynonymCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList", pm); }

    public Map<String, SynonymMemberCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_SynonymMemberList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_SynonymMemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_SynonymMemberList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_SynonymMemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_SynonymMemberList", pm); }

    public Map<String, SynonymMemberLoginCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList", pm); }

    public Map<String, VendorSynonymMemberCQ> xdfgetMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList() { return xgetSQueMap("memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) { return xkeepSQue("memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList", sq); }
    public Map<String, Object> xdfgetMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter() { return xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList"); }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter(Object pm) { return xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList", pm); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue xdfgetMemberStatusName()
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected ConditionValue xgetCValueMemberStatusName() { return xdfgetMemberStatusName(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /**
     * Add order-by as ascend. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MemberStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberStatusCQ> _myselfExistsMap;
    public Map<String, MemberStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberStatusCB.class.getName(); }
    protected String xCQ() { return MemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
