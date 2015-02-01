package org.docksidestage.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The entity of DoubleByteOnSql. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME_WITH_SPACE, MEMBER_STATUS_NAME
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberNameWithSpace = entity.getMemberNameWithSpace();
 * String memberStatusName = entity.getMemberStatusName();
 * entity.setMemberId(memberId);
 * entity.setMemberNameWithSpace(memberNameWithSpace);
 * entity.setMemberStatusName(memberStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsDoubleByteOnSql extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {NUMBER(9)} */
    protected Integer _memberId;

    /** MEMBER_NAME_WITH_SPACE: {VARCHAR2(201)} */
    protected String _memberNameWithSpace;

    /** MEMBER_STATUS_NAME: {VARCHAR2(50)} */
    protected String _memberStatusName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta.DoubleByteOnSqlDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "DoubleByteOnSql";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsDoubleByteOnSql) {
            BsDoubleByteOnSql other = (BsDoubleByteOnSql)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberNameWithSpace, other._memberNameWithSpace)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
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
        hs = xCH(hs, _memberNameWithSpace);
        hs = xCH(hs, _memberStatusName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberNameWithSpace));
        sb.append(dm).append(xfND(_memberStatusName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public DoubleByteOnSql clone() {
        return (DoubleByteOnSql)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {NUMBER(9)} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NUMBER(9)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME_WITH_SPACE: {VARCHAR2(201)} <br>
     * @return The value of the column 'MEMBER_NAME_WITH_SPACE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberNameWithSpace() {
        checkSpecifiedProperty("memberNameWithSpace");
        return _memberNameWithSpace;
    }

    /**
     * [set] MEMBER_NAME_WITH_SPACE: {VARCHAR2(201)} <br>
     * @param memberNameWithSpace The value of the column 'MEMBER_NAME_WITH_SPACE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberNameWithSpace(String memberNameWithSpace) {
        registerModifiedProperty("memberNameWithSpace");
        _memberNameWithSpace = memberNameWithSpace;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR2(50)} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR2(50)} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }
}
