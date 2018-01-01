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
 * The abstract condition-query of VENDOR_LARGE_DATA.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_LARGE_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeDataId_Equal(Long largeDataId) {
        doSetLargeDataId_Equal(largeDataId);
    }

    protected void doSetLargeDataId_Equal(Long largeDataId) {
        regLargeDataId(CK_EQ, largeDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeDataId_GreaterThan(Long largeDataId) {
        regLargeDataId(CK_GT, largeDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeDataId_LessThan(Long largeDataId) {
        regLargeDataId(CK_LT, largeDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeDataId_GreaterEqual(Long largeDataId) {
        regLargeDataId(CK_GE, largeDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataId The value of largeDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLargeDataId_LessEqual(Long largeDataId) {
        regLargeDataId(CK_LE, largeDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param minNumber The min number of largeDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of largeDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLargeDataId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param minNumber The min number of largeDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of largeDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLargeDataId(), "LARGE_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataIdList The collection of largeDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeDataId_InScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_InScope(largeDataIdList);
    }

    protected void doSetLargeDataId_InScope(Collection<Long> largeDataIdList) {
        regINS(CK_INS, cTL(largeDataIdList), xgetCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     * @param largeDataIdList The collection of largeDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_NotInScope(largeDataIdList);
    }

    protected void doSetLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        regINS(CK_NINS, cTL(largeDataIdList), xgetCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br>
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendorLargeDataRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VendorLargeDataRefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeDataRef(SubQuery<VendorLargeDataRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(cb.query());
        registerExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LARGE_DATA_ID from VENDOR_LARGE_DATA_REF where ...)} <br>
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendorLargeDataRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LargeDataId_NotExistsReferrer_VendorLargeDataRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeDataRef(SubQuery<VendorLargeDataRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    public void xsderiveVendorLargeDataRefList(String fn, SubQuery<VendorLargeDataRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList", al, op);
    }
    public abstract String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from VENDOR_LARGE_DATA_REF where ...)} <br>
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendorLargeDataRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataRefCB> derivedVendorLargeDataRef() {
        return xcreateQDRFunctionVendorLargeDataRefList();
    }
    protected HpQDRFunction<VendorLargeDataRefCB> xcreateQDRFunctionVendorLargeDataRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendorLargeDataRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendorLargeDataRefList(String fn, SubQuery<VendorLargeDataRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(cb.query()); String prpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", sqpp, "vendorLargeDataRefList", rd, vl, prpp, op);
    }
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataId_IsNull() { regLargeDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LARGE_DATA_ID: {PK, NotNull, NUMBER(12)}
     */
    public void setLargeDataId_IsNotNull() { regLargeDataId(CK_ISNN, DOBJ); }

    protected void regLargeDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeDataId(), "LARGE_DATA_ID"); }
    protected abstract ConditionValue xgetCValueLargeDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringIndex_Equal(String stringIndex) {
        doSetStringIndex_Equal(fRES(stringIndex));
    }

    protected void doSetStringIndex_Equal(String stringIndex) {
        regStringIndex(CK_EQ, stringIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringIndex_NotEqual(String stringIndex) {
        doSetStringIndex_NotEqual(fRES(stringIndex));
    }

    protected void doSetStringIndex_NotEqual(String stringIndex) {
        regStringIndex(CK_NES, stringIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndexList The collection of stringIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringIndex_InScope(Collection<String> stringIndexList) {
        doSetStringIndex_InScope(stringIndexList);
    }

    protected void doSetStringIndex_InScope(Collection<String> stringIndexList) {
        regINS(CK_INS, cTL(stringIndexList), xgetCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndexList The collection of stringIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringIndex_NotInScope(Collection<String> stringIndexList) {
        doSetStringIndex_NotInScope(stringIndexList);
    }

    protected void doSetStringIndex_NotInScope(Collection<String> stringIndexList) {
        regINS(CK_NINS, cTL(stringIndexList), xgetCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringIndex_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringIndex The value of stringIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringIndex_LikeSearch(String stringIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringIndex_LikeSearch(stringIndex, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringIndex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringIndex The value of stringIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringIndex_LikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringIndex), xgetCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringIndex_NotLikeSearch(String stringIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringIndex_NotLikeSearch(stringIndex, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringIndex_NotLikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringIndex), xgetCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_INDEX: {IX, NotNull, VARCHAR2(200)}
     * @param stringIndex The value of stringIndex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringIndex_PrefixSearch(String stringIndex) {
        setStringIndex_LikeSearch(stringIndex, xcLSOPPre());
    }

    protected void regStringIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringIndex(), "STRING_INDEX"); }
    protected abstract ConditionValue xgetCValueStringIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNoIndex_Equal(String stringNoIndex) {
        doSetStringNoIndex_Equal(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_Equal(String stringNoIndex) {
        regStringNoIndex(CK_EQ, stringNoIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNoIndex_NotEqual(String stringNoIndex) {
        doSetStringNoIndex_NotEqual(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_NotEqual(String stringNoIndex) {
        regStringNoIndex(CK_NES, stringNoIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndexList The collection of stringNoIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_InScope(stringNoIndexList);
    }

    protected void doSetStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        regINS(CK_INS, cTL(stringNoIndexList), xgetCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndexList The collection of stringNoIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_NotInScope(stringNoIndexList);
    }

    protected void doSetStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        regINS(CK_NINS, cTL(stringNoIndexList), xgetCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringNoIndex_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringNoIndex The value of stringNoIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringNoIndex_LikeSearch(String stringNoIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringNoIndex_LikeSearch(stringNoIndex, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringNoIndex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNoIndex The value of stringNoIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNoIndex_LikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNoIndex), xgetCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringNoIndex_NotLikeSearch(String stringNoIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringNoIndex_NotLikeSearch(stringNoIndex, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNoIndex_NotLikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNoIndex), xgetCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_NO_INDEX: {NotNull, VARCHAR2(200)}
     * @param stringNoIndex The value of stringNoIndex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringNoIndex_PrefixSearch(String stringNoIndex) {
        setStringNoIndex_LikeSearch(stringNoIndex, xcLSOPPre());
    }

    protected void regStringNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringNoIndex(), "STRING_NO_INDEX"); }
    protected abstract ConditionValue xgetCValueStringNoIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringUniqueIndex_Equal(String stringUniqueIndex) {
        doSetStringUniqueIndex_Equal(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_Equal(String stringUniqueIndex) {
        regStringUniqueIndex(CK_EQ, stringUniqueIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        doSetStringUniqueIndex_NotEqual(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        regStringUniqueIndex(CK_NES, stringUniqueIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_InScope(stringUniqueIndexList);
    }

    protected void doSetStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_INS, cTL(stringUniqueIndexList), xgetCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_NotInScope(stringUniqueIndexList);
    }

    protected void doSetStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_NINS, cTL(stringUniqueIndexList), xgetCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringUniqueIndex_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringUniqueIndex The value of stringUniqueIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_LikeSearch(String stringUniqueIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringUniqueIndex_LikeSearch(stringUniqueIndex, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setStringUniqueIndex_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringUniqueIndex The value of stringUniqueIndex as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_LikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringUniqueIndex), xgetCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_NotLikeSearch(String stringUniqueIndex, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringUniqueIndex_NotLikeSearch(stringUniqueIndex, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringUniqueIndex_NotLikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringUniqueIndex), xgetCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStringUniqueIndex_PrefixSearch(String stringUniqueIndex) {
        setStringUniqueIndex_LikeSearch(stringUniqueIndex, xcLSOPPre());
    }

    protected void regStringUniqueIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX"); }
    protected abstract ConditionValue xgetCValueStringUniqueIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntflgIndex_Equal(Integer intflgIndex) {
        doSetIntflgIndex_Equal(intflgIndex);
    }

    protected void doSetIntflgIndex_Equal(Integer intflgIndex) {
        regIntflgIndex(CK_EQ, intflgIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntflgIndex_GreaterThan(Integer intflgIndex) {
        regIntflgIndex(CK_GT, intflgIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntflgIndex_LessThan(Integer intflgIndex) {
        regIntflgIndex(CK_LT, intflgIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntflgIndex_GreaterEqual(Integer intflgIndex) {
        regIntflgIndex(CK_GE, intflgIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndex The value of intflgIndex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIntflgIndex_LessEqual(Integer intflgIndex) {
        regIntflgIndex(CK_LE, intflgIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of intflgIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of intflgIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIntflgIndex_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIntflgIndex_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of intflgIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of intflgIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntflgIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIntflgIndex(), "INTFLG_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndexList The collection of intflgIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_InScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        regINS(CK_INS, cTL(intflgIndexList), xgetCValueIntflgIndex(), "INTFLG_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INTFLG_INDEX: {NotNull, NUMBER(8)}
     * @param intflgIndexList The collection of intflgIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_NotInScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        regINS(CK_NINS, cTL(intflgIndexList), xgetCValueIntflgIndex(), "INTFLG_INDEX");
    }

    protected void regIntflgIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIntflgIndex(), "INTFLG_INDEX"); }
    protected abstract ConditionValue xgetCValueIntflgIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        doSetNumericIntegerIndex_Equal(numericIntegerIndex);
    }

    protected void doSetNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_EQ, numericIntegerIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_GreaterThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GT, numericIntegerIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_LessThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LT, numericIntegerIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_GreaterEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GE, numericIntegerIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_LessEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LE, numericIntegerIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numericIntegerIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNumericIntegerIndex_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNumericIntegerIndex_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numericIntegerIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_InScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_INS, cTL(numericIntegerIndexList), xgetCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_NotInScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_NINS, cTL(numericIntegerIndexList), xgetCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    protected void regNumericIntegerIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX"); }
    protected abstract ConditionValue xgetCValueNumericIntegerIndex();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        doSetNumericIntegerNoIndex_Equal(numericIntegerNoIndex);
    }

    protected void doSetNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_EQ, numericIntegerNoIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_GreaterThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GT, numericIntegerNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_LessThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LT, numericIntegerNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_GreaterEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GE, numericIntegerNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_LessEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LE, numericIntegerNoIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerNoIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numericIntegerNoIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNumericIntegerNoIndex_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNumericIntegerNoIndex_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param minNumber The min number of numericIntegerNoIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numericIntegerNoIndex. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerNoIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_InScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_INS, cTL(numericIntegerNoIndexList), xgetCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_NotInScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_NINS, cTL(numericIntegerNoIndexList), xgetCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    protected void regNumericIntegerNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX"); }
    protected abstract ConditionValue xgetCValueNumericIntegerNoIndex();

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
    public HpSLCFunction<VendorLargeDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorLargeDataCB.class);
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
    public HpSLCFunction<VendorLargeDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorLargeDataCB.class);
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
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorLargeDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorLargeDataCB.class);
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
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorLargeDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorLargeDataCB.class);
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
    public HpSLCFunction<VendorLargeDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorLargeDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorLargeDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorLargeDataCQ sq);

    protected VendorLargeDataCB xcreateScalarConditionCB() {
        VendorLargeDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorLargeDataCB xcreateScalarConditionPartitionByCB() {
        VendorLargeDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorLargeDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LARGE_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorLargeDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LARGE_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorLargeDataCQ sq);

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
    protected VendorLargeDataCB newMyCB() {
        return new VendorLargeDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorLargeDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
