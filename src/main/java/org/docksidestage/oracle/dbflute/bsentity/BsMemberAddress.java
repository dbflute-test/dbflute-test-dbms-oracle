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
 * The entity of MEMBER_ADDRESS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_ADDRESS_ID
 * 
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     SEQ_MEMBER_ADDRESS
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, REGION
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, region
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberAddressId = entity.getMemberAddressId();
 * Integer memberId = entity.getMemberId();
 * java.time.LocalDate validBeginDate = entity.getValidBeginDate();
 * java.time.LocalDate validEndDate = entity.getValidEndDate();
 * String address = entity.getAddress();
 * java.math.BigDecimal regionId = entity.getRegionId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberAddressId(memberAddressId);
 * entity.setMemberId(memberId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * entity.setAddress(address);
 * entity.setRegionId(regionId);
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
public abstract class BsMemberAddress extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ADDRESS_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _memberAddressId;

    /** MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER} */
    protected Integer _memberId;

    /** VALID_BEGIN_DATE: {+UQ, NotNull, DATE(7)} */
    protected java.time.LocalDate _validBeginDate;

    /** VALID_END_DATE: {NotNull, DATE(7)} */
    protected java.time.LocalDate _validEndDate;

    /** ADDRESS: {NotNull, VARCHAR2(200)} */
    protected String _address;

    /** REGION_ID: {NotNull, NUMBER(22), FK to REGION, classification=Region} */
    protected java.math.BigDecimal _regionId;

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
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "MEMBER_ADDRESS";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "memberAddress";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberAddressId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId : UQ+, NotNull, NUMBER(9), FK to MEMBER. (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(7). (NotNull)
     */
    public void uniqueBy(Integer memberId, java.time.LocalDate validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setMemberId(memberId);setValidBeginDate(validBeginDate);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of regionId as the classification of Region. <br>
     * REGION_ID: {NotNull, NUMBER(22), FK to REGION, classification=Region} <br>
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Region getRegionIdAsRegion() {
        return CDef.Region.codeOf(getRegionId());
    }

    /**
     * Set the value of regionId as the classification of Region. <br>
     * REGION_ID: {NotNull, NUMBER(22), FK to REGION, classification=Region} <br>
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRegionIdAsRegion(CDef.Region cdef) {
        setRegionId(cdef != null ? toNumber(cdef.code(), java.math.BigDecimal.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as America (1). <br>
     * AMERICA
     */
    public void setRegionId_America() {
        setRegionIdAsRegion(CDef.Region.America);
    }

    /**
     * Set the value of regionId as Canada (2). <br>
     * CANADA
     */
    public void setRegionId_Canada() {
        setRegionIdAsRegion(CDef.Region.Canada);
    }

    /**
     * Set the value of regionId as China (3). <br>
     * CHINA
     */
    public void setRegionId_China() {
        setRegionIdAsRegion(CDef.Region.China);
    }

    /**
     * Set the value of regionId as Chiba (4). <br>
     * CHIBA
     */
    public void setRegionId_Chiba() {
        setRegionIdAsRegion(CDef.Region.Chiba);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId America? <br>
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdAmerica() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.America) : false;
    }

    /**
     * Is the value of regionId Canada? <br>
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdCanada() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.Canada) : false;
    }

    /**
     * Is the value of regionId China? <br>
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChina() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.China) : false;
    }

    /**
     * Is the value of regionId Chiba? <br>
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChiba() {
        CDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(CDef.Region.Chiba) : false;
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

    /** REGION by my REGION_ID, named 'region'. */
    protected OptionalEntity<Region> _region;

    /**
     * [get] REGION by my REGION_ID, named 'region'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'region'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Region> getRegion() {
        if (_region == null) { _region = OptionalEntity.relationEmpty(this, "region"); }
        return _region;
    }

    /**
     * [set] REGION by my REGION_ID, named 'region'.
     * @param region The entity of foreign property 'region'. (NullAllowed)
     */
    public void setRegion(OptionalEntity<Region> region) {
        _region = region;
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
        if (obj instanceof BsMemberAddress) {
            BsMemberAddress other = (BsMemberAddress)obj;
            if (!xSV(_memberAddressId, other._memberAddressId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberAddressId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_region != null && _region.isPresent())
        { sb.append(li).append(xbRDS(_region, "region")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberAddressId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_validBeginDate));
        sb.append(dm).append(xfND(_validEndDate));
        sb.append(dm).append(xfND(_address));
        sb.append(dm).append(xfND(_regionId));
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
        if (_region != null && _region.isPresent())
        { sb.append(dm).append("region"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberAddress clone() {
        return (MemberAddress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ADDRESS_ID: {PK, NotNull, NUMBER(16)} <br>
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberAddressId() {
        checkSpecifiedProperty("memberAddressId");
        return _memberAddressId;
    }

    /**
     * [set] MEMBER_ADDRESS_ID: {PK, NotNull, NUMBER(16)} <br>
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAddressId(Long memberAddressId) {
        registerModifiedProperty("memberAddressId");
        _memberAddressId = memberAddressId;
    }

    /**
     * [get] MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(7)} <br>
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "oracleDateType")
    public java.time.LocalDate getValidBeginDate() {
        checkSpecifiedProperty("validBeginDate");
        return _validBeginDate;
    }

    /**
     * [set] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(7)} <br>
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.time.LocalDate validBeginDate) {
        registerModifiedProperty("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] VALID_END_DATE: {NotNull, DATE(7)} <br>
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "oracleDateType")
    public java.time.LocalDate getValidEndDate() {
        checkSpecifiedProperty("validEndDate");
        return _validEndDate;
    }

    /**
     * [set] VALID_END_DATE: {NotNull, DATE(7)} <br>
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.time.LocalDate validEndDate) {
        registerModifiedProperty("validEndDate");
        _validEndDate = validEndDate;
    }

    /**
     * [get] ADDRESS: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return _address;
    }

    /**
     * [set] ADDRESS: {NotNull, VARCHAR2(200)} <br>
     * @param address The value of the column 'ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        _address = address;
    }

    /**
     * [get] REGION_ID: {NotNull, NUMBER(22), FK to REGION, classification=Region} <br>
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRegionId() {
        checkSpecifiedProperty("regionId");
        return _regionId;
    }

    /**
     * [set] REGION_ID: {NotNull, NUMBER(22), FK to REGION, classification=Region} <br>
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    protected void setRegionId(java.math.BigDecimal regionId) {
        checkClassificationCode("REGION_ID", CDef.DefMeta.Region, regionId);
        registerModifiedProperty("regionId");
        _regionId = regionId;
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
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingRegionId(java.math.BigDecimal regionId) {
        setRegionId(regionId);
    }
}
