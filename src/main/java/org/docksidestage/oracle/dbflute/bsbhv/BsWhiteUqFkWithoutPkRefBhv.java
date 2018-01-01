package org.docksidestage.oracle.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
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
 * The behavior of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_UQ_CODE
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
 *     WHITE_UQ_FK_WITHOUT_PK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkWithoutPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkWithoutPkRefBhv extends AbstractBehaviorReadable<WhiteUqFkWithoutPkRef, WhiteUqFkWithoutPkRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteUqFkWithoutPkRefDbm asDBMeta() { return WhiteUqFkWithoutPkRefDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_UQ_FK_WITHOUT_PK_REF"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkWithoutPkRefCB newConditionBean() { return new WhiteUqFkWithoutPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkWithoutPkRefCB cb) {
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
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteUqFkWithoutPkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteUqFkWithoutPkRef</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteUqFkWithoutPkRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteUqFkWithoutPkRef</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkWithoutPkRef> selectEntity(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteUqFkWithoutPkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteUqFkWithoutPkRef.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteUqFkWithoutPkRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteUqFkWithoutPkRef.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkWithoutPkRef> selectEntity(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteUqFkWithoutPkRef> facadeSelectEntity(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkWithoutPkRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkWithoutPkRef <span style="color: #553000">whiteUqFkWithoutPkRef</span> = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteUqFkWithoutPkRef</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPkRef selectEntityWithDeletedCheck(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().set...;
     * WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkWithoutPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPkRef selectEntityWithDeletedCheck(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteUqFkWithoutPkRef&gt; <span style="color: #553000">whiteUqFkWithoutPkRefList</span> = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteUqFkWithoutPkRef <span style="color: #553000">whiteUqFkWithoutPkRef</span> : <span style="color: #553000">whiteUqFkWithoutPkRefList</span>) {
     *     ... = <span style="color: #553000">whiteUqFkWithoutPkRef</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkWithoutPkRef> selectList(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteUqFkWithoutPkRef&gt; <span style="color: #553000">whiteUqFkWithoutPkRefList</span> = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef : <span style="color: #553000">whiteUqFkWithoutPkRefList</span>) {
     *     ... = whiteUqFkWithoutPkRef.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkWithoutPkRef> selectList(WhiteUqFkWithoutPkRefCB cb) {
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
     * PagingResultBean&lt;WhiteUqFkWithoutPkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteUqFkWithoutPkRef.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkWithoutPkRef> selectPage(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkWithoutPkRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef : <span style="color: #553000">page</span>) {
     *     ... = whiteUqFkWithoutPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkWithoutPkRef> selectPage(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @param entityLambda The handler of entity row of WhiteUqFkWithoutPkRef. (NotNull)
     */
    public void selectCursor(CBCall<WhiteUqFkWithoutPkRefCB> cbLambda, EntityRowHandler<WhiteUqFkWithoutPkRef> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = <span style="color: #70226C">new</span> WhiteUqFkWithoutPkRefCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkWithoutPkRef. (NotNull)
     */
    public void selectCursor(WhiteUqFkWithoutPkRefCB cb, EntityRowHandler<WhiteUqFkWithoutPkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteUqFkWithoutPkRefBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkWithoutPkRefCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * Load referrer for the list by the referrer loader.
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
     * @param whiteUqFkWithoutPkRefList The entity list of whiteUqFkWithoutPkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList, ReferrerLoaderHandler<LoaderOfWhiteUqFkWithoutPkRef> loaderLambda) {
        xassLRArg(whiteUqFkWithoutPkRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFkWithoutPkRef().ready(whiteUqFkWithoutPkRefList, _behaviorSelector));
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
     * @param whiteUqFkWithoutPkRef The entity of whiteUqFkWithoutPkRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef, ReferrerLoaderHandler<LoaderOfWhiteUqFkWithoutPkRef> loaderLambda) {
        xassLRArg(whiteUqFkWithoutPkRef, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFkWithoutPkRef().ready(xnewLRAryLs(whiteUqFkWithoutPkRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqFkWithoutPk'.
     * @param whiteUqFkWithoutPkRefList The list of whiteUqFkWithoutPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFkWithoutPk> pulloutWhiteUqFkWithoutPk(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList)
    { return helpPulloutInternally(whiteUqFkWithoutPkRefList, "whiteUqFkWithoutPk"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteUqFkWithoutPkRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteUqFkWithoutPkRefBhv.outideSql().removeBlockComment().selectList()
     * whiteUqFkWithoutPkRefBhv.outideSql().removeLineComment().selectList()
     * whiteUqFkWithoutPkRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteUqFkWithoutPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUqFkWithoutPkRef> typeOfSelectedEntity() { return WhiteUqFkWithoutPkRef.class; }
    protected Class<WhiteUqFkWithoutPkRef> typeOfHandlingEntity() { return WhiteUqFkWithoutPkRef.class; }
    protected Class<WhiteUqFkWithoutPkRefCB> typeOfHandlingConditionBean() { return WhiteUqFkWithoutPkRefCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @javax.annotation.Resource(name="behaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @javax.annotation.Resource(name="behaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }
}
