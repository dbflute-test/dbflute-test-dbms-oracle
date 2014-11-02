package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.WhiteRefTargetCQ;

/**
 * The nest select set-upper of WHITE_REF_TARGET.
 * @author oracleman
 */
public class WhiteRefTargetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteRefTargetCQ _query;
    public WhiteRefTargetNss(WhiteRefTargetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     */
    public void withWhiteTarget() {
        _query.xdoNss(() -> _query.queryWhiteTarget());
    }
}
