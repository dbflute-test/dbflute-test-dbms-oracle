package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br>
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
public class LoaderOfNextSchemaProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextSchemaProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected NextSchemaProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextSchemaProductStatus ready(List<NextSchemaProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextSchemaProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextSchemaProductStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteRefNextTarget> _referrerWhiteRefNextTarget;

    /**
     * Load referrer of whiteRefNextTargetList by the set-upper of referrer. <br>
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">nextSchemaProductStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadWhiteRefNextTarget</span>(<span style="color: #553000">targetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">targetCB</span>.setupSelect...
     *         <span style="color: #553000">targetCB</span>.query().set...
     *         <span style="color: #553000">targetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">targetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    targetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = nextSchemaProductStatus.<span style="color: #CC4747">getWhiteRefNextTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteRefNextTarget> loadWhiteRefNextTarget(ConditionBeanSetupper<WhiteRefNextTargetCB> refCBLambda) {
        myBhv().loadWhiteRefNextTarget(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteRefNextTarget = refLs);
        return hd -> hd.handle(new LoaderOfWhiteRefNextTarget().ready(_referrerWhiteRefNextTarget, _selector));
    }

    protected List<NextSchemaProduct> _referrerNextSchemaProduct;

    /**
     * Load referrer of nextSchemaProductList by the set-upper of referrer. <br>
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">nextSchemaProductStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadNextSchemaProduct</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (NextSchemaProductStatus nextSchemaProductStatus : <span style="color: #553000">nextSchemaProductStatusList</span>) {
     *     ... = nextSchemaProductStatus.<span style="color: #CC4747">getNextSchemaProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfNextSchemaProduct> loadNextSchemaProduct(ConditionBeanSetupper<NextSchemaProductCB> refCBLambda) {
        myBhv().loadNextSchemaProduct(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerNextSchemaProduct = refLs);
        return hd -> hd.handle(new LoaderOfNextSchemaProduct().ready(_referrerNextSchemaProduct, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextSchemaProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
