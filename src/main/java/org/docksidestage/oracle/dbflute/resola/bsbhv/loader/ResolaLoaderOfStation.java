package org.docksidestage.oracle.dbflute.resola.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.oracle.dbflute.resola.exbhv.*;
import org.docksidestage.oracle.dbflute.resola.exentity.*;

/**
 * The referrer loader of STATION as TABLE. <br>
 * <pre>
 * [primary key]
 *     STATION_ID
 *
 * [column]
 *     STATION_ID, STATION_NAME, BIRTHDATE, FORMALIZED_DATETIME, HOME_COUNT, WORKING_KILOMETER
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
 * @author DBFlute(AutoGenerator)
 */
public class ResolaLoaderOfStation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ResolaStation> _selectedList;
    protected BehaviorSelector _selector;
    protected ResolaStationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ResolaLoaderOfStation ready(List<ResolaStation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ResolaStationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ResolaStationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ResolaStation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
