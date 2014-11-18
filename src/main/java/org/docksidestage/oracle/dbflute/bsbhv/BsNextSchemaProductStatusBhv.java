package org.docksidestage.oracle.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.bsbhv.loader.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The behavior of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     WHITE_REF_NEXT_TARGET, NEXT_SCHEMA_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefNextTargetList, nextSchemaProductList
 * </pre>
 * @author oracleman
 */
public abstract class BsNextSchemaProductStatusBhv extends AbstractBehaviorWritable<NextSchemaProductStatus, NextSchemaProductStatusCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public NextSchemaProductStatusDbm asDBMeta() { return NextSchemaProductStatusDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "NEXT_SCHEMA_PRODUCT_STATUS"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public NextSchemaProductStatusCB newConditionBean() { return new NextSchemaProductStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextSchemaProductStatusCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">nextSchemaProductStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">nextSchemaProductStatus</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">nextSchemaProductStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">nextSchemaProductStatus</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextSchemaProductStatus> selectEntity(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(nextSchemaProductStatus <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = nextSchemaProductStatus.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(nextSchemaProductStatus <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = nextSchemaProductStatus.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextSchemaProductStatus> selectEntity(NextSchemaProductStatusCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<NextSchemaProductStatus> facadeSelectEntity(NextSchemaProductStatusCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(NextSchemaProductStatusCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextSchemaProductStatus <span style="color: #553000">nextSchemaProductStatus</span> = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">nextSchemaProductStatus</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntityWithDeletedCheck(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().set...;
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProductStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntityWithDeletedCheck(NextSchemaProductStatusCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productStatusCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextSchemaProductStatus> selectByPK(String productStatusCode) {
        return facadeSelectByPK(productStatusCode);
    }

    protected OptionalEntity<NextSchemaProductStatus> facadeSelectByPK(String productStatusCode) {
        return doSelectOptionalByPK(productStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectByPK(String productStatusCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productStatusCode), tp);
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(String productStatusCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productStatusCode, tp), productStatusCode);
    }

    protected NextSchemaProductStatusCB xprepareCBAsPK(String productStatusCode) {
        assertObjectNotNull("productStatusCode", productStatusCode);
        return newConditionBean().acceptPK(productStatusCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param productStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextSchemaProductStatus> selectByUniqueOf(String productStatusName) {
        return facadeSelectByUniqueOf(productStatusName);
    }

    protected OptionalEntity<NextSchemaProductStatus> facadeSelectByUniqueOf(String productStatusName) {
        return doSelectByUniqueOf(productStatusName, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectByUniqueOf(String productStatusName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(productStatusName), tp), productStatusName);
    }

    protected NextSchemaProductStatusCB xprepareCBAsUniqueOf(String productStatusName) {
        assertObjectNotNull("productStatusName", productStatusName);
        return newConditionBean().acceptUniqueOf(productStatusName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;NextSchemaProductStatus&gt; <span style="color: #553000">nextSchemaProductStatusList</span> = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus <span style="color: #553000">nextSchemaProductStatus</span> : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = <span style="color: #553000">nextSchemaProductStatus</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProductStatus> selectList(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;NextSchemaProductStatus&gt; <span style="color: #553000">nextSchemaProductStatusList</span> = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = nextSchemaProductStatus.get...;
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProductStatus> selectList(NextSchemaProductStatusCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;NextSchemaProductStatus&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">page</span>) {
     *     ... = nextSchemaProductStatus.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProductStatus> selectPage(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProductStatus&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">page</span>) {
     *     ... = nextSchemaProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProductStatus> selectPage(NextSchemaProductStatusCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @param entityLambda The handler of entity row of NextSchemaProductStatus. (NotNull)
     */
    public void selectCursor(CBCall<NextSchemaProductStatusCB> cbLambda, EntityRowHandler<NextSchemaProductStatus> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().set...
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of NextSchemaProductStatus. (NotNull)
     */
    public void selectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<NextSchemaProductStatus> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<NextSchemaProductStatusCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<NextSchemaProductStatus> nextSchemaProductStatusList, ReferrerLoaderHandler<LoaderOfNextSchemaProductStatus> loaderLambda) {
        xassLRArg(nextSchemaProductStatusList, loaderLambda);
        loaderLambda.handle(new LoaderOfNextSchemaProductStatus().ready(nextSchemaProductStatusList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(NextSchemaProductStatus nextSchemaProductStatus, ReferrerLoaderHandler<LoaderOfNextSchemaProductStatus> loaderLambda) {
        xassLRArg(nextSchemaProductStatus, loaderLambda);
        loaderLambda.handle(new LoaderOfNextSchemaProductStatus().ready(xnewLRAryLs(nextSchemaProductStatus), _behaviorSelector));
    }

    /**
     * Load referrer of whiteRefNextTargetList by the set-upper of referrer. <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">loadWhiteRefNextTarget</span>(<span style="color: #553000">nextSchemaProductStatusList</span>, <span style="color: #553000">targetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">targetCB</span>.setupSelect...
     *     <span style="color: #553000">targetCB</span>.query().set...
     *     <span style="color: #553000">targetCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = nextSchemaProductStatus.<span style="color: #CC4747">getWhiteRefNextTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTarget(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<WhiteRefNextTargetCB> refCBLambda) {
        xassLRArg(nextSchemaProductStatusList, refCBLambda);
        return doLoadWhiteRefNextTarget(nextSchemaProductStatusList, new LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteRefNextTargetList by the set-upper of referrer. <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">loadWhiteRefNextTarget</span>(<span style="color: #553000">nextSchemaProductStatus</span>, <span style="color: #553000">targetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">targetCB</span>.setupSelect...
     *     <span style="color: #553000">targetCB</span>.query().set...
     *     <span style="color: #553000">targetCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">nextSchemaProductStatus</span>.<span style="color: #CC4747">getWhiteRefNextTargetList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTarget(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<WhiteRefNextTargetCB> refCBLambda) {
        xassLRArg(nextSchemaProductStatus, refCBLambda);
        return doLoadWhiteRefNextTarget(xnewLRLs(nextSchemaProductStatus), new LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTarget(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        return loadWhiteRefNextTarget(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTarget(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return (NestedReferrerListGateway<WhiteRefNextTarget>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteRefNextTarget(nextSchemaProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteRefNextTarget> doLoadWhiteRefNextTarget(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> option) {
        return helpLoadReferrerInternally(nextSchemaProductStatusList, option, "whiteRefNextTargetList");
    }

    /**
     * Load referrer of nextSchemaProductList by the set-upper of referrer. <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">loadNextSchemaProduct</span>(<span style="color: #553000">nextSchemaProductStatusList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = nextSchemaProductStatus.<span style="color: #CC4747">getNextSchemaProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProduct(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<NextSchemaProductCB> refCBLambda) {
        xassLRArg(nextSchemaProductStatusList, refCBLambda);
        return doLoadNextSchemaProduct(nextSchemaProductStatusList, new LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of nextSchemaProductList by the set-upper of referrer. <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">loadNextSchemaProduct</span>(<span style="color: #553000">nextSchemaProductStatus</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">nextSchemaProductStatus</span>.<span style="color: #CC4747">getNextSchemaProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProduct(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<NextSchemaProductCB> refCBLambda) {
        xassLRArg(nextSchemaProductStatus, refCBLambda);
        return doLoadNextSchemaProduct(xnewLRLs(nextSchemaProductStatus), new LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProduct(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        return loadNextSchemaProduct(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProduct(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return (NestedReferrerListGateway<NextSchemaProduct>)EMPTY_NREF_LGWAY; }
        return doLoadNextSchemaProduct(nextSchemaProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<NextSchemaProduct> doLoadNextSchemaProduct(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> option) {
        return helpLoadReferrerInternally(nextSchemaProductStatusList, option, "nextSchemaProductList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productStatusCode.
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusCodeList(List<NextSchemaProductStatus> nextSchemaProductStatusList)
    { return helpExtractListInternally(nextSchemaProductStatusList, "productStatusCode"); }

    /**
     * Extract the value list of (single) unique key productStatusName.
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusNameList(List<NextSchemaProductStatus> nextSchemaProductStatusList)
    { return helpExtractListInternally(nextSchemaProductStatusList, "productStatusName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">insert</span>(nextSchemaProductStatus);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProductStatus nextSchemaProductStatus) {
        doInsert(nextSchemaProductStatus, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">update</span>(nextSchemaProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(NextSchemaProductStatus nextSchemaProductStatus) {
        doUpdate(nextSchemaProductStatus, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextSchemaProductStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus) {
        doInsertOrUpdate(nextSchemaProductStatus, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">delete</span>(nextSchemaProductStatus);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProductStatus nextSchemaProductStatus) {
        doDelete(nextSchemaProductStatus, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">batchInsert</span>(nextSchemaProductStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchInsert(nextSchemaProductStatusList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         nextSchemaProductStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProductStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">batchUpdate</span>(nextSchemaProductStatusList);
     * </pre>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchUpdate(nextSchemaProductStatusList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchDelete(nextSchemaProductStatusList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProductStatus, NextSchemaProductStatusCB&gt;() {
     *     public ConditionBean setup(NextSchemaProductStatus entity, NextSchemaProductStatusCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">queryUpdate</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProductStatus nextSchemaProductStatus, CBCall<NextSchemaProductStatusCB> cbLambda) {
        return doQueryUpdate(nextSchemaProductStatus, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">queryUpdate</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb) {
        return doQueryUpdate(nextSchemaProductStatus, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<NextSchemaProductStatusCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * InsertOption&lt;NextSchemaProductStatusCB&gt; option = new InsertOption&lt;NextSchemaProductStatusCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">varyingInsert</span>(nextSchemaProductStatus, option);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextSchemaProductStatus nextSchemaProductStatus, WritableOptionCall<NextSchemaProductStatusCB, InsertOption<NextSchemaProductStatusCB>> opLambda) {
        doInsert(nextSchemaProductStatus, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductStatusCB&gt; option = new UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *         public void specify(NextSchemaProductStatusCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(nextSchemaProductStatus, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextSchemaProductStatus nextSchemaProductStatus, WritableOptionCall<NextSchemaProductStatusCB, UpdateOption<NextSchemaProductStatusCB>> opLambda) {
        doUpdate(nextSchemaProductStatus, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextSchemaProductStatus The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus, WritableOptionCall<NextSchemaProductStatusCB, InsertOption<NextSchemaProductStatusCB>> insertOpLambda, WritableOptionCall<NextSchemaProductStatusCB, UpdateOption<NextSchemaProductStatusCB>> updateOpLambda) {
        doInsertOrUpdate(nextSchemaProductStatus, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param nextSchemaProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextSchemaProductStatus nextSchemaProductStatus, WritableOptionCall<NextSchemaProductStatusCB, DeleteOption<NextSchemaProductStatusCB>> opLambda) {
        doDelete(nextSchemaProductStatus, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList, WritableOptionCall<NextSchemaProductStatusCB, InsertOption<NextSchemaProductStatusCB>> opLambda) {
        return doBatchInsert(nextSchemaProductStatusList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, WritableOptionCall<NextSchemaProductStatusCB, UpdateOption<NextSchemaProductStatusCB>> opLambda) {
        return doBatchUpdate(nextSchemaProductStatusList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList, WritableOptionCall<NextSchemaProductStatusCB, DeleteOption<NextSchemaProductStatusCB>> opLambda) {
        return doBatchDelete(nextSchemaProductStatusList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> manyArgLambda, WritableOptionCall<NextSchemaProductStatusCB, InsertOption<NextSchemaProductStatusCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductStatusCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void specify(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(nextSchemaProductStatus, cb, option);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProductStatus nextSchemaProductStatus, CBCall<NextSchemaProductStatusCB> cbLambda, WritableOptionCall<NextSchemaProductStatusCB, UpdateOption<NextSchemaProductStatusCB>> opLambda) {
        return doQueryUpdate(nextSchemaProductStatus, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextSchemaProductStatus nextSchemaProductStatus = <span style="color: #70226C">new</span> NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = <span style="color: #70226C">new</span> NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductStatusCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void specify(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(nextSchemaProductStatus, cb, option);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb, WritableOptionCall<NextSchemaProductStatusCB, UpdateOption<NextSchemaProductStatusCB>> opLambda) {
        return doQueryUpdate(nextSchemaProductStatus, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of NextSchemaProductStatus. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<NextSchemaProductStatusCB> cbLambda, WritableOptionCall<NextSchemaProductStatusCB, DeleteOption<NextSchemaProductStatusCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextSchemaProductStatusCB cb, WritableOptionCall<NextSchemaProductStatusCB, DeleteOption<NextSchemaProductStatusCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * nextSchemaProductStatusBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * nextSchemaProductStatusBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * nextSchemaProductStatusBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * nextSchemaProductStatusBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * nextSchemaProductStatusBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * nextSchemaProductStatusBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * nextSchemaProductStatusBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * nextSchemaProductStatusBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * nextSchemaProductStatusBhv.outideSql().removeBlockComment().selectList()
     * nextSchemaProductStatusBhv.outideSql().removeLineComment().selectList()
     * nextSchemaProductStatusBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<NextSchemaProductStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends NextSchemaProductStatus> typeOfSelectedEntity() { return NextSchemaProductStatus.class; }
    protected Class<NextSchemaProductStatus> typeOfHandlingEntity() { return NextSchemaProductStatus.class; }
    protected Class<NextSchemaProductStatusCB> typeOfHandlingConditionBean() { return NextSchemaProductStatusCB.class; }
}
