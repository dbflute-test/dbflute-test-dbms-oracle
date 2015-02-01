package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.dbmeta.accessory.MappingValueType;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.oracle.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.allcommon.CDef;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of MEMBER_WITHDRAWAL as TABLE. <br>
 * 退会するとInsertされる
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, withdrawalReason
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonInputText = entity.getWithdrawalReasonInputText();
 * java.time.LocalDateTime withdrawalDatetime = entity.getWithdrawalDatetime();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonInputText(withdrawalReasonInputText);
 * entity.setWithdrawalDatetime(withdrawalDatetime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterProcess(registerProcess);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateProcess(updateProcess);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsMemberWithdrawal extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER} */
    protected Integer _memberId;

    /** WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} */
    protected String _withdrawalReasonCode;

    /** WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)} */
    protected String _withdrawalReasonInputText;

    /** WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} */
    protected java.time.LocalDateTime _withdrawalDatetime;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_PROCESS: {NotNull, VARCHAR2(200)} */
    protected String _registerProcess;

    /** REGISTER_USER: {NotNull, VARCHAR2(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_PROCESS: {NotNull, VARCHAR2(200)} */
    protected String _updateProcess;

    /** UPDATE_USER: {NotNull, VARCHAR2(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, NUMBER(16)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MEMBER_WITHDRAWAL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WithdrawalReason getWithdrawalReasonCodeAsWithdrawalReason() {
        return CDef.WithdrawalReason.codeOf(getWithdrawalReasonCode());
    }

    /**
     * Set the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason cdef) {
        setWithdrawalReasonCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of withdrawalReasonCode as Sit (SIT). <br>
     * SIT: サイトが使いにくいから
     */
    public void setWithdrawalReasonCode_Sit() {
        setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.Sit);
    }

    /**
     * Set the value of withdrawalReasonCode as Prd (PRD). <br>
     * PRD: 商品に魅力がないから
     */
    public void setWithdrawalReasonCode_Prd() {
        setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.Prd);
    }

    /**
     * Set the value of withdrawalReasonCode as Frt (FRT). <br>
     * FRT: フリテンだから
     */
    public void setWithdrawalReasonCode_Frt() {
        setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.Frt);
    }

    /**
     * Set the value of withdrawalReasonCode as Oth (OTH). <br>
     * OTH: その他理由
     */
    public void setWithdrawalReasonCode_Oth() {
        setWithdrawalReasonCodeAsWithdrawalReason(CDef.WithdrawalReason.Oth);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode Sit? <br>
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeSit() {
        CDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(CDef.WithdrawalReason.Sit) : false;
    }

    /**
     * Is the value of withdrawalReasonCode Prd? <br>
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodePrd() {
        CDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(CDef.WithdrawalReason.Prd) : false;
    }

    /**
     * Is the value of withdrawalReasonCode Frt? <br>
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeFrt() {
        CDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(CDef.WithdrawalReason.Frt) : false;
    }

    /**
     * Is the value of withdrawalReasonCode Oth? <br>
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeOth() {
        CDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(CDef.WithdrawalReason.Oth) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'. */
    protected OptionalEntity<WithdrawalReason> _withdrawalReason;

    /**
     * [get] WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'withdrawalReason'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WithdrawalReason> getWithdrawalReason() {
        if (_withdrawalReason == null) { _withdrawalReason = OptionalEntity.relationEmpty(this, "withdrawalReason"); }
        return _withdrawalReason;
    }

    /**
     * [set] WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @param withdrawalReason The entity of foreign property 'withdrawalReason'. (NullAllowed)
     */
    public void setWithdrawalReason(OptionalEntity<WithdrawalReason> withdrawalReason) {
        _withdrawalReason = withdrawalReason;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberWithdrawal) {
            BsMemberWithdrawal other = (BsMemberWithdrawal)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_withdrawalReason != null && _withdrawalReason.isPresent())
        { sb.append(li).append(xbRDS(_withdrawalReason, "withdrawalReason")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_withdrawalReasonCode));
        sb.append(dm).append(xfND(_withdrawalReasonInputText));
        sb.append(dm).append(xfND(_withdrawalDatetime));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_withdrawalReason != null && _withdrawalReason.isPresent())
        { sb.append(dm).append("withdrawalReason"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberWithdrawal clone() {
        return (MemberWithdrawal)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, NotNull, NUMBER(9), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getWithdrawalReasonCode() {
        checkSpecifiedProperty("withdrawalReasonCode");
        return _withdrawalReasonCode;
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br>
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setWithdrawalReasonCode(String withdrawalReasonCode) {
        checkClassificationCode("WITHDRAWAL_REASON_CODE", CDef.DefMeta.WithdrawalReason, withdrawalReasonCode);
        registerModifiedProperty("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getWithdrawalReasonInputText() {
        checkSpecifiedProperty("withdrawalReasonInputText");
        return _withdrawalReasonInputText;
    }

    /**
     * [set] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(4000)} <br>
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWithdrawalReasonInputText(String withdrawalReasonInputText) {
        registerModifiedProperty("withdrawalReasonInputText");
        _withdrawalReasonInputText = withdrawalReasonInputText;
    }

    /**
     * [get] WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getWithdrawalDatetime() {
        checkSpecifiedProperty("withdrawalDatetime");
        return _withdrawalDatetime;
    }

    /**
     * [set] WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalDatetime(java.time.LocalDateTime withdrawalDatetime) {
        registerModifiedProperty("withdrawalDatetime");
        _withdrawalDatetime = withdrawalDatetime;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_PROCESS: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] REGISTER_PROCESS: {NotNull, VARCHAR2(200)} <br>
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR2(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_PROCESS: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] UPDATE_PROCESS: {NotNull, VARCHAR2(200)} <br>
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR2(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, NUMBER(16)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, NUMBER(16)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingWithdrawalReasonCode(String withdrawalReasonCode) {
        setWithdrawalReasonCode(withdrawalReasonCode);
    }
}
