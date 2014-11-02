package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.SynonymRefExceptCQ;

/**
 * The nest select set-upper of SYNONYM_REF_EXCEPT.
 * @author oracleman
 */
public class SynonymRefExceptNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SynonymRefExceptCQ _query;
    public SynonymRefExceptNss(SynonymRefExceptCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     */
    public void withSynonymExcept() {
        _query.xdoNss(() -> _query.querySynonymExcept());
    }
}
