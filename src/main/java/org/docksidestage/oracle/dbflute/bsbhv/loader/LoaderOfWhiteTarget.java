package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_TARGET as TABLE. <br>
 * <pre>
 * [primary key]
 *     TARGET_ID
 *
 * [column]
 *     TARGET_ID, TARGET_NAME
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
 *     WHITE_REF_TARGET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefTargetList
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteTarget {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteTarget> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteTargetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteTarget ready(List<WhiteTarget> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteTargetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteTargetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteRefTarget> _referrerWhiteRefTarget;

    /**
     * Load referrer of whiteRefTargetList by the set-upper of referrer. <br>
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * <pre>
     * <span style="color: #0000C0">whiteTargetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteTargetList</span>, <span style="color: #553000">targetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">targetLoader</span>.<span style="color: #CC4747">loadWhiteRefTarget</span>(<span style="color: #553000">targetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">targetCB</span>.setupSelect...
     *         <span style="color: #553000">targetCB</span>.query().set...
     *         <span style="color: #553000">targetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">targetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    targetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteTarget whiteTarget : <span style="color: #553000">whiteTargetList</span>) {
     *     ... = whiteTarget.<span style="color: #CC4747">getWhiteRefTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTargetId_InScope(pkList);
     * cb.query().addOrderBy_TargetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteRefTarget> loadWhiteRefTarget(ConditionBeanSetupper<WhiteRefTargetCB> refCBLambda) {
        myBhv().loadWhiteRefTarget(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteRefTarget = refLs);
        return hd -> hd.handle(new LoaderOfWhiteRefTarget().ready(_referrerWhiteRefTarget, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteTarget> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
