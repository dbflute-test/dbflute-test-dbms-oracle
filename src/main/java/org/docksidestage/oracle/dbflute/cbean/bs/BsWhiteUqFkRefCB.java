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

/**
 * The base condition-bean of WHITE_UQ_FK_REF.
 * @author oracleman
 */
public class BsWhiteUqFkRefCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkRefCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkRefCB() {
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
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "WHITE_UQ_FK_REF";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param uqFkRefId : PK, NotNull, NUMBER(16). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteUqFkRefCB acceptPK(Long uqFkRefId) {
        assertObjectNotNull("uqFkRefId", uqFkRefId);
        BsWhiteUqFkRefCB cb = this;
        cb.query().setUqFkRefId_Equal(uqFkRefId);
        return (WhiteUqFkRefCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param compoundUqFirstCode : UQ+, NotNull, CHAR(3). (NotNull)
     * @param compoundUqSecondCode : +UQ, NotNull, CHAR(3). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteUqFkRefCB acceptUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode) {
        assertObjectNotNull("compoundUqFirstCode", compoundUqFirstCode);assertObjectNotNull("compoundUqSecondCode", compoundUqSecondCode);
        BsWhiteUqFkRefCB cb = this;
        cb.query().setCompoundUqFirstCode_Equal(compoundUqFirstCode);cb.query().setCompoundUqSecondCode_Equal(compoundUqSecondCode);
        return (WhiteUqFkRefCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_UqFkRefId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_UqFkRefId_Desc();
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
    public WhiteUqFkRefCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public WhiteUqFkRefCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteUqFkRefCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteUqFkRefCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteUqFkRefCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteUqFkRefCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteUqFkRefCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteUqFkRefCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<WhiteUqFkRefCB> unionCBLambda) {
        final WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteUqFkRefCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<WhiteUqFkRefCB> unionCBLambda) {
        final WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteUqFkRefCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkRefBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteUqFkByFkToPkId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteUqFkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteUqFkRef</span>.<span style="color: #CC4747">getWhiteUqFkByFkToPkId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteUqFkByFkToPkId() {
        assertSetupSelectPurpose("whiteUqFkByFkToPkId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFkToPkId();
        }
        doSetupSelect(() -> query().queryWhiteUqFkByFkToPkId());
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkRefBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteUqFkByFkToUqCode()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteUqFkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteUqFkRef</span>.<span style="color: #CC4747">getWhiteUqFkByFkToUqCode()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteUqFkByFkToUqCode() {
        assertSetupSelectPurpose("whiteUqFkByFkToUqCode");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFkToUqCode();
        }
        doSetupSelect(() -> query().queryWhiteUqFkByFkToUqCode());
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

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<WhiteUqFkRefCQ> {
        protected WhiteUqFkCB.HpSpecification _whiteUqFkByFkToPkId;
        protected WhiteUqFkCB.HpSpecification _whiteUqFkByFkToUqCode;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteUqFkRefCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * UQ_FK_REF_ID: {PK, NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUqFkRefId() { return doColumn("UQ_FK_REF_ID"); }
        /**
         * FK_TO_PK_ID: {NotNull, NUMBER(16), FK to WHITE_UQ_FK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFkToPkId() { return doColumn("FK_TO_PK_ID"); }
        /**
         * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFkToUqCode() { return doColumn("FK_TO_UQ_CODE"); }
        /**
         * COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompoundUqFirstCode() { return doColumn("COMPOUND_UQ_FIRST_CODE"); }
        /**
         * COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCompoundUqSecondCode() { return doColumn("COMPOUND_UQ_SECOND_CODE"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnUqFkRefId(); // PK
            if (qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkRefNestCQ) {
                columnCompoundUqFirstCode(); // non PK but referred column (and referrer also non PK)
                columnCompoundUqSecondCode(); // non PK but referred column (and referrer also non PK)
            }
            if (qyCall().qy().hasConditionQueryWhiteUqFkByFkToPkId()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkCQ) {
                columnFkToPkId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteUqFkByFkToUqCode()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteUqFkCQ) {
                columnFkToUqCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "WHITE_UQ_FK_REF"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteUqFkCB.HpSpecification specifyWhiteUqFkByFkToPkId() {
            assertRelation("whiteUqFkByFkToPkId");
            if (_whiteUqFkByFkToPkId == null) {
                _whiteUqFkByFkToPkId = new WhiteUqFkCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteUqFkByFkToPkId()
                                    , () -> _qyCall.qy().queryWhiteUqFkByFkToPkId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteUqFkByFkToPkId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteUqFkByFkToPkId()
                      , () -> xsyncQyCall().qy().queryWhiteUqFkByFkToPkId()));
                }
            }
            return _whiteUqFkByFkToPkId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteUqFkCB.HpSpecification specifyWhiteUqFkByFkToUqCode() {
            assertRelation("whiteUqFkByFkToUqCode");
            if (_whiteUqFkByFkToUqCode == null) {
                _whiteUqFkByFkToUqCode = new WhiteUqFkCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteUqFkByFkToUqCode()
                                    , () -> _qyCall.qy().queryWhiteUqFkByFkToUqCode())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteUqFkByFkToUqCode.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteUqFkByFkToUqCode()
                      , () -> xsyncQyCall().qy().queryWhiteUqFkByFkToUqCode()));
                }
            }
            return _whiteUqFkByFkToUqCode;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from WHITE_UQ_FK_REF_NEST where ...) as FOO_MAX} <br>
         * WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(nestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     nestCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     nestCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteUqFkRefNest.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteUqFkRefNestCB, WhiteUqFkRefCQ> derivedWhiteUqFkRefNest() {
            assertDerived("whiteUqFkRefNestList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteUqFkRefNestCB> sq, WhiteUqFkRefCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhiteUqFkRefNestList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteUqFkRefCB, WhiteUqFkRefCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteUqFkRefCB> sq, WhiteUqFkRefCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
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
    public WhiteUqFkRefCB dreamCruiseCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForDreamCruise((WhiteUqFkRefCB) this);
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
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteUqFkRefCB> columnQuery(final SpecifyQuery<WhiteUqFkRefCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhiteUqFkRefCB xcreateColumnQueryCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForColumnQuery((WhiteUqFkRefCB)this);
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
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteUqFkRefCB> orCBLambda) {
        xorSQ((WhiteUqFkRefCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteUqFkRefCB> andCBLambda) {
        xorSQAP((WhiteUqFkRefCB)this, andCBLambda);
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
        final WhiteUqFkRefCB cb;
        if (mainCB != null) {
            cb = (WhiteUqFkRefCB)mainCB;
        } else {
            cb = new WhiteUqFkRefCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteUqFkRefCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
