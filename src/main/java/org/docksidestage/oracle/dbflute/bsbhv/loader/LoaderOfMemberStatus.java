package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;
import org.docksidestage.oracle.dbflute.cbean.*;

/**
 * The referrer loader of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, SYNONYM_MEMBER_LOGIN, VENDOR_SYNONYM_MEMBER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList, memberVendorSynonymList, synonymMemberList, synonymMemberLoginList, vendorSynonymMemberList
 * </pre>
 * @author oracleman
 */
public class LoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberStatus ready(List<MemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Member> _referrerMember;

    /**
     * Load referrer of memberList by the set-upper of referrer. <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMember> loadMember(ConditionBeanSetupper<MemberCB> refCBLambda) {
        myBhv().loadMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMember = refLs);
        return hd -> hd.handle(new LoaderOfMember().ready(_referrerMember, _selector));
    }

    protected List<MemberLogin> _referrerMemberLogin;

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMemberLogin> loadMemberLogin(ConditionBeanSetupper<MemberLoginCB> refCBLambda) {
        myBhv().loadMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLogin = refLs);
        return hd -> hd.handle(new LoaderOfMemberLogin().ready(_referrerMemberLogin, _selector));
    }

    protected List<MemberVendorSynonym> _referrerMemberVendorSynonym;

    /**
     * Load referrer of memberVendorSynonymList by the set-upper of referrer. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadMemberVendorSynonym</span>(<span style="color: #553000">synonymCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">synonymCB</span>.setupSelect...
     *         <span style="color: #553000">synonymCB</span>.query().set...
     *         <span style="color: #553000">synonymCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">synonymLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    synonymLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getMemberVendorSynonymList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMemberVendorSynonym> loadMemberVendorSynonym(ConditionBeanSetupper<MemberVendorSynonymCB> refCBLambda) {
        myBhv().loadMemberVendorSynonym(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberVendorSynonym = refLs);
        return hd -> hd.handle(new LoaderOfMemberVendorSynonym().ready(_referrerMemberVendorSynonym, _selector));
    }

    protected List<SynonymMember> _referrerSynonymMember;

    /**
     * Load referrer of synonymMemberList by the set-upper of referrer. <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadSynonymMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getSynonymMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSynonymMember> loadSynonymMember(ConditionBeanSetupper<SynonymMemberCB> refCBLambda) {
        myBhv().loadSynonymMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSynonymMember = refLs);
        return hd -> hd.handle(new LoaderOfSynonymMember().ready(_referrerSynonymMember, _selector));
    }

    protected List<SynonymMemberLogin> _referrerSynonymMemberLogin;

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadSynonymMemberLogin</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getSynonymMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSynonymMemberLogin> loadSynonymMemberLogin(ConditionBeanSetupper<SynonymMemberLoginCB> refCBLambda) {
        myBhv().loadSynonymMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSynonymMemberLogin = refLs);
        return hd -> hd.handle(new LoaderOfSynonymMemberLogin().ready(_referrerSynonymMemberLogin, _selector));
    }

    protected List<VendorSynonymMember> _referrerVendorSynonymMember;

    /**
     * Load referrer of vendorSynonymMemberList by the set-upper of referrer. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadVendorSynonymMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MemberStatus memberStatus : <span style="color: #553000">memberStatusList</span>) {
     *     ... = memberStatus.<span style="color: #CC4747">getVendorSynonymMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorSynonymMember> loadVendorSynonymMember(ConditionBeanSetupper<VendorSynonymMemberCB> refCBLambda) {
        myBhv().loadVendorSynonymMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorSynonymMember = refLs);
        return hd -> hd.handle(new LoaderOfVendorSynonymMember().ready(_referrerVendorSynonymMember, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
