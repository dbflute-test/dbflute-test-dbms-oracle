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
 * The abstract condition-query of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public abstract class AbstractBsNextSchemaProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextSchemaProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "NEXT_SCHEMA_PRODUCT_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    protected void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    protected void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusCode_LikeSearch(productStatusCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusCode_NotLikeSearch(productStatusCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, xcLSOPPre());
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteRefNextTarget</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteRefNextTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefNextTarget(SubQuery<WhiteRefNextTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsNextSchemaProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of NextSchemaProductList for 'exists'. (NotNull)
     */
    public void existsNextSchemaProduct(SubQuery<NextSchemaProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_ExistsReferrer_NextSchemaProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteRefNextTarget</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefNextTarget(SubQuery<WhiteRefNextTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsNextSchemaProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductStatusCode_NotExistsReferrer_NextSchemaProductList for 'not exists'. (NotNull)
     */
    public void notExistsNextSchemaProduct(SubQuery<NextSchemaProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    public void xsderiveWhiteRefNextTargetList(String fn, SubQuery<WhiteRefNextTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    public void xsderiveNextSchemaProductList(String fn, SubQuery<NextSchemaProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_REF_NEXT_TARGET where ...)} <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteRefNextTarget()</span>.<span style="color: #CC4747">max</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     targetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> derivedWhiteRefNextTarget() {
        return xcreateQDRFunctionWhiteRefNextTargetList();
    }
    protected HpQDRFunction<WhiteRefNextTargetCB> xcreateQDRFunctionWhiteRefNextTargetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteRefNextTargetList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteRefNextTargetList(String fn, SubQuery<WhiteRefNextTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(cb.query()); String prpp = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", sqpp, "whiteRefNextTargetList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from NEXT_SCHEMA_PRODUCT where ...)} <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedNextSchemaProduct()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductCB> derivedNextSchemaProduct() {
        return xcreateQDRFunctionNextSchemaProductList();
    }
    protected HpQDRFunction<NextSchemaProductCB> xcreateQDRFunctionNextSchemaProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveNextSchemaProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveNextSchemaProductList(String fn, SubQuery<NextSchemaProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(cb.query()); String prpp = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", sqpp, "nextSchemaProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DOBJ); }

    protected void regProductStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueProductStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_Equal(String productStatusName) {
        doSetProductStatusName_Equal(fRES(productStatusName));
    }

    protected void doSetProductStatusName_Equal(String productStatusName) {
        regProductStatusName(CK_EQ, productStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotEqual(String productStatusName) {
        doSetProductStatusName_NotEqual(fRES(productStatusName));
    }

    protected void doSetProductStatusName_NotEqual(String productStatusName) {
        regProductStatusName(CK_NES, productStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_InScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_InScope(productStatusNameList);
    }

    protected void doSetProductStatusName_InScope(Collection<String> productStatusNameList) {
        regINS(CK_INS, cTL(productStatusNameList), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_NotInScope(productStatusNameList);
    }

    protected void doSetProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        regINS(CK_NINS, cTL(productStatusNameList), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusName_LikeSearch(productStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusName), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusName_NotLikeSearch(productStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusName), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_PrefixSearch(String productStatusName) {
        setProductStatusName_LikeSearch(productStatusName, xcLSOPPre());
    }

    protected void regProductStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueProductStatusName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, NextSchemaProductStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(NextSchemaProductStatusCQ sq);

    protected NextSchemaProductStatusCB xcreateScalarConditionCB() {
        NextSchemaProductStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NextSchemaProductStatusCB xcreateScalarConditionPartitionByCB() {
        NextSchemaProductStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NextSchemaProductStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_STATUS_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NextSchemaProductStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NextSchemaProductStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<NextSchemaProductStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NextSchemaProductStatusCQ sq);

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
    protected NextSchemaProductStatusCB newMyCB() {
        return new NextSchemaProductStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return NextSchemaProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
