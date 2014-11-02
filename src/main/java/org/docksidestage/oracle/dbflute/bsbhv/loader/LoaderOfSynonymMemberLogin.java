package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The referrer loader of (会員ログイン)SYNONYM_MEMBER_LOGIN as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
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
 *     MEMBER_STATUS, MEMBER_VENDOR_SYNONYM, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, memberVendorSynonym, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymMemberLogin> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymMemberLoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymMemberLogin ready(List<SynonymMemberLogin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymMemberLoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymMemberLoginBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfMemberVendorSynonym _foreignMemberVendorSynonymLoader;
    public LoaderOfMemberVendorSynonym pulloutMemberVendorSynonym() {
        if (_foreignMemberVendorSynonymLoader == null)
        { _foreignMemberVendorSynonymLoader = new LoaderOfMemberVendorSynonym().ready(myBhv().pulloutMemberVendorSynonym(_selectedList), _selector); }
        return _foreignMemberVendorSynonymLoader;
    }

    protected LoaderOfSynonymMember _foreignSynonymMemberLoader;
    public LoaderOfSynonymMember pulloutSynonymMember() {
        if (_foreignSynonymMemberLoader == null)
        { _foreignSynonymMemberLoader = new LoaderOfSynonymMember().ready(myBhv().pulloutSynonymMember(_selectedList), _selector); }
        return _foreignSynonymMemberLoader;
    }

    protected LoaderOfVendorSynonymMember _foreignVendorSynonymMemberLoader;
    public LoaderOfVendorSynonymMember pulloutVendorSynonymMember() {
        if (_foreignVendorSynonymMemberLoader == null)
        { _foreignVendorSynonymMemberLoader = new LoaderOfVendorSynonymMember().ready(myBhv().pulloutVendorSynonymMember(_selectedList), _selector); }
        return _foreignVendorSynonymMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SynonymMemberLogin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
