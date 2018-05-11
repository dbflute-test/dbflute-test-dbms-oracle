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
 * The condition-query for in-line of VENDOR_CHECK.
 * @author oracleman
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
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
    protected ConditionValue xgetCValueVendorCheckId() { return _myCQ.xdfgetVendorCheckId(); }
    protected ConditionValue xgetCValueTypeOfChar() { return _myCQ.xdfgetTypeOfChar(); }
    protected ConditionValue xgetCValueTypeOfNchar() { return _myCQ.xdfgetTypeOfNchar(); }
    protected ConditionValue xgetCValueTypeOfVarchar2() { return _myCQ.xdfgetTypeOfVarchar2(); }
    protected ConditionValue xgetCValueTypeOfVarchar2Max() { return _myCQ.xdfgetTypeOfVarchar2Max(); }
    protected ConditionValue xgetCValueTypeOfNvarchar2() { return _myCQ.xdfgetTypeOfNvarchar2(); }
    protected ConditionValue xgetCValueTypeOfClob() { return _myCQ.xdfgetTypeOfClob(); }
    protected ConditionValue xgetCValueTypeOfNclob() { return _myCQ.xdfgetTypeOfNclob(); }
    protected ConditionValue xgetCValueTypeOfLong() { return _myCQ.xdfgetTypeOfLong(); }
    protected ConditionValue xgetCValueTypeOfXmltype() { return _myCQ.xdfgetTypeOfXmltype(); }
    protected ConditionValue xgetCValueTypeOfNumberInteger() { return _myCQ.xdfgetTypeOfNumberInteger(); }
    protected ConditionValue xgetCValueTypeOfNumberBigint() { return _myCQ.xdfgetTypeOfNumberBigint(); }
    protected ConditionValue xgetCValueTypeOfNumberDecimal() { return _myCQ.xdfgetTypeOfNumberDecimal(); }
    protected ConditionValue xgetCValueTypeOfNumberIntegerMin() { return _myCQ.xdfgetTypeOfNumberIntegerMin(); }
    protected ConditionValue xgetCValueTypeOfNumberIntegerMax() { return _myCQ.xdfgetTypeOfNumberIntegerMax(); }
    protected ConditionValue xgetCValueTypeOfNumberBigintMin() { return _myCQ.xdfgetTypeOfNumberBigintMin(); }
    protected ConditionValue xgetCValueTypeOfNumberBigintMax() { return _myCQ.xdfgetTypeOfNumberBigintMax(); }
    protected ConditionValue xgetCValueTypeOfNumberSuperintMin() { return _myCQ.xdfgetTypeOfNumberSuperintMin(); }
    protected ConditionValue xgetCValueTypeOfNumberSuperintMax() { return _myCQ.xdfgetTypeOfNumberSuperintMax(); }
    protected ConditionValue xgetCValueTypeOfNumberMaxdecimal() { return _myCQ.xdfgetTypeOfNumberMaxdecimal(); }
    protected ConditionValue xgetCValueTypeOfInteger() { return _myCQ.xdfgetTypeOfInteger(); }
    protected ConditionValue xgetCValueTypeOfBinaryFloat() { return _myCQ.xdfgetTypeOfBinaryFloat(); }
    protected ConditionValue xgetCValueTypeOfBinaryDouble() { return _myCQ.xdfgetTypeOfBinaryDouble(); }
    protected ConditionValue xgetCValueTypeOfDate() { return _myCQ.xdfgetTypeOfDate(); }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return _myCQ.xdfgetTypeOfTimestamp(); }
    protected ConditionValue xgetCValueTypeOfIntervalYearToMonth() { return _myCQ.xdfgetTypeOfIntervalYearToMonth(); }
    protected ConditionValue xgetCValueTypeOfIntervalDayToSecond() { return _myCQ.xdfgetTypeOfIntervalDayToSecond(); }
    protected ConditionValue xgetCValueTypeOfBfile() { return _myCQ.xdfgetTypeOfBfile(); }
    protected ConditionValue xgetCValueTypeOfBlob() { return _myCQ.xdfgetTypeOfBlob(); }
    protected ConditionValue xgetCValueTypeOfRaw() { return _myCQ.xdfgetTypeOfRaw(); }
    protected ConditionValue xgetCValueTypeOfRowid() { return _myCQ.xdfgetTypeOfRowid(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
