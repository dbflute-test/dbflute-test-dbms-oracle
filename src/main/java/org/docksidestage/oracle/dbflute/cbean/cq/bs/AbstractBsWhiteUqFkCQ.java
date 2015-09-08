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
 * The abstract condition-query of WHITE_UQ_FK.
 * @author oracleman
 */
public abstract class AbstractBsWhiteUqFkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_UQ_FK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkId_Equal(Long uqFkId) {
        doSetUqFkId_Equal(uqFkId);
    }

    protected void doSetUqFkId_Equal(Long uqFkId) {
        regUqFkId(CK_EQ, uqFkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkId_GreaterThan(Long uqFkId) {
        regUqFkId(CK_GT, uqFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkId_LessThan(Long uqFkId) {
        regUqFkId(CK_LT, uqFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkId_GreaterEqual(Long uqFkId) {
        regUqFkId(CK_GE, uqFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUqFkId_LessEqual(Long uqFkId) {
        regUqFkId(CK_LE, uqFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of uqFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUqFkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUqFkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of uqFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUqFkId(), "UQ_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkIdList The collection of uqFkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkId_InScope(Collection<Long> uqFkIdList) {
        doSetUqFkId_InScope(uqFkIdList);
    }

    protected void doSetUqFkId_InScope(Collection<Long> uqFkIdList) {
        regINS(CK_INS, cTL(uqFkIdList), xgetCValueUqFkId(), "UQ_FK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkIdList The collection of uqFkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkId_NotInScope(Collection<Long> uqFkIdList) {
        doSetUqFkId_NotInScope(uqFkIdList);
    }

    protected void doSetUqFkId_NotInScope(Collection<Long> uqFkIdList) {
        regINS(CK_NINS, cTL(uqFkIdList), xgetCValueUqFkId(), "UQ_FK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteUqFkRefByFkToPkId</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteUqFkRefByFkToPkIdList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefByFkToPkId(SubQuery<WhiteUqFkRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerExistsReferrer(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteUqFkRefByFkToPkId</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefByFkToPkId(SubQuery<WhiteUqFkRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    public void xsderiveWhiteUqFkRefByFkToPkIdList(String fn, SubQuery<WhiteUqFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList", al, op);
    }
    public abstract String keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteUqFkRefByFkToPkId()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> derivedWhiteUqFkRefByFkToPkId() {
        return xcreateQDRFunctionWhiteUqFkRefByFkToPkIdList();
    }
    protected HpQDRFunction<WhiteUqFkRefCB> xcreateQDRFunctionWhiteUqFkRefByFkToPkIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteUqFkRefByFkToPkIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteUqFkRefByFkToPkIdList(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(cb.query()); String prpp = keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", sqpp, "whiteUqFkRefByFkToPkIdList", rd, vl, prpp, op);
    }
    public abstract String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);
    public abstract String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setUqFkId_IsNull() { regUqFkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setUqFkId_IsNotNull() { regUqFkId(CK_ISNN, DOBJ); }

    protected void regUqFkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqFkId(), "UQ_FK_ID"); }
    protected abstract ConditionValue xgetCValueUqFkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_Equal(String uqFkCode) {
        doSetUqFkCode_Equal(fRES(uqFkCode));
    }

    protected void doSetUqFkCode_Equal(String uqFkCode) {
        regUqFkCode(CK_EQ, hSC("UQ_FK_CODE", uqFkCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_NotEqual(String uqFkCode) {
        doSetUqFkCode_NotEqual(fRES(uqFkCode));
    }

    protected void doSetUqFkCode_NotEqual(String uqFkCode) {
        regUqFkCode(CK_NES, hSC("UQ_FK_CODE", uqFkCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCodeList The collection of uqFkCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_InScope(Collection<String> uqFkCodeList) {
        doSetUqFkCode_InScope(uqFkCodeList);
    }

    protected void doSetUqFkCode_InScope(Collection<String> uqFkCodeList) {
        regINS(CK_INS, cTL(uqFkCodeList), xgetCValueUqFkCode(), "UQ_FK_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCodeList The collection of uqFkCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_NotInScope(Collection<String> uqFkCodeList) {
        doSetUqFkCode_NotInScope(uqFkCodeList);
    }

    protected void doSetUqFkCode_NotInScope(Collection<String> uqFkCodeList) {
        regINS(CK_NINS, cTL(uqFkCodeList), xgetCValueUqFkCode(), "UQ_FK_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br>
     * <pre>e.g. setUqFkCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param uqFkCode The value of uqFkCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUqFkCode_LikeSearch(String uqFkCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUqFkCode_LikeSearch(uqFkCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br>
     * <pre>e.g. setUqFkCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqFkCode The value of uqFkCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqFkCode_LikeSearch(String uqFkCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqFkCode), xgetCValueUqFkCode(), "UQ_FK_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUqFkCode_NotLikeSearch(String uqFkCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUqFkCode_NotLikeSearch(uqFkCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqFkCode_NotLikeSearch(String uqFkCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqFkCode), xgetCValueUqFkCode(), "UQ_FK_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_PrefixSearch(String uqFkCode) {
        setUqFkCode_LikeSearch(uqFkCode, xcLSOPPre());
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteUqFkRefByFkToUqCode</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteUqFkRefByFkToUqCodeList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefByFkToUqCode(SubQuery<WhiteUqFkRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteUqFkRefByFkToUqCode</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefByFkToUqCode(SubQuery<WhiteUqFkRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerNotExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    public void xsderiveWhiteUqFkRefByFkToUqCodeList(String fn, SubQuery<WhiteUqFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList", al, op);
    }
    public abstract String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_UQ_FK_REF where ...)} <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteUqFkRefByFkToUqCode()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> derivedWhiteUqFkRefByFkToUqCode() {
        return xcreateQDRFunctionWhiteUqFkRefByFkToUqCodeList();
    }
    protected HpQDRFunction<WhiteUqFkRefCB> xcreateQDRFunctionWhiteUqFkRefByFkToUqCodeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteUqFkRefByFkToUqCodeList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteUqFkRefByFkToUqCodeList(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query()); String prpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", sqpp, "whiteUqFkRefByFkToUqCodeList", rd, vl, prpp, op);
    }
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(Object vl);

    protected void regUqFkCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUqFkCode(), "UQ_FK_CODE"); }
    protected abstract ConditionValue xgetCValueUqFkCode();

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
    public HpSLCFunction<WhiteUqFkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteUqFkCB.class);
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
    public HpSLCFunction<WhiteUqFkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteUqFkCB.class);
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
    public HpSLCFunction<WhiteUqFkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteUqFkCB.class);
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
    public HpSLCFunction<WhiteUqFkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteUqFkCB.class);
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
    public HpSLCFunction<WhiteUqFkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteUqFkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteUqFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteUqFkCQ sq);

    protected WhiteUqFkCB xcreateScalarConditionCB() {
        WhiteUqFkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqFkCB xcreateScalarConditionPartitionByCB() {
        WhiteUqFkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqFkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "UQ_FK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqFkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqFkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_FK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqFkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqFkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqFkCQ sq);

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
    protected WhiteUqFkCB newMyCB() {
        return new WhiteUqFkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteUqFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
