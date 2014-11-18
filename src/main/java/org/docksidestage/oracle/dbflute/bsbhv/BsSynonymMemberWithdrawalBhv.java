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
 * The behavior of SYNONYM_MEMBER_WITHDRAWAL as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
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
 *     MEMBER_VENDOR_SYNONYM, WITHDRAWAL_REASON, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberVendorSynonym, withdrawalReason, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymMemberWithdrawalBhv extends AbstractBehaviorWritable<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public SynonymMemberWithdrawalDbm asDBMeta() { return SynonymMemberWithdrawalDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "SYNONYM_MEMBER_WITHDRAWAL"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymMemberWithdrawalCB newConditionBean() { return new SynonymMemberWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymMemberWithdrawalCB cb) {
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
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">synonymMemberWithdrawal</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberWithdrawal> selectEntity(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(synonymMemberWithdrawal <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = synonymMemberWithdrawal.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(synonymMemberWithdrawal <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = synonymMemberWithdrawal.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberWithdrawal> selectEntity(SynonymMemberWithdrawalCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<SynonymMemberWithdrawal> facadeSelectEntity(SynonymMemberWithdrawalCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymMemberWithdrawalCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberWithdrawal <span style="color: #553000">synonymMemberWithdrawal</span> = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">synonymMemberWithdrawal</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectEntityWithDeletedCheck(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().set...;
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymMemberWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectEntityWithDeletedCheck(SynonymMemberWithdrawalCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberWithdrawal> selectByPK(Integer memberId) {
        return facadeSelectByPK(memberId);
    }

    protected OptionalEntity<SynonymMemberWithdrawal> facadeSelectByPK(Integer memberId) {
        return doSelectOptionalByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ENTITY doSelectByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends SynonymMemberWithdrawal> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    protected SynonymMemberWithdrawalCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;SynonymMemberWithdrawal&gt; <span style="color: #553000">synonymMemberWithdrawalList</span> = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (SynonymMemberWithdrawal <span style="color: #553000">synonymMemberWithdrawal</span> : <span style="color: #553000">synonymMemberWithdrawalList</span>) {
     *     ... = <span style="color: #553000">synonymMemberWithdrawal</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberWithdrawal> selectList(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;SynonymMemberWithdrawal&gt; <span style="color: #553000">synonymMemberWithdrawalList</span> = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (SynonymMemberWithdrawal synonymMemberWithdrawal : <span style="color: #553000">synonymMemberWithdrawalList</span>) {
     *     ... = synonymMemberWithdrawal.get...;
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberWithdrawal> selectList(SynonymMemberWithdrawalCB cb) {
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
     * PagingResultBean&lt;SynonymMemberWithdrawal&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymMemberWithdrawal synonymMemberWithdrawal : <span style="color: #553000">page</span>) {
     *     ... = synonymMemberWithdrawal.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberWithdrawal> selectPage(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymMemberWithdrawal&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymMemberWithdrawal synonymMemberWithdrawal : <span style="color: #553000">page</span>) {
     *     ... = synonymMemberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberWithdrawal> selectPage(SynonymMemberWithdrawalCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param entityLambda The handler of entity row of SynonymMemberWithdrawal. (NotNull)
     */
    public void selectCursor(CBCall<SynonymMemberWithdrawalCB> cbLambda, EntityRowHandler<SynonymMemberWithdrawal> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().set...
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymMemberWithdrawal. (NotNull)
     */
    public void selectCursor(SynonymMemberWithdrawalCB cb, EntityRowHandler<SynonymMemberWithdrawal> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymMemberWithdrawalCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param synonymMemberWithdrawalList The entity list of synonymMemberWithdrawal. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, ReferrerLoaderHandler<LoaderOfSynonymMemberWithdrawal> loaderLambda) {
        xassLRArg(synonymMemberWithdrawalList, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymMemberWithdrawal().ready(synonymMemberWithdrawalList, _behaviorSelector));
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
     * @param synonymMemberWithdrawal The entity of synonymMemberWithdrawal. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymMemberWithdrawal synonymMemberWithdrawal, ReferrerLoaderHandler<LoaderOfSynonymMemberWithdrawal> loaderLambda) {
        xassLRArg(synonymMemberWithdrawal, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymMemberWithdrawal().ready(xnewLRAryLs(synonymMemberWithdrawal), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberVendorSynonym'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberVendorSynonym> pulloutMemberVendorSynonym(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "memberVendorSynonym"); }

    /**
     * Pull out the list of foreign table 'WithdrawalReason'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WithdrawalReason> pulloutWithdrawalReason(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "withdrawalReason"); }

    /**
     * Pull out the list of foreign table 'SynonymMember'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMember> pulloutSynonymMember(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "synonymMember"); }

    /**
     * Pull out the list of foreign table 'VendorSynonymMember'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorSynonymMember> pulloutVendorSynonymMember(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "vendorSynonymMember"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpExtractListInternally(synonymMemberWithdrawalList, "memberId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberWithdrawal.setFoo...(value);
     * synonymMemberWithdrawal.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">insert</span>(synonymMemberWithdrawal);
     * ... = synonymMemberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymMemberWithdrawal The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsert(synonymMemberWithdrawal, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">update</span>(synonymMemberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doUpdate(synonymMemberWithdrawal, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(synonymMemberWithdrawal);
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doUpdateNonstrict(synonymMemberWithdrawal, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsertOrUpdate(synonymMemberWithdrawal, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsertOrUpdateNonstrict(synonymMemberWithdrawal, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">delete</span>(synonymMemberWithdrawal);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doDelete(synonymMemberWithdrawal, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(synonymMemberWithdrawal);
     * </pre>
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doDeleteNonstrict(synonymMemberWithdrawal, null);
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
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">batchInsert</span>(synonymMemberWithdrawalList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchInsert(synonymMemberWithdrawalList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         synonymMemberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">batchUpdate</span>(synonymMemberWithdrawalList);
     * </pre>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchUpdate(synonymMemberWithdrawalList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         synonymMemberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">batchUpdate</span>(synonymMemberWithdrawalList);
     * </pre>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchUpdateNonstrict(synonymMemberWithdrawalList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchDelete(synonymMemberWithdrawalList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchDeleteNonstrict(synonymMemberWithdrawalList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymMemberWithdrawal, SynonymMemberWithdrawalCB&gt;() {
     *     public ConditionBean setup(SynonymMemberWithdrawal entity, SynonymMemberWithdrawalCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return doQueryUpdate(synonymMemberWithdrawal, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, SynonymMemberWithdrawalCB cb) {
        return doQueryUpdate(synonymMemberWithdrawal, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<SynonymMemberWithdrawalCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymMemberWithdrawalCB cb) {
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
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberWithdrawal.setFoo...(value);
     * synonymMemberWithdrawal.setBar...(value);
     * InsertOption&lt;SynonymMemberWithdrawalCB&gt; option = new InsertOption&lt;SynonymMemberWithdrawalCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">varyingInsert</span>(synonymMemberWithdrawal, option);
     * ... = synonymMemberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymMemberWithdrawal The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, InsertOption<SynonymMemberWithdrawalCB>> opLambda) {
        doInsert(synonymMemberWithdrawal, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = new UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *         public void specify(SynonymMemberWithdrawalCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(synonymMemberWithdrawal, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        doUpdate(synonymMemberWithdrawal, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void specify(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(synonymMemberWithdrawal, option);
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        doUpdateNonstrict(synonymMemberWithdrawal, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, InsertOption<SynonymMemberWithdrawalCB>> insertOpLambda, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> updateOpLambda) {
        doInsertOrUpdate(synonymMemberWithdrawal, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, InsertOption<SynonymMemberWithdrawalCB>> insertOpLambda, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(synonymMemberWithdrawal, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        doDelete(synonymMemberWithdrawal, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        doDeleteNonstrict(synonymMemberWithdrawal, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, WritableOptionCall<SynonymMemberWithdrawalCB, InsertOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doBatchInsert(synonymMemberWithdrawalList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doBatchUpdate(synonymMemberWithdrawalList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doBatchUpdateNonstrict(synonymMemberWithdrawalList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doBatchDelete(synonymMemberWithdrawalList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doBatchDeleteNonstrict(synonymMemberWithdrawalList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> manyArgLambda, WritableOptionCall<SynonymMemberWithdrawalCB, InsertOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void specify(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymMemberWithdrawal, cb, option);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, CBCall<SynonymMemberWithdrawalCB> cbLambda, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doQueryUpdate(synonymMemberWithdrawal, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = <span style="color: #70226C">new</span> SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = <span style="color: #70226C">new</span> SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void specify(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">synonymMemberWithdrawalBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymMemberWithdrawal, cb, option);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, SynonymMemberWithdrawalCB cb, WritableOptionCall<SynonymMemberWithdrawalCB, UpdateOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doQueryUpdate(synonymMemberWithdrawal, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<SynonymMemberWithdrawalCB> cbLambda, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymMemberWithdrawalCB cb, WritableOptionCall<SynonymMemberWithdrawalCB, DeleteOption<SynonymMemberWithdrawalCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * synonymMemberWithdrawalBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * synonymMemberWithdrawalBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymMemberWithdrawalBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * synonymMemberWithdrawalBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymMemberWithdrawalBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * synonymMemberWithdrawalBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * synonymMemberWithdrawalBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * synonymMemberWithdrawalBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * synonymMemberWithdrawalBhv.outideSql().removeBlockComment().selectList()
     * synonymMemberWithdrawalBhv.outideSql().removeLineComment().selectList()
     * synonymMemberWithdrawalBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<SynonymMemberWithdrawalBhv> outsideSql() {
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
    protected Class<? extends SynonymMemberWithdrawal> typeOfSelectedEntity() { return SynonymMemberWithdrawal.class; }
    protected Class<SynonymMemberWithdrawal> typeOfHandlingEntity() { return SynonymMemberWithdrawal.class; }
    protected Class<SynonymMemberWithdrawalCB> typeOfHandlingConditionBean() { return SynonymMemberWithdrawalCB.class; }
}
