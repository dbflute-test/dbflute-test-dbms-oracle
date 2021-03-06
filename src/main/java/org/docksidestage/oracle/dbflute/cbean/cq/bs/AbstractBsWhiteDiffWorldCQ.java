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
 * The abstract condition-query of WHITE_DIFF_WORLD.
 * @author oracleman
 */
public abstract class AbstractBsWhiteDiffWorldCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDiffWorldCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DIFF_WORLD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffWorldId_Equal(Long diffWorldId) {
        doSetDiffWorldId_Equal(diffWorldId);
    }

    protected void doSetDiffWorldId_Equal(Long diffWorldId) {
        regDiffWorldId(CK_EQ, diffWorldId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffWorldId_GreaterThan(Long diffWorldId) {
        regDiffWorldId(CK_GT, diffWorldId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffWorldId_LessThan(Long diffWorldId) {
        regDiffWorldId(CK_LT, diffWorldId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffWorldId_GreaterEqual(Long diffWorldId) {
        regDiffWorldId(CK_GE, diffWorldId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffWorldId_LessEqual(Long diffWorldId) {
        regDiffWorldId(CK_LE, diffWorldId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of diffWorldId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffWorldId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDiffWorldId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDiffWorldId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of diffWorldId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffWorldId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffWorldId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiffWorldId(), "DIFF_WORLD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldIdList The collection of diffWorldId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldId_InScope(Collection<Long> diffWorldIdList) {
        doSetDiffWorldId_InScope(diffWorldIdList);
    }

    protected void doSetDiffWorldId_InScope(Collection<Long> diffWorldIdList) {
        regINS(CK_INS, cTL(diffWorldIdList), xgetCValueDiffWorldId(), "DIFF_WORLD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldIdList The collection of diffWorldId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldId_NotInScope(Collection<Long> diffWorldIdList) {
        doSetDiffWorldId_NotInScope(diffWorldIdList);
    }

    protected void doSetDiffWorldId_NotInScope(Collection<Long> diffWorldIdList) {
        regINS(CK_NINS, cTL(diffWorldIdList), xgetCValueDiffWorldId(), "DIFF_WORLD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setDiffWorldId_IsNull() { regDiffWorldId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setDiffWorldId_IsNotNull() { regDiffWorldId(CK_ISNN, DOBJ); }

    protected void regDiffWorldId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffWorldId(), "DIFF_WORLD_ID"); }
    protected abstract ConditionValue xgetCValueDiffWorldId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldName_Equal(String diffWorldName) {
        doSetDiffWorldName_Equal(fRES(diffWorldName));
    }

    protected void doSetDiffWorldName_Equal(String diffWorldName) {
        regDiffWorldName(CK_EQ, diffWorldName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldName_NotEqual(String diffWorldName) {
        doSetDiffWorldName_NotEqual(fRES(diffWorldName));
    }

    protected void doSetDiffWorldName_NotEqual(String diffWorldName) {
        regDiffWorldName(CK_NES, diffWorldName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldNameList The collection of diffWorldName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldName_InScope(Collection<String> diffWorldNameList) {
        doSetDiffWorldName_InScope(diffWorldNameList);
    }

    protected void doSetDiffWorldName_InScope(Collection<String> diffWorldNameList) {
        regINS(CK_INS, cTL(diffWorldNameList), xgetCValueDiffWorldName(), "DIFF_WORLD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldNameList The collection of diffWorldName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldName_NotInScope(Collection<String> diffWorldNameList) {
        doSetDiffWorldName_NotInScope(diffWorldNameList);
    }

    protected void doSetDiffWorldName_NotInScope(Collection<String> diffWorldNameList) {
        regINS(CK_NINS, cTL(diffWorldNameList), xgetCValueDiffWorldName(), "DIFF_WORLD_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setDiffWorldName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param diffWorldName The value of diffWorldName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDiffWorldName_LikeSearch(String diffWorldName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDiffWorldName_LikeSearch(diffWorldName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setDiffWorldName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffWorldName The value of diffWorldName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffWorldName_LikeSearch(String diffWorldName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffWorldName), xgetCValueDiffWorldName(), "DIFF_WORLD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDiffWorldName_NotLikeSearch(String diffWorldName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDiffWorldName_NotLikeSearch(diffWorldName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffWorldName_NotLikeSearch(String diffWorldName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffWorldName), xgetCValueDiffWorldName(), "DIFF_WORLD_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffWorldName_PrefixSearch(String diffWorldName) {
        setDiffWorldName_LikeSearch(diffWorldName, xcLSOPPre());
    }

    protected void regDiffWorldName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffWorldName(), "DIFF_WORLD_NAME"); }
    protected abstract ConditionValue xgetCValueDiffWorldName();

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
    public HpSLCFunction<WhiteDiffWorldCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDiffWorldCB.class);
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
    public HpSLCFunction<WhiteDiffWorldCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDiffWorldCB.class);
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
    public HpSLCFunction<WhiteDiffWorldCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDiffWorldCB.class);
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
    public HpSLCFunction<WhiteDiffWorldCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDiffWorldCB.class);
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
    public HpSLCFunction<WhiteDiffWorldCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDiffWorldCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDiffWorldCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDiffWorldCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDiffWorldCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDiffWorldCQ sq);

    protected WhiteDiffWorldCB xcreateScalarConditionCB() {
        WhiteDiffWorldCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDiffWorldCB xcreateScalarConditionPartitionByCB() {
        WhiteDiffWorldCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDiffWorldCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DIFF_WORLD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDiffWorldCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDiffWorldCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDiffWorldCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DIFF_WORLD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDiffWorldCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDiffWorldCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDiffWorldCQ sq);

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
    protected WhiteDiffWorldCB newMyCB() {
        return new WhiteDiffWorldCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDiffWorldCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
