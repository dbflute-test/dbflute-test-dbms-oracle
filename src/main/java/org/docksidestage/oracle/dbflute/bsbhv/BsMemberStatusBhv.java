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
import org.docksidestage.oracle.dbflute.allcommon.CDef;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.bsbhv.loader.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The behavior of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, SYNONYM_MEMBER_LOGIN, VENDOR_SYNONYM_MEMBER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList, memberVendorSynonymList, synonymMemberList, synonymMemberLoginList, vendorSynonymMemberList
 * </pre>
 * @author oracleman
 */
public abstract class BsMemberStatusBhv extends AbstractBehaviorWritable<MemberStatus, MemberStatusCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_selectDisplayMemberStatus = "selectDisplayMemberStatus";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public MemberStatusDbm getDBMeta() { return MemberStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MemberStatusCB newConditionBean() { return new MemberStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MemberStatusCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MemberStatusCB cb) {
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
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">memberStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">memberStatus</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">memberStatus</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">memberStatus</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberStatus> selectEntity(CBCall<MemberStatusCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(memberStatus <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = memberStatus.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(memberStatus <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = memberStatus.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberStatus> selectEntity(MemberStatusCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<MemberStatus> facadeSelectEntity(MemberStatusCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(MemberStatusCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MemberStatus <span style="color: #553000">memberStatus</span> = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">memberStatus</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberStatus selectEntityWithDeletedCheck(CBCall<MemberStatusCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().set...;
     * MemberStatus memberStatus = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberStatus selectEntityWithDeletedCheck(MemberStatusCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberStatusCode : PK, NotNull, CHAR(3), classification=MemberStatus. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberStatus> selectByPK(CDef.MemberStatus memberStatusCode) {
        return facadeSelectByPK(memberStatusCode);
    }

    protected OptionalEntity<MemberStatus> facadeSelectByPK(CDef.MemberStatus memberStatusCode) {
        return doSelectOptionalByPK(memberStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberStatus> ENTITY doSelectByPK(CDef.MemberStatus memberStatusCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberStatusCode), tp);
    }

    protected <ENTITY extends MemberStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.MemberStatus memberStatusCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberStatusCode, tp), memberStatusCode);
    }

    protected MemberStatusCB xprepareCBAsPK(CDef.MemberStatus memberStatusCode) {
        assertObjectNotNull("memberStatusCode", memberStatusCode);
        return newConditionBean().acceptPK(memberStatusCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder : UQ, NotNull, NUMBER(8). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberStatus> selectByUniqueOfDisplayOrder(Integer displayOrder) {
        return facadeSelectByUniqueOfDisplayOrder(displayOrder);
    }

    protected OptionalEntity<MemberStatus> facadeSelectByUniqueOfDisplayOrder(Integer displayOrder) {
        return doSelectByUniqueOfDisplayOrder(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberStatus> OptionalEntity<ENTITY> doSelectByUniqueOfDisplayOrder(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfDisplayOrder(displayOrder), tp), displayOrder);
    }

    protected MemberStatusCB xprepareCBAsUniqueOfDisplayOrder(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOfDisplayOrder(displayOrder);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberStatus> selectByUniqueOfMemberStatusName(String memberStatusName) {
        return facadeSelectByUniqueOfMemberStatusName(memberStatusName);
    }

    protected OptionalEntity<MemberStatus> facadeSelectByUniqueOfMemberStatusName(String memberStatusName) {
        return doSelectByUniqueOfMemberStatusName(memberStatusName, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberStatus> OptionalEntity<ENTITY> doSelectByUniqueOfMemberStatusName(String memberStatusName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOfMemberStatusName(memberStatusName), tp), memberStatusName);
    }

    protected MemberStatusCB xprepareCBAsUniqueOfMemberStatusName(String memberStatusName) {
        assertObjectNotNull("memberStatusName", memberStatusName);
        return newConditionBean().acceptUniqueOfMemberStatusName(memberStatusName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MemberStatus&gt; <span style="color: #553000">memberStatusList</span> = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (MemberStatus <span style="color: #553000">memberStatus</span> : <span style="color: #553000">memberStatusList</span>) {
     *     ... = <span style="color: #553000">memberStatus</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberStatus> selectList(CBCall<MemberStatusCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MemberStatus&gt; <span style="color: #553000">memberStatusList</span> = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberStatus> selectList(MemberStatusCB cb) {
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
     * PagingResultBean&lt;MemberStatus&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">page</span>) {
     *     ... = memberStatus.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberStatus> selectPage(CBCall<MemberStatusCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberStatus&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">page</span>) {
     *     ... = memberStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberStatus> selectPage(MemberStatusCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @param entityLambda The handler of entity row of MemberStatus. (NotNull)
     */
    public void selectCursor(CBCall<MemberStatusCB> cbLambda, EntityRowHandler<MemberStatus> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().set...
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberStatus. (NotNull)
     */
    public void selectCursor(MemberStatusCB cb, EntityRowHandler<MemberStatus> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MemberStatusCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
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
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MemberStatus> memberStatusList, ReferrerLoaderHandler<LoaderOfMemberStatus> loaderLambda) {
        xassLRArg(memberStatusList, loaderLambda);
        loaderLambda.handle(new LoaderOfMemberStatus().ready(memberStatusList, _behaviorSelector));
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
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MemberStatus memberStatus, ReferrerLoaderHandler<LoaderOfMemberStatus> loaderLambda) {
        xassLRArg(memberStatus, loaderLambda);
        loaderLambda.handle(new LoaderOfMemberStatus().ready(xnewLRAryLs(memberStatus), _behaviorSelector));
    }

    /**
     * Load referrer of memberList by the set-upper of referrer. <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMember</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Member> loadMember(List<MemberStatus> memberStatusList, ConditionBeanSetupper<MemberCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadMember(memberStatusList, new LoadReferrerOption<MemberCB, Member>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberList by the set-upper of referrer. <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMember</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Member> loadMember(MemberStatus memberStatus, ConditionBeanSetupper<MemberCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadMember(xnewLRLs(memberStatus), new LoadReferrerOption<MemberCB, Member>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Member> loadMember(MemberStatus memberStatus, LoadReferrerOption<MemberCB, Member> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadMember(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<Member> loadMember(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberCB, Member> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<Member>)EMPTY_NREF_LGWAY; }
        return doLoadMember(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<Member> doLoadMember(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberCB, Member> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "memberList");
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberLogin> loadMemberLogin(List<MemberStatus> memberStatusList, ConditionBeanSetupper<MemberLoginCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadMemberLogin(memberStatusList, new LoadReferrerOption<MemberLoginCB, MemberLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberLogin> loadMemberLogin(MemberStatus memberStatus, ConditionBeanSetupper<MemberLoginCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadMemberLogin(xnewLRLs(memberStatus), new LoadReferrerOption<MemberLoginCB, MemberLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberLogin> loadMemberLogin(MemberStatus memberStatus, LoadReferrerOption<MemberLoginCB, MemberLogin> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadMemberLogin(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MemberLogin> loadMemberLogin(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberLoginCB, MemberLogin> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<MemberLogin>)EMPTY_NREF_LGWAY; }
        return doLoadMemberLogin(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MemberLogin> doLoadMemberLogin(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberLoginCB, MemberLogin> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "memberLoginList");
    }

    /**
     * Load referrer of memberVendorSynonymList by the set-upper of referrer. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMemberVendorSynonym</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">synonymCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">synonymCB</span>.setupSelect...
     *     <span style="color: #553000">synonymCB</span>.query().set...
     *     <span style="color: #553000">synonymCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberVendorSynonymList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberVendorSynonym> loadMemberVendorSynonym(List<MemberStatus> memberStatusList, ConditionBeanSetupper<MemberVendorSynonymCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadMemberVendorSynonym(memberStatusList, new LoadReferrerOption<MemberVendorSynonymCB, MemberVendorSynonym>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberVendorSynonymList by the set-upper of referrer. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadMemberVendorSynonym</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">synonymCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">synonymCB</span>.setupSelect...
     *     <span style="color: #553000">synonymCB</span>.query().set...
     *     <span style="color: #553000">synonymCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getMemberVendorSynonymList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberVendorSynonym> loadMemberVendorSynonym(MemberStatus memberStatus, ConditionBeanSetupper<MemberVendorSynonymCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadMemberVendorSynonym(xnewLRLs(memberStatus), new LoadReferrerOption<MemberVendorSynonymCB, MemberVendorSynonym>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberVendorSynonym> loadMemberVendorSynonym(MemberStatus memberStatus, LoadReferrerOption<MemberVendorSynonymCB, MemberVendorSynonym> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadMemberVendorSynonym(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MemberVendorSynonym> loadMemberVendorSynonym(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberVendorSynonymCB, MemberVendorSynonym> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<MemberVendorSynonym>)EMPTY_NREF_LGWAY; }
        return doLoadMemberVendorSynonym(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MemberVendorSynonym> doLoadMemberVendorSynonym(List<MemberStatus> memberStatusList, LoadReferrerOption<MemberVendorSynonymCB, MemberVendorSynonym> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "memberVendorSynonymList");
    }

    /**
     * Load referrer of synonymMemberList by the set-upper of referrer. <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadSynonymMember</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getSynonymMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMember> loadSynonymMember(List<MemberStatus> memberStatusList, ConditionBeanSetupper<SynonymMemberCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadSynonymMember(memberStatusList, new LoadReferrerOption<SynonymMemberCB, SynonymMember>().xinit(refCBLambda));
    }

    /**
     * Load referrer of synonymMemberList by the set-upper of referrer. <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadSynonymMember</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getSynonymMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMember> loadSynonymMember(MemberStatus memberStatus, ConditionBeanSetupper<SynonymMemberCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadSynonymMember(xnewLRLs(memberStatus), new LoadReferrerOption<SynonymMemberCB, SynonymMember>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMember> loadSynonymMember(MemberStatus memberStatus, LoadReferrerOption<SynonymMemberCB, SynonymMember> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadSynonymMember(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<SynonymMember> loadSynonymMember(List<MemberStatus> memberStatusList, LoadReferrerOption<SynonymMemberCB, SynonymMember> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<SynonymMember>)EMPTY_NREF_LGWAY; }
        return doLoadSynonymMember(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<SynonymMember> doLoadSynonymMember(List<MemberStatus> memberStatusList, LoadReferrerOption<SynonymMemberCB, SynonymMember> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "synonymMemberList");
    }

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadSynonymMemberLogin</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getSynonymMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLogin(List<MemberStatus> memberStatusList, ConditionBeanSetupper<SynonymMemberLoginCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadSynonymMemberLogin(memberStatusList, new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadSynonymMemberLogin</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getSynonymMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLogin(MemberStatus memberStatus, ConditionBeanSetupper<SynonymMemberLoginCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadSynonymMemberLogin(xnewLRLs(memberStatus), new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLogin(MemberStatus memberStatus, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadSynonymMemberLogin(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLogin(List<MemberStatus> memberStatusList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<SynonymMemberLogin>)EMPTY_NREF_LGWAY; }
        return doLoadSynonymMemberLogin(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<SynonymMemberLogin> doLoadSynonymMemberLogin(List<MemberStatus> memberStatusList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "synonymMemberLoginList");
    }

    /**
     * Load referrer of vendorSynonymMemberList by the set-upper of referrer. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadVendorSynonymMember</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getVendorSynonymMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorSynonymMember> loadVendorSynonymMember(List<MemberStatus> memberStatusList, ConditionBeanSetupper<VendorSynonymMemberCB> refCBLambda) {
        xassLRArg(memberStatusList, refCBLambda);
        return doLoadVendorSynonymMember(memberStatusList, new LoadReferrerOption<VendorSynonymMemberCB, VendorSynonymMember>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendorSynonymMemberList by the set-upper of referrer. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">loadVendorSynonymMember</span>(<span style="color: #553000">memberStatus</span>, <span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberCB</span>.setupSelect...
     *     <span style="color: #553000">memberCB</span>.query().set...
     *     <span style="color: #553000">memberCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">memberStatus</span>.<span style="color: #CC4747">getVendorSynonymMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorSynonymMember> loadVendorSynonymMember(MemberStatus memberStatus, ConditionBeanSetupper<VendorSynonymMemberCB> refCBLambda) {
        xassLRArg(memberStatus, refCBLambda);
        return doLoadVendorSynonymMember(xnewLRLs(memberStatus), new LoadReferrerOption<VendorSynonymMemberCB, VendorSynonymMember>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorSynonymMember> loadVendorSynonymMember(MemberStatus memberStatus, LoadReferrerOption<VendorSynonymMemberCB, VendorSynonymMember> loadReferrerOption) {
        xassLRArg(memberStatus, loadReferrerOption);
        return loadVendorSynonymMember(xnewLRLs(memberStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorSynonymMember> loadVendorSynonymMember(List<MemberStatus> memberStatusList, LoadReferrerOption<VendorSynonymMemberCB, VendorSynonymMember> loadReferrerOption) {
        xassLRArg(memberStatusList, loadReferrerOption);
        if (memberStatusList.isEmpty()) { return (NestedReferrerListGateway<VendorSynonymMember>)EMPTY_NREF_LGWAY; }
        return doLoadVendorSynonymMember(memberStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorSynonymMember> doLoadVendorSynonymMember(List<MemberStatus> memberStatusList, LoadReferrerOption<VendorSynonymMemberCB, VendorSynonymMember> option) {
        return helpLoadReferrerInternally(memberStatusList, option, "vendorSynonymMemberList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberStatusCode.
     * @param memberStatusList The list of memberStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberStatusCodeList(List<MemberStatus> memberStatusList)
    { return helpExtractListInternally(memberStatusList, "memberStatusCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param memberStatusList The list of memberStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<MemberStatus> memberStatusList)
    { return helpExtractListInternally(memberStatusList, "displayOrder"); }

    /**
     * Extract the value list of (single) unique key memberStatusName.
     * @param memberStatusList The list of memberStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberStatusNameList(List<MemberStatus> memberStatusList)
    { return helpExtractListInternally(memberStatusList, "memberStatusName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberStatus.setFoo...(value);
     * memberStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">insert</span>(memberStatus);
     * ... = memberStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MemberStatus memberStatus) {
        doInsert(memberStatus, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">update</span>(memberStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MemberStatus memberStatus) {
        doUpdate(memberStatus, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MemberStatus memberStatus) {
        doInsertOrUpdate(memberStatus, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">delete</span>(memberStatus);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MemberStatus memberStatus) {
        doDelete(memberStatus, null);
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
     *     MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     *     memberStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         memberStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberStatusList.add(memberStatus);
     * }
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">batchInsert</span>(memberStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MemberStatus> memberStatusList) {
        return doBatchInsert(memberStatusList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     *     memberStatus.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         memberStatus.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         memberStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberStatusList.add(memberStatus);
     * }
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">batchUpdate</span>(memberStatusList);
     * </pre>
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<MemberStatus> memberStatusList) {
        return doBatchUpdate(memberStatusList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<MemberStatus> memberStatusList) {
        return doBatchDelete(memberStatusList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberStatus, MemberStatusCB&gt;() {
     *     public ConditionBean setup(MemberStatus entity, MemberStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MemberStatus, MemberStatusCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">queryUpdate</span>(memberStatus, cb);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberStatus memberStatus, CBCall<MemberStatusCB> cbLambda) {
        return doQueryUpdate(memberStatus, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">queryUpdate</span>(memberStatus, cb);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberStatus memberStatus, MemberStatusCB cb) {
        return doQueryUpdate(memberStatus, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(memberStatus, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MemberStatusCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">queryDelete</span>(memberStatus, cb);
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberStatusCB cb) {
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
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberStatus.setFoo...(value);
     * memberStatus.setBar...(value);
     * InsertOption&lt;MemberStatusCB&gt; option = new InsertOption&lt;MemberStatusCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">varyingInsert</span>(memberStatus, option);
     * ... = memberStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MemberStatus memberStatus, WritableOptionCall<MemberStatusCB, InsertOption<MemberStatusCB>> opLambda) {
        doInsert(memberStatus, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberStatus.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberStatusCB&gt; option = new UpdateOption&lt;MemberStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberStatusCB&gt;() {
     *         public void specify(MemberStatusCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(memberStatus, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MemberStatus memberStatus, WritableOptionCall<MemberStatusCB, UpdateOption<MemberStatusCB>> opLambda) {
        doUpdate(memberStatus, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberStatus The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MemberStatus memberStatus, WritableOptionCall<MemberStatusCB, InsertOption<MemberStatusCB>> insertOpLambda, WritableOptionCall<MemberStatusCB, UpdateOption<MemberStatusCB>> updateOpLambda) {
        doInsertOrUpdate(memberStatus, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param memberStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MemberStatus memberStatus, WritableOptionCall<MemberStatusCB, DeleteOption<MemberStatusCB>> opLambda) {
        doDelete(memberStatus, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MemberStatus> memberStatusList, WritableOptionCall<MemberStatusCB, InsertOption<MemberStatusCB>> opLambda) {
        return doBatchInsert(memberStatusList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MemberStatus> memberStatusList, WritableOptionCall<MemberStatusCB, UpdateOption<MemberStatusCB>> opLambda) {
        return doBatchUpdate(memberStatusList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MemberStatus> memberStatusList, WritableOptionCall<MemberStatusCB, DeleteOption<MemberStatusCB>> opLambda) {
        return doBatchDelete(memberStatusList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MemberStatus, MemberStatusCB> manyArgLambda, WritableOptionCall<MemberStatusCB, InsertOption<MemberStatusCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberStatusCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;MemberStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberStatusCB&gt;() {
     *     public void specify(MemberStatusCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(memberStatus, cb, option);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberStatus memberStatus, CBCall<MemberStatusCB> cbLambda, WritableOptionCall<MemberStatusCB, UpdateOption<MemberStatusCB>> opLambda) {
        return doQueryUpdate(memberStatus, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberStatus memberStatus = <span style="color: #70226C">new</span> MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = <span style="color: #70226C">new</span> MemberStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberStatusCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;MemberStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberStatusCB&gt;() {
     *     public void specify(MemberStatusCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(memberStatus, cb, option);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberStatus memberStatus, MemberStatusCB cb, WritableOptionCall<MemberStatusCB, UpdateOption<MemberStatusCB>> opLambda) {
        return doQueryUpdate(memberStatus, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of MemberStatus. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MemberStatusCB> cbLambda, WritableOptionCall<MemberStatusCB, DeleteOption<MemberStatusCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberStatusCB cb, WritableOptionCall<MemberStatusCB, DeleteOption<MemberStatusCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * memberStatusBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * memberStatusBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberStatusBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * memberStatusBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberStatusBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * memberStatusBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * memberStatusBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * memberStatusBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * memberStatusBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * memberStatusBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * memberStatusBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * memberStatusBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * memberStatusBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * memberStatusBhv.outideSql().removeBlockComment().selectList()
     * memberStatusBhv.outideSql().removeLineComment().selectList()
     * memberStatusBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<MemberStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MemberStatus> typeOfSelectedEntity() { return MemberStatus.class; }
    protected Class<MemberStatus> typeOfHandlingEntity() { return MemberStatus.class; }
    protected Class<MemberStatusCB> typeOfHandlingConditionBean() { return MemberStatusCB.class; }
}