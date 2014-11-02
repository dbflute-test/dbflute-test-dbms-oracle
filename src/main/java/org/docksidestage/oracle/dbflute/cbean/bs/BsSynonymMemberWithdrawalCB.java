package org.docksidestage.oracle.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.docksidestage.oracle.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.allcommon.ImplementedInvokerAssistant;
import org.docksidestage.oracle.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.docksidestage.oracle.dbflute.cbean.*;
import org.docksidestage.oracle.dbflute.cbean.cq.*;
import org.docksidestage.oracle.dbflute.cbean.nss.*;

/**
 * The base condition-bean of SYNONYM_MEMBER_WITHDRAWAL.
 * @author oracleman
 */
public class BsSynonymMemberWithdrawalCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymMemberWithdrawalCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSynonymMemberWithdrawalCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SYNONYM_MEMBER_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId : PK, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @return this. (NotNull)
     */
    public SynonymMemberWithdrawalCB acceptPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        BsSynonymMemberWithdrawalCB cb = this;
        cb.query().setMemberId_Equal(memberId);
        return (SynonymMemberWithdrawalCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public SynonymMemberWithdrawalCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public SynonymMemberWithdrawalCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected SynonymMemberWithdrawalCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected SynonymMemberWithdrawalCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected SynonymMemberWithdrawalCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        SynonymMemberWithdrawalCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected SynonymMemberWithdrawalCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new SynonymMemberWithdrawalCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<SynonymMemberWithdrawalCB> unionCBLambda) {
        final SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final SynonymMemberWithdrawalCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<SynonymMemberWithdrawalCB> unionCBLambda) {
        final SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final SynonymMemberWithdrawalCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public ConditionBean lockForUpdateNoWait()
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateNoWait(); } return this; }
    public ConditionBean lockForUpdateWait(int waitSec)
    { if (xhelpIsSqlClauseOracle()) { xhelpGettingSqlClauseOracle().lockForUpdateWait(waitSec); } return this; }

    protected boolean xhelpIsSqlClauseOracle() {
        return getSqlClause() instanceof org.dbflute.cbean.sqlclause.SqlClauseOracle;
    }

    protected org.dbflute.cbean.sqlclause.SqlClauseOracle xhelpGettingSqlClauseOracle() {
        return (org.dbflute.cbean.sqlclause.SqlClauseOracle)getSqlClause();
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberVendorSynonymNss _nssMemberVendorSynonym;
    public MemberVendorSynonymNss xdfgetNssMemberVendorSynonym() {
        if (_nssMemberVendorSynonym == null) { _nssMemberVendorSynonym = new MemberVendorSynonymNss(null); }
        return _nssMemberVendorSynonym;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberVendorSynonym()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.<span style="color: #CC4747">getMemberVendorSynonym()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss setupSelect_MemberVendorSynonym() {
        assertSetupSelectPurpose("memberVendorSynonym");
        doSetupSelect(() -> query().queryMemberVendorSynonym());
        if (_nssMemberVendorSynonym == null || !_nssMemberVendorSynonym.hasConditionQuery())
        { _nssMemberVendorSynonym = new MemberVendorSynonymNss(query().queryMemberVendorSynonym()); }
        return _nssMemberVendorSynonym;
    }

    /**
     * Set up relation columns to select clause. <br>
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WithdrawalReason()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.<span style="color: #CC4747">getWithdrawalReason()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WithdrawalReason() {
        assertSetupSelectPurpose("withdrawalReason");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnWithdrawalReasonCode();
        }
        doSetupSelect(() -> query().queryWithdrawalReason());
    }

    protected SynonymMemberNss _nssSynonymMember;
    public SynonymMemberNss xdfgetNssSynonymMember() {
        if (_nssSynonymMember == null) { _nssSynonymMember = new SynonymMemberNss(null); }
        return _nssSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_SynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.<span style="color: #CC4747">getSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SynonymMemberNss setupSelect_SynonymMember() {
        assertSetupSelectPurpose("synonymMember");
        doSetupSelect(() -> query().querySynonymMember());
        if (_nssSynonymMember == null || !_nssSynonymMember.hasConditionQuery())
        { _nssSynonymMember = new SynonymMemberNss(query().querySynonymMember()); }
        return _nssSynonymMember;
    }

    protected VendorSynonymMemberNss _nssVendorSynonymMember;
    public VendorSynonymMemberNss xdfgetNssVendorSynonymMember() {
        if (_nssVendorSynonymMember == null) { _nssVendorSynonymMember = new VendorSynonymMemberNss(null); }
        return _nssVendorSynonymMember;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_VendorSynonymMember()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.<span style="color: #CC4747">getVendorSynonymMember()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss setupSelect_VendorSynonymMember() {
        assertSetupSelectPurpose("vendorSynonymMember");
        doSetupSelect(() -> query().queryVendorSynonymMember());
        if (_nssVendorSynonymMember == null || !_nssVendorSynonymMember.hasConditionQuery())
        { _nssVendorSynonymMember = new VendorSynonymMemberNss(query().queryVendorSynonymMember()); }
        return _nssVendorSynonymMember;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<SynonymMemberWithdrawalCQ> {
        protected MemberVendorSynonymCB.HpSpecification _memberVendorSynonym;
        protected WithdrawalReasonCB.HpSpecification _withdrawalReason;
        protected SynonymMemberCB.HpSpecification _synonymMember;
        protected VendorSynonymMemberCB.HpSpecification _vendorSynonymMember;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<SynonymMemberWithdrawalCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWithdrawalReasonCode() { return doColumn("WITHDRAWAL_REASON_CODE"); }
        /**
         * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWithdrawalReasonInputText() { return doColumn("WITHDRAWAL_REASON_INPUT_TEXT"); }
        /**
         * WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWithdrawalDatetime() { return doColumn("WITHDRAWAL_DATETIME"); }
        /**
         * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterProcess() { return doColumn("REGISTER_PROCESS"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateProcess() { return doColumn("UPDATE_PROCESS"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * VERSION_NO: {NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryWithdrawalReason()
                    || qyCall().qy().xgetReferrerQuery() instanceof WithdrawalReasonCQ) {
                columnWithdrawalReasonCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "SYNONYM_MEMBER_WITHDRAWAL"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberVendorSynonymCB.HpSpecification specifyMemberVendorSynonym() {
            assertRelation("memberVendorSynonym");
            if (_memberVendorSynonym == null) {
                _memberVendorSynonym = new MemberVendorSynonymCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberVendorSynonym()
                                    , () -> _qyCall.qy().queryMemberVendorSynonym())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberVendorSynonym.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberVendorSynonym()
                      , () -> xsyncQyCall().qy().queryMemberVendorSynonym()));
                }
            }
            return _memberVendorSynonym;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WithdrawalReasonCB.HpSpecification specifyWithdrawalReason() {
            assertRelation("withdrawalReason");
            if (_withdrawalReason == null) {
                _withdrawalReason = new WithdrawalReasonCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWithdrawalReason()
                                    , () -> _qyCall.qy().queryWithdrawalReason())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _withdrawalReason.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWithdrawalReason()
                      , () -> xsyncQyCall().qy().queryWithdrawalReason()));
                }
            }
            return _withdrawalReason;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SynonymMemberCB.HpSpecification specifySynonymMember() {
            assertRelation("synonymMember");
            if (_synonymMember == null) {
                _synonymMember = new SynonymMemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQuerySynonymMember()
                                    , () -> _qyCall.qy().querySynonymMember())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _synonymMember.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySynonymMember()
                      , () -> xsyncQyCall().qy().querySynonymMember()));
                }
            }
            return _synonymMember;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public VendorSynonymMemberCB.HpSpecification specifyVendorSynonymMember() {
            assertRelation("vendorSynonymMember");
            if (_vendorSynonymMember == null) {
                _vendorSynonymMember = new VendorSynonymMemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVendorSynonymMember()
                                    , () -> _qyCall.qy().queryVendorSynonymMember())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vendorSynonymMember.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendorSynonymMember()
                      , () -> xsyncQyCall().qy().queryVendorSynonymMember()));
                }
            }
            return _vendorSynonymMember;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<SynonymMemberWithdrawalCB, SynonymMemberWithdrawalCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public SynonymMemberWithdrawalCB dreamCruiseCB() {
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForDreamCruise((SynonymMemberWithdrawalCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<SynonymMemberWithdrawalCB> columnQuery(final SpecifyQuery<SynonymMemberWithdrawalCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected SynonymMemberWithdrawalCB xcreateColumnQueryCB() {
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
        cb.xsetupForColumnQuery((SynonymMemberWithdrawalCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<SynonymMemberWithdrawalCB> orCBLambda) {
        xorSQ((SynonymMemberWithdrawalCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *             public void query(SynonymMemberWithdrawalCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<SynonymMemberWithdrawalCB> andCBLambda) {
        xorSQAP((SynonymMemberWithdrawalCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final SynonymMemberWithdrawalCB cb;
        if (mainCB != null) {
            cb = (SynonymMemberWithdrawalCB)mainCB;
        } else {
            cb = new SynonymMemberWithdrawalCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return SynonymMemberWithdrawalCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return SynonymMemberWithdrawalCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
