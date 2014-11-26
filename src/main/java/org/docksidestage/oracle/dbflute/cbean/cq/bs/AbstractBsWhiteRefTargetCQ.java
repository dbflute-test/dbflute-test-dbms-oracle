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
 * The abstract condition-query of WHITE_REF_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteRefTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_Equal(Long refTargetId) {
        doSetRefTargetId_Equal(refTargetId);
    }

    protected void doSetRefTargetId_Equal(Long refTargetId) {
        regRefTargetId(CK_EQ, refTargetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterThan(Long refTargetId) {
        regRefTargetId(CK_GT, refTargetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessThan(Long refTargetId) {
        regRefTargetId(CK_LT, refTargetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterEqual(Long refTargetId) {
        regRefTargetId(CK_GE, refTargetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetId The value of refTargetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessEqual(Long refTargetId) {
        regRefTargetId(CK_LE, refTargetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refTargetId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefTargetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefTargetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refTargetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefTargetId(), "REF_TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetIdList The collection of refTargetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_InScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_InScope(refTargetIdList);
    }

    protected void doSetRefTargetId_InScope(Collection<Long> refTargetIdList) {
        regINS(CK_INS, cTL(refTargetIdList), xgetCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refTargetIdList The collection of refTargetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_NotInScope(refTargetIdList);
    }

    protected void doSetRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        regINS(CK_NINS, cTL(refTargetIdList), xgetCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefTargetId_IsNull() { regRefTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefTargetId_IsNotNull() { regRefTargetId(CK_ISNN, DOBJ); }

    protected void regRefTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefTargetId(), "REF_TARGET_ID"); }
    protected abstract ConditionValue xgetCValueRefTargetId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as equal. (NullAllowed: if null, no condition)
     */
    public void setTargetId_Equal(Long targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Long targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTargetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetIdList The collection of targetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_InScope(Collection<Long> targetIdList) {
        doSetTargetId_InScope(targetIdList);
    }

    protected void doSetTargetId_InScope(Collection<Long> targetIdList) {
        regINS(CK_INS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET}
     * @param targetIdList The collection of targetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    protected void regTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetId(), "TARGET_ID"); }
    protected abstract ConditionValue xgetCValueTargetId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteRefTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteRefTargetCQ sq);

    protected WhiteRefTargetCB xcreateScalarConditionCB() {
        WhiteRefTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteRefTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteRefTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REF_TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteRefTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefTargetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteRefTargetCQ sq);

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
    protected WhiteRefTargetCB newMyCB() {
        return new WhiteRefTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteRefTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
