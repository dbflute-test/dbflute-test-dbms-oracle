package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of SYNONYM_EXCEPT as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     SYNONYM_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymRefExceptList
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymExcept ready(List<SynonymExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SynonymRefExcept> _referrerSynonymRefExcept;

    /**
     * Load referrer of synonymRefExceptList by the set-upper of referrer. <br>
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * <pre>
     * <span style="color: #0000C0">synonymExceptBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">synonymExceptList</span>, <span style="color: #553000">exceptLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">exceptLoader</span>.<span style="color: #CC4747">loadSynonymRefExcept</span>(<span style="color: #553000">exceptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">exceptCB</span>.setupSelect...
     *         <span style="color: #553000">exceptCB</span>.query().set...
     *         <span style="color: #553000">exceptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">exceptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    exceptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SynonymExcept synonymExcept : <span style="color: #553000">synonymExceptList</span>) {
     *     ... = synonymExcept.<span style="color: #CC4747">getSynonymRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSynonymRefExcept> loadSynonymRefExcept(ConditionBeanSetupper<SynonymRefExceptCB> refCBLambda) {
        myBhv().loadSynonymRefExcept(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSynonymRefExcept = refLs);
        return hd -> hd.handle(new LoaderOfSynonymRefExcept().ready(_referrerSynonymRefExcept, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
