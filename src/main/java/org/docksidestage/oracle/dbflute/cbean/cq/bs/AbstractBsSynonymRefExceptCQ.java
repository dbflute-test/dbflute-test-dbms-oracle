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
 * The abstract condition-query of SYNONYM_REF_EXCEPT.
 * @author oracleman
 */
public abstract class AbstractBsSynonymRefExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymRefExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_REF_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_Equal(Long refExceptId) {
        doSetRefExceptId_Equal(refExceptId);
    }

    protected void doSetRefExceptId_Equal(Long refExceptId) {
        regRefExceptId(CK_EQ, refExceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterThan(Long refExceptId) {
        regRefExceptId(CK_GT, refExceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessThan(Long refExceptId) {
        regRefExceptId(CK_LT, refExceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterEqual(Long refExceptId) {
        regRefExceptId(CK_GE, refExceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessEqual(Long refExceptId) {
        regRefExceptId(CK_LE, refExceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refExceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refExceptId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefExceptId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefExceptId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refExceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refExceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefExceptId(), "REF_EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptIdList The collection of refExceptId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefExceptId_InScope(Collection<Long> refExceptIdList) {
        doSetRefExceptId_InScope(refExceptIdList);
    }

    protected void doSetRefExceptId_InScope(Collection<Long> refExceptIdList) {
        regINS(CK_INS, cTL(refExceptIdList), xgetCValueRefExceptId(), "REF_EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptIdList The collection of refExceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefExceptId_NotInScope(Collection<Long> refExceptIdList) {
        doSetRefExceptId_NotInScope(refExceptIdList);
    }

    protected void doSetRefExceptId_NotInScope(Collection<Long> refExceptIdList) {
        regINS(CK_NINS, cTL(refExceptIdList), xgetCValueRefExceptId(), "REF_EXCEPT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefExceptId_IsNull() { regRefExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefExceptId_IsNotNull() { regRefExceptId(CK_ISNN, DOBJ); }

    protected void regRefExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefExceptId(), "REF_EXCEPT_ID"); }
    protected abstract ConditionValue xgetCValueRefExceptId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setExceptId_Equal(Long exceptId) {
        doSetExceptId_Equal(exceptId);
    }

    protected void doSetExceptId_Equal(Long exceptId) {
        regExceptId(CK_EQ, exceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterThan(Long exceptId) {
        regExceptId(CK_GT, exceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessThan(Long exceptId) {
        regExceptId(CK_LT, exceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterEqual(Long exceptId) {
        regExceptId(CK_GE, exceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessEqual(Long exceptId) {
        regExceptId(CK_LE, exceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setExceptId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExceptId(), "EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptIdList The collection of exceptId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptId_InScope(Collection<Long> exceptIdList) {
        doSetExceptId_InScope(exceptIdList);
    }

    protected void doSetExceptId_InScope(Collection<Long> exceptIdList) {
        regINS(CK_INS, cTL(exceptIdList), xgetCValueExceptId(), "EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptIdList The collection of exceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptId_NotInScope(Collection<Long> exceptIdList) {
        doSetExceptId_NotInScope(exceptIdList);
    }

    protected void doSetExceptId_NotInScope(Collection<Long> exceptIdList) {
        regINS(CK_NINS, cTL(exceptIdList), xgetCValueExceptId(), "EXCEPT_ID");
    }

    protected void regExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExceptId(), "EXCEPT_ID"); }
    protected abstract ConditionValue xgetCValueExceptId();

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
    public HpSLCFunction<SynonymRefExceptCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SynonymRefExceptCB.class);
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
    public HpSLCFunction<SynonymRefExceptCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SynonymRefExceptCB.class);
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
    public HpSLCFunction<SynonymRefExceptCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SynonymRefExceptCB.class);
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
    public HpSLCFunction<SynonymRefExceptCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SynonymRefExceptCB.class);
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
    public HpSLCFunction<SynonymRefExceptCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SynonymRefExceptCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SynonymRefExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SynonymRefExceptCQ sq);

    protected SynonymRefExceptCB xcreateScalarConditionCB() {
        SynonymRefExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SynonymRefExceptCB xcreateScalarConditionPartitionByCB() {
        SynonymRefExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymRefExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REF_EXCEPT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymRefExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymRefExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SynonymRefExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_EXCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymRefExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymRefExceptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymRefExceptCQ sq);

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
    protected SynonymRefExceptCB newMyCB() {
        return new SynonymRefExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SynonymRefExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
