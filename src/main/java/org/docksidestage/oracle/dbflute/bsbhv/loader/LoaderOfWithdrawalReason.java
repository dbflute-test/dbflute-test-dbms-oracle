package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of WITHDRAWAL_REASON as TABLE. <br>
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL, SYNONYM_MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList, synonymMemberWithdrawalList
 * </pre>
 * @author oracleman
 */
public class LoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected WithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWithdrawalReason ready(List<WithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberWithdrawal> _referrerMemberWithdrawal;

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br>
     * MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">withdrawalReasonList</span>, <span style="color: #553000">reasonLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reasonLoader</span>.<span style="color: #CC4747">loadMemberWithdrawal</span>(<span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *         <span style="color: #553000">withdrawalCB</span>.query().set...
     *         <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">withdrawalLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    withdrawalLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = withdrawalReason.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal> loadMemberWithdrawal(ConditionBeanSetupper<MemberWithdrawalCB> refCBLambda) {
        myBhv().loadMemberWithdrawal(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberWithdrawal = refLs);
        return hd -> hd.handle(new LoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawal, _selector));
    }

    protected List<SynonymMemberWithdrawal> _referrerSynonymMemberWithdrawal;

    /**
     * Load referrer of synonymMemberWithdrawalList by the set-upper of referrer. <br>
     * SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">withdrawalReasonList</span>, <span style="color: #553000">reasonLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reasonLoader</span>.<span style="color: #CC4747">loadSynonymMemberWithdrawal</span>(<span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *         <span style="color: #553000">withdrawalCB</span>.query().set...
     *         <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">withdrawalLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    withdrawalLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = withdrawalReason.<span style="color: #CC4747">getSynonymMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSynonymMemberWithdrawal> loadSynonymMemberWithdrawal(ConditionBeanSetupper<SynonymMemberWithdrawalCB> refCBLambda) {
        myBhv().loadSynonymMemberWithdrawal(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSynonymMemberWithdrawal = refLs);
        return hd -> hd.handle(new LoaderOfSynonymMemberWithdrawal().ready(_referrerSynonymMemberWithdrawal, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
