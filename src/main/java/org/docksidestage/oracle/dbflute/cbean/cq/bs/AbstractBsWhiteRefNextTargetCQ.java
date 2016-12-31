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
 * The abstract condition-query of WHITE_REF_NEXT_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteRefNextTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefNextTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_NEXT_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefNextTargetId_Equal(Long refNextTargetId) {
        doSetRefNextTargetId_Equal(refNextTargetId);
    }

    protected void doSetRefNextTargetId_Equal(Long refNextTargetId) {
        regRefNextTargetId(CK_EQ, refNextTargetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefNextTargetId_GreaterThan(Long refNextTargetId) {
        regRefNextTargetId(CK_GT, refNextTargetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefNextTargetId_LessThan(Long refNextTargetId) {
        regRefNextTargetId(CK_LT, refNextTargetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefNextTargetId_GreaterEqual(Long refNextTargetId) {
        regRefNextTargetId(CK_GE, refNextTargetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefNextTargetId_LessEqual(Long refNextTargetId) {
        regRefNextTargetId(CK_LE, refNextTargetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refNextTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refNextTargetId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefNextTargetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefNextTargetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refNextTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refNextTargetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefNextTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefNextTargetId(), "REF_NEXT_TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetIdList The collection of refNextTargetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextTargetId_InScope(Collection<Long> refNextTargetIdList) {
        doSetRefNextTargetId_InScope(refNextTargetIdList);
    }

    protected void doSetRefNextTargetId_InScope(Collection<Long> refNextTargetIdList) {
        regINS(CK_INS, cTL(refNextTargetIdList), xgetCValueRefNextTargetId(), "REF_NEXT_TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetIdList The collection of refNextTargetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextTargetId_NotInScope(Collection<Long> refNextTargetIdList) {
        doSetRefNextTargetId_NotInScope(refNextTargetIdList);
    }

    protected void doSetRefNextTargetId_NotInScope(Collection<Long> refNextTargetIdList) {
        regINS(CK_NINS, cTL(refNextTargetIdList), xgetCValueRefNextTargetId(), "REF_NEXT_TARGET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextTargetId_IsNull() { regRefNextTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextTargetId_IsNotNull() { regRefNextTargetId(CK_ISNN, DOBJ); }

    protected void regRefNextTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefNextTargetId(), "REF_NEXT_TARGET_ID"); }
    protected abstract ConditionValue xgetCValueRefNextTargetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_Equal(String nextTargetCode) {
        doSetNextTargetCode_Equal(fRES(nextTargetCode));
    }

    protected void doSetNextTargetCode_Equal(String nextTargetCode) {
        regNextTargetCode(CK_EQ, hSC("NEXT_TARGET_CODE", nextTargetCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_NotEqual(String nextTargetCode) {
        doSetNextTargetCode_NotEqual(fRES(nextTargetCode));
    }

    protected void doSetNextTargetCode_NotEqual(String nextTargetCode) {
        regNextTargetCode(CK_NES, hSC("NEXT_TARGET_CODE", nextTargetCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCodeList The collection of nextTargetCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_InScope(Collection<String> nextTargetCodeList) {
        doSetNextTargetCode_InScope(nextTargetCodeList);
    }

    protected void doSetNextTargetCode_InScope(Collection<String> nextTargetCodeList) {
        regINS(CK_INS, cTL(nextTargetCodeList), xgetCValueNextTargetCode(), "NEXT_TARGET_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCodeList The collection of nextTargetCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_NotInScope(Collection<String> nextTargetCodeList) {
        doSetNextTargetCode_NotInScope(nextTargetCodeList);
    }

    protected void doSetNextTargetCode_NotInScope(Collection<String> nextTargetCodeList) {
        regINS(CK_NINS, cTL(nextTargetCodeList), xgetCValueNextTargetCode(), "NEXT_TARGET_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br>
     * <pre>e.g. setNextTargetCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nextTargetCode The value of nextTargetCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNextTargetCode_LikeSearch(String nextTargetCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNextTargetCode_LikeSearch(nextTargetCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br>
     * <pre>e.g. setNextTargetCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nextTargetCode The value of nextTargetCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNextTargetCode_LikeSearch(String nextTargetCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nextTargetCode), xgetCValueNextTargetCode(), "NEXT_TARGET_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNextTargetCode_NotLikeSearch(String nextTargetCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNextTargetCode_NotLikeSearch(nextTargetCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNextTargetCode_NotLikeSearch(String nextTargetCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nextTargetCode), xgetCValueNextTargetCode(), "NEXT_TARGET_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_PrefixSearch(String nextTargetCode) {
        setNextTargetCode_LikeSearch(nextTargetCode, xcLSOPPre());
    }

    protected void regNextTargetCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextTargetCode(), "NEXT_TARGET_CODE"); }
    protected abstract ConditionValue xgetCValueNextTargetCode();

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
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteRefNextTargetCB.class);
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
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteRefNextTargetCB.class);
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
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteRefNextTargetCB.class);
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
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteRefNextTargetCB.class);
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
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteRefNextTargetCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteRefNextTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteRefNextTargetCQ sq);

    protected WhiteRefNextTargetCB xcreateScalarConditionCB() {
        WhiteRefNextTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteRefNextTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefNextTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteRefNextTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REF_NEXT_TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefNextTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteRefNextTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_NEXT_TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefNextTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefNextTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteRefNextTargetCQ sq);

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
    protected WhiteRefNextTargetCB newMyCB() {
        return new WhiteRefNextTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteRefNextTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
