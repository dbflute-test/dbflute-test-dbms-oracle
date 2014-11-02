package org.docksidestage.oracle.dbflute.cbean.cq;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.oracle.dbflute.cbean.cq.bs.BsSynonymNextSecretAuthCQ;

/**
 * The condition-query of SYNONYM_NEXT_SECRET_AUTH.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author oracleman
 */
public class SynonymNextSecretAuthCQ extends BsSynonymNextSecretAuthCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (Nullable: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public SynonymNextSecretAuthCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }
	
    // ===================================================================================
    //                                                                      Arrange Method
    //                                                                      ==============
	// You can make original arrange query methods here.
	// public void arrangeXxx() {
	//     ...
	// }
}
