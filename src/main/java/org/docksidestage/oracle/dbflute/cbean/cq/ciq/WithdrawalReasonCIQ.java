package org.docksidestage.oracle.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.oracle.dbflute.cbean.*;
import org.docksidestage.oracle.dbflute.cbean.cq.bs.*;
import org.docksidestage.oracle.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of WITHDRAWAL_REASON.
 * @author oracleman
 */
public class WithdrawalReasonCIQ extends AbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWithdrawalReasonCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WithdrawalReasonCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWithdrawalReasonCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return _myCQ.xdfgetWithdrawalReasonCode(); }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_ExistsReferrer_SynonymMemberWithdrawalList(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_NotExistsReferrer_SynonymMemberWithdrawalList(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_SynonymMemberWithdrawalList(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_SynonymMemberWithdrawalList(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_SynonymMemberWithdrawalListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueWithdrawalReasonText() { return _myCQ.xdfgetWithdrawalReasonText(); }
    protected ConditionValue xgetCValueDisplayOrder() { return _myCQ.xdfgetDisplayOrder(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WithdrawalReasonCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WithdrawalReasonCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WithdrawalReasonCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WithdrawalReasonCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xinCQ() { return WithdrawalReasonCQ.class.getName(); }
}
