package org.docksidestage.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.cbean.*;
import org.docksidestage.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author oracleman
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue xgetCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, hSC("TYPE_OF_CHAR", typeOfChar, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, hSC("TYPE_OF_CHAR", typeOfChar, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_NotLikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), xgetCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_Equal(String typeOfNchar) {
        doSetTypeOfNchar_Equal(fRES(typeOfNchar));
    }

    protected void doSetTypeOfNchar_Equal(String typeOfNchar) {
        regTypeOfNchar(CK_EQ, hSC("TYPE_OF_NCHAR", typeOfNchar, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_NotEqual(String typeOfNchar) {
        doSetTypeOfNchar_NotEqual(fRES(typeOfNchar));
    }

    protected void doSetTypeOfNchar_NotEqual(String typeOfNchar) {
        regTypeOfNchar(CK_NES, hSC("TYPE_OF_NCHAR", typeOfNchar, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNcharList The collection of typeOfNchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_InScope(Collection<String> typeOfNcharList) {
        doSetTypeOfNchar_InScope(typeOfNcharList);
    }

    protected void doSetTypeOfNchar_InScope(Collection<String> typeOfNcharList) {
        regINS(CK_INS, cTL(typeOfNcharList), xgetCValueTypeOfNchar(), "TYPE_OF_NCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNcharList The collection of typeOfNchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_NotInScope(Collection<String> typeOfNcharList) {
        doSetTypeOfNchar_NotInScope(typeOfNcharList);
    }

    protected void doSetTypeOfNchar_NotInScope(Collection<String> typeOfNcharList) {
        regINS(CK_NINS, cTL(typeOfNcharList), xgetCValueTypeOfNchar(), "TYPE_OF_NCHAR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)} <br>
     * <pre>e.g. setTypeOfNchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfNchar The value of typeOfNchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNchar_LikeSearch(String typeOfNchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNchar_LikeSearch(typeOfNchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)} <br>
     * <pre>e.g. setTypeOfNchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNchar The value of typeOfNchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNchar_LikeSearch(String typeOfNchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNchar), xgetCValueTypeOfNchar(), "TYPE_OF_NCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNchar_NotLikeSearch(String typeOfNchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNchar_NotLikeSearch(typeOfNchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNchar_NotLikeSearch(String typeOfNchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNchar), xgetCValueTypeOfNchar(), "TYPE_OF_NCHAR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_PrefixSearch(String typeOfNchar) {
        setTypeOfNchar_LikeSearch(typeOfNchar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNull() { regTypeOfNchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNullOrEmpty() { regTypeOfNchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNotNull() { regTypeOfNchar(CK_ISNN, DOBJ); }

    protected void regTypeOfNchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNchar(), "TYPE_OF_NCHAR"); }
    protected abstract ConditionValue xgetCValueTypeOfNchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_Equal(String typeOfVarchar2) {
        doSetTypeOfVarchar2_Equal(fRES(typeOfVarchar2));
    }

    protected void doSetTypeOfVarchar2_Equal(String typeOfVarchar2) {
        regTypeOfVarchar2(CK_EQ, typeOfVarchar2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_NotEqual(String typeOfVarchar2) {
        doSetTypeOfVarchar2_NotEqual(fRES(typeOfVarchar2));
    }

    protected void doSetTypeOfVarchar2_NotEqual(String typeOfVarchar2) {
        regTypeOfVarchar2(CK_NES, typeOfVarchar2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2List The collection of typeOfVarchar2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_InScope(Collection<String> typeOfVarchar2List) {
        doSetTypeOfVarchar2_InScope(typeOfVarchar2List);
    }

    protected void doSetTypeOfVarchar2_InScope(Collection<String> typeOfVarchar2List) {
        regINS(CK_INS, cTL(typeOfVarchar2List), xgetCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2List The collection of typeOfVarchar2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_NotInScope(Collection<String> typeOfVarchar2List) {
        doSetTypeOfVarchar2_NotInScope(typeOfVarchar2List);
    }

    protected void doSetTypeOfVarchar2_NotInScope(Collection<String> typeOfVarchar2List) {
        regINS(CK_NINS, cTL(typeOfVarchar2List), xgetCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br>
     * <pre>e.g. setTypeOfVarchar2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar2 The value of typeOfVarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2_LikeSearch(String typeOfVarchar2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar2_LikeSearch(typeOfVarchar2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br>
     * <pre>e.g. setTypeOfVarchar2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar2 The value of typeOfVarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2_LikeSearch(String typeOfVarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar2), xgetCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2_NotLikeSearch(String typeOfVarchar2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar2_NotLikeSearch(typeOfVarchar2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar2_NotLikeSearch(String typeOfVarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar2), xgetCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_PrefixSearch(String typeOfVarchar2) {
        setTypeOfVarchar2_LikeSearch(typeOfVarchar2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNull() { regTypeOfVarchar2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNullOrEmpty() { regTypeOfVarchar2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNotNull() { regTypeOfVarchar2(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_Equal(String typeOfVarchar2Max) {
        doSetTypeOfVarchar2Max_Equal(fRES(typeOfVarchar2Max));
    }

    protected void doSetTypeOfVarchar2Max_Equal(String typeOfVarchar2Max) {
        regTypeOfVarchar2Max(CK_EQ, typeOfVarchar2Max);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_NotEqual(String typeOfVarchar2Max) {
        doSetTypeOfVarchar2Max_NotEqual(fRES(typeOfVarchar2Max));
    }

    protected void doSetTypeOfVarchar2Max_NotEqual(String typeOfVarchar2Max) {
        regTypeOfVarchar2Max(CK_NES, typeOfVarchar2Max);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2MaxList The collection of typeOfVarchar2Max as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_InScope(Collection<String> typeOfVarchar2MaxList) {
        doSetTypeOfVarchar2Max_InScope(typeOfVarchar2MaxList);
    }

    protected void doSetTypeOfVarchar2Max_InScope(Collection<String> typeOfVarchar2MaxList) {
        regINS(CK_INS, cTL(typeOfVarchar2MaxList), xgetCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2MaxList The collection of typeOfVarchar2Max as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_NotInScope(Collection<String> typeOfVarchar2MaxList) {
        doSetTypeOfVarchar2Max_NotInScope(typeOfVarchar2MaxList);
    }

    protected void doSetTypeOfVarchar2Max_NotInScope(Collection<String> typeOfVarchar2MaxList) {
        regINS(CK_NINS, cTL(typeOfVarchar2MaxList), xgetCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br>
     * <pre>e.g. setTypeOfVarchar2Max_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_LikeSearch(String typeOfVarchar2Max, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar2Max_LikeSearch(typeOfVarchar2Max, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br>
     * <pre>e.g. setTypeOfVarchar2Max_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_LikeSearch(String typeOfVarchar2Max, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar2Max), xgetCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_NotLikeSearch(String typeOfVarchar2Max, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar2Max_NotLikeSearch(typeOfVarchar2Max, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_NotLikeSearch(String typeOfVarchar2Max, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar2Max), xgetCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_PrefixSearch(String typeOfVarchar2Max) {
        setTypeOfVarchar2Max_LikeSearch(typeOfVarchar2Max, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNull() { regTypeOfVarchar2Max(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNullOrEmpty() { regTypeOfVarchar2Max(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNotNull() { regTypeOfVarchar2Max(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar2Max(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar2Max();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_Equal(String typeOfNvarchar2) {
        doSetTypeOfNvarchar2_Equal(fRES(typeOfNvarchar2));
    }

    protected void doSetTypeOfNvarchar2_Equal(String typeOfNvarchar2) {
        regTypeOfNvarchar2(CK_EQ, typeOfNvarchar2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_NotEqual(String typeOfNvarchar2) {
        doSetTypeOfNvarchar2_NotEqual(fRES(typeOfNvarchar2));
    }

    protected void doSetTypeOfNvarchar2_NotEqual(String typeOfNvarchar2) {
        regTypeOfNvarchar2(CK_NES, typeOfNvarchar2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2List The collection of typeOfNvarchar2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_InScope(Collection<String> typeOfNvarchar2List) {
        doSetTypeOfNvarchar2_InScope(typeOfNvarchar2List);
    }

    protected void doSetTypeOfNvarchar2_InScope(Collection<String> typeOfNvarchar2List) {
        regINS(CK_INS, cTL(typeOfNvarchar2List), xgetCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2List The collection of typeOfNvarchar2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_NotInScope(Collection<String> typeOfNvarchar2List) {
        doSetTypeOfNvarchar2_NotInScope(typeOfNvarchar2List);
    }

    protected void doSetTypeOfNvarchar2_NotInScope(Collection<String> typeOfNvarchar2List) {
        regINS(CK_NINS, cTL(typeOfNvarchar2List), xgetCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)} <br>
     * <pre>e.g. setTypeOfNvarchar2_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_LikeSearch(String typeOfNvarchar2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNvarchar2_LikeSearch(typeOfNvarchar2, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)} <br>
     * <pre>e.g. setTypeOfNvarchar2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_LikeSearch(String typeOfNvarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNvarchar2), xgetCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_NotLikeSearch(String typeOfNvarchar2, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNvarchar2_NotLikeSearch(typeOfNvarchar2, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_NotLikeSearch(String typeOfNvarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNvarchar2), xgetCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_PrefixSearch(String typeOfNvarchar2) {
        setTypeOfNvarchar2_LikeSearch(typeOfNvarchar2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNull() { regTypeOfNvarchar2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNullOrEmpty() { regTypeOfNvarchar2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNotNull() { regTypeOfNvarchar2(CK_ISNN, DOBJ); }

    protected void regTypeOfNvarchar2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2"); }
    protected abstract ConditionValue xgetCValueTypeOfNvarchar2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_Equal(String typeOfClob) {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_Equal(String typeOfClob) {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotEqual(String typeOfClob) {
        doSetTypeOfClob_NotEqual(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_NotEqual(String typeOfClob) {
        regTypeOfClob(CK_NES, typeOfClob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClobList The collection of typeOfClob as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_InScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_InScope(typeOfClobList);
    }

    protected void doSetTypeOfClob_InScope(Collection<String> typeOfClobList) {
        regINS(CK_INS, cTL(typeOfClobList), xgetCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClobList The collection of typeOfClob as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_NotInScope(typeOfClobList);
    }

    protected void doSetTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        regINS(CK_NINS, cTL(typeOfClobList), xgetCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)} <br>
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfClob_LikeSearch(typeOfClob, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)} <br>
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfClob), xgetCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfClob_NotLikeSearch(typeOfClob, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfClob), xgetCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_PrefixSearch(String typeOfClob) {
        setTypeOfClob_LikeSearch(typeOfClob, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     */
    public void setTypeOfClob_IsNull() { regTypeOfClob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_CLOB: {CLOB(4000)}
     */
    public void setTypeOfClob_IsNotNull() { regTypeOfClob(CK_ISNN, DOBJ); }

    protected void regTypeOfClob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfClob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_Equal(String typeOfNclob) {
        doSetTypeOfNclob_Equal(fRES(typeOfNclob));
    }

    protected void doSetTypeOfNclob_Equal(String typeOfNclob) {
        regTypeOfNclob(CK_EQ, typeOfNclob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_NotEqual(String typeOfNclob) {
        doSetTypeOfNclob_NotEqual(fRES(typeOfNclob));
    }

    protected void doSetTypeOfNclob_NotEqual(String typeOfNclob) {
        regTypeOfNclob(CK_NES, typeOfNclob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclobList The collection of typeOfNclob as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_InScope(Collection<String> typeOfNclobList) {
        doSetTypeOfNclob_InScope(typeOfNclobList);
    }

    protected void doSetTypeOfNclob_InScope(Collection<String> typeOfNclobList) {
        regINS(CK_INS, cTL(typeOfNclobList), xgetCValueTypeOfNclob(), "TYPE_OF_NCLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclobList The collection of typeOfNclob as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_NotInScope(Collection<String> typeOfNclobList) {
        doSetTypeOfNclob_NotInScope(typeOfNclobList);
    }

    protected void doSetTypeOfNclob_NotInScope(Collection<String> typeOfNclobList) {
        regINS(CK_NINS, cTL(typeOfNclobList), xgetCValueTypeOfNclob(), "TYPE_OF_NCLOB");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)} <br>
     * <pre>e.g. setTypeOfNclob_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfNclob The value of typeOfNclob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNclob_LikeSearch(String typeOfNclob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNclob_LikeSearch(typeOfNclob, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)} <br>
     * <pre>e.g. setTypeOfNclob_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNclob The value of typeOfNclob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNclob_LikeSearch(String typeOfNclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNclob), xgetCValueTypeOfNclob(), "TYPE_OF_NCLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfNclob_NotLikeSearch(String typeOfNclob, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfNclob_NotLikeSearch(typeOfNclob, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNclob_NotLikeSearch(String typeOfNclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNclob), xgetCValueTypeOfNclob(), "TYPE_OF_NCLOB", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_PrefixSearch(String typeOfNclob) {
        setTypeOfNclob_LikeSearch(typeOfNclob, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     */
    public void setTypeOfNclob_IsNull() { regTypeOfNclob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     */
    public void setTypeOfNclob_IsNotNull() { regTypeOfNclob(CK_ISNN, DOBJ); }

    protected void regTypeOfNclob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNclob(), "TYPE_OF_NCLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfNclob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_Equal(String typeOfLong) {
        doSetTypeOfLong_Equal(fRES(typeOfLong));
    }

    protected void doSetTypeOfLong_Equal(String typeOfLong) {
        regTypeOfLong(CK_EQ, typeOfLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_NotEqual(String typeOfLong) {
        doSetTypeOfLong_NotEqual(fRES(typeOfLong));
    }

    protected void doSetTypeOfLong_NotEqual(String typeOfLong) {
        regTypeOfLong(CK_NES, typeOfLong);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLongList The collection of typeOfLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_InScope(Collection<String> typeOfLongList) {
        doSetTypeOfLong_InScope(typeOfLongList);
    }

    protected void doSetTypeOfLong_InScope(Collection<String> typeOfLongList) {
        regINS(CK_INS, cTL(typeOfLongList), xgetCValueTypeOfLong(), "TYPE_OF_LONG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLongList The collection of typeOfLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_NotInScope(Collection<String> typeOfLongList) {
        doSetTypeOfLong_NotInScope(typeOfLongList);
    }

    protected void doSetTypeOfLong_NotInScope(Collection<String> typeOfLongList) {
        regINS(CK_NINS, cTL(typeOfLongList), xgetCValueTypeOfLong(), "TYPE_OF_LONG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG} <br>
     * <pre>e.g. setTypeOfLong_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfLong The value of typeOfLong as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLong_LikeSearch(String typeOfLong, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLong_LikeSearch(typeOfLong, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG} <br>
     * <pre>e.g. setTypeOfLong_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfLong The value of typeOfLong as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfLong_LikeSearch(String typeOfLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfLong), xgetCValueTypeOfLong(), "TYPE_OF_LONG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfLong_NotLikeSearch(String typeOfLong, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfLong_NotLikeSearch(typeOfLong, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfLong_NotLikeSearch(String typeOfLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfLong), xgetCValueTypeOfLong(), "TYPE_OF_LONG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_PrefixSearch(String typeOfLong) {
        setTypeOfLong_LikeSearch(typeOfLong, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNull() { regTypeOfLong(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNullOrEmpty() { regTypeOfLong(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNotNull() { regTypeOfLong(CK_ISNN, DOBJ); }

    protected void regTypeOfLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfLong(), "TYPE_OF_LONG"); }
    protected abstract ConditionValue xgetCValueTypeOfLong();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_Equal(String typeOfXmltype) {
        doSetTypeOfXmltype_Equal(fRES(typeOfXmltype));
    }

    protected void doSetTypeOfXmltype_Equal(String typeOfXmltype) {
        regTypeOfXmltype(CK_EQ, typeOfXmltype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_NotEqual(String typeOfXmltype) {
        doSetTypeOfXmltype_NotEqual(fRES(typeOfXmltype));
    }

    protected void doSetTypeOfXmltype_NotEqual(String typeOfXmltype) {
        regTypeOfXmltype(CK_NES, typeOfXmltype);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltypeList The collection of typeOfXmltype as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_InScope(Collection<String> typeOfXmltypeList) {
        doSetTypeOfXmltype_InScope(typeOfXmltypeList);
    }

    protected void doSetTypeOfXmltype_InScope(Collection<String> typeOfXmltypeList) {
        regINS(CK_INS, cTL(typeOfXmltypeList), xgetCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltypeList The collection of typeOfXmltype as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_NotInScope(Collection<String> typeOfXmltypeList) {
        doSetTypeOfXmltype_NotInScope(typeOfXmltypeList);
    }

    protected void doSetTypeOfXmltype_NotInScope(Collection<String> typeOfXmltypeList) {
        regINS(CK_NINS, cTL(typeOfXmltypeList), xgetCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)} <br>
     * <pre>e.g. setTypeOfXmltype_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfXmltype The value of typeOfXmltype as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfXmltype_LikeSearch(String typeOfXmltype, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfXmltype_LikeSearch(typeOfXmltype, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)} <br>
     * <pre>e.g. setTypeOfXmltype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfXmltype The value of typeOfXmltype as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfXmltype_LikeSearch(String typeOfXmltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfXmltype), xgetCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfXmltype_NotLikeSearch(String typeOfXmltype, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfXmltype_NotLikeSearch(typeOfXmltype, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfXmltype_NotLikeSearch(String typeOfXmltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfXmltype), xgetCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_PrefixSearch(String typeOfXmltype) {
        setTypeOfXmltype_LikeSearch(typeOfXmltype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNull() { regTypeOfXmltype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNullOrEmpty() { regTypeOfXmltype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNotNull() { regTypeOfXmltype(CK_ISNN, DOBJ); }

    protected void regTypeOfXmltype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE"); }
    protected abstract ConditionValue xgetCValueTypeOfXmltype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberInteger_Equal(Integer typeOfNumberInteger) {
        doSetTypeOfNumberInteger_Equal(typeOfNumberInteger);
    }

    protected void doSetTypeOfNumberInteger_Equal(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_EQ, typeOfNumberInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberInteger_GreaterThan(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_GT, typeOfNumberInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberInteger_LessThan(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_LT, typeOfNumberInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberInteger_GreaterEqual(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_GE, typeOfNumberInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberInteger_LessEqual(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_LE, typeOfNumberInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param minNumber The min number of typeOfNumberInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param minNumber The min number of typeOfNumberInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberIntegerList The collection of typeOfNumberInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberInteger_InScope(Collection<Integer> typeOfNumberIntegerList) {
        doSetTypeOfNumberInteger_InScope(typeOfNumberIntegerList);
    }

    protected void doSetTypeOfNumberInteger_InScope(Collection<Integer> typeOfNumberIntegerList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerList), xgetCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberIntegerList The collection of typeOfNumberInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberInteger_NotInScope(Collection<Integer> typeOfNumberIntegerList) {
        doSetTypeOfNumberInteger_NotInScope(typeOfNumberIntegerList);
    }

    protected void doSetTypeOfNumberInteger_NotInScope(Collection<Integer> typeOfNumberIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerList), xgetCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     */
    public void setTypeOfNumberInteger_IsNull() { regTypeOfNumberInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     */
    public void setTypeOfNumberInteger_IsNotNull() { regTypeOfNumberInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigint_Equal(Long typeOfNumberBigint) {
        doSetTypeOfNumberBigint_Equal(typeOfNumberBigint);
    }

    protected void doSetTypeOfNumberBigint_Equal(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_EQ, typeOfNumberBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigint_GreaterThan(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_GT, typeOfNumberBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigint_LessThan(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_LT, typeOfNumberBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigint_GreaterEqual(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_GE, typeOfNumberBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigint_LessEqual(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_LE, typeOfNumberBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param minNumber The min number of typeOfNumberBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigint. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param minNumber The min number of typeOfNumberBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigintList The collection of typeOfNumberBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigint_InScope(Collection<Long> typeOfNumberBigintList) {
        doSetTypeOfNumberBigint_InScope(typeOfNumberBigintList);
    }

    protected void doSetTypeOfNumberBigint_InScope(Collection<Long> typeOfNumberBigintList) {
        regINS(CK_INS, cTL(typeOfNumberBigintList), xgetCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigintList The collection of typeOfNumberBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigint_NotInScope(Collection<Long> typeOfNumberBigintList) {
        doSetTypeOfNumberBigint_NotInScope(typeOfNumberBigintList);
    }

    protected void doSetTypeOfNumberBigint_NotInScope(Collection<Long> typeOfNumberBigintList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintList), xgetCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     */
    public void setTypeOfNumberBigint_IsNull() { regTypeOfNumberBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     */
    public void setTypeOfNumberBigint_IsNotNull() { regTypeOfNumberBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberDecimal_Equal(java.math.BigDecimal typeOfNumberDecimal) {
        doSetTypeOfNumberDecimal_Equal(typeOfNumberDecimal);
    }

    protected void doSetTypeOfNumberDecimal_Equal(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_EQ, typeOfNumberDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberDecimal_GreaterThan(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_GT, typeOfNumberDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberDecimal_LessThan(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_LT, typeOfNumberDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberDecimal_GreaterEqual(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_GE, typeOfNumberDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberDecimal_LessEqual(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_LE, typeOfNumberDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param minNumber The min number of typeOfNumberDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberDecimal. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param minNumber The min number of typeOfNumberDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimalList The collection of typeOfNumberDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        doSetTypeOfNumberDecimal_InScope(typeOfNumberDecimalList);
    }

    protected void doSetTypeOfNumberDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        regINS(CK_INS, cTL(typeOfNumberDecimalList), xgetCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimalList The collection of typeOfNumberDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        doSetTypeOfNumberDecimal_NotInScope(typeOfNumberDecimalList);
    }

    protected void doSetTypeOfNumberDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumberDecimalList), xgetCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     */
    public void setTypeOfNumberDecimal_IsNull() { regTypeOfNumberDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     */
    public void setTypeOfNumberDecimal_IsNotNull() { regTypeOfNumberDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMin_Equal(Integer typeOfNumberIntegerMin) {
        doSetTypeOfNumberIntegerMin_Equal(typeOfNumberIntegerMin);
    }

    protected void doSetTypeOfNumberIntegerMin_Equal(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_EQ, typeOfNumberIntegerMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMin_GreaterThan(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_GT, typeOfNumberIntegerMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMin_LessThan(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_LT, typeOfNumberIntegerMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMin_GreaterEqual(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_GE, typeOfNumberIntegerMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMin_LessEqual(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_LE, typeOfNumberIntegerMin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param minNumber The min number of typeOfNumberIntegerMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMin. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMin_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberIntegerMin_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param minNumber The min number of typeOfNumberIntegerMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMin_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMinList The collection of typeOfNumberIntegerMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMin_InScope(Collection<Integer> typeOfNumberIntegerMinList) {
        doSetTypeOfNumberIntegerMin_InScope(typeOfNumberIntegerMinList);
    }

    protected void doSetTypeOfNumberIntegerMin_InScope(Collection<Integer> typeOfNumberIntegerMinList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerMinList), xgetCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMinList The collection of typeOfNumberIntegerMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMin_NotInScope(Collection<Integer> typeOfNumberIntegerMinList) {
        doSetTypeOfNumberIntegerMin_NotInScope(typeOfNumberIntegerMinList);
    }

    protected void doSetTypeOfNumberIntegerMin_NotInScope(Collection<Integer> typeOfNumberIntegerMinList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerMinList), xgetCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     */
    public void setTypeOfNumberIntegerMin_IsNull() { regTypeOfNumberIntegerMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     */
    public void setTypeOfNumberIntegerMin_IsNotNull() { regTypeOfNumberIntegerMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberIntegerMin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberIntegerMin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMax_Equal(Integer typeOfNumberIntegerMax) {
        doSetTypeOfNumberIntegerMax_Equal(typeOfNumberIntegerMax);
    }

    protected void doSetTypeOfNumberIntegerMax_Equal(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_EQ, typeOfNumberIntegerMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMax_GreaterThan(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_GT, typeOfNumberIntegerMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMax_LessThan(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_LT, typeOfNumberIntegerMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMax_GreaterEqual(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_GE, typeOfNumberIntegerMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberIntegerMax_LessEqual(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_LE, typeOfNumberIntegerMax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param minNumber The min number of typeOfNumberIntegerMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMax. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMax_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberIntegerMax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param minNumber The min number of typeOfNumberIntegerMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMaxList The collection of typeOfNumberIntegerMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMax_InScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        doSetTypeOfNumberIntegerMax_InScope(typeOfNumberIntegerMaxList);
    }

    protected void doSetTypeOfNumberIntegerMax_InScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerMaxList), xgetCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMaxList The collection of typeOfNumberIntegerMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMax_NotInScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        doSetTypeOfNumberIntegerMax_NotInScope(typeOfNumberIntegerMaxList);
    }

    protected void doSetTypeOfNumberIntegerMax_NotInScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerMaxList), xgetCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     */
    public void setTypeOfNumberIntegerMax_IsNull() { regTypeOfNumberIntegerMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     */
    public void setTypeOfNumberIntegerMax_IsNotNull() { regTypeOfNumberIntegerMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberIntegerMax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberIntegerMax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMin_Equal(Long typeOfNumberBigintMin) {
        doSetTypeOfNumberBigintMin_Equal(typeOfNumberBigintMin);
    }

    protected void doSetTypeOfNumberBigintMin_Equal(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_EQ, typeOfNumberBigintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMin_GreaterThan(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_GT, typeOfNumberBigintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMin_LessThan(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_LT, typeOfNumberBigintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMin_GreaterEqual(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_GE, typeOfNumberBigintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMin_LessEqual(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_LE, typeOfNumberBigintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param minNumber The min number of typeOfNumberBigintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMin. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMin_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberBigintMin_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param minNumber The min number of typeOfNumberBigintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMin_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMinList The collection of typeOfNumberBigintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMin_InScope(Collection<Long> typeOfNumberBigintMinList) {
        doSetTypeOfNumberBigintMin_InScope(typeOfNumberBigintMinList);
    }

    protected void doSetTypeOfNumberBigintMin_InScope(Collection<Long> typeOfNumberBigintMinList) {
        regINS(CK_INS, cTL(typeOfNumberBigintMinList), xgetCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMinList The collection of typeOfNumberBigintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMin_NotInScope(Collection<Long> typeOfNumberBigintMinList) {
        doSetTypeOfNumberBigintMin_NotInScope(typeOfNumberBigintMinList);
    }

    protected void doSetTypeOfNumberBigintMin_NotInScope(Collection<Long> typeOfNumberBigintMinList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintMinList), xgetCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     */
    public void setTypeOfNumberBigintMin_IsNull() { regTypeOfNumberBigintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     */
    public void setTypeOfNumberBigintMin_IsNotNull() { regTypeOfNumberBigintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigintMin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberBigintMin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMax_Equal(Long typeOfNumberBigintMax) {
        doSetTypeOfNumberBigintMax_Equal(typeOfNumberBigintMax);
    }

    protected void doSetTypeOfNumberBigintMax_Equal(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_EQ, typeOfNumberBigintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMax_GreaterThan(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_GT, typeOfNumberBigintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMax_LessThan(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_LT, typeOfNumberBigintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMax_GreaterEqual(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_GE, typeOfNumberBigintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberBigintMax_LessEqual(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_LE, typeOfNumberBigintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param minNumber The min number of typeOfNumberBigintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMax. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMax_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberBigintMax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param minNumber The min number of typeOfNumberBigintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMaxList The collection of typeOfNumberBigintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMax_InScope(Collection<Long> typeOfNumberBigintMaxList) {
        doSetTypeOfNumberBigintMax_InScope(typeOfNumberBigintMaxList);
    }

    protected void doSetTypeOfNumberBigintMax_InScope(Collection<Long> typeOfNumberBigintMaxList) {
        regINS(CK_INS, cTL(typeOfNumberBigintMaxList), xgetCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMaxList The collection of typeOfNumberBigintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMax_NotInScope(Collection<Long> typeOfNumberBigintMaxList) {
        doSetTypeOfNumberBigintMax_NotInScope(typeOfNumberBigintMaxList);
    }

    protected void doSetTypeOfNumberBigintMax_NotInScope(Collection<Long> typeOfNumberBigintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintMaxList), xgetCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     */
    public void setTypeOfNumberBigintMax_IsNull() { regTypeOfNumberBigintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     */
    public void setTypeOfNumberBigintMax_IsNotNull() { regTypeOfNumberBigintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigintMax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberBigintMax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMin_Equal(java.math.BigDecimal typeOfNumberSuperintMin) {
        doSetTypeOfNumberSuperintMin_Equal(typeOfNumberSuperintMin);
    }

    protected void doSetTypeOfNumberSuperintMin_Equal(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_EQ, typeOfNumberSuperintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMin_GreaterThan(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_GT, typeOfNumberSuperintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMin_LessThan(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_LT, typeOfNumberSuperintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMin_GreaterEqual(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_GE, typeOfNumberSuperintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMin_LessEqual(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_LE, typeOfNumberSuperintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param minNumber The min number of typeOfNumberSuperintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMin. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMin_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberSuperintMin_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param minNumber The min number of typeOfNumberSuperintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMin_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMinList The collection of typeOfNumberSuperintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        doSetTypeOfNumberSuperintMin_InScope(typeOfNumberSuperintMinList);
    }

    protected void doSetTypeOfNumberSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        regINS(CK_INS, cTL(typeOfNumberSuperintMinList), xgetCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMinList The collection of typeOfNumberSuperintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        doSetTypeOfNumberSuperintMin_NotInScope(typeOfNumberSuperintMinList);
    }

    protected void doSetTypeOfNumberSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        regINS(CK_NINS, cTL(typeOfNumberSuperintMinList), xgetCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     */
    public void setTypeOfNumberSuperintMin_IsNull() { regTypeOfNumberSuperintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     */
    public void setTypeOfNumberSuperintMin_IsNotNull() { regTypeOfNumberSuperintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberSuperintMin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberSuperintMin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMax_Equal(java.math.BigDecimal typeOfNumberSuperintMax) {
        doSetTypeOfNumberSuperintMax_Equal(typeOfNumberSuperintMax);
    }

    protected void doSetTypeOfNumberSuperintMax_Equal(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_EQ, typeOfNumberSuperintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMax_GreaterThan(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_GT, typeOfNumberSuperintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMax_LessThan(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_LT, typeOfNumberSuperintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMax_GreaterEqual(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_GE, typeOfNumberSuperintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberSuperintMax_LessEqual(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_LE, typeOfNumberSuperintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param minNumber The min number of typeOfNumberSuperintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMax. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberSuperintMax_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param minNumber The min number of typeOfNumberSuperintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMaxList The collection of typeOfNumberSuperintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        doSetTypeOfNumberSuperintMax_InScope(typeOfNumberSuperintMaxList);
    }

    protected void doSetTypeOfNumberSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        regINS(CK_INS, cTL(typeOfNumberSuperintMaxList), xgetCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMaxList The collection of typeOfNumberSuperintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        doSetTypeOfNumberSuperintMax_NotInScope(typeOfNumberSuperintMaxList);
    }

    protected void doSetTypeOfNumberSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberSuperintMaxList), xgetCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     */
    public void setTypeOfNumberSuperintMax_IsNull() { regTypeOfNumberSuperintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     */
    public void setTypeOfNumberSuperintMax_IsNotNull() { regTypeOfNumberSuperintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberSuperintMax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberSuperintMax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberMaxdecimal_Equal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        doSetTypeOfNumberMaxdecimal_Equal(typeOfNumberMaxdecimal);
    }

    protected void doSetTypeOfNumberMaxdecimal_Equal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_EQ, typeOfNumberMaxdecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberMaxdecimal_GreaterThan(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_GT, typeOfNumberMaxdecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberMaxdecimal_LessThan(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_LT, typeOfNumberMaxdecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberMaxdecimal_GreaterEqual(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_GE, typeOfNumberMaxdecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumberMaxdecimal_LessEqual(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_LE, typeOfNumberMaxdecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param minNumber The min number of typeOfNumberMaxdecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberMaxdecimal. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumberMaxdecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumberMaxdecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param minNumber The min number of typeOfNumberMaxdecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberMaxdecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberMaxdecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimalList The collection of typeOfNumberMaxdecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        doSetTypeOfNumberMaxdecimal_InScope(typeOfNumberMaxdecimalList);
    }

    protected void doSetTypeOfNumberMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        regINS(CK_INS, cTL(typeOfNumberMaxdecimalList), xgetCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimalList The collection of typeOfNumberMaxdecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        doSetTypeOfNumberMaxdecimal_NotInScope(typeOfNumberMaxdecimalList);
    }

    protected void doSetTypeOfNumberMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        regINS(CK_NINS, cTL(typeOfNumberMaxdecimalList), xgetCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     */
    public void setTypeOfNumberMaxdecimal_IsNull() { regTypeOfNumberMaxdecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     */
    public void setTypeOfNumberMaxdecimal_IsNotNull() { regTypeOfNumberMaxdecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberMaxdecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL"); }
    protected abstract ConditionValue xgetCValueTypeOfNumberMaxdecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_Equal(java.math.BigDecimal typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterThan(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessThan(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_GreaterEqual(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInteger_LessEqual(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_InScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_NotInScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTEGER: {NUMBER(22)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue xgetCValueTypeOfInteger();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_Equal(String typeOfBinaryFloat) {
        doSetTypeOfBinaryFloat_Equal(fRES(typeOfBinaryFloat));
    }

    protected void doSetTypeOfBinaryFloat_Equal(String typeOfBinaryFloat) {
        regTypeOfBinaryFloat(CK_EQ, typeOfBinaryFloat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_NotEqual(String typeOfBinaryFloat) {
        doSetTypeOfBinaryFloat_NotEqual(fRES(typeOfBinaryFloat));
    }

    protected void doSetTypeOfBinaryFloat_NotEqual(String typeOfBinaryFloat) {
        regTypeOfBinaryFloat(CK_NES, typeOfBinaryFloat);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloatList The collection of typeOfBinaryFloat as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_InScope(Collection<String> typeOfBinaryFloatList) {
        doSetTypeOfBinaryFloat_InScope(typeOfBinaryFloatList);
    }

    protected void doSetTypeOfBinaryFloat_InScope(Collection<String> typeOfBinaryFloatList) {
        regINS(CK_INS, cTL(typeOfBinaryFloatList), xgetCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloatList The collection of typeOfBinaryFloat as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_NotInScope(Collection<String> typeOfBinaryFloatList) {
        doSetTypeOfBinaryFloat_NotInScope(typeOfBinaryFloatList);
    }

    protected void doSetTypeOfBinaryFloat_NotInScope(Collection<String> typeOfBinaryFloatList) {
        regINS(CK_NINS, cTL(typeOfBinaryFloatList), xgetCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br>
     * <pre>e.g. setTypeOfBinaryFloat_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_LikeSearch(String typeOfBinaryFloat, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBinaryFloat_LikeSearch(typeOfBinaryFloat, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br>
     * <pre>e.g. setTypeOfBinaryFloat_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_LikeSearch(String typeOfBinaryFloat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBinaryFloat), xgetCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_NotLikeSearch(String typeOfBinaryFloat, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBinaryFloat_NotLikeSearch(typeOfBinaryFloat, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_NotLikeSearch(String typeOfBinaryFloat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBinaryFloat), xgetCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_PrefixSearch(String typeOfBinaryFloat) {
        setTypeOfBinaryFloat_LikeSearch(typeOfBinaryFloat, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNull() { regTypeOfBinaryFloat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNullOrEmpty() { regTypeOfBinaryFloat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNotNull() { regTypeOfBinaryFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfBinaryFloat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT"); }
    protected abstract ConditionValue xgetCValueTypeOfBinaryFloat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_Equal(String typeOfBinaryDouble) {
        doSetTypeOfBinaryDouble_Equal(fRES(typeOfBinaryDouble));
    }

    protected void doSetTypeOfBinaryDouble_Equal(String typeOfBinaryDouble) {
        regTypeOfBinaryDouble(CK_EQ, typeOfBinaryDouble);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_NotEqual(String typeOfBinaryDouble) {
        doSetTypeOfBinaryDouble_NotEqual(fRES(typeOfBinaryDouble));
    }

    protected void doSetTypeOfBinaryDouble_NotEqual(String typeOfBinaryDouble) {
        regTypeOfBinaryDouble(CK_NES, typeOfBinaryDouble);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDoubleList The collection of typeOfBinaryDouble as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_InScope(Collection<String> typeOfBinaryDoubleList) {
        doSetTypeOfBinaryDouble_InScope(typeOfBinaryDoubleList);
    }

    protected void doSetTypeOfBinaryDouble_InScope(Collection<String> typeOfBinaryDoubleList) {
        regINS(CK_INS, cTL(typeOfBinaryDoubleList), xgetCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDoubleList The collection of typeOfBinaryDouble as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_NotInScope(Collection<String> typeOfBinaryDoubleList) {
        doSetTypeOfBinaryDouble_NotInScope(typeOfBinaryDoubleList);
    }

    protected void doSetTypeOfBinaryDouble_NotInScope(Collection<String> typeOfBinaryDoubleList) {
        regINS(CK_NINS, cTL(typeOfBinaryDoubleList), xgetCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br>
     * <pre>e.g. setTypeOfBinaryDouble_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_LikeSearch(String typeOfBinaryDouble, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBinaryDouble_LikeSearch(typeOfBinaryDouble, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br>
     * <pre>e.g. setTypeOfBinaryDouble_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_LikeSearch(String typeOfBinaryDouble, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBinaryDouble), xgetCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_NotLikeSearch(String typeOfBinaryDouble, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBinaryDouble_NotLikeSearch(typeOfBinaryDouble, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_NotLikeSearch(String typeOfBinaryDouble, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBinaryDouble), xgetCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_PrefixSearch(String typeOfBinaryDouble) {
        setTypeOfBinaryDouble_LikeSearch(typeOfBinaryDouble, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNull() { regTypeOfBinaryDouble(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNullOrEmpty() { regTypeOfBinaryDouble(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNotNull() { regTypeOfBinaryDouble(CK_ISNN, DOBJ); }

    protected void regTypeOfBinaryDouble(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE"); }
    protected abstract ConditionValue xgetCValueTypeOfBinaryDouble();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_Equal(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_EQ,  typeOfDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GT,  typeOfDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LT,  typeOfDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GE,  typeOfDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LE, typeOfDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_DATE: {DATE(7)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected abstract ConditionValue xgetCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_Equal(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfTimestamp_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_OF_TIMESTAMP"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfTimestamp(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfTimestamp_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected abstract ConditionValue xgetCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_Equal(String typeOfIntervalYearToMonth) {
        doSetTypeOfIntervalYearToMonth_Equal(fRES(typeOfIntervalYearToMonth));
    }

    protected void doSetTypeOfIntervalYearToMonth_Equal(String typeOfIntervalYearToMonth) {
        regTypeOfIntervalYearToMonth(CK_EQ, typeOfIntervalYearToMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_NotEqual(String typeOfIntervalYearToMonth) {
        doSetTypeOfIntervalYearToMonth_NotEqual(fRES(typeOfIntervalYearToMonth));
    }

    protected void doSetTypeOfIntervalYearToMonth_NotEqual(String typeOfIntervalYearToMonth) {
        regTypeOfIntervalYearToMonth(CK_NES, typeOfIntervalYearToMonth);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonthList The collection of typeOfIntervalYearToMonth as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_InScope(Collection<String> typeOfIntervalYearToMonthList) {
        doSetTypeOfIntervalYearToMonth_InScope(typeOfIntervalYearToMonthList);
    }

    protected void doSetTypeOfIntervalYearToMonth_InScope(Collection<String> typeOfIntervalYearToMonthList) {
        regINS(CK_INS, cTL(typeOfIntervalYearToMonthList), xgetCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonthList The collection of typeOfIntervalYearToMonth as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_NotInScope(Collection<String> typeOfIntervalYearToMonthList) {
        doSetTypeOfIntervalYearToMonth_NotInScope(typeOfIntervalYearToMonthList);
    }

    protected void doSetTypeOfIntervalYearToMonth_NotInScope(Collection<String> typeOfIntervalYearToMonthList) {
        regINS(CK_NINS, cTL(typeOfIntervalYearToMonthList), xgetCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)} <br>
     * <pre>e.g. setTypeOfIntervalYearToMonth_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_LikeSearch(String typeOfIntervalYearToMonth, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfIntervalYearToMonth_LikeSearch(typeOfIntervalYearToMonth, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)} <br>
     * <pre>e.g. setTypeOfIntervalYearToMonth_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_LikeSearch(String typeOfIntervalYearToMonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfIntervalYearToMonth), xgetCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_NotLikeSearch(String typeOfIntervalYearToMonth, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfIntervalYearToMonth_NotLikeSearch(typeOfIntervalYearToMonth, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_NotLikeSearch(String typeOfIntervalYearToMonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfIntervalYearToMonth), xgetCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_PrefixSearch(String typeOfIntervalYearToMonth) {
        setTypeOfIntervalYearToMonth_LikeSearch(typeOfIntervalYearToMonth, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNull() { regTypeOfIntervalYearToMonth(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNullOrEmpty() { regTypeOfIntervalYearToMonth(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNotNull() { regTypeOfIntervalYearToMonth(CK_ISNN, DOBJ); }

    protected void regTypeOfIntervalYearToMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH"); }
    protected abstract ConditionValue xgetCValueTypeOfIntervalYearToMonth();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_Equal(String typeOfIntervalDayToSecond) {
        doSetTypeOfIntervalDayToSecond_Equal(fRES(typeOfIntervalDayToSecond));
    }

    protected void doSetTypeOfIntervalDayToSecond_Equal(String typeOfIntervalDayToSecond) {
        regTypeOfIntervalDayToSecond(CK_EQ, typeOfIntervalDayToSecond);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_NotEqual(String typeOfIntervalDayToSecond) {
        doSetTypeOfIntervalDayToSecond_NotEqual(fRES(typeOfIntervalDayToSecond));
    }

    protected void doSetTypeOfIntervalDayToSecond_NotEqual(String typeOfIntervalDayToSecond) {
        regTypeOfIntervalDayToSecond(CK_NES, typeOfIntervalDayToSecond);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecondList The collection of typeOfIntervalDayToSecond as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_InScope(Collection<String> typeOfIntervalDayToSecondList) {
        doSetTypeOfIntervalDayToSecond_InScope(typeOfIntervalDayToSecondList);
    }

    protected void doSetTypeOfIntervalDayToSecond_InScope(Collection<String> typeOfIntervalDayToSecondList) {
        regINS(CK_INS, cTL(typeOfIntervalDayToSecondList), xgetCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecondList The collection of typeOfIntervalDayToSecond as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_NotInScope(Collection<String> typeOfIntervalDayToSecondList) {
        doSetTypeOfIntervalDayToSecond_NotInScope(typeOfIntervalDayToSecondList);
    }

    protected void doSetTypeOfIntervalDayToSecond_NotInScope(Collection<String> typeOfIntervalDayToSecondList) {
        regINS(CK_NINS, cTL(typeOfIntervalDayToSecondList), xgetCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)} <br>
     * <pre>e.g. setTypeOfIntervalDayToSecond_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_LikeSearch(String typeOfIntervalDayToSecond, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfIntervalDayToSecond_LikeSearch(typeOfIntervalDayToSecond, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)} <br>
     * <pre>e.g. setTypeOfIntervalDayToSecond_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_LikeSearch(String typeOfIntervalDayToSecond, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfIntervalDayToSecond), xgetCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_NotLikeSearch(String typeOfIntervalDayToSecond, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfIntervalDayToSecond_NotLikeSearch(typeOfIntervalDayToSecond, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_NotLikeSearch(String typeOfIntervalDayToSecond, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfIntervalDayToSecond), xgetCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_PrefixSearch(String typeOfIntervalDayToSecond) {
        setTypeOfIntervalDayToSecond_LikeSearch(typeOfIntervalDayToSecond, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNull() { regTypeOfIntervalDayToSecond(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNullOrEmpty() { regTypeOfIntervalDayToSecond(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNotNull() { regTypeOfIntervalDayToSecond(CK_ISNN, DOBJ); }

    protected void regTypeOfIntervalDayToSecond(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND"); }
    protected abstract ConditionValue xgetCValueTypeOfIntervalDayToSecond();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(4000)}
     */
    public void setTypeOfBlob_IsNull() { regTypeOfBlob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BLOB: {BLOB(4000)}
     */
    public void setTypeOfBlob_IsNotNull() { regTypeOfBlob(CK_ISNN, DOBJ); }

    protected void regTypeOfBlob(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    protected abstract ConditionValue xgetCValueTypeOfBlob();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_RAW: {RAW(512)}
     */
    public void setTypeOfRaw_IsNull() { regTypeOfRaw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_RAW: {RAW(512)}
     */
    public void setTypeOfRaw_IsNotNull() { regTypeOfRaw(CK_ISNN, DOBJ); }

    protected void regTypeOfRaw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfRaw(), "TYPE_OF_RAW"); }
    protected abstract ConditionValue xgetCValueTypeOfRaw();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_Equal(String typeOfBfile) {
        doSetTypeOfBfile_Equal(fRES(typeOfBfile));
    }

    protected void doSetTypeOfBfile_Equal(String typeOfBfile) {
        regTypeOfBfile(CK_EQ, typeOfBfile);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_NotEqual(String typeOfBfile) {
        doSetTypeOfBfile_NotEqual(fRES(typeOfBfile));
    }

    protected void doSetTypeOfBfile_NotEqual(String typeOfBfile) {
        regTypeOfBfile(CK_NES, typeOfBfile);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfileList The collection of typeOfBfile as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_InScope(Collection<String> typeOfBfileList) {
        doSetTypeOfBfile_InScope(typeOfBfileList);
    }

    protected void doSetTypeOfBfile_InScope(Collection<String> typeOfBfileList) {
        regINS(CK_INS, cTL(typeOfBfileList), xgetCValueTypeOfBfile(), "TYPE_OF_BFILE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfileList The collection of typeOfBfile as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_NotInScope(Collection<String> typeOfBfileList) {
        doSetTypeOfBfile_NotInScope(typeOfBfileList);
    }

    protected void doSetTypeOfBfile_NotInScope(Collection<String> typeOfBfileList) {
        regINS(CK_NINS, cTL(typeOfBfileList), xgetCValueTypeOfBfile(), "TYPE_OF_BFILE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)} <br>
     * <pre>e.g. setTypeOfBfile_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfBfile The value of typeOfBfile as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBfile_LikeSearch(String typeOfBfile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBfile_LikeSearch(typeOfBfile, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)} <br>
     * <pre>e.g. setTypeOfBfile_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBfile The value of typeOfBfile as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBfile_LikeSearch(String typeOfBfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBfile), xgetCValueTypeOfBfile(), "TYPE_OF_BFILE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfBfile_NotLikeSearch(String typeOfBfile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfBfile_NotLikeSearch(typeOfBfile, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBfile_NotLikeSearch(String typeOfBfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBfile), xgetCValueTypeOfBfile(), "TYPE_OF_BFILE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_PrefixSearch(String typeOfBfile) {
        setTypeOfBfile_LikeSearch(typeOfBfile, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNull() { regTypeOfBfile(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNullOrEmpty() { regTypeOfBfile(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNotNull() { regTypeOfBfile(CK_ISNN, DOBJ); }

    protected void regTypeOfBfile(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBfile(), "TYPE_OF_BFILE"); }
    protected abstract ConditionValue xgetCValueTypeOfBfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_Equal(String typeOfRowid) {
        doSetTypeOfRowid_Equal(fRES(typeOfRowid));
    }

    protected void doSetTypeOfRowid_Equal(String typeOfRowid) {
        regTypeOfRowid(CK_EQ, typeOfRowid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_NotEqual(String typeOfRowid) {
        doSetTypeOfRowid_NotEqual(fRES(typeOfRowid));
    }

    protected void doSetTypeOfRowid_NotEqual(String typeOfRowid) {
        regTypeOfRowid(CK_NES, typeOfRowid);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowidList The collection of typeOfRowid as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_InScope(Collection<String> typeOfRowidList) {
        doSetTypeOfRowid_InScope(typeOfRowidList);
    }

    protected void doSetTypeOfRowid_InScope(Collection<String> typeOfRowidList) {
        regINS(CK_INS, cTL(typeOfRowidList), xgetCValueTypeOfRowid(), "TYPE_OF_ROWID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowidList The collection of typeOfRowid as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_NotInScope(Collection<String> typeOfRowidList) {
        doSetTypeOfRowid_NotInScope(typeOfRowidList);
    }

    protected void doSetTypeOfRowid_NotInScope(Collection<String> typeOfRowidList) {
        regINS(CK_NINS, cTL(typeOfRowidList), xgetCValueTypeOfRowid(), "TYPE_OF_ROWID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)} <br>
     * <pre>e.g. setTypeOfRowid_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfRowid The value of typeOfRowid as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfRowid_LikeSearch(String typeOfRowid, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfRowid_LikeSearch(typeOfRowid, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)} <br>
     * <pre>e.g. setTypeOfRowid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfRowid The value of typeOfRowid as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfRowid_LikeSearch(String typeOfRowid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfRowid), xgetCValueTypeOfRowid(), "TYPE_OF_ROWID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfRowid_NotLikeSearch(String typeOfRowid, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfRowid_NotLikeSearch(typeOfRowid, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfRowid_NotLikeSearch(String typeOfRowid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfRowid), xgetCValueTypeOfRowid(), "TYPE_OF_ROWID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_PrefixSearch(String typeOfRowid) {
        setTypeOfRowid_LikeSearch(typeOfRowid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNull() { regTypeOfRowid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNullOrEmpty() { regTypeOfRowid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNotNull() { regTypeOfRowid(CK_ISNN, DOBJ); }

    protected void regTypeOfRowid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfRowid(), "TYPE_OF_ROWID"); }
    protected abstract ConditionValue xgetCValueTypeOfRowid();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VENDOR_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br>
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
