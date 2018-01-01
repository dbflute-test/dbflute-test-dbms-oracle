package org.docksidestage.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpResultSetParameterWith. <br>
 * This is related to "<span style="color: #AD4747">SP_RESULT_SET_PARAMETER_WITH</span>".
 * @author oracleman
 */
public class BsSpResultSetParameterWithPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String curMember_PROCEDURE_PARAMETER = "out, 0";
    public static final String curMemberStatus_PROCEDURE_PARAMETER = "out, 1";
    public static final String VInChar_PROCEDURE_PARAMETER = "in, 2";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 3";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "inout, 4";
    public static final String VInNumber_PROCEDURE_PARAMETER = "in, 5";
    public static final String VInDate_PROCEDURE_PARAMETER = "in, 6";
    public static final String VInTimestamp_PROCEDURE_PARAMETER = "in, 7";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of curMember: {REF CURSOR as Out}. */
    protected List<SpResultSetParameterWithCurMember> _curMember;

    /** The parameter of curMemberStatus: {REF CURSOR as Out}. */
    protected List<SpResultSetParameterWithCurMemberStatus> _curMemberStatus;

    /** The parameter of VInChar: {CHAR as In}. */
    protected String _vInChar;

    /** The parameter of VOutVarchar: {VARCHAR2 as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {VARCHAR2 as InOut}. */
    protected String _vInoutVarchar;

    /** The parameter of VInNumber: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vInNumber;

    /** The parameter of VInDate: {DATE as In}. */
    protected java.time.LocalDate _vInDate;

    /** The parameter of VInTimestamp: {TIMESTAMP(6) as In}. */
    protected java.time.LocalDateTime _vInTimestamp;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpResultSetParameterWith. <br>
     * This is related to "<span style="color: #AD4747">SP_RESULT_SET_PARAMETER_WITH</span>".
     */
    public BsSpResultSetParameterWithPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "SP_RESULT_SET_PARAMETER_WITH"; }

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
        sb.append(dm).append(_curMember);
        sb.append(dm).append(_curMemberStatus);
        sb.append(dm).append(_vInChar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vInoutVarchar);
        sb.append(dm).append(_vInNumber);
        sb.append(dm).append(_vInDate);
        sb.append(dm).append(_vInTimestamp);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] curMember: {REF CURSOR as Out} <br>
     * @return The value of curMember. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterWithCurMember> getCurMember() {
        return _curMember;
    }

    /**
     * [set] curMember: {REF CURSOR as Out} <br>
     * @param curMember The value of curMember. (NullAllowed)
     */
    public void setCurMember(List<SpResultSetParameterWithCurMember> curMember) {
        _curMember = curMember;
    }

    /**
     * [get] curMemberStatus: {REF CURSOR as Out} <br>
     * @return The value of curMemberStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterWithCurMemberStatus> getCurMemberStatus() {
        return _curMemberStatus;
    }

    /**
     * [set] curMemberStatus: {REF CURSOR as Out} <br>
     * @param curMemberStatus The value of curMemberStatus. (NullAllowed)
     */
    public void setCurMemberStatus(List<SpResultSetParameterWithCurMemberStatus> curMemberStatus) {
        _curMemberStatus = curMemberStatus;
    }

    /**
     * [get] VInChar: {CHAR as In} <br>
     * @return The value of VInChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInChar() {
        return filterStringParameter(_vInChar);
    }

    /**
     * [set] VInChar: {CHAR as In} <br>
     * @param vInChar The value of VInChar. (NullAllowed)
     */
    public void setVInChar(String vInChar) {
        _vInChar = vInChar;
    }

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
     * [get] VInoutVarchar: {VARCHAR2 as InOut} <br>
     * @return The value of VInoutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {VARCHAR2 as InOut} <br>
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
    }

    /**
     * [get] VInNumber: {NUMBER(22) as In} <br>
     * @return The value of VInNumber. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVInNumber() {
        return _vInNumber;
    }

    /**
     * [set] VInNumber: {NUMBER(22) as In} <br>
     * @param vInNumber The value of VInNumber. (NullAllowed)
     */
    public void setVInNumber(java.math.BigDecimal vInNumber) {
        _vInNumber = vInNumber;
    }

    /**
     * [get] VInDate: {DATE as In} <br>
     * @return The value of VInDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getVInDate() {
        return _vInDate;
    }

    /**
     * [set] VInDate: {DATE as In} <br>
     * @param vInDate The value of VInDate. (NullAllowed)
     */
    public void setVInDate(java.time.LocalDate vInDate) {
        _vInDate = vInDate;
    }

    /**
     * [get] VInTimestamp: {TIMESTAMP(6) as In} <br>
     * @return The value of VInTimestamp. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getVInTimestamp() {
        return _vInTimestamp;
    }

    /**
     * [set] VInTimestamp: {TIMESTAMP(6) as In} <br>
     * @param vInTimestamp The value of VInTimestamp. (NullAllowed)
     */
    public void setVInTimestamp(java.time.LocalDateTime vInTimestamp) {
        _vInTimestamp = vInTimestamp;
    }
}
