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
 * The base condition-bean of VENDOR_CHECK.
 * @author oracleman
 */
public class BsVendorCheckCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
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
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param vendorCheckId : PK, NotNull, NUMBER(16). (NotNull)
     * @return this. (NotNull)
     */
    public VendorCheckCB acceptPK(Long vendorCheckId) {
        assertObjectNotNull("vendorCheckId", vendorCheckId);
        BsVendorCheckCB cb = this;
        cb.query().setVendorCheckId_Equal(vendorCheckId);
        return (VendorCheckCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_VendorCheckId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_VendorCheckId_Desc();
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
    public VendorCheckCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public VendorCheckCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected VendorCheckCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected VendorCheckCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        VendorCheckCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected VendorCheckCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<VendorCheckCB> unionCBLambda) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<VendorCheckCB> unionCBLambda) {
        final VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final VendorCheckCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<VendorCheckCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<VendorCheckCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVendorCheckId() { return doColumn("VENDOR_CHECK_ID"); }
        /**
         * TYPE_OF_CHAR: {CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfChar() { return doColumn("TYPE_OF_CHAR"); }
        /**
         * TYPE_OF_NCHAR: {NCHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNchar() { return doColumn("TYPE_OF_NCHAR"); }
        /**
         * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfVarchar2() { return doColumn("TYPE_OF_VARCHAR2"); }
        /**
         * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfVarchar2Max() { return doColumn("TYPE_OF_VARCHAR2_MAX"); }
        /**
         * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNvarchar2() { return doColumn("TYPE_OF_NVARCHAR2"); }
        /**
         * TYPE_OF_CLOB: {CLOB(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfClob() { return doColumn("TYPE_OF_CLOB"); }
        /**
         * TYPE_OF_NCLOB: {NCLOB(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNclob() { return doColumn("TYPE_OF_NCLOB"); }
        /**
         * TYPE_OF_LONG: {LONG}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfLong() { return doColumn("TYPE_OF_LONG"); }
        /**
         * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfXmltype() { return doColumn("TYPE_OF_XMLTYPE"); }
        /**
         * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberInteger() { return doColumn("TYPE_OF_NUMBER_INTEGER"); }
        /**
         * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberBigint() { return doColumn("TYPE_OF_NUMBER_BIGINT"); }
        /**
         * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberDecimal() { return doColumn("TYPE_OF_NUMBER_DECIMAL"); }
        /**
         * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberIntegerMin() { return doColumn("TYPE_OF_NUMBER_INTEGER_MIN"); }
        /**
         * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberIntegerMax() { return doColumn("TYPE_OF_NUMBER_INTEGER_MAX"); }
        /**
         * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberBigintMin() { return doColumn("TYPE_OF_NUMBER_BIGINT_MIN"); }
        /**
         * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberBigintMax() { return doColumn("TYPE_OF_NUMBER_BIGINT_MAX"); }
        /**
         * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberSuperintMin() { return doColumn("TYPE_OF_NUMBER_SUPERINT_MIN"); }
        /**
         * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberSuperintMax() { return doColumn("TYPE_OF_NUMBER_SUPERINT_MAX"); }
        /**
         * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfNumberMaxdecimal() { return doColumn("TYPE_OF_NUMBER_MAXDECIMAL"); }
        /**
         * TYPE_OF_INTEGER: {NUMBER(22)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfInteger() { return doColumn("TYPE_OF_INTEGER"); }
        /**
         * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBinaryFloat() { return doColumn("TYPE_OF_BINARY_FLOAT"); }
        /**
         * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBinaryDouble() { return doColumn("TYPE_OF_BINARY_DOUBLE"); }
        /**
         * TYPE_OF_DATE: {DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfDate() { return doColumn("TYPE_OF_DATE"); }
        /**
         * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfTimestamp() { return doColumn("TYPE_OF_TIMESTAMP"); }
        /**
         * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfIntervalYearToMonth() { return doColumn("TYPE_OF_INTERVAL_YEAR_TO_MONTH"); }
        /**
         * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfIntervalDayToSecond() { return doColumn("TYPE_OF_INTERVAL_DAY_TO_SECOND"); }
        /**
         * TYPE_OF_BFILE: {BFILE(530)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBfile() { return doColumn("TYPE_OF_BFILE"); }
        /**
         * TYPE_OF_BLOB: {BLOB(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfBlob() { return doColumn("TYPE_OF_BLOB"); }
        /**
         * TYPE_OF_RAW: {RAW(512)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfRaw() { return doColumn("TYPE_OF_RAW"); }
        /**
         * TYPE_OF_ROWID: {ROWID(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTypeOfRowid() { return doColumn("TYPE_OF_ROWID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnVendorCheckId(); // PK
        }
        @Override
        protected String getTableDbName() { return "VENDOR_CHECK"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<VendorCheckCB, VendorCheckCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<VendorCheckCB> sq, VendorCheckCQ cq, String al, DerivedReferrerOption op)
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
    public VendorCheckCB dreamCruiseCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForDreamCruise((VendorCheckCB) this);
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
    public HpColQyOperand<VendorCheckCB> columnQuery(final SpecifyQuery<VendorCheckCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected VendorCheckCB xcreateColumnQueryCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForColumnQuery((VendorCheckCB)this);
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
    public void orScopeQuery(OrQuery<VendorCheckCB> orCBLambda) {
        xorSQ((VendorCheckCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<VendorCheckCB> andCBLambda) {
        xorSQAP((VendorCheckCB)this, andCBLambda);
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
        final VendorCheckCB cb;
        if (mainCB != null) {
            cb = (VendorCheckCB)mainCB;
        } else {
            cb = new VendorCheckCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return VendorCheckCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return VendorCheckCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
