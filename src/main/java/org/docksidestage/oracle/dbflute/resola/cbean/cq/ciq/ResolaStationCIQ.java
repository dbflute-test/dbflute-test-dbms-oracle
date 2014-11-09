package org.docksidestage.oracle.dbflute.resola.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.oracle.dbflute.resola.cbean.*;
import org.docksidestage.oracle.dbflute.resola.cbean.cq.bs.*;
import org.docksidestage.oracle.dbflute.resola.cbean.cq.*;

/**
 * The condition-query for in-line of STATION.
 * @author DBFlute(AutoGenerator)
 */
public class ResolaStationCIQ extends ResolaAbstractBsStationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ResolaBsStationCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ResolaStationCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, ResolaBsStationCQ myCQ) {
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
    protected ConditionValue xgetCValueStationId() { return _myCQ.xdfgetStationId(); }
    protected ConditionValue xgetCValueStationName() { return _myCQ.xdfgetStationName(); }
    protected ConditionValue xgetCValueBirthdate() { return _myCQ.xdfgetBirthdate(); }
    protected ConditionValue xgetCValueFormalizedDatetime() { return _myCQ.xdfgetFormalizedDatetime(); }
    protected ConditionValue xgetCValueHomeCount() { return _myCQ.xdfgetHomeCount(); }
    protected ConditionValue xgetCValueWorkingKilometer() { return _myCQ.xdfgetWorkingKilometer(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(ResolaStationCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ResolaStationCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ResolaStationCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ResolaStationCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ResolaStationCB.class.getName(); }
    protected String xinCQ() { return ResolaStationCQ.class.getName(); }
}
