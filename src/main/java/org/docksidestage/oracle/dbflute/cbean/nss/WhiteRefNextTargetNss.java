package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.WhiteRefNextTargetCQ;

/**
 * The nest select set-upper of WHITE_REF_NEXT_TARGET.
 * @author oracleman
 */
public class WhiteRefNextTargetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefNextTargetCQ _query;
    public WhiteRefNextTargetNss(WhiteRefNextTargetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     */
    public void withNextSchemaProductStatus() {
        _query.xdoNss(() -> _query.queryNextSchemaProductStatus());
    }
}
