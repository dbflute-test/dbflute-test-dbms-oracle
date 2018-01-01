package org.docksidestage.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVariousTypeParameter. <br>
 * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpVariousTypeParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutNvarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutChar_PROCEDURE_PARAMETER = "out, 2";
    public static final String VInClob_PROCEDURE_PARAMETER = "in, 3";
    public static final String VInClob_VALUE_TYPE = "stringClobType";
    public static final String VOutClob_PROCEDURE_PARAMETER = "out, 4";
    public static final String VOutClob_VALUE_TYPE = "stringClobType";
    public static final String vvInNumberInteger_PROCEDURE_PARAMETER = "in, 5";
    public static final String vvInNumberBigint_PROCEDURE_PARAMETER = "in, 6";
    public static final String vvInNumberDecimal_PROCEDURE_PARAMETER = "in, 7";
    public static final String vvOutDecimal_PROCEDURE_PARAMETER = "out, 8";
    public static final String vvInoutInteger_PROCEDURE_PARAMETER = "inout, 9";
    public static final String vvOutBigint_PROCEDURE_PARAMETER = "out, 10";
    public static final String vvvInDate_PROCEDURE_PARAMETER = "in, 11";
    public static final String vvvOutTimestamp_PROCEDURE_PARAMETER = "out, 12";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {VARCHAR2 as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutNvarchar: {NVARCHAR2 as Out}. */
    protected String _vOutNvarchar;

    /** The parameter of VOutChar: {CHAR as Out}. */
    protected String _vOutChar;

    /** The parameter of VInClob: {CLOB as In}. */
    protected String _vInClob;

    /** The parameter of VOutClob: {CLOB as Out}. */
    protected String _vOutClob;

    /** The parameter of vvInNumberInteger: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vvInNumberInteger;

    /** The parameter of vvInNumberBigint: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vvInNumberBigint;

    /** The parameter of vvInNumberDecimal: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vvInNumberDecimal;

    /** The parameter of vvOutDecimal: {NUMBER(22) as Out}. */
    protected java.math.BigDecimal _vvOutDecimal;

    /** The parameter of vvInoutInteger: {NUMBER(38) as InOut}. */
    protected java.math.BigDecimal _vvInoutInteger;

    /** The parameter of vvOutBigint: {NUMBER(38) as Out}. */
    protected java.math.BigDecimal _vvOutBigint;

    /** The parameter of vvvInDate: {DATE as In}. */
    protected java.time.LocalDate _vvvInDate;

    /** The parameter of vvvOutTimestamp: {TIMESTAMP(6) as Out}. */
    protected java.time.LocalDateTime _vvvOutTimestamp;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVariousTypeParameter. <br>
     * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
     */
    public BsSpVariousTypeParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SP_VARIOUS_TYPE_PARAMETER"; }

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
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutNvarchar);
        sb.append(dm).append(_vOutChar);
        sb.append(dm).append(_vInClob);
        sb.append(dm).append(_vOutClob);
        sb.append(dm).append(_vvInNumberInteger);
        sb.append(dm).append(_vvInNumberBigint);
        sb.append(dm).append(_vvInNumberDecimal);
        sb.append(dm).append(_vvOutDecimal);
        sb.append(dm).append(_vvInoutInteger);
        sb.append(dm).append(_vvOutBigint);
        sb.append(dm).append(_vvvInDate);
        sb.append(dm).append(_vvvOutTimestamp);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {VARCHAR2 as In} <br>
     * @return The value of VInVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {VARCHAR2 as In} <br>
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutNvarchar: {NVARCHAR2 as Out} <br>
     * @return The value of VOutNvarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutNvarchar() {
        return filterStringParameter(_vOutNvarchar);
    }

    /**
     * [set] VOutNvarchar: {NVARCHAR2 as Out} <br>
     * @param vOutNvarchar The value of VOutNvarchar. (NullAllowed)
     */
    public void setVOutNvarchar(String vOutNvarchar) {
        _vOutNvarchar = vOutNvarchar;
    }

    /**
     * [get] VOutChar: {CHAR as Out} <br>
     * @return The value of VOutChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutChar() {
        return filterStringParameter(_vOutChar);
    }

    /**
     * [set] VOutChar: {CHAR as Out} <br>
     * @param vOutChar The value of VOutChar. (NullAllowed)
     */
    public void setVOutChar(String vOutChar) {
        _vOutChar = vOutChar;
    }

    /**
     * [get] VInClob: {CLOB as In} <br>
     * @return The value of VInClob. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInClob() {
        return filterStringParameter(_vInClob);
    }

    /**
     * [set] VInClob: {CLOB as In} <br>
     * @param vInClob The value of VInClob. (NullAllowed)
     */
    public void setVInClob(String vInClob) {
        _vInClob = vInClob;
    }

    /**
     * [get] VOutClob: {CLOB as Out} <br>
     * @return The value of VOutClob. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutClob() {
        return filterStringParameter(_vOutClob);
    }

    /**
     * [set] VOutClob: {CLOB as Out} <br>
     * @param vOutClob The value of VOutClob. (NullAllowed)
     */
    public void setVOutClob(String vOutClob) {
        _vOutClob = vOutClob;
    }

    /**
     * [get] vvInNumberInteger: {NUMBER(22) as In} <br>
     * @return The value of vvInNumberInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumberInteger() {
        return _vvInNumberInteger;
    }

    /**
     * [set] vvInNumberInteger: {NUMBER(22) as In} <br>
     * @param vvInNumberInteger The value of vvInNumberInteger. (NullAllowed)
     */
    public void setVvInNumberInteger(java.math.BigDecimal vvInNumberInteger) {
        _vvInNumberInteger = vvInNumberInteger;
    }

    /**
     * [get] vvInNumberBigint: {NUMBER(22) as In} <br>
     * @return The value of vvInNumberBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumberBigint() {
        return _vvInNumberBigint;
    }

    /**
     * [set] vvInNumberBigint: {NUMBER(22) as In} <br>
     * @param vvInNumberBigint The value of vvInNumberBigint. (NullAllowed)
     */
    public void setVvInNumberBigint(java.math.BigDecimal vvInNumberBigint) {
        _vvInNumberBigint = vvInNumberBigint;
    }

    /**
     * [get] vvInNumberDecimal: {NUMBER(22) as In} <br>
     * @return The value of vvInNumberDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumberDecimal() {
        return _vvInNumberDecimal;
    }

    /**
     * [set] vvInNumberDecimal: {NUMBER(22) as In} <br>
     * @param vvInNumberDecimal The value of vvInNumberDecimal. (NullAllowed)
     */
    public void setVvInNumberDecimal(java.math.BigDecimal vvInNumberDecimal) {
        _vvInNumberDecimal = vvInNumberDecimal;
    }

    /**
     * [get] vvOutDecimal: {NUMBER(22) as Out} <br>
     * @return The value of vvOutDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvOutDecimal() {
        return _vvOutDecimal;
    }

    /**
     * [set] vvOutDecimal: {NUMBER(22) as Out} <br>
     * @param vvOutDecimal The value of vvOutDecimal. (NullAllowed)
     */
    public void setVvOutDecimal(java.math.BigDecimal vvOutDecimal) {
        _vvOutDecimal = vvOutDecimal;
    }

    /**
     * [get] vvInoutInteger: {NUMBER(38) as InOut} <br>
     * @return The value of vvInoutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInoutInteger() {
        return _vvInoutInteger;
    }

    /**
     * [set] vvInoutInteger: {NUMBER(38) as InOut} <br>
     * @param vvInoutInteger The value of vvInoutInteger. (NullAllowed)
     */
    public void setVvInoutInteger(java.math.BigDecimal vvInoutInteger) {
        _vvInoutInteger = vvInoutInteger;
    }

    /**
     * [get] vvOutBigint: {NUMBER(38) as Out} <br>
     * @return The value of vvOutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvOutBigint() {
        return _vvOutBigint;
    }

    /**
     * [set] vvOutBigint: {NUMBER(38) as Out} <br>
     * @param vvOutBigint The value of vvOutBigint. (NullAllowed)
     */
    public void setVvOutBigint(java.math.BigDecimal vvOutBigint) {
        _vvOutBigint = vvOutBigint;
    }

    /**
     * [get] vvvInDate: {DATE as In} <br>
     * @return The value of vvvInDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getVvvInDate() {
        return _vvvInDate;
    }

    /**
     * [set] vvvInDate: {DATE as In} <br>
     * @param vvvInDate The value of vvvInDate. (NullAllowed)
     */
    public void setVvvInDate(java.time.LocalDate vvvInDate) {
        _vvvInDate = vvvInDate;
    }

    /**
     * [get] vvvOutTimestamp: {TIMESTAMP(6) as Out} <br>
     * @return The value of vvvOutTimestamp. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getVvvOutTimestamp() {
        return _vvvOutTimestamp;
    }

    /**
     * [set] vvvOutTimestamp: {TIMESTAMP(6) as Out} <br>
     * @param vvvOutTimestamp The value of vvvOutTimestamp. (NullAllowed)
     */
    public void setVvvOutTimestamp(java.time.LocalDateTime vvvOutTimestamp) {
        _vvvOutTimestamp = vvvOutTimestamp;
    }
}
