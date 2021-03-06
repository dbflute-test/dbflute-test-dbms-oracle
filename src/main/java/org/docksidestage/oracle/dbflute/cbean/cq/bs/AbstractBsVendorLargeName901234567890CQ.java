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
 * The abstract condition-query of VENDOR_LARGE_NAME_901234567890.
 * @author oracleman
 */
public abstract class AbstractBsVendorLargeName901234567890CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeName901234567890CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_LARGE_NAME_901234567890";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_Equal(Long vendorLargeName901234567Id) {
        doSetVendorLargeName901234567Id_Equal(vendorLargeName901234567Id);
    }

    protected void doSetVendorLargeName901234567Id_Equal(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_EQ, vendorLargeName901234567Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_GreaterThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GT, vendorLargeName901234567Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_LessThan(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LT, vendorLargeName901234567Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_GreaterEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_GE, vendorLargeName901234567Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567Id The value of vendorLargeName901234567Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_LessEqual(Long vendorLargeName901234567Id) {
        regVendorLargeName901234567Id(CK_LE, vendorLargeName901234567Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorLargeName901234567Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorLargeName901234567Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorLargeName901234567Id_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorLargeName901234567Id_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorLargeName901234567Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorLargeName901234567Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorLargeName901234567Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567IdList The collection of vendorLargeName901234567Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_InScope(Collection<Long> vendorLargeName901234567IdList) {
        doSetVendorLargeName901234567Id_InScope(vendorLargeName901234567IdList);
    }

    protected void doSetVendorLargeName901234567Id_InScope(Collection<Long> vendorLargeName901234567IdList) {
        regINS(CK_INS, cTL(vendorLargeName901234567IdList), xgetCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorLargeName901234567IdList The collection of vendorLargeName901234567Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        doSetVendorLargeName901234567Id_NotInScope(vendorLargeName901234567IdList);
    }

    protected void doSetVendorLargeName901234567Id_NotInScope(Collection<Long> vendorLargeName901234567IdList) {
        regINS(CK_NINS, cTL(vendorLargeName901234567IdList), xgetCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendorLargeName90123456Ref</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VendorLargeName90123456RefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeName90123456Ref(SubQuery<VendorLargeName90123456RefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(cb.query());
        registerExistsReferrer(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_ExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select VENDOR_LARGE_NAME_901234567_ID from VENDOR_LARGE_NAME_90123456_REF where ...)} <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendorLargeName90123456Ref</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeName90123456Ref(SubQuery<VendorLargeName90123456RefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(cb.query());
        registerNotExistsReferrer(cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList");
    }
    public abstract String keepVendorLargeName901234567Id_NotExistsReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    public void xsderiveVendorLargeName90123456RefList(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", pp, "vendorLargeName90123456RefList", al, op);
    }
    public abstract String keepVendorLargeName901234567Id_SpecifyDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from VENDOR_LARGE_NAME_90123456_REF where ...)} <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendorLargeName90123456Ref()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeName90123456RefCB> derivedVendorLargeName90123456Ref() {
        return xcreateQDRFunctionVendorLargeName90123456RefList();
    }
    protected HpQDRFunction<VendorLargeName90123456RefCB> xcreateQDRFunctionVendorLargeName90123456RefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendorLargeName90123456RefList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendorLargeName90123456RefList(String fn, SubQuery<VendorLargeName90123456RefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(cb.query()); String prpp = keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "VENDOR_LARGE_NAME_901234567_ID", "VENDOR_LARGE_NAME_901234567_ID", sqpp, "vendorLargeName90123456RefList", rd, vl, prpp, op);
    }
    public abstract String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefList(VendorLargeName90123456RefCQ sq);
    public abstract String keepVendorLargeName901234567Id_QueryDerivedReferrer_VendorLargeName90123456RefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName901234567Id_IsNull() { regVendorLargeName901234567Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_901234567_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorLargeName901234567Id_IsNotNull() { regVendorLargeName901234567Id(CK_ISNN, DOBJ); }

    protected void regVendorLargeName901234567Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorLargeName901234567Id(), "VENDOR_LARGE_NAME_901234567_ID"); }
    protected abstract ConditionValue xgetCValueVendorLargeName901234567Id();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName9012345Name_Equal(String vendorLargeName9012345Name) {
        doSetVendorLargeName9012345Name_Equal(fRES(vendorLargeName9012345Name));
    }

    protected void doSetVendorLargeName9012345Name_Equal(String vendorLargeName9012345Name) {
        regVendorLargeName9012345Name(CK_EQ, vendorLargeName9012345Name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName9012345Name_NotEqual(String vendorLargeName9012345Name) {
        doSetVendorLargeName9012345Name_NotEqual(fRES(vendorLargeName9012345Name));
    }

    protected void doSetVendorLargeName9012345Name_NotEqual(String vendorLargeName9012345Name) {
        regVendorLargeName9012345Name(CK_NES, vendorLargeName9012345Name);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345NameList The collection of vendorLargeName9012345Name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName9012345Name_InScope(Collection<String> vendorLargeName9012345NameList) {
        doSetVendorLargeName9012345Name_InScope(vendorLargeName9012345NameList);
    }

    protected void doSetVendorLargeName9012345Name_InScope(Collection<String> vendorLargeName9012345NameList) {
        regINS(CK_INS, cTL(vendorLargeName9012345NameList), xgetCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345NameList The collection of vendorLargeName9012345Name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName9012345Name_NotInScope(Collection<String> vendorLargeName9012345NameList) {
        doSetVendorLargeName9012345Name_NotInScope(vendorLargeName9012345NameList);
    }

    protected void doSetVendorLargeName9012345Name_NotInScope(Collection<String> vendorLargeName9012345NameList) {
        regINS(CK_NINS, cTL(vendorLargeName9012345NameList), xgetCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br>
     * <pre>e.g. setVendorLargeName9012345Name_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_LikeSearch(String vendorLargeName9012345Name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVendorLargeName9012345Name_LikeSearch(vendorLargeName9012345Name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)} <br>
     * <pre>e.g. setVendorLargeName9012345Name_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_LikeSearch(String vendorLargeName9012345Name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vendorLargeName9012345Name), xgetCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_NotLikeSearch(String vendorLargeName9012345Name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVendorLargeName9012345Name_NotLikeSearch(vendorLargeName9012345Name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVendorLargeName9012345Name_NotLikeSearch(String vendorLargeName9012345Name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vendorLargeName9012345Name), xgetCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VENDOR_LARGE_NAME_9012345_NAME: {NotNull, VARCHAR2(32)}
     * @param vendorLargeName9012345Name The value of vendorLargeName9012345Name as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorLargeName9012345Name_PrefixSearch(String vendorLargeName9012345Name) {
        setVendorLargeName9012345Name_LikeSearch(vendorLargeName9012345Name, xcLSOPPre());
    }

    protected void regVendorLargeName9012345Name(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorLargeName9012345Name(), "VENDOR_LARGE_NAME_9012345_NAME"); }
    protected abstract ConditionValue xgetCValueVendorLargeName9012345Name();

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
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorLargeName901234567890CB.class);
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
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorLargeName901234567890CB.class);
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
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorLargeName901234567890CB.class);
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
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorLargeName901234567890CB.class);
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
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorLargeName901234567890CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void query(VendorLargeName901234567890CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorLargeName901234567890CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorLargeName901234567890CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorLargeName901234567890CQ sq);

    protected VendorLargeName901234567890CB xcreateScalarConditionCB() {
        VendorLargeName901234567890CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorLargeName901234567890CB xcreateScalarConditionPartitionByCB() {
        VendorLargeName901234567890CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorLargeName901234567890CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "VENDOR_LARGE_NAME_901234567_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeName901234567890CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeName901234567890CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorLargeName901234567890CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "VENDOR_LARGE_NAME_901234567_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeName901234567890CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeName901234567890CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorLargeName901234567890CQ sq);

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
    protected VendorLargeName901234567890CB newMyCB() {
        return new VendorLargeName901234567890CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorLargeName901234567890CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
