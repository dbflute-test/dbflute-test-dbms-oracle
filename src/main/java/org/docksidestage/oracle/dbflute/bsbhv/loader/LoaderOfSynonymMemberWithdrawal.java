package org.docksidestage.oracle.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The referrer loader of SYNONYM_MEMBER_WITHDRAWAL as SYNONYM. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_VENDOR_SYNONYM, WITHDRAWAL_REASON, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberVendorSynonym, withdrawalReason, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public class LoaderOfSynonymMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SynonymMemberWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected SynonymMemberWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSynonymMemberWithdrawal ready(List<SynonymMemberWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SynonymMemberWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SynonymMemberWithdrawalBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberVendorSynonym _foreignMemberVendorSynonymLoader;
    public LoaderOfMemberVendorSynonym pulloutMemberVendorSynonym() {
        if (_foreignMemberVendorSynonymLoader == null)
        { _foreignMemberVendorSynonymLoader = new LoaderOfMemberVendorSynonym().ready(myBhv().pulloutMemberVendorSynonym(_selectedList), _selector); }
        return _foreignMemberVendorSynonymLoader;
    }

    protected LoaderOfWithdrawalReason _foreignWithdrawalReasonLoader;
    public LoaderOfWithdrawalReason pulloutWithdrawalReason() {
        if (_foreignWithdrawalReasonLoader == null)
        { _foreignWithdrawalReasonLoader = new LoaderOfWithdrawalReason().ready(myBhv().pulloutWithdrawalReason(_selectedList), _selector); }
        return _foreignWithdrawalReasonLoader;
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
    public List<SynonymMemberWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
