package org.docksidestage.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpTableManualParameter. <br>
 * This is related to "<span style="color: #AD4747">SP_TABLE_MANUAL_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpTableManualParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarcharArray_PROCEDURE_PARAMETER = "in, 0";
    public static final ValueType VInVarcharArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("VARCHAR2_TABLE", String.class);
    public static final String VOutVarcharArray_PROCEDURE_PARAMETER = "out, 1";
    public static final ValueType VOutVarcharArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("VARCHAR2_TABLE", String.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarcharArray: {TABLE as In}. */
    protected List<String> _vInVarcharArray;

    /** The parameter of VOutVarcharArray: {TABLE as Out}. */
    protected List<String> _vOutVarcharArray;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpTableManualParameter. <br>
     * This is related to "<span style="color: #AD4747">SP_TABLE_MANUAL_PARAMETER</span>".
     */
    public BsSpTableManualParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SP_TABLE_MANUAL_PARAMETER"; }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() { return true; } // as default

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() { return false; } // resolved by generator

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_vInVarcharArray);
        sb.append(dm).append(_vOutVarcharArray);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarcharArray: {TABLE as In} <br>
     * @return The value of VInVarcharArray. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getVInVarcharArray() {
        return _vInVarcharArray;
    }

    /**
     * [set] VInVarcharArray: {TABLE as In} <br>
     * @param vInVarcharArray The value of VInVarcharArray. (NullAllowed)
     */
    public void setVInVarcharArray(List<String> vInVarcharArray) {
        _vInVarcharArray = vInVarcharArray;
    }

    /**
     * [get] VOutVarcharArray: {TABLE as Out} <br>
     * @return The value of VOutVarcharArray. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getVOutVarcharArray() {
        return _vOutVarcharArray;
    }

    /**
     * [set] VOutVarcharArray: {TABLE as Out} <br>
     * @param vOutVarcharArray The value of VOutVarcharArray. (NullAllowed)
     */
    public void setVOutVarcharArray(List<String> vOutVarcharArray) {
        _vOutVarcharArray = vOutVarcharArray;
    }
}
