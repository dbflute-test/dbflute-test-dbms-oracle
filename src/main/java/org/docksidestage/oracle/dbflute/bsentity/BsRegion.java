package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.allcommon.CDef;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of REGION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_ADDRESS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal regionId = entity.getRegionId();
 * String regionName = entity.getRegionName();
 * entity.setRegionId(regionId);
 * entity.setRegionName(regionName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsRegion extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REGION_ID: {PK, NotNull, NUMBER(38), classification=Region} */
    protected java.math.BigDecimal _regionId;

    /** REGION_NAME: {NotNull, VARCHAR2(50)} */
    protected String _regionName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "REGION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_regionId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of regionId as the classification of Region. <br>
     * REGION_ID: {PK, NotNull, NUMBER(38), classification=Region} <br>
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Region getRegionIdAsRegion() {
        return CDef.Region.codeOf(getRegionId());
    }

    /**
     * Set the value of regionId as the classification of Region. <br>
     * REGION_ID: {PK, NotNull, NUMBER(38), classification=Region} <br>
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * [get] MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsRegion) {
            BsRegion other = (BsRegion)obj;
            if (!xSV(_regionId, other._regionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _regionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberAddressList != null) { for (MemberAddress et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_regionId));
        sb.append(dm).append(xfND(_regionName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(dm).append("memberAddressList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Region clone() {
        return (Region)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REGION_ID: {PK, NotNull, NUMBER(38), classification=Region} <br>
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getRegionId() {
        checkSpecifiedProperty("regionId");
        return _regionId;
    }

    /**
     * [set] REGION_ID: {PK, NotNull, NUMBER(38), classification=Region} <br>
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    protected void setRegionId(java.math.BigDecimal regionId) {
        checkClassificationCode("REGION_ID", CDef.DefMeta.Region, regionId);
        registerModifiedProperty("regionId");
        _regionId = regionId;
    }

    /**
     * [get] REGION_NAME: {NotNull, VARCHAR2(50)} <br>
     * @return The value of the column 'REGION_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRegionName() {
        checkSpecifiedProperty("regionName");
        return _regionName;
    }

    /**
     * [set] REGION_NAME: {NotNull, VARCHAR2(50)} <br>
     * @param regionName The value of the column 'REGION_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRegionName(String regionName) {
        registerModifiedProperty("regionName");
        _regionName = regionName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingRegionId(java.math.BigDecimal regionId) {
        setRegionId(regionId);
    }
}
