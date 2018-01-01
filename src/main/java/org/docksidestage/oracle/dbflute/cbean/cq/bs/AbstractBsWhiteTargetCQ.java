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
 * The abstract condition-query of WHITE_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_Equal(Long targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Long targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTargetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetId_InScope(Collection<Long> targetIdList) {
        doSetTargetId_InScope(targetIdList);
    }

    protected void doSetTargetId_InScope(Collection<Long> targetIdList) {
        regINS(CK_INS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br>
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteRefTarget</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteRefTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefTarget(SubQuery<WhiteRefTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTargetId_ExistsReferrer_WhiteRefTargetList(cb.query());
        registerExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br>
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteRefTarget</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TargetId_NotExistsReferrer_WhiteRefTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefTarget(SubQuery<WhiteRefTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTargetId_NotExistsReferrer_WhiteRefTargetList(cb.query());
        registerNotExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    public void xsderiveWhiteRefTargetList(String fn, SubQuery<WhiteRefTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList", al, op);
    }
    public abstract String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_REF_TARGET where ...)} <br>
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteRefTarget()</span>.<span style="color: #CC4747">max</span>(targetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     targetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     targetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> derivedWhiteRefTarget() {
        return xcreateQDRFunctionWhiteRefTargetList();
    }
    protected HpQDRFunction<WhiteRefTargetCB> xcreateQDRFunctionWhiteRefTargetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteRefTargetList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteRefTargetList(String fn, SubQuery<WhiteRefTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(cb.query()); String prpp = keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TARGET_ID", "TARGET_ID", sqpp, "whiteRefTargetList", rd, vl, prpp, op);
    }
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNull() { regTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNotNull() { regTargetId(CK_ISNN, DOBJ); }

    protected void regTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetId(), "TARGET_ID"); }
    protected abstract ConditionValue xgetCValueTargetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetName_Equal(String targetName) {
        doSetTargetName_Equal(fRES(targetName));
    }

    protected void doSetTargetName_Equal(String targetName) {
        regTargetName(CK_EQ, targetName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetName_NotEqual(String targetName) {
        doSetTargetName_NotEqual(fRES(targetName));
    }

    protected void doSetTargetName_NotEqual(String targetName) {
        regTargetName(CK_NES, targetName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetName_InScope(Collection<String> targetNameList) {
        doSetTargetName_InScope(targetNameList);
    }

    protected void doSetTargetName_InScope(Collection<String> targetNameList) {
        regINS(CK_INS, cTL(targetNameList), xgetCValueTargetName(), "TARGET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetName_NotInScope(Collection<String> targetNameList) {
        doSetTargetName_NotInScope(targetNameList);
    }

    protected void doSetTargetName_NotInScope(Collection<String> targetNameList) {
        regINS(CK_NINS, cTL(targetNameList), xgetCValueTargetName(), "TARGET_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)} <br>
     * <pre>e.g. setTargetName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param targetName The value of targetName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTargetName_LikeSearch(String targetName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTargetName_LikeSearch(targetName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)} <br>
     * <pre>e.g. setTargetName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param targetName The value of targetName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTargetName_LikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(targetName), xgetCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTargetName_NotLikeSearch(String targetName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTargetName_NotLikeSearch(targetName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTargetName_NotLikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(targetName), xgetCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetName_PrefixSearch(String targetName) {
        setTargetName_LikeSearch(targetName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNull() { regTargetName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNullOrEmpty() { regTargetName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNotNull() { regTargetName(CK_ISNN, DOBJ); }

    protected void regTargetName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetName(), "TARGET_NAME"); }
    protected abstract ConditionValue xgetCValueTargetName();

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
    public HpSLCFunction<WhiteTargetCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTargetCB.class);
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
    public HpSLCFunction<WhiteTargetCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTargetCB.class);
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
    public HpSLCFunction<WhiteTargetCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTargetCB.class);
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
    public HpSLCFunction<WhiteTargetCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTargetCB.class);
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
    public HpSLCFunction<WhiteTargetCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTargetCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTargetCQ sq);

    protected WhiteTargetCB xcreateScalarConditionCB() {
        WhiteTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTargetCQ sq);

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
    protected WhiteTargetCB newMyCB() {
        return new WhiteTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
