package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.VendorSynonymMemberCQ;

/**
 * The nest select set-upper of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public class VendorSynonymMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final VendorSynonymMemberCQ _query;
    public VendorSynonymMemberNss(VendorSynonymMemberCQ query) { _query = query; }
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
