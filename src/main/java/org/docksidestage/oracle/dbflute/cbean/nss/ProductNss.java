package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.ProductCQ;

/**
 * The nest select set-upper of PRODUCT.
 * @author oracleman
 */
public class ProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ProductCQ _query;
    public ProductNss(ProductCQ query) { _query = query; }
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
