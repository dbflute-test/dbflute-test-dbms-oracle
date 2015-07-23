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
 * The behavior of VENDOR_LARGE_NAME_901234567890 as TABLE. <br>
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_901234567_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_901234567_ID, VENDOR_LARGE_NAME_9012345_NAME
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
 *     VENDOR_LARGE_NAME_90123456_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeName90123456RefList
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName901234567890Bhv extends AbstractBehaviorWritable<VendorLargeName901234567890, VendorLargeName901234567890CB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public VendorLargeName901234567890Dbm asDBMeta() { return VendorLargeName901234567890Dbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "VENDOR_LARGE_NAME_901234567890"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeName901234567890CB newConditionBean() { return new VendorLargeName901234567890CB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeName901234567890CB cb) {
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
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">vendorLargeName901234567890</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">vendorLargeName901234567890</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">vendorLargeName901234567890</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">vendorLargeName901234567890</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeName901234567890> selectEntity(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(vendorLargeName901234567890 <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = vendorLargeName901234567890.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(vendorLargeName901234567890 <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = vendorLargeName901234567890.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeName901234567890> selectEntity(VendorLargeName901234567890CB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<VendorLargeName901234567890> facadeSelectEntity(VendorLargeName901234567890CB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName901234567890> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeName901234567890CB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeName901234567890 <span style="color: #553000">vendorLargeName901234567890</span> = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">vendorLargeName901234567890</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntityWithDeletedCheck(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().set...;
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeName901234567890.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntityWithDeletedCheck(VendorLargeName901234567890CB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorLargeName901234567Id : PK, NotNull, NUMBER(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeName901234567890> selectByPK(Long vendorLargeName901234567Id) {
        return facadeSelectByPK(vendorLargeName901234567Id);
    }

    protected OptionalEntity<VendorLargeName901234567890> facadeSelectByPK(Long vendorLargeName901234567Id) {
        return doSelectOptionalByPK(vendorLargeName901234567Id, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectByPK(Long vendorLargeName901234567Id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendorLargeName901234567Id), tp);
    }

    protected <ENTITY extends VendorLargeName901234567890> OptionalEntity<ENTITY> doSelectOptionalByPK(Long vendorLargeName901234567Id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendorLargeName901234567Id, tp), vendorLargeName901234567Id);
    }

    protected VendorLargeName901234567890CB xprepareCBAsPK(Long vendorLargeName901234567Id) {
        assertObjectNotNull("vendorLargeName901234567Id", vendorLargeName901234567Id);
        return newConditionBean().acceptPK(vendorLargeName901234567Id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;VendorLargeName901234567890&gt; <span style="color: #553000">vendorLargeName901234567890List</span> = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (VendorLargeName901234567890 <span style="color: #553000">vendorLargeName901234567890</span> : <span style="color: #553000">vendorLargeName901234567890List</span>) {
     *     ... = <span style="color: #553000">vendorLargeName901234567890</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName901234567890> selectList(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;VendorLargeName901234567890&gt; <span style="color: #553000">vendorLargeName901234567890List</span> = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (VendorLargeName901234567890 vendorLargeName901234567890 : <span style="color: #553000">vendorLargeName901234567890List</span>) {
     *     ... = vendorLargeName901234567890.get...;
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName901234567890> selectList(VendorLargeName901234567890CB cb) {
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
     * PagingResultBean&lt;VendorLargeName901234567890&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorLargeName901234567890 vendorLargeName901234567890 : <span style="color: #553000">page</span>) {
     *     ... = vendorLargeName901234567890.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName901234567890> selectPage(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeName901234567890&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorLargeName901234567890 vendorLargeName901234567890 : <span style="color: #553000">page</span>) {
     *     ... = vendorLargeName901234567890.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName901234567890> selectPage(VendorLargeName901234567890CB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @param entityLambda The handler of entity row of VendorLargeName901234567890. (NotNull)
     */
    public void selectCursor(CBCall<VendorLargeName901234567890CB> cbLambda, EntityRowHandler<VendorLargeName901234567890> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().set...
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeName901234567890. (NotNull)
     */
    public void selectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<VendorLargeName901234567890> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeName901234567890CB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeName901234567890> vendorLargeName901234567890List, ReferrerLoaderHandler<LoaderOfVendorLargeName901234567890> loaderLambda) {
        xassLRArg(vendorLargeName901234567890List, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorLargeName901234567890().ready(vendorLargeName901234567890List, _behaviorSelector));
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
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeName901234567890 vendorLargeName901234567890, ReferrerLoaderHandler<LoaderOfVendorLargeName901234567890> loaderLambda) {
        xassLRArg(vendorLargeName901234567890, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorLargeName901234567890().ready(xnewLRAryLs(vendorLargeName901234567890), _behaviorSelector));
    }

    /**
     * Load referrer of vendorLargeName90123456RefList by the set-upper of referrer. <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">loadVendorLargeName90123456Ref</span>(<span style="color: #553000">vendorLargeName901234567890List</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (VendorLargeName901234567890 vendorLargeName901234567890 : <span style="color: #553000">vendorLargeName901234567890List</span>) {
     *     ... = vendorLargeName901234567890.<span style="color: #CC4747">getVendorLargeName90123456RefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456Ref(List<VendorLargeName901234567890> vendorLargeName901234567890List, ConditionBeanSetupper<VendorLargeName90123456RefCB> refCBLambda) {
        xassLRArg(vendorLargeName901234567890List, refCBLambda);
        return doLoadVendorLargeName90123456Ref(vendorLargeName901234567890List, new LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendorLargeName90123456RefList by the set-upper of referrer. <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">loadVendorLargeName90123456Ref</span>(<span style="color: #553000">vendorLargeName901234567890</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">vendorLargeName901234567890</span>.<span style="color: #CC4747">getVendorLargeName90123456RefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456Ref(VendorLargeName901234567890 vendorLargeName901234567890, ConditionBeanSetupper<VendorLargeName90123456RefCB> refCBLambda) {
        xassLRArg(vendorLargeName901234567890, refCBLambda);
        return doLoadVendorLargeName90123456Ref(xnewLRLs(vendorLargeName901234567890), new LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456Ref(VendorLargeName901234567890 vendorLargeName901234567890, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890, loadReferrerOption);
        return loadVendorLargeName90123456Ref(xnewLRLs(vendorLargeName901234567890), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456Ref(List<VendorLargeName901234567890> vendorLargeName901234567890List, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890List, loadReferrerOption);
        if (vendorLargeName901234567890List.isEmpty()) { return (NestedReferrerListGateway<VendorLargeName90123456Ref>)EMPTY_NREF_LGWAY; }
        return doLoadVendorLargeName90123456Ref(vendorLargeName901234567890List, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorLargeName90123456Ref> doLoadVendorLargeName90123456Ref(List<VendorLargeName901234567890> vendorLargeName901234567890List, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> option) {
        return helpLoadReferrerInternally(vendorLargeName901234567890List, option, "vendorLargeName90123456RefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorLargeName901234567Id.
     * @param vendorLargeName901234567890List The list of vendorLargeName901234567890. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorLargeName901234567IdList(List<VendorLargeName901234567890> vendorLargeName901234567890List)
    { return helpExtractListInternally(vendorLargeName901234567890List, "vendorLargeName901234567Id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">insert</span>(vendorLargeName901234567890);
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeName901234567890 The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInsert(vendorLargeName901234567890, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">update</span>(vendorLargeName901234567890);
     * </pre>
     * @param vendorLargeName901234567890 The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeName901234567890 vendorLargeName901234567890) {
        doUpdate(vendorLargeName901234567890, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param vendorLargeName901234567890 The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInsertOrUpdate(vendorLargeName901234567890, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">delete</span>(vendorLargeName901234567890);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeName901234567890 vendorLargeName901234567890) {
        doDelete(vendorLargeName901234567890, null);
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
     *     VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">batchInsert</span>(vendorLargeName901234567890List);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchInsert(vendorLargeName901234567890List, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         vendorLargeName901234567890.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeName901234567890.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">batchUpdate</span>(vendorLargeName901234567890List);
     * </pre>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchUpdate(vendorLargeName901234567890List, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchDelete(vendorLargeName901234567890List, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeName901234567890, VendorLargeName901234567890CB&gt;() {
     *     public ConditionBean setup(VendorLargeName901234567890 entity, VendorLargeName901234567890CB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorLargeName901234567890, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, CBCall<VendorLargeName901234567890CB> cbLambda) {
        return doQueryUpdate(vendorLargeName901234567890, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb) {
        return doQueryUpdate(vendorLargeName901234567890, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeName901234567890, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorLargeName901234567890CB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeName901234567890CB cb) {
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">varyingInsert</span>(vendorLargeName901234567890, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeName901234567890 The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeName901234567890 vendorLargeName901234567890, WritableOptionCall<VendorLargeName901234567890CB, InsertOption<VendorLargeName901234567890CB>> opLambda) {
        doInsert(vendorLargeName901234567890, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">varyingUpdate</span>(vendorLargeName901234567890, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeName901234567890 The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeName901234567890 vendorLargeName901234567890, WritableOptionCall<VendorLargeName901234567890CB, UpdateOption<VendorLargeName901234567890CB>> opLambda) {
        doUpdate(vendorLargeName901234567890, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeName901234567890 The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890, WritableOptionCall<VendorLargeName901234567890CB, InsertOption<VendorLargeName901234567890CB>> insertOpLambda, WritableOptionCall<VendorLargeName901234567890CB, UpdateOption<VendorLargeName901234567890CB>> updateOpLambda) {
        doInsertOrUpdate(vendorLargeName901234567890, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param vendorLargeName901234567890 The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeName901234567890 vendorLargeName901234567890, WritableOptionCall<VendorLargeName901234567890CB, DeleteOption<VendorLargeName901234567890CB>> opLambda) {
        doDelete(vendorLargeName901234567890, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List, WritableOptionCall<VendorLargeName901234567890CB, InsertOption<VendorLargeName901234567890CB>> opLambda) {
        return doBatchInsert(vendorLargeName901234567890List, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, WritableOptionCall<VendorLargeName901234567890CB, UpdateOption<VendorLargeName901234567890CB>> opLambda) {
        return doBatchUpdate(vendorLargeName901234567890List, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List, WritableOptionCall<VendorLargeName901234567890CB, DeleteOption<VendorLargeName901234567890CB>> opLambda) {
        return doBatchDelete(vendorLargeName901234567890List, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> manyArgLambda, WritableOptionCall<VendorLargeName901234567890CB, InsertOption<VendorLargeName901234567890CB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorLargeName901234567890, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, CBCall<VendorLargeName901234567890CB> cbLambda, WritableOptionCall<VendorLargeName901234567890CB, UpdateOption<VendorLargeName901234567890CB>> opLambda) {
        return doQueryUpdate(vendorLargeName901234567890, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorLargeName901234567890 vendorLargeName901234567890 = <span style="color: #70226C">new</span> VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = <span style="color: #70226C">new</span> VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorLargeName901234567890, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb, WritableOptionCall<VendorLargeName901234567890CB, UpdateOption<VendorLargeName901234567890CB>> opLambda) {
        return doQueryUpdate(vendorLargeName901234567890, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeName901234567890, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeName901234567890. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorLargeName901234567890CB> cbLambda, WritableOptionCall<VendorLargeName901234567890CB, DeleteOption<VendorLargeName901234567890CB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeName901234567890CB cb, WritableOptionCall<VendorLargeName901234567890CB, DeleteOption<VendorLargeName901234567890CB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorLargeName901234567890Bhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorLargeName901234567890Bhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorLargeName901234567890Bhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorLargeName901234567890Bhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorLargeName901234567890Bhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorLargeName901234567890Bhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorLargeName901234567890Bhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorLargeName901234567890Bhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorLargeName901234567890Bhv.outideSql().removeBlockComment().selectList()
     * vendorLargeName901234567890Bhv.outideSql().removeLineComment().selectList()
     * vendorLargeName901234567890Bhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<VendorLargeName901234567890Bhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorLargeName901234567890> typeOfSelectedEntity() { return VendorLargeName901234567890.class; }
    protected Class<VendorLargeName901234567890> typeOfHandlingEntity() { return VendorLargeName901234567890.class; }
    protected Class<VendorLargeName901234567890CB> typeOfHandlingConditionBean() { return VendorLargeName901234567890CB.class; }

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
