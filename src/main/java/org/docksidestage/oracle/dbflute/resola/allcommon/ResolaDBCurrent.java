package org.docksidestage.oracle.dbflute.resola.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.dbflute.dbway.DBDef;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ResolaDBCurrent {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ResolaDBCurrent.class);

    /** Singleton instance. */
    private static final ResolaDBCurrent _instance = new ResolaDBCurrent();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DBDef _currentDBDef;
    {
        _currentDBDef = DBDef.codeOf("oracle");
        if (_currentDBDef == null) {
            _currentDBDef = DBDef.Unknown;
        }
    }
	
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    private ResolaDBCurrent() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get singleton instance.
     * @return Singleton instance. (NotNull)
     */
    public static ResolaDBCurrent getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public void initializeCurrentDBDef(DBDef currentDBDef) {
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting currentDBDef: " + currentDBDef);
		}
		if (currentDBDef == null) {
		    String msg = "The argument 'currentDBDef' should not be null!";
		    throw new IllegalArgumentException(msg);
		}
        _currentDBDef = currentDBDef;
    }

    public DBDef currentDBDef() {
        return _currentDBDef;
    }

    public boolean isCurrentDBDef(DBDef currentDBDef) {
	    return _currentDBDef.equals(currentDBDef);
    }
}
