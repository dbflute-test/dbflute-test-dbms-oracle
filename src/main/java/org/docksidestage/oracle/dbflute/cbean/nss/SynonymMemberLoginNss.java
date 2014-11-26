package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.SynonymMemberLoginCQ;

/**
 * The nest select set-upper of SYNONYM_MEMBER_LOGIN.
 * @author oracleman
 */
public class SynonymMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final SynonymMemberLoginCQ _query;
    public SynonymMemberLoginNss(SynonymMemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    public void withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員)MEMBER_VENDOR_SYNONYM by my MEMBER_ID, named 'memberVendorSynonym'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberVendorSynonymNss withMemberVendorSynonym() {
        _query.xdoNss(() -> _query.queryMemberVendorSynonym());
        return new MemberVendorSynonymNss(_query.queryMemberVendorSynonym());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員)SYNONYM_MEMBER by my MEMBER_ID, named 'synonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SynonymMemberNss withSynonymMember() {
        _query.xdoNss(() -> _query.querySynonymMember());
        return new SynonymMemberNss(_query.querySynonymMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員)VENDOR_SYNONYM_MEMBER by my MEMBER_ID, named 'vendorSynonymMember'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorSynonymMemberNss withVendorSynonymMember() {
        _query.xdoNss(() -> _query.queryVendorSynonymMember());
        return new VendorSynonymMemberNss(_query.queryVendorSynonymMember());
    }
}
