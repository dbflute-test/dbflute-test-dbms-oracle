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
 * The condition-query for in-line of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class SynonymMemberWithdrawalCIQ extends AbstractBsSynonymMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSynonymMemberWithdrawalCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SynonymMemberWithdrawalCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSynonymMemberWithdrawalCQ myCQ) {
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
    protected ConditionValue xgetCValueMemberId() { return _myCQ.xdfgetMemberId(); }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return _myCQ.xdfgetWithdrawalReasonCode(); }
    protected ConditionValue xgetCValueWithdrawalReasonInputText() { return _myCQ.xdfgetWithdrawalReasonInputText(); }
    protected ConditionValue xgetCValueWithdrawalDatetime() { return _myCQ.xdfgetWithdrawalDatetime(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterProcess() { return _myCQ.xdfgetRegisterProcess(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateProcess() { return _myCQ.xdfgetUpdateProcess(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SynonymMemberWithdrawalCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SynonymMemberWithdrawalCB.class.getName(); }
    protected String xinCQ() { return SynonymMemberWithdrawalCQ.class.getName(); }
}
