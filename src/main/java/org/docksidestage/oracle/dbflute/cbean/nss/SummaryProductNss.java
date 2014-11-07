package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.SummaryProductCQ;

/**
 * The nest select set-upper of SUMMARY_PRODUCT.
 * @author oracleman
 */
public class SummaryProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final SummaryProductCQ _query;
    public SummaryProductNss(SummaryProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     */
    public void withProductStatus() {
        _query.xdoNss(() -> _query.queryProductStatus());
    }
}
