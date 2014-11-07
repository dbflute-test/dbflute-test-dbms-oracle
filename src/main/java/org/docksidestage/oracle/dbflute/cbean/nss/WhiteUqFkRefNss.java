package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.WhiteUqFkRefCQ;

/**
 * The nest select set-upper of WHITE_UQ_FK_REF.
 * @author oracleman
 */
public class WhiteUqFkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteUqFkRefCQ _query;
    public WhiteUqFkRefNss(WhiteUqFkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_UQ_FK by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     */
    public void withWhiteUqFkByFkToPkId() {
        _query.xdoNss(() -> _query.queryWhiteUqFkByFkToPkId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_UQ_FK by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     */
    public void withWhiteUqFkByFkToUqCode() {
        _query.xdoNss(() -> _query.queryWhiteUqFkByFkToUqCode());
    }
}
