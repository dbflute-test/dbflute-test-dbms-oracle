package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.MemberVendorSynonymCQ;

/**
 * The nest select set-upper of MEMBER_VENDOR_SYNONYM.
 * @author oracleman
 */
public class MemberVendorSynonymNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberVendorSynonymCQ _query;
    public MemberVendorSynonymNss(MemberVendorSynonymCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymMemberWithdrawalNss withSynonymMemberWithdrawalAsOne() {
        _query.xdoNss(() -> _query.querySynonymMemberWithdrawalAsOne());
        return new SynonymMemberWithdrawalNss(_query.querySynonymMemberWithdrawalAsOne());
    }
}
