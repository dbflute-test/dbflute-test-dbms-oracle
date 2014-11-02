package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR_LARGE_NAME_901234567890 as TABLE. <br>
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
public class LoaderOfVendorLargeName901234567890 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeName901234567890> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeName901234567890Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeName901234567890 ready(List<VendorLargeName901234567890> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeName901234567890Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeName901234567890Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeName90123456Ref> _referrerVendorLargeName90123456Ref;

    /**
     * Load referrer of vendorLargeName90123456RefList by the set-upper of referrer. <br>
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeName901234567890Bhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorLargeName901234567890List</span>, <span style="color: #553000">entityLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityLoader</span>.<span style="color: #CC4747">loadVendorLargeName90123456Ref</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : <span style="color: #553000">vendorLargeName901234567890List</span>) {
     *     ... = vendorLargeName901234567890.<span style="color: #CC4747">getVendorLargeName90123456RefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeName90123456Ref> loadVendorLargeName90123456Ref(ConditionBeanSetupper<VendorLargeName90123456RefCB> refCBLambda) {
        myBhv().loadVendorLargeName90123456Ref(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorLargeName90123456Ref = refLs);
        return hd -> hd.handle(new LoaderOfVendorLargeName90123456Ref().ready(_referrerVendorLargeName90123456Ref, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeName901234567890> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
