package org.docksidestage.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.paging.SimplePagingBean;
import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exbhv.*;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of UnpaidSummaryMember. <br>
 * This is related to "<span style="color: #AD4747">selectUnpaidSummaryMember</span>" on MemberBhv.
 * @author oracleman
 */
public class BsUnpaidSummaryMemberPmb extends SimplePagingBean implements EntityHandlingPmb<MemberBhv, UnpaidSummaryMember>, AutoPagingHandlingPmb<MemberBhv, UnpaidSummaryMember>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected Integer _memberId;

    /** The parameter of memberName. */
    protected String _memberName;

    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected String _memberStatusCode;

    /** The parameter of unpaidMemberOnly. */
    protected boolean _unpaidMemberOnly;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of UnpaidSummaryMember. <br>
     * This is related to "<span style="color: #AD4747">selectUnpaidSummaryMember</span>" on MemberBhv.
     */
    public BsUnpaidSummaryMemberPmb() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectUnpaidSummaryMember"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<UnpaidSummaryMember> getEntityType() { return UnpaidSummaryMember.class; }

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
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberName);
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_unpaidMemberOnly);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br>
     * @return The value of memberId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] memberId <br>
     * @param memberId The value of memberId. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        _memberId = memberId;
    }

    /**
     * [get] memberName <br>
     * @return The value of memberName. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberName() {
        return filterStringParameter(_memberName);
    }

    /**
     * [set] memberName <br>
     * @param memberName The value of memberName. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        _memberName = memberName;
    }

    /**
     * [get] memberStatusCode:cls(MemberStatus) <br>
     * @return The value of memberStatusCode. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberStatusCode() {
        return filterStringParameter(_memberStatusCode);
    }

    /**
     * [set as MemberStatus] memberStatusCode:cls(MemberStatus) <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the property)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        _memberStatusCode = cdef != null ? cdef.code() : null;
    }

    /**
     * [set as Formalized] memberStatusCode:cls(MemberStatus) <br>
     * as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        _memberStatusCode = CDef.MemberStatus.Formalized.code();
    }

    /**
     * [set as Withdrawal] memberStatusCode:cls(MemberStatus) <br>
     * withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        _memberStatusCode = CDef.MemberStatus.Withdrawal.code();
    }

    /**
     * [set as Provisional] memberStatusCode:cls(MemberStatus) <br>
     * first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        _memberStatusCode = CDef.MemberStatus.Provisional.code();
    }

    /**
     * [get] unpaidMemberOnly <br>
     * @return The value of unpaidMemberOnly. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public boolean getUnpaidMemberOnly() {
        return _unpaidMemberOnly;
    }

    /**
     * [set] unpaidMemberOnly <br>
     * @param unpaidMemberOnly The value of unpaidMemberOnly. (NullAllowed)
     */
    public void setUnpaidMemberOnly(boolean unpaidMemberOnly) {
        _unpaidMemberOnly = unpaidMemberOnly;
    }
}
