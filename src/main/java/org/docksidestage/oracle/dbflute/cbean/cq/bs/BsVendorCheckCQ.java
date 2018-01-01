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
 * The base condition-query of VENDOR_CHECK.
 * @author oracleman
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue xdfgetVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue xgetCValueVendorCheckId() { return xdfgetVendorCheckId(); }

    /**
     * Add order-by as ascend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue xdfgetTypeOfChar()
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected ConditionValue xgetCValueTypeOfChar() { return xdfgetTypeOfChar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("TYPE_OF_CHAR"); return this; }

    protected ConditionValue _typeOfNchar;
    public ConditionValue xdfgetTypeOfNchar()
    { if (_typeOfNchar == null) { _typeOfNchar = nCV(); }
      return _typeOfNchar; }
    protected ConditionValue xgetCValueTypeOfNchar() { return xdfgetTypeOfNchar(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNchar_Asc() { regOBA("TYPE_OF_NCHAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNchar_Desc() { regOBD("TYPE_OF_NCHAR"); return this; }

    protected ConditionValue _typeOfVarchar2;
    public ConditionValue xdfgetTypeOfVarchar2()
    { if (_typeOfVarchar2 == null) { _typeOfVarchar2 = nCV(); }
      return _typeOfVarchar2; }
    protected ConditionValue xgetCValueTypeOfVarchar2() { return xdfgetTypeOfVarchar2(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2_Asc() { regOBA("TYPE_OF_VARCHAR2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2_Desc() { regOBD("TYPE_OF_VARCHAR2"); return this; }

    protected ConditionValue _typeOfVarchar2Max;
    public ConditionValue xdfgetTypeOfVarchar2Max()
    { if (_typeOfVarchar2Max == null) { _typeOfVarchar2Max = nCV(); }
      return _typeOfVarchar2Max; }
    protected ConditionValue xgetCValueTypeOfVarchar2Max() { return xdfgetTypeOfVarchar2Max(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2Max_Asc() { regOBA("TYPE_OF_VARCHAR2_MAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2Max_Desc() { regOBD("TYPE_OF_VARCHAR2_MAX"); return this; }

    protected ConditionValue _typeOfNvarchar2;
    public ConditionValue xdfgetTypeOfNvarchar2()
    { if (_typeOfNvarchar2 == null) { _typeOfNvarchar2 = nCV(); }
      return _typeOfNvarchar2; }
    protected ConditionValue xgetCValueTypeOfNvarchar2() { return xdfgetTypeOfNvarchar2(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar2_Asc() { regOBA("TYPE_OF_NVARCHAR2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar2_Desc() { regOBD("TYPE_OF_NVARCHAR2"); return this; }

    protected ConditionValue _typeOfClob;
    public ConditionValue xdfgetTypeOfClob()
    { if (_typeOfClob == null) { _typeOfClob = nCV(); }
      return _typeOfClob; }
    protected ConditionValue xgetCValueTypeOfClob() { return xdfgetTypeOfClob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Asc() { regOBA("TYPE_OF_CLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Desc() { regOBD("TYPE_OF_CLOB"); return this; }

    protected ConditionValue _typeOfNclob;
    public ConditionValue xdfgetTypeOfNclob()
    { if (_typeOfNclob == null) { _typeOfNclob = nCV(); }
      return _typeOfNclob; }
    protected ConditionValue xgetCValueTypeOfNclob() { return xdfgetTypeOfNclob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNclob_Asc() { regOBA("TYPE_OF_NCLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNclob_Desc() { regOBD("TYPE_OF_NCLOB"); return this; }

    protected ConditionValue _typeOfLong;
    public ConditionValue xdfgetTypeOfLong()
    { if (_typeOfLong == null) { _typeOfLong = nCV(); }
      return _typeOfLong; }
    protected ConditionValue xgetCValueTypeOfLong() { return xdfgetTypeOfLong(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_LONG: {LONG}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLong_Asc() { regOBA("TYPE_OF_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_LONG: {LONG}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLong_Desc() { regOBD("TYPE_OF_LONG"); return this; }

    protected ConditionValue _typeOfXmltype;
    public ConditionValue xdfgetTypeOfXmltype()
    { if (_typeOfXmltype == null) { _typeOfXmltype = nCV(); }
      return _typeOfXmltype; }
    protected ConditionValue xgetCValueTypeOfXmltype() { return xdfgetTypeOfXmltype(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXmltype_Asc() { regOBA("TYPE_OF_XMLTYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXmltype_Desc() { regOBD("TYPE_OF_XMLTYPE"); return this; }

    protected ConditionValue _typeOfNumberInteger;
    public ConditionValue xdfgetTypeOfNumberInteger()
    { if (_typeOfNumberInteger == null) { _typeOfNumberInteger = nCV(); }
      return _typeOfNumberInteger; }
    protected ConditionValue xgetCValueTypeOfNumberInteger() { return xdfgetTypeOfNumberInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberInteger_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberInteger_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER"); return this; }

    protected ConditionValue _typeOfNumberBigint;
    public ConditionValue xdfgetTypeOfNumberBigint()
    { if (_typeOfNumberBigint == null) { _typeOfNumberBigint = nCV(); }
      return _typeOfNumberBigint; }
    protected ConditionValue xgetCValueTypeOfNumberBigint() { return xdfgetTypeOfNumberBigint(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigint_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigint_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT"); return this; }

    protected ConditionValue _typeOfNumberDecimal;
    public ConditionValue xdfgetTypeOfNumberDecimal()
    { if (_typeOfNumberDecimal == null) { _typeOfNumberDecimal = nCV(); }
      return _typeOfNumberDecimal; }
    protected ConditionValue xgetCValueTypeOfNumberDecimal() { return xdfgetTypeOfNumberDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberDecimal_Asc() { regOBA("TYPE_OF_NUMBER_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberDecimal_Desc() { regOBD("TYPE_OF_NUMBER_DECIMAL"); return this; }

    protected ConditionValue _typeOfNumberIntegerMin;
    public ConditionValue xdfgetTypeOfNumberIntegerMin()
    { if (_typeOfNumberIntegerMin == null) { _typeOfNumberIntegerMin = nCV(); }
      return _typeOfNumberIntegerMin; }
    protected ConditionValue xgetCValueTypeOfNumberIntegerMin() { return xdfgetTypeOfNumberIntegerMin(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMin_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER_MIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMin_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER_MIN"); return this; }

    protected ConditionValue _typeOfNumberIntegerMax;
    public ConditionValue xdfgetTypeOfNumberIntegerMax()
    { if (_typeOfNumberIntegerMax == null) { _typeOfNumberIntegerMax = nCV(); }
      return _typeOfNumberIntegerMax; }
    protected ConditionValue xgetCValueTypeOfNumberIntegerMax() { return xdfgetTypeOfNumberIntegerMax(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMax_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER_MAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMax_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER_MAX"); return this; }

    protected ConditionValue _typeOfNumberBigintMin;
    public ConditionValue xdfgetTypeOfNumberBigintMin()
    { if (_typeOfNumberBigintMin == null) { _typeOfNumberBigintMin = nCV(); }
      return _typeOfNumberBigintMin; }
    protected ConditionValue xgetCValueTypeOfNumberBigintMin() { return xdfgetTypeOfNumberBigintMin(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMin_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMin_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT_MIN"); return this; }

    protected ConditionValue _typeOfNumberBigintMax;
    public ConditionValue xdfgetTypeOfNumberBigintMax()
    { if (_typeOfNumberBigintMax == null) { _typeOfNumberBigintMax = nCV(); }
      return _typeOfNumberBigintMax; }
    protected ConditionValue xgetCValueTypeOfNumberBigintMax() { return xdfgetTypeOfNumberBigintMax(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMax_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMax_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT_MAX"); return this; }

    protected ConditionValue _typeOfNumberSuperintMin;
    public ConditionValue xdfgetTypeOfNumberSuperintMin()
    { if (_typeOfNumberSuperintMin == null) { _typeOfNumberSuperintMin = nCV(); }
      return _typeOfNumberSuperintMin; }
    protected ConditionValue xgetCValueTypeOfNumberSuperintMin() { return xdfgetTypeOfNumberSuperintMin(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMin_Asc() { regOBA("TYPE_OF_NUMBER_SUPERINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMin_Desc() { regOBD("TYPE_OF_NUMBER_SUPERINT_MIN"); return this; }

    protected ConditionValue _typeOfNumberSuperintMax;
    public ConditionValue xdfgetTypeOfNumberSuperintMax()
    { if (_typeOfNumberSuperintMax == null) { _typeOfNumberSuperintMax = nCV(); }
      return _typeOfNumberSuperintMax; }
    protected ConditionValue xgetCValueTypeOfNumberSuperintMax() { return xdfgetTypeOfNumberSuperintMax(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMax_Asc() { regOBA("TYPE_OF_NUMBER_SUPERINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMax_Desc() { regOBD("TYPE_OF_NUMBER_SUPERINT_MAX"); return this; }

    protected ConditionValue _typeOfNumberMaxdecimal;
    public ConditionValue xdfgetTypeOfNumberMaxdecimal()
    { if (_typeOfNumberMaxdecimal == null) { _typeOfNumberMaxdecimal = nCV(); }
      return _typeOfNumberMaxdecimal; }
    protected ConditionValue xgetCValueTypeOfNumberMaxdecimal() { return xdfgetTypeOfNumberMaxdecimal(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberMaxdecimal_Asc() { regOBA("TYPE_OF_NUMBER_MAXDECIMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberMaxdecimal_Desc() { regOBD("TYPE_OF_NUMBER_MAXDECIMAL"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue xdfgetTypeOfInteger()
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected ConditionValue xgetCValueTypeOfInteger() { return xdfgetTypeOfInteger(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBinaryFloat;
    public ConditionValue xdfgetTypeOfBinaryFloat()
    { if (_typeOfBinaryFloat == null) { _typeOfBinaryFloat = nCV(); }
      return _typeOfBinaryFloat; }
    protected ConditionValue xgetCValueTypeOfBinaryFloat() { return xdfgetTypeOfBinaryFloat(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryFloat_Asc() { regOBA("TYPE_OF_BINARY_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryFloat_Desc() { regOBD("TYPE_OF_BINARY_FLOAT"); return this; }

    protected ConditionValue _typeOfBinaryDouble;
    public ConditionValue xdfgetTypeOfBinaryDouble()
    { if (_typeOfBinaryDouble == null) { _typeOfBinaryDouble = nCV(); }
      return _typeOfBinaryDouble; }
    protected ConditionValue xgetCValueTypeOfBinaryDouble() { return xdfgetTypeOfBinaryDouble(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryDouble_Asc() { regOBA("TYPE_OF_BINARY_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryDouble_Desc() { regOBD("TYPE_OF_BINARY_DOUBLE"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue xdfgetTypeOfDate()
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected ConditionValue xgetCValueTypeOfDate() { return xdfgetTypeOfDate(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue xdfgetTypeOfTimestamp()
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return xdfgetTypeOfTimestamp(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfIntervalYearToMonth;
    public ConditionValue xdfgetTypeOfIntervalYearToMonth()
    { if (_typeOfIntervalYearToMonth == null) { _typeOfIntervalYearToMonth = nCV(); }
      return _typeOfIntervalYearToMonth; }
    protected ConditionValue xgetCValueTypeOfIntervalYearToMonth() { return xdfgetTypeOfIntervalYearToMonth(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalYearToMonth_Asc() { regOBA("TYPE_OF_INTERVAL_YEAR_TO_MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalYearToMonth_Desc() { regOBD("TYPE_OF_INTERVAL_YEAR_TO_MONTH"); return this; }

    protected ConditionValue _typeOfIntervalDayToSecond;
    public ConditionValue xdfgetTypeOfIntervalDayToSecond()
    { if (_typeOfIntervalDayToSecond == null) { _typeOfIntervalDayToSecond = nCV(); }
      return _typeOfIntervalDayToSecond; }
    protected ConditionValue xgetCValueTypeOfIntervalDayToSecond() { return xdfgetTypeOfIntervalDayToSecond(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalDayToSecond_Asc() { regOBA("TYPE_OF_INTERVAL_DAY_TO_SECOND"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalDayToSecond_Desc() { regOBD("TYPE_OF_INTERVAL_DAY_TO_SECOND"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue xdfgetTypeOfBlob()
    { if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
      return _typeOfBlob; }
    protected ConditionValue xgetCValueTypeOfBlob() { return xdfgetTypeOfBlob(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfRaw;
    public ConditionValue xdfgetTypeOfRaw()
    { if (_typeOfRaw == null) { _typeOfRaw = nCV(); }
      return _typeOfRaw; }
    protected ConditionValue xgetCValueTypeOfRaw() { return xdfgetTypeOfRaw(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_RAW: {RAW(512)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRaw_Asc() { regOBA("TYPE_OF_RAW"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_RAW: {RAW(512)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRaw_Desc() { regOBD("TYPE_OF_RAW"); return this; }

    protected ConditionValue _typeOfBfile;
    public ConditionValue xdfgetTypeOfBfile()
    { if (_typeOfBfile == null) { _typeOfBfile = nCV(); }
      return _typeOfBfile; }
    protected ConditionValue xgetCValueTypeOfBfile() { return xdfgetTypeOfBfile(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBfile_Asc() { regOBA("TYPE_OF_BFILE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBfile_Desc() { regOBD("TYPE_OF_BFILE"); return this; }

    protected ConditionValue _typeOfRowid;
    public ConditionValue xdfgetTypeOfRowid()
    { if (_typeOfRowid == null) { _typeOfRowid = nCV(); }
      return _typeOfRowid; }
    protected ConditionValue xgetCValueTypeOfRowid() { return xdfgetTypeOfRowid(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRowid_Asc() { regOBA("TYPE_OF_ROWID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRowid_Desc() { regOBD("TYPE_OF_ROWID"); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorCheckCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorCheckCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
