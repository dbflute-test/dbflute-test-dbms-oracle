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
 * The behavior of WHITE_UQ_FK as TABLE. <br>
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkBhv extends AbstractBehaviorWritable<WhiteUqFk, WhiteUqFkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteUqFkDbm asDBMeta() { return WhiteUqFkDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_UQ_FK"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkCB newConditionBean() { return new WhiteUqFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteUqFkCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkCB cb) {
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
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteUqFk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteUqFk</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteUqFk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteUqFk</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFk> selectEntity(CBCall<WhiteUqFkCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteUqFk <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteUqFk.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteUqFk <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteUqFk.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFk> selectEntity(WhiteUqFkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<WhiteUqFk> facadeSelectEntity(WhiteUqFkCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFk <span style="color: #553000">whiteUqFk</span> = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteUqFk</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntityWithDeletedCheck(CBCall<WhiteUqFkCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().set...;
     * WhiteUqFk whiteUqFk = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntityWithDeletedCheck(WhiteUqFkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFk> selectByPK(Long uqFkId) {
        return facadeSelectByPK(uqFkId);
    }

    protected OptionalEntity<WhiteUqFk> facadeSelectByPK(Long uqFkId) {
        return doSelectOptionalByPK(uqFkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectByPK(Long uqFkId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(uqFkId), tp);
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectOptionalByPK(Long uqFkId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(uqFkId, tp), uqFkId);
    }

    protected WhiteUqFkCB xprepareCBAsPK(Long uqFkId) {
        assertObjectNotNull("uqFkId", uqFkId);
        return newConditionBean().acceptPK(uqFkId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param uqFkCode : UQ, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFk> selectByUniqueOf(String uqFkCode) {
        return facadeSelectByUniqueOf(uqFkCode);
    }

    protected OptionalEntity<WhiteUqFk> facadeSelectByUniqueOf(String uqFkCode) {
        return doSelectByUniqueOf(uqFkCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectByUniqueOf(String uqFkCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(uqFkCode), tp), uqFkCode);
    }

    protected WhiteUqFkCB xprepareCBAsUniqueOf(String uqFkCode) {
        assertObjectNotNull("uqFkCode", uqFkCode);
        return newConditionBean().acceptUniqueOf(uqFkCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteUqFk&gt; <span style="color: #553000">whiteUqFkList</span> = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteUqFk <span style="color: #553000">whiteUqFk</span> : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = <span style="color: #553000">whiteUqFk</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFk> selectList(CBCall<WhiteUqFkCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WhiteUqFk&gt; <span style="color: #553000">whiteUqFkList</span> = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WhiteUqFk whiteUqFk : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = whiteUqFk.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFk> selectList(WhiteUqFkCB cb) {
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
     * PagingResultBean&lt;WhiteUqFk&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteUqFk whiteUqFk : <span style="color: #553000">page</span>) {
     *     ... = whiteUqFk.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFk> selectPage(CBCall<WhiteUqFkCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFk&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteUqFk whiteUqFk : <span style="color: #553000">page</span>) {
     *     ... = whiteUqFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFk> selectPage(WhiteUqFkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @param entityLambda The handler of entity row of WhiteUqFk. (NotNull)
     */
    public void selectCursor(CBCall<WhiteUqFkCB> cbLambda, EntityRowHandler<WhiteUqFk> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFk. (NotNull)
     */
    public void selectCursor(WhiteUqFkCB cb, EntityRowHandler<WhiteUqFk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFk> whiteUqFkList, ReferrerLoaderHandler<LoaderOfWhiteUqFk> loaderLambda) {
        xassLRArg(whiteUqFkList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFk().ready(whiteUqFkList, _behaviorSelector));
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
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFk whiteUqFk, ReferrerLoaderHandler<LoaderOfWhiteUqFk> loaderLambda) {
        xassLRArg(whiteUqFk, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUqFk().ready(xnewLRAryLs(whiteUqFk), _behaviorSelector));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToPkId</span>(<span style="color: #553000">whiteUqFkList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteUqFk whiteUqFk : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = whiteUqFk.<span style="color: #CC4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkId(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        xassLRArg(whiteUqFkList, refCBLambda);
        return doLoadWhiteUqFkRefByFkToPkId(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToPkId</span>(<span style="color: #553000">whiteUqFk</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteUqFk</span>.<span style="color: #CC4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkId(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        xassLRArg(whiteUqFk, refCBLambda);
        return doLoadWhiteUqFkRefByFkToPkId(xnewLRLs(whiteUqFk), new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkId(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        return loadWhiteUqFkRefByFkToPkId(xnewLRLs(whiteUqFk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkId(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return (NestedReferrerListGateway<WhiteUqFkRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteUqFkRefByFkToPkId(whiteUqFkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteUqFkRef> doLoadWhiteUqFkRefByFkToPkId(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> option) {
        return helpLoadReferrerInternally(whiteUqFkList, option, "whiteUqFkRefByFkToPkIdList");
    }

    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToUqCode</span>(<span style="color: #553000">whiteUqFkList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteUqFk whiteUqFk : <span style="color: #553000">whiteUqFkList</span>) {
     *     ... = whiteUqFk.<span style="color: #CC4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCode(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        xassLRArg(whiteUqFkList, refCBLambda);
        return doLoadWhiteUqFkRefByFkToUqCode(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">loadWhiteUqFkRefByFkToUqCode</span>(<span style="color: #553000">whiteUqFk</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteUqFk</span>.<span style="color: #CC4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCode(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        xassLRArg(whiteUqFk, refCBLambda);
        return doLoadWhiteUqFkRefByFkToUqCode(xnewLRLs(whiteUqFk), new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCode(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        return loadWhiteUqFkRefByFkToUqCode(xnewLRLs(whiteUqFk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCode(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return (NestedReferrerListGateway<WhiteUqFkRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteUqFkRefByFkToUqCode(whiteUqFkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteUqFkRef> doLoadWhiteUqFkRefByFkToUqCode(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> option) {
        return helpLoadReferrerInternally(whiteUqFkList, option, "whiteUqFkRefByFkToUqCodeList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkId.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkIdList(List<WhiteUqFk> whiteUqFkList)
    { return helpExtractListInternally(whiteUqFkList, "uqFkId"); }

    /**
     * Extract the value list of (single) unique key uqFkCode.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqFkCodeList(List<WhiteUqFk> whiteUqFkList)
    { return helpExtractListInternally(whiteUqFkList, "uqFkCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">insert</span>(whiteUqFk);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFk whiteUqFk) {
        doInsert(whiteUqFk, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">update</span>(whiteUqFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteUqFk whiteUqFk) {
        doUpdate(whiteUqFk, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteUqFk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFk whiteUqFk) {
        doInsertOrUpdate(whiteUqFk, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">delete</span>(whiteUqFk);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFk whiteUqFk) {
        doDelete(whiteUqFk, null);
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
     *     WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteUqFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteUqFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFk> whiteUqFkList) {
        return doBatchInsert(whiteUqFkList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteUqFk.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteUqFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteUqFkList);
     * </pre>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFk> whiteUqFkList) {
        return doBatchUpdate(whiteUqFkList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFk> whiteUqFkList) {
        return doBatchDelete(whiteUqFkList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFk, WhiteUqFkCB&gt;() {
     *     public ConditionBean setup(WhiteUqFk entity, WhiteUqFkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteUqFk, cb);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFk whiteUqFk, CBCall<WhiteUqFkCB> cbLambda) {
        return doQueryUpdate(whiteUqFk, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteUqFk, cb);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb) {
        return doQueryUpdate(whiteUqFk, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteUqFk, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteUqFkCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteUqFk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkCB cb) {
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
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * InsertOption&lt;WhiteUqFkCB&gt; option = new InsertOption&lt;WhiteUqFkCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteUqFk, option);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFk whiteUqFk, WritableOptionCall<WhiteUqFkCB, InsertOption<WhiteUqFkCB>> opLambda) {
        doInsert(whiteUqFk, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkCB&gt; option = new UpdateOption&lt;WhiteUqFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *         public void specify(WhiteUqFkCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteUqFk, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFk whiteUqFk, WritableOptionCall<WhiteUqFkCB, UpdateOption<WhiteUqFkCB>> opLambda) {
        doUpdate(whiteUqFk, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFk The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFk whiteUqFk, WritableOptionCall<WhiteUqFkCB, InsertOption<WhiteUqFkCB>> insertOpLambda, WritableOptionCall<WhiteUqFkCB, UpdateOption<WhiteUqFkCB>> updateOpLambda) {
        doInsertOrUpdate(whiteUqFk, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteUqFk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFk whiteUqFk, WritableOptionCall<WhiteUqFkCB, DeleteOption<WhiteUqFkCB>> opLambda) {
        doDelete(whiteUqFk, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFk> whiteUqFkList, WritableOptionCall<WhiteUqFkCB, InsertOption<WhiteUqFkCB>> opLambda) {
        return doBatchInsert(whiteUqFkList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFk> whiteUqFkList, WritableOptionCall<WhiteUqFkCB, UpdateOption<WhiteUqFkCB>> opLambda) {
        return doBatchUpdate(whiteUqFkList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFk> whiteUqFkList, WritableOptionCall<WhiteUqFkCB, DeleteOption<WhiteUqFkCB>> opLambda) {
        return doBatchDelete(whiteUqFkList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> manyArgLambda, WritableOptionCall<WhiteUqFkCB, InsertOption<WhiteUqFkCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteUqFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *     public void specify(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteUqFk, cb, option);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFk whiteUqFk, CBCall<WhiteUqFkCB> cbLambda, WritableOptionCall<WhiteUqFkCB, UpdateOption<WhiteUqFkCB>> opLambda) {
        return doQueryUpdate(whiteUqFk, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteUqFk whiteUqFk = <span style="color: #70226C">new</span> WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = <span style="color: #70226C">new</span> WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;WhiteUqFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *     public void specify(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteUqFkBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteUqFk, cb, option);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb, WritableOptionCall<WhiteUqFkCB, UpdateOption<WhiteUqFkCB>> opLambda) {
        return doQueryUpdate(whiteUqFk, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WhiteUqFk. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteUqFkCB> cbLambda, WritableOptionCall<WhiteUqFkCB, DeleteOption<WhiteUqFkCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkCB cb, WritableOptionCall<WhiteUqFkCB, DeleteOption<WhiteUqFkCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteUqFkBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteUqFkBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteUqFkBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUqFkBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteUqFkBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteUqFkBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteUqFkBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteUqFkBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteUqFkBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteUqFkBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteUqFkBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteUqFkBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteUqFkBhv.outideSql().removeBlockComment().selectList()
     * whiteUqFkBhv.outideSql().removeLineComment().selectList()
     * whiteUqFkBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteUqFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUqFk> typeOfSelectedEntity() { return WhiteUqFk.class; }
    protected Class<WhiteUqFk> typeOfHandlingEntity() { return WhiteUqFk.class; }
    protected Class<WhiteUqFkCB> typeOfHandlingConditionBean() { return WhiteUqFkCB.class; }
}
