package org.docksidestage.oracle.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.bsbhv.loader.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The behavior of SYNONYM_NEXT_LINK_SYNONYM as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSynonymBhv extends AbstractBehaviorWritable<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public SynonymNextLinkSynonymDbm asDBMeta() { return SynonymNextLinkSynonymDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "SYNONYM_NEXT_LINK_SYNONYM"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextLinkSynonymCB newConditionBean() { return new SynonymNextLinkSynonymCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkSynonymCB cb) {
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
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">synonymNextLinkSynonym</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">synonymNextLinkSynonym</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">synonymNextLinkSynonym</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">synonymNextLinkSynonym</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymNextLinkSynonym> selectEntity(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(synonymNextLinkSynonym <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = synonymNextLinkSynonym.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(synonymNextLinkSynonym <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = synonymNextLinkSynonym.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymNextLinkSynonym> selectEntity(SynonymNextLinkSynonymCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<SynonymNextLinkSynonym> facadeSelectEntity(SynonymNextLinkSynonymCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextLinkSynonymCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextLinkSynonym <span style="color: #553000">synonymNextLinkSynonym</span> = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">synonymNextLinkSynonym</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntityWithDeletedCheck(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().set...;
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkSynonym.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntityWithDeletedCheck(SynonymNextLinkSynonymCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymNextLinkSynonym> selectByPK(Long productId) {
        return facadeSelectByPK(productId);
    }

    protected OptionalEntity<SynonymNextLinkSynonym> facadeSelectByPK(Long productId) {
        return doSelectOptionalByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productId, tp), productId);
    }

    protected SynonymNextLinkSynonymCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;SynonymNextLinkSynonym&gt; <span style="color: #553000">synonymNextLinkSynonymList</span> = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (SynonymNextLinkSynonym <span style="color: #553000">synonymNextLinkSynonym</span> : <span style="color: #553000">synonymNextLinkSynonymList</span>) {
     *     ... = <span style="color: #553000">synonymNextLinkSynonym</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSynonym> selectList(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;SynonymNextLinkSynonym&gt; <span style="color: #553000">synonymNextLinkSynonymList</span> = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (SynonymNextLinkSynonym synonymNextLinkSynonym : <span style="color: #553000">synonymNextLinkSynonymList</span>) {
     *     ... = synonymNextLinkSynonym.get...;
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSynonym> selectList(SynonymNextLinkSynonymCB cb) {
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
     * PagingResultBean&lt;SynonymNextLinkSynonym&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymNextLinkSynonym synonymNextLinkSynonym : <span style="color: #553000">page</span>) {
     *     ... = synonymNextLinkSynonym.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSynonym> selectPage(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkSynonym&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymNextLinkSynonym synonymNextLinkSynonym : <span style="color: #553000">page</span>) {
     *     ... = synonymNextLinkSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSynonym> selectPage(SynonymNextLinkSynonymCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param entityLambda The handler of entity row of SynonymNextLinkSynonym. (NotNull)
     */
    public void selectCursor(CBCall<SynonymNextLinkSynonymCB> cbLambda, EntityRowHandler<SynonymNextLinkSynonym> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().set...
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkSynonym. (NotNull)
     */
    public void selectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<SynonymNextLinkSynonym> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextLinkSynonymCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param synonymNextLinkSynonymList The entity list of synonymNextLinkSynonym. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSynonym> loaderLambda) {
        xassLRArg(synonymNextLinkSynonymList, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymNextLinkSynonym().ready(synonymNextLinkSynonymList, _behaviorSelector));
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
     * @param synonymNextLinkSynonym The entity of synonymNextLinkSynonym. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextLinkSynonym synonymNextLinkSynonym, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSynonym> loaderLambda) {
        xassLRArg(synonymNextLinkSynonym, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymNextLinkSynonym().ready(xnewLRAryLs(synonymNextLinkSynonym), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param synonymNextLinkSynonymList The list of synonymNextLinkSynonym. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList)
    { return helpExtractListInternally(synonymNextLinkSynonymList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">insert</span>(synonymNextLinkSynonym);
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkSynonym The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsert(synonymNextLinkSynonym, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">update</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdate(synonymNextLinkSynonym, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdateNonstrict(synonymNextLinkSynonym, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsertOrUpdate(synonymNextLinkSynonym, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsertOrUpdateNonstrict(synonymNextLinkSynonym, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">delete</span>(synonymNextLinkSynonym);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDelete(synonymNextLinkSynonym, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDeleteNonstrict(synonymNextLinkSynonym, null);
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
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">batchInsert</span>(synonymNextLinkSynonymList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchInsert(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchUpdate(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDelete(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkSynonym, SynonymNextLinkSynonymCB&gt;() {
     *     public ConditionBean setup(SynonymNextLinkSynonym entity, SynonymNextLinkSynonymCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymNextLinkSynonym, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return doQueryUpdate(synonymNextLinkSynonym, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb) {
        return doQueryUpdate(synonymNextLinkSynonym, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymNextLinkSynonym, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<SynonymNextLinkSynonymCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkSynonymCB cb) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">varyingInsert</span>(synonymNextLinkSynonym, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkSynonym The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, InsertOption<SynonymNextLinkSynonymCB>> opLambda) {
        doInsert(synonymNextLinkSynonym, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(synonymNextLinkSynonym, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        doUpdate(synonymNextLinkSynonym, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(synonymNextLinkSynonym, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        doUpdateNonstrict(synonymNextLinkSynonym, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, InsertOption<SynonymNextLinkSynonymCB>> insertOpLambda, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> updateOpLambda) {
        doInsertOrUpdate(synonymNextLinkSynonym, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, InsertOption<SynonymNextLinkSynonymCB>> insertOpLambda, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(synonymNextLinkSynonym, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        doDelete(synonymNextLinkSynonym, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        doDeleteNonstrict(synonymNextLinkSynonym, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, WritableOptionCall<SynonymNextLinkSynonymCB, InsertOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doBatchInsert(synonymNextLinkSynonymList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doBatchUpdate(synonymNextLinkSynonymList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doBatchDelete(synonymNextLinkSynonymList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> manyArgLambda, WritableOptionCall<SynonymNextLinkSynonymCB, InsertOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymNextLinkSynonym, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, CBCall<SynonymNextLinkSynonymCB> cbLambda, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doQueryUpdate(synonymNextLinkSynonym, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = <span style="color: #70226C">new</span> SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = <span style="color: #70226C">new</span> SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymNextLinkSynonym, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb, WritableOptionCall<SynonymNextLinkSynonymCB, UpdateOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doQueryUpdate(synonymNextLinkSynonym, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">synonymNextLinkSynonymBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymNextLinkSynonym, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<SynonymNextLinkSynonymCB> cbLambda, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkSynonymCB cb, WritableOptionCall<SynonymNextLinkSynonymCB, DeleteOption<SynonymNextLinkSynonymCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * synonymNextLinkSynonymBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * synonymNextLinkSynonymBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymNextLinkSynonymBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * synonymNextLinkSynonymBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymNextLinkSynonymBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * synonymNextLinkSynonymBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * synonymNextLinkSynonymBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * synonymNextLinkSynonymBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * synonymNextLinkSynonymBhv.outideSql().removeBlockComment().selectList()
     * synonymNextLinkSynonymBhv.outideSql().removeLineComment().selectList()
     * synonymNextLinkSynonymBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<SynonymNextLinkSynonymBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymNextLinkSynonym> typeOfSelectedEntity() { return SynonymNextLinkSynonym.class; }
    protected Class<SynonymNextLinkSynonym> typeOfHandlingEntity() { return SynonymNextLinkSynonym.class; }
    protected Class<SynonymNextLinkSynonymCB> typeOfHandlingConditionBean() { return SynonymNextLinkSynonymCB.class; }

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

    @Override
    @javax.annotation.Resource(name="commonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
