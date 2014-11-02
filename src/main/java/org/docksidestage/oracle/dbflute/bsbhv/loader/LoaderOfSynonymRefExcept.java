package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The referrer loader of SYNONYM_REF_EXCEPT as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     REF_EXCEPT_ID
 *
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     SYNONYM_EXCEPT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     synonymExcept
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymRefExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymRefExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymRefExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymRefExcept ready(List<SynonymRefExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymRefExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymRefExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfSynonymExcept _foreignSynonymExceptLoader;
    public LoaderOfSynonymExcept pulloutSynonymExcept() {
        if (_foreignSynonymExceptLoader == null)
        { _foreignSynonymExceptLoader = new LoaderOfSynonymExcept().ready(myBhv().pulloutSynonymExcept(_selectedList), _selector); }
        return _foreignSynonymExceptLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymRefExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
