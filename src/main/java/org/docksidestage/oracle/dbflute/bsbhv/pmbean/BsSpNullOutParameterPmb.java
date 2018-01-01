package org.docksidestage.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpNullOutParameter. <br>
 * This is related to "<span style="color: #AD4747">SP_NULL_OUT_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpNullOutParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 0";
    public static final String VOutInteger_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutNumber_PROCEDURE_PARAMETER = "out, 2";
    public static final String VOutDate_PROCEDURE_PARAMETER = "out, 3";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VOutVarchar: {VARCHAR2 as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VOutInteger: {NUMBER(38) as Out}. */
    protected java.math.BigDecimal _vOutInteger;

    /** The parameter of VOutNumber: {NUMBER(22) as Out}. */
    protected java.math.BigDecimal _vOutNumber;

    /** The parameter of VOutDate: {DATE as Out}. */
    protected java.time.LocalDate _vOutDate;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpNullOutParameter. <br>
     * This is related to "<span style="color: #AD4747">SP_NULL_OUT_PARAMETER</span>".
     */
    public BsSpNullOutParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SP_NULL_OUT_PARAMETER"; }

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
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vOutInteger);
        sb.append(dm).append(_vOutNumber);
        sb.append(dm).append(_vOutDate);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VOutVarchar: {VARCHAR2 as Out} <br>
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {VARCHAR2 as Out} <br>
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VOutInteger: {NUMBER(38) as Out} <br>
     * @return The value of VOutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVOutInteger() {
        return _vOutInteger;
    }

    /**
     * [set] VOutInteger: {NUMBER(38) as Out} <br>
     * @param vOutInteger The value of VOutInteger. (NullAllowed)
     */
    public void setVOutInteger(java.math.BigDecimal vOutInteger) {
        _vOutInteger = vOutInteger;
    }

    /**
     * [get] VOutNumber: {NUMBER(22) as Out} <br>
     * @return The value of VOutNumber. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVOutNumber() {
        return _vOutNumber;
    }

    /**
     * [set] VOutNumber: {NUMBER(22) as Out} <br>
     * @param vOutNumber The value of VOutNumber. (NullAllowed)
     */
    public void setVOutNumber(java.math.BigDecimal vOutNumber) {
        _vOutNumber = vOutNumber;
    }

    /**
     * [get] VOutDate: {DATE as Out} <br>
     * @return The value of VOutDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getVOutDate() {
        return _vOutDate;
    }

    /**
     * [set] VOutDate: {DATE as Out} <br>
     * @param vOutDate The value of VOutDate. (NullAllowed)
     */
    public void setVOutDate(java.time.LocalDate vOutDate) {
        _vOutDate = vOutDate;
    }
}
