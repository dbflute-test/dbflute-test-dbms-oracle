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
 * The behavior of (会員ログイン)SYNONYM_MEMBER_LOGIN as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
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
 *     MEMBER_STATUS, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, memberVendorSynonym, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymMemberLoginBhv extends AbstractBehaviorWritable<SynonymMemberLogin, SynonymMemberLoginCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public SynonymMemberLoginDbm asDBMeta() { return SynonymMemberLoginDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "SYNONYM_MEMBER_LOGIN"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymMemberLoginCB newConditionBean() { return new SynonymMemberLoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<SynonymMemberLoginCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymMemberLoginCB cb) {
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
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">synonymMemberLogin</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">synonymMemberLogin</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">synonymMemberLogin</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">synonymMemberLogin</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberLogin> selectEntity(CBCall<SynonymMemberLoginCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(synonymMemberLogin <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = synonymMemberLogin.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(synonymMemberLogin <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = synonymMemberLogin.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberLogin> selectEntity(SynonymMemberLoginCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<SynonymMemberLogin> facadeSelectEntity(SynonymMemberLoginCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberLogin> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymMemberLoginCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberLogin <span style="color: #553000">synonymMemberLogin</span> = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">synonymMemberLogin</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberLogin selectEntityWithDeletedCheck(CBCall<SynonymMemberLoginCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().set...;
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymMemberLogin.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberLogin selectEntityWithDeletedCheck(SynonymMemberLoginCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberLoginId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberLogin> selectByPK(Long memberLoginId) {
        return facadeSelectByPK(memberLoginId);
    }

    protected OptionalEntity<SynonymMemberLogin> facadeSelectByPK(Long memberLoginId) {
        return doSelectOptionalByPK(memberLoginId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberLogin> ENTITY doSelectByPK(Long memberLoginId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberLoginId), tp);
    }

    protected <ENTITY extends SynonymMemberLogin> OptionalEntity<ENTITY> doSelectOptionalByPK(Long memberLoginId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberLoginId, tp), memberLoginId);
    }

    protected SynonymMemberLoginCB xprepareCBAsPK(Long memberLoginId) {
        assertObjectNotNull("memberLoginId", memberLoginId);
        return newConditionBean().acceptPK(memberLoginId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId : UQ+, NotNull, NUMBER(9), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @param loginDatetime : +UQ, IX, NotNull, TIMESTAMP(3)(11, 3). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMemberLogin> selectByUniqueOf(Integer memberId, java.time.LocalDateTime loginDatetime) {
        return facadeSelectByUniqueOf(memberId, loginDatetime);
    }

    protected OptionalEntity<SynonymMemberLogin> facadeSelectByUniqueOf(Integer memberId, java.time.LocalDateTime loginDatetime) {
        return doSelectByUniqueOf(memberId, loginDatetime, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberLogin> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer memberId, java.time.LocalDateTime loginDatetime, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberId, loginDatetime), tp), memberId, loginDatetime);
    }

    protected SynonymMemberLoginCB xprepareCBAsUniqueOf(Integer memberId, java.time.LocalDateTime loginDatetime) {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("loginDatetime", loginDatetime);
        return newConditionBean().acceptUniqueOf(memberId, loginDatetime);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;SynonymMemberLogin&gt; <span style="color: #553000">synonymMemberLoginList</span> = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (SynonymMemberLogin <span style="color: #553000">synonymMemberLogin</span> : <span style="color: #553000">synonymMemberLoginList</span>) {
     *     ... = <span style="color: #553000">synonymMemberLogin</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberLogin> selectList(CBCall<SynonymMemberLoginCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;SynonymMemberLogin&gt; <span style="color: #553000">synonymMemberLoginList</span> = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (SynonymMemberLogin synonymMemberLogin : <span style="color: #553000">synonymMemberLoginList</span>) {
     *     ... = synonymMemberLogin.get...;
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberLogin> selectList(SynonymMemberLoginCB cb) {
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
     * PagingResultBean&lt;SynonymMemberLogin&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymMemberLogin synonymMemberLogin : <span style="color: #553000">page</span>) {
     *     ... = synonymMemberLogin.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberLogin> selectPage(CBCall<SynonymMemberLoginCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymMemberLogin&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (SynonymMemberLogin synonymMemberLogin : <span style="color: #553000">page</span>) {
     *     ... = synonymMemberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberLogin> selectPage(SynonymMemberLoginCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @param entityLambda The handler of entity row of SynonymMemberLogin. (NotNull)
     */
    public void selectCursor(CBCall<SynonymMemberLoginCB> cbLambda, EntityRowHandler<SynonymMemberLogin> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().set...
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymMemberLogin. (NotNull)
     */
    public void selectCursor(SynonymMemberLoginCB cb, EntityRowHandler<SynonymMemberLogin> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymMemberLoginCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param synonymMemberLoginList The entity list of synonymMemberLogin. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymMemberLogin> synonymMemberLoginList, ReferrerLoaderHandler<LoaderOfSynonymMemberLogin> loaderLambda) {
        xassLRArg(synonymMemberLoginList, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymMemberLogin().ready(synonymMemberLoginList, _behaviorSelector));
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
     * @param synonymMemberLogin The entity of synonymMemberLogin. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymMemberLogin synonymMemberLogin, ReferrerLoaderHandler<LoaderOfSynonymMemberLogin> loaderLambda) {
        xassLRArg(synonymMemberLogin, loaderLambda);
        loaderLambda.handle(new LoaderOfSynonymMemberLogin().ready(xnewLRAryLs(synonymMemberLogin), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<SynonymMemberLogin> synonymMemberLoginList)
    { return helpPulloutInternally(synonymMemberLoginList, "memberStatus"); }

    /**
     * Pull out the list of foreign table 'MemberVendorSynonym'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberVendorSynonym> pulloutMemberVendorSynonym(List<SynonymMemberLogin> synonymMemberLoginList)
    { return helpPulloutInternally(synonymMemberLoginList, "memberVendorSynonym"); }

    /**
     * Pull out the list of foreign table 'SynonymMember'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMember> pulloutSynonymMember(List<SynonymMemberLogin> synonymMemberLoginList)
    { return helpPulloutInternally(synonymMemberLoginList, "synonymMember"); }

    /**
     * Pull out the list of foreign table 'VendorSynonymMember'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorSynonymMember> pulloutVendorSynonymMember(List<SynonymMemberLogin> synonymMemberLoginList)
    { return helpPulloutInternally(synonymMemberLoginList, "vendorSynonymMember"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberLoginId.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberLoginIdList(List<SynonymMemberLogin> synonymMemberLoginList)
    { return helpExtractListInternally(synonymMemberLoginList, "memberLoginId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberLogin.setFoo...(value);
     * synonymMemberLogin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">insert</span>(synonymMemberLogin);
     * ... = synonymMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymMemberLogin The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymMemberLogin synonymMemberLogin) {
        doInsert(synonymMemberLogin, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberLogin.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">update</span>(synonymMemberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymMemberLogin synonymMemberLogin) {
        doUpdate(synonymMemberLogin, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMemberLogin The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymMemberLogin synonymMemberLogin) {
        doInsertOrUpdate(synonymMemberLogin, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberLogin.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">delete</span>(synonymMemberLogin);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymMemberLogin synonymMemberLogin) {
        doDelete(synonymMemberLogin, null);
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
     *     SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     *     synonymMemberLogin.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymMemberLogin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymMemberLoginList.add(synonymMemberLogin);
     * }
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">batchInsert</span>(synonymMemberLoginList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymMemberLogin> synonymMemberLoginList) {
        return doBatchInsert(synonymMemberLoginList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     *     synonymMemberLogin.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         synonymMemberLogin.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         synonymMemberLogin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberLogin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberLoginList.add(synonymMemberLogin);
     * }
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">batchUpdate</span>(synonymMemberLoginList);
     * </pre>
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymMemberLogin> synonymMemberLoginList) {
        return doBatchUpdate(synonymMemberLoginList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymMemberLogin> synonymMemberLoginList) {
        return doBatchDelete(synonymMemberLoginList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymMemberLogin, SynonymMemberLoginCB&gt;() {
     *     public ConditionBean setup(SynonymMemberLogin entity, SynonymMemberLoginCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymMemberLogin, cb);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberLogin synonymMemberLogin, CBCall<SynonymMemberLoginCB> cbLambda) {
        return doQueryUpdate(synonymMemberLogin, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">queryUpdate</span>(synonymMemberLogin, cb);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberLogin synonymMemberLogin, SynonymMemberLoginCB cb) {
        return doQueryUpdate(synonymMemberLogin, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymMemberLogin, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<SynonymMemberLoginCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">queryDelete</span>(synonymMemberLogin, cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymMemberLoginCB cb) {
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
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberLogin.setFoo...(value);
     * synonymMemberLogin.setBar...(value);
     * InsertOption&lt;SynonymMemberLoginCB&gt; option = new InsertOption&lt;SynonymMemberLoginCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">varyingInsert</span>(synonymMemberLogin, option);
     * ... = synonymMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymMemberLogin The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymMemberLogin synonymMemberLogin, WritableOptionCall<SynonymMemberLoginCB, InsertOption<SynonymMemberLoginCB>> opLambda) {
        doInsert(synonymMemberLogin, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberLogin.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymMemberLoginCB&gt; option = new UpdateOption&lt;SynonymMemberLoginCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *         public void specify(SynonymMemberLoginCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(synonymMemberLogin, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymMemberLogin synonymMemberLogin, WritableOptionCall<SynonymMemberLoginCB, UpdateOption<SynonymMemberLoginCB>> opLambda) {
        doUpdate(synonymMemberLogin, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymMemberLogin The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymMemberLogin synonymMemberLogin, WritableOptionCall<SynonymMemberLoginCB, InsertOption<SynonymMemberLoginCB>> insertOpLambda, WritableOptionCall<SynonymMemberLoginCB, UpdateOption<SynonymMemberLoginCB>> updateOpLambda) {
        doInsertOrUpdate(synonymMemberLogin, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param synonymMemberLogin The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymMemberLogin synonymMemberLogin, WritableOptionCall<SynonymMemberLoginCB, DeleteOption<SynonymMemberLoginCB>> opLambda) {
        doDelete(synonymMemberLogin, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymMemberLogin> synonymMemberLoginList, WritableOptionCall<SynonymMemberLoginCB, InsertOption<SynonymMemberLoginCB>> opLambda) {
        return doBatchInsert(synonymMemberLoginList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymMemberLogin> synonymMemberLoginList, WritableOptionCall<SynonymMemberLoginCB, UpdateOption<SynonymMemberLoginCB>> opLambda) {
        return doBatchUpdate(synonymMemberLoginList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymMemberLogin> synonymMemberLoginList, WritableOptionCall<SynonymMemberLoginCB, DeleteOption<SynonymMemberLoginCB>> opLambda) {
        return doBatchDelete(synonymMemberLoginList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> manyArgLambda, WritableOptionCall<SynonymMemberLoginCB, InsertOption<SynonymMemberLoginCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberLoginCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;SynonymMemberLoginCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void specify(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymMemberLogin, cb, option);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberLogin synonymMemberLogin, CBCall<SynonymMemberLoginCB> cbLambda, WritableOptionCall<SynonymMemberLoginCB, UpdateOption<SynonymMemberLoginCB>> opLambda) {
        return doQueryUpdate(synonymMemberLogin, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberLogin synonymMemberLogin = <span style="color: #70226C">new</span> SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = <span style="color: #70226C">new</span> SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberLoginCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;SynonymMemberLoginCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void specify(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">synonymMemberLoginBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(synonymMemberLogin, cb, option);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberLogin synonymMemberLogin, SynonymMemberLoginCB cb, WritableOptionCall<SynonymMemberLoginCB, UpdateOption<SynonymMemberLoginCB>> opLambda) {
        return doQueryUpdate(synonymMemberLogin, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of SynonymMemberLogin. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<SynonymMemberLoginCB> cbLambda, WritableOptionCall<SynonymMemberLoginCB, DeleteOption<SynonymMemberLoginCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymMemberLoginCB cb, WritableOptionCall<SynonymMemberLoginCB, DeleteOption<SynonymMemberLoginCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * synonymMemberLoginBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * synonymMemberLoginBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymMemberLoginBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * synonymMemberLoginBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * synonymMemberLoginBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * synonymMemberLoginBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * synonymMemberLoginBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * synonymMemberLoginBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * synonymMemberLoginBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * synonymMemberLoginBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * synonymMemberLoginBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * synonymMemberLoginBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * synonymMemberLoginBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * synonymMemberLoginBhv.outideSql().removeBlockComment().selectList()
     * synonymMemberLoginBhv.outideSql().removeLineComment().selectList()
     * synonymMemberLoginBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<SynonymMemberLoginBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymMemberLogin> typeOfSelectedEntity() { return SynonymMemberLogin.class; }
    protected Class<SynonymMemberLogin> typeOfHandlingEntity() { return SynonymMemberLogin.class; }
    protected Class<SynonymMemberLoginCB> typeOfHandlingConditionBean() { return SynonymMemberLoginCB.class; }
}
