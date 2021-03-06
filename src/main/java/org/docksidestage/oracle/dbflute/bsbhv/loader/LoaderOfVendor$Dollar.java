package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The referrer loader of VENDOR_$_DOLLAR as TABLE. <br>
 * <pre>
 * [primary key]
 *     VENDOR_$_DOLLAR_ID
 *
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
public class LoaderOfVendor$Dollar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Vendor$Dollar> _selectedList;
    protected BehaviorSelector _selector;
    protected Vendor$DollarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendor$Dollar ready(List<Vendor$Dollar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected Vendor$DollarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(Vendor$DollarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Vendor$Dollar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
