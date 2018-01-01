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
 * The behavior of VENDOR_LARGE_DATA as TABLE. <br>
 * <pre>
 * [primary key]
 *     LARGE_DATA_ID
 *
 * [column]
 *     LARGE_DATA_ID, STRING_INDEX, STRING_NO_INDEX, STRING_UNIQUE_INDEX, INTFLG_INDEX, NUMERIC_INTEGER_INDEX, NUMERIC_INTEGER_NO_INDEX
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
 *     VENDOR_LARGE_DATA_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeDataBhv extends AbstractBehaviorWritable<VendorLargeData, VendorLargeDataCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public VendorLargeDataDbm asDBMeta() { return VendorLargeDataDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "VENDOR_LARGE_DATA"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeDataCB newConditionBean() { return new VendorLargeDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorLargeDataCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeDataCB cb) {
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
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">vendorLargeData</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">vendorLargeData</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">vendorLargeData</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">vendorLargeData</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeData> selectEntity(CBCall<VendorLargeDataCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().set...
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(vendorLargeData <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = vendorLargeData.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(vendorLargeData <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = vendorLargeData.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeData> selectEntity(VendorLargeDataCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<VendorLargeData> facadeSelectEntity(VendorLargeDataCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeDataCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeData <span style="color: #553000">vendorLargeData</span> = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">vendorLargeData</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntityWithDeletedCheck(CBCall<VendorLargeDataCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().set...;
     * VendorLargeData vendorLargeData = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntityWithDeletedCheck(VendorLargeDataCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param largeDataId : PK, NotNull, NUMBER(12). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeData> selectByPK(Long largeDataId) {
        return facadeSelectByPK(largeDataId);
    }

    protected OptionalEntity<VendorLargeData> facadeSelectByPK(Long largeDataId) {
        return doSelectOptionalByPK(largeDataId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectByPK(Long largeDataId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(largeDataId), tp);
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectOptionalByPK(Long largeDataId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(largeDataId, tp), largeDataId);
    }

    protected VendorLargeDataCB xprepareCBAsPK(Long largeDataId) {
        assertObjectNotNull("largeDataId", largeDataId);
        return newConditionBean().acceptPK(largeDataId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param stringUniqueIndex : UQ, NotNull, VARCHAR2(200). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeData> selectByUniqueOf(String stringUniqueIndex) {
        return facadeSelectByUniqueOf(stringUniqueIndex);
    }

    protected OptionalEntity<VendorLargeData> facadeSelectByUniqueOf(String stringUniqueIndex) {
        return doSelectByUniqueOf(stringUniqueIndex, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectByUniqueOf(String stringUniqueIndex, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(stringUniqueIndex), tp), stringUniqueIndex);
    }

    protected VendorLargeDataCB xprepareCBAsUniqueOf(String stringUniqueIndex) {
        assertObjectNotNull("stringUniqueIndex", stringUniqueIndex);
        return newConditionBean().acceptUniqueOf(stringUniqueIndex);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;VendorLargeData&gt; <span style="color: #553000">vendorLargeDataList</span> = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (VendorLargeData <span style="color: #553000">vendorLargeData</span> : <span style="color: #553000">vendorLargeDataList</span>) {
     *     ... = <span style="color: #553000">vendorLargeData</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeData> selectList(CBCall<VendorLargeDataCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;VendorLargeData&gt; <span style="color: #553000">vendorLargeDataList</span> = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (VendorLargeData vendorLargeData : <span style="color: #553000">vendorLargeDataList</span>) {
     *     ... = vendorLargeData.get...;
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeData> selectList(VendorLargeDataCB cb) {
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
     * PagingResultBean&lt;VendorLargeData&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorLargeData vendorLargeData : <span style="color: #553000">page</span>) {
     *     ... = vendorLargeData.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeData> selectPage(CBCall<VendorLargeDataCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeData&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorLargeData vendorLargeData : <span style="color: #553000">page</span>) {
     *     ... = vendorLargeData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeData> selectPage(VendorLargeDataCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @param entityLambda The handler of entity row of VendorLargeData. (NotNull)
     */
    public void selectCursor(CBCall<VendorLargeDataCB> cbLambda, EntityRowHandler<VendorLargeData> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().set...
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeData. (NotNull)
     */
    public void selectCursor(VendorLargeDataCB cb, EntityRowHandler<VendorLargeData> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeDataCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeData> vendorLargeDataList, ReferrerLoaderHandler<LoaderOfVendorLargeData> loaderLambda) {
        xassLRArg(vendorLargeDataList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorLargeData().ready(vendorLargeDataList, _behaviorSelector));
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
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeData vendorLargeData, ReferrerLoaderHandler<LoaderOfVendorLargeData> loaderLambda) {
        xassLRArg(vendorLargeData, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorLargeData().ready(xnewLRAryLs(vendorLargeData), _behaviorSelector));
    }

    /**
     * Load referrer of vendorLargeDataRefList by the set-upper of referrer. <br>
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">loadVendorLargeDataRef</span>(<span style="color: #553000">vendorLargeDataList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (VendorLargeData vendorLargeData : <span style="color: #553000">vendorLargeDataList</span>) {
     *     ... = vendorLargeData.<span style="color: #CC4747">getVendorLargeDataRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRef(List<VendorLargeData> vendorLargeDataList, ConditionBeanSetupper<VendorLargeDataRefCB> refCBLambda) {
        xassLRArg(vendorLargeDataList, refCBLambda);
        return doLoadVendorLargeDataRef(vendorLargeDataList, new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendorLargeDataRefList by the set-upper of referrer. <br>
     * VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">loadVendorLargeDataRef</span>(<span style="color: #553000">vendorLargeData</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">vendorLargeData</span>.<span style="color: #CC4747">getVendorLargeDataRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRef(VendorLargeData vendorLargeData, ConditionBeanSetupper<VendorLargeDataRefCB> refCBLambda) {
        xassLRArg(vendorLargeData, refCBLambda);
        return doLoadVendorLargeDataRef(xnewLRLs(vendorLargeData), new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRef(VendorLargeData vendorLargeData, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeData, loadReferrerOption);
        return loadVendorLargeDataRef(xnewLRLs(vendorLargeData), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRef(List<VendorLargeData> vendorLargeDataList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataList, loadReferrerOption);
        if (vendorLargeDataList.isEmpty()) { return (NestedReferrerListGateway<VendorLargeDataRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorLargeDataRef(vendorLargeDataList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorLargeDataRef> doLoadVendorLargeDataRef(List<VendorLargeData> vendorLargeDataList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> option) {
        return helpLoadReferrerInternally(vendorLargeDataList, option, "vendorLargeDataRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key largeDataId.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLargeDataIdList(List<VendorLargeData> vendorLargeDataList)
    { return helpExtractListInternally(vendorLargeDataList, "largeDataId"); }

    /**
     * Extract the value list of (single) unique key stringUniqueIndex.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractStringUniqueIndexList(List<VendorLargeData> vendorLargeDataList)
    { return helpExtractListInternally(vendorLargeDataList, "stringUniqueIndex"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">insert</span>(vendorLargeData);
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeData The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeData vendorLargeData) {
        doInsert(vendorLargeData, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">update</span>(vendorLargeData);
     * </pre>
     * @param vendorLargeData The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeData vendorLargeData) {
        doUpdate(vendorLargeData, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param vendorLargeData The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeData vendorLargeData) {
        doInsertOrUpdate(vendorLargeData, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">delete</span>(vendorLargeData);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeData The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeData vendorLargeData) {
        doDelete(vendorLargeData, null);
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
     *     VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorLargeData.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">batchInsert</span>(vendorLargeDataList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeData> vendorLargeDataList) {
        return doBatchInsert(vendorLargeDataList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorLargeData.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         vendorLargeData.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeData.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">batchUpdate</span>(vendorLargeDataList);
     * </pre>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeData> vendorLargeDataList) {
        return doBatchUpdate(vendorLargeDataList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeData> vendorLargeDataList) {
        return doBatchDelete(vendorLargeDataList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeData, VendorLargeDataCB&gt;() {
     *     public ConditionBean setup(VendorLargeData entity, VendorLargeDataCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorLargeData, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeData vendorLargeData, CBCall<VendorLargeDataCB> cbLambda) {
        return doQueryUpdate(vendorLargeData, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorLargeData, cb);
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb) {
        return doQueryUpdate(vendorLargeData, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeData, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorLargeDataCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeData, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeDataCB cb) {
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
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">varyingInsert</span>(vendorLargeData, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeData The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeData vendorLargeData, WritableOptionCall<VendorLargeDataCB, InsertOption<VendorLargeDataCB>> opLambda) {
        doInsert(vendorLargeData, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(vendorLargeData, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeData The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeData vendorLargeData, WritableOptionCall<VendorLargeDataCB, UpdateOption<VendorLargeDataCB>> opLambda) {
        doUpdate(vendorLargeData, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeData The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeData vendorLargeData, WritableOptionCall<VendorLargeDataCB, InsertOption<VendorLargeDataCB>> insertOpLambda, WritableOptionCall<VendorLargeDataCB, UpdateOption<VendorLargeDataCB>> updateOpLambda) {
        doInsertOrUpdate(vendorLargeData, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param vendorLargeData The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeData vendorLargeData, WritableOptionCall<VendorLargeDataCB, DeleteOption<VendorLargeDataCB>> opLambda) {
        doDelete(vendorLargeData, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeData> vendorLargeDataList, WritableOptionCall<VendorLargeDataCB, InsertOption<VendorLargeDataCB>> opLambda) {
        return doBatchInsert(vendorLargeDataList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeData> vendorLargeDataList, WritableOptionCall<VendorLargeDataCB, UpdateOption<VendorLargeDataCB>> opLambda) {
        return doBatchUpdate(vendorLargeDataList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeData> vendorLargeDataList, WritableOptionCall<VendorLargeDataCB, DeleteOption<VendorLargeDataCB>> opLambda) {
        return doBatchDelete(vendorLargeDataList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> manyArgLambda, WritableOptionCall<VendorLargeDataCB, InsertOption<VendorLargeDataCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorLargeData, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeData vendorLargeData, CBCall<VendorLargeDataCB> cbLambda, WritableOptionCall<VendorLargeDataCB, UpdateOption<VendorLargeDataCB>> opLambda) {
        return doQueryUpdate(vendorLargeData, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorLargeData vendorLargeData = <span style="color: #70226C">new</span> VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = <span style="color: #70226C">new</span> VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorLargeData, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb, WritableOptionCall<VendorLargeDataCB, UpdateOption<VendorLargeDataCB>> opLambda) {
        return doQueryUpdate(vendorLargeData, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorLargeData, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorLargeData. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorLargeDataCB> cbLambda, WritableOptionCall<VendorLargeDataCB, DeleteOption<VendorLargeDataCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeDataCB cb, WritableOptionCall<VendorLargeDataCB, DeleteOption<VendorLargeDataCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * vendorLargeDataBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * vendorLargeDataBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorLargeDataBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorLargeDataBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorLargeDataBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorLargeDataBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorLargeDataBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * vendorLargeDataBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorLargeDataBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorLargeDataBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorLargeDataBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorLargeDataBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorLargeDataBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * vendorLargeDataBhv.outideSql().removeBlockComment().selectList()
     * vendorLargeDataBhv.outideSql().removeLineComment().selectList()
     * vendorLargeDataBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<VendorLargeDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorLargeData> typeOfSelectedEntity() { return VendorLargeData.class; }
    protected Class<VendorLargeData> typeOfHandlingEntity() { return VendorLargeData.class; }
    protected Class<VendorLargeDataCB> typeOfHandlingConditionBean() { return VendorLargeDataCB.class; }

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
