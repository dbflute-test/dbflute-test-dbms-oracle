package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.NextSchemaProductCQ;

/**
 * The nest select set-upper of NEXT_SCHEMA_PRODUCT.
 * @author oracleman
 */
public class NextSchemaProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductCQ _query;
    public NextSchemaProductNss(NextSchemaProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'nextSchemaProductStatus'.
     */
    public void withNextSchemaProductStatus() {
        _query.xdoNss(() -> _query.queryNextSchemaProductStatus());
    }
}
