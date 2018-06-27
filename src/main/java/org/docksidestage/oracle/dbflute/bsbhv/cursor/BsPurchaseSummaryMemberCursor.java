package org.docksidestage.oracle.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbflute.jdbc.ValueType;
import org.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br>
 * @author oracleman
 */
public class BsPurchaseSummaryMemberCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of MEMBER_ID. */
    public static final String DB_NAME_MEMBER_ID = "MEMBER_ID";

    /** DB name of MEMBER_NAME. */
    public static final String DB_NAME_MEMBER_NAME = "MEMBER_NAME";

    /** DB name of BIRTHDATE. */
    public static final String DB_NAME_BIRTHDATE = "BIRTHDATE";

    /** DB name of FORMALIZED_DATETIME. */
    public static final String DB_NAME_FORMALIZED_DATETIME = "FORMALIZED_DATETIME";

    /** DB name of PURCHASE_SUMMARY. */
    public static final String DB_NAME_PURCHASE_SUMMARY = "PURCHASE_SUMMARY";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Integer.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(java.time.LocalDate.class);
    protected ValueType _vtFormalizedDatetime = vt(java.time.LocalDateTime.class);
    protected ValueType _vtPurchaseSummary = vt(Long.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseSummaryMemberCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException When it fails to move the cursor to next point.
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] MEMBER_ID: {NUMBER(9)} <br>
     * @return The value of memberId. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Integer getMemberId() throws SQLException {
        return (Integer)_vtMemberId.getValue(_rs, DB_NAME_MEMBER_ID);
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR2(200)} <br>
     * @return The value of memberName. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_MEMBER_NAME);
    }

    /**
     * [get] BIRTHDATE: {DATE(7)} <br>
     * @return The value of birthdate. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDate getBirthdate() throws SQLException {
        return (java.time.LocalDate)_vtBirthdate.getValue(_rs, DB_NAME_BIRTHDATE);
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(11, 3)} <br>
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDateTime getFormalizedDatetime() throws SQLException {
        return (java.time.LocalDateTime)_vtFormalizedDatetime.getValue(_rs, DB_NAME_FORMALIZED_DATETIME);
    }

    /**
     * [get] PURCHASE_SUMMARY: {NUMBER(39)} <br>
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getPurchaseSummary() throws SQLException {
        return (Long)_vtPurchaseSummary.getValue(_rs, DB_NAME_PURCHASE_SUMMARY);
    }

}
