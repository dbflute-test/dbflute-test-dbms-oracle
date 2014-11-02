package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.SynonymProductCQ;

/**
 * The nest select set-upper of SYNONYM_PRODUCT.
 * @author oracleman
 */
public class SynonymProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymProductCQ _query;
    public SynonymProductNss(SynonymProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SYNONYM_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'synonymProductStatus'.
     */
    public void withSynonymProductStatus() {
        _query.xdoNss(() -> _query.querySynonymProductStatus());
    }
}
