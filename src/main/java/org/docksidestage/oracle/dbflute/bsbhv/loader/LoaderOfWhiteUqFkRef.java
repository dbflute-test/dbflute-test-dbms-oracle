package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_UQ_FK_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     UQ_FK_REF_ID
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     WHITE_UQ_FK
 *
 * [referrer table]
 *     WHITE_UQ_FK_REF_NEST
 *
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 *
 * [referrer property]
 *     whiteUqFkRefNestList
 * </pre>
 * @author oracleman
 */
public class LoaderOfWhiteUqFkRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFkRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFkRef ready(List<WhiteUqFkRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRefNest> _referrerWhiteUqFkRefNest;

    /**
     * Load referrer of whiteUqFkRefNestList by the set-upper of referrer. <br>
     * WHITE_UQ_FK_REF_NEST by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * <pre>
     * <span style="color: #0000C0">whiteUqFkRefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteUqFkRefList</span>, <span style="color: #553000">refLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refLoader</span>.<span style="color: #CC4747">loadWhiteUqFkRefNest</span>(<span style="color: #553000">nestCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nestCB</span>.setupSelect...
     *         <span style="color: #553000">nestCB</span>.query().set...
     *         <span style="color: #553000">nestCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nestLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    nestLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteUqFkRef whiteUqFkRef : <span style="color: #553000">whiteUqFkRefList</span>) {
     *     ... = whiteUqFkRef.<span style="color: #CC4747">getWhiteUqFkRefNestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRefNest> loadWhiteUqFkRefNest(ConditionBeanSetupper<WhiteUqFkRefNestCB> refCBLambda) {
        myBhv().loadWhiteUqFkRefNest(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteUqFkRefNest = refLs);
        return hd -> hd.handle(new LoaderOfWhiteUqFkRefNest().ready(_referrerWhiteUqFkRefNest, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToPkIdLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToPkId() {
        if (_foreignWhiteUqFkByFkToPkIdLoader == null)
        { _foreignWhiteUqFkByFkToPkIdLoader = new LoaderOfWhiteUqFk().ready(myBhv().pulloutWhiteUqFkByFkToPkId(_selectedList), _selector); }
        return _foreignWhiteUqFkByFkToPkIdLoader;
    }

    protected LoaderOfWhiteUqFk _foreignWhiteUqFkByFkToUqCodeLoader;
    public LoaderOfWhiteUqFk pulloutWhiteUqFkByFkToUqCode() {
        if (_foreignWhiteUqFkByFkToUqCodeLoader == null)
        { _foreignWhiteUqFkByFkToUqCodeLoader = new LoaderOfWhiteUqFk().ready(myBhv().pulloutWhiteUqFkByFkToUqCode(_selectedList), _selector); }
        return _foreignWhiteUqFkByFkToUqCodeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFkRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
