package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.WhiteUqFkWithoutPkRefCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK_WITHOUT_PK_REF.
 * @author oracleman
 */
public class WhiteUqFkWithoutPkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteUqFkWithoutPkRefCQ _query;
    public WhiteUqFkWithoutPkRefNss(WhiteUqFkWithoutPkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     */
    public void withWhiteUqFkWithoutPk() {
        _query.xdoNss(() -> _query.queryWhiteUqFkWithoutPk());
    }
}
