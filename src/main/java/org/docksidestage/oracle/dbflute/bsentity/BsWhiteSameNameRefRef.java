package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.dbmeta.accessory.MappingValueType;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_SAME_NAME_REF_REF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REF_REF_ID
 * 
 * [column]
 *     REF_REF_ID, REF_REF_NAME, REF_REF_DATE
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
 * Long refRefId = entity.getRefRefId();
 * String refRefName = entity.getRefRefName();
 * java.time.LocalDate refRefDate = entity.getRefRefDate();
 * entity.setRefRefId(refRefId);
 * entity.setRefRefName(refRefName);
 * entity.setRefRefDate(refRefDate);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteSameNameRefRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refRefId;

    /** REF_REF_NAME: {NotNull, VARCHAR2(100)} */
    protected String _refRefName;

    /** REF_REF_DATE: {NotNull, DATE(7)} */
    protected java.time.LocalDate _refRefDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_SAME_NAME_REF_REF";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refRefId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteSameNameRefRef) {
            BsWhiteSameNameRefRef other = (BsWhiteSameNameRefRef)obj;
            if (!xSV(_refRefId, other._refRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refRefId));
        sb.append(dm).append(xfND(_refRefName));
        sb.append(dm).append(xfND(_refRefDate));
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
    public WhiteSameNameRefRef clone() {
        return (WhiteSameNameRefRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_REF_ID: {PK, NotNull, NUMBER(16)} <br>
     * @return The value of the column 'REF_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefRefId() {
        checkSpecifiedProperty("refRefId");
        return _refRefId;
    }

    /**
     * [set] REF_REF_ID: {PK, NotNull, NUMBER(16)} <br>
     * @param refRefId The value of the column 'REF_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefId(Long refRefId) {
        registerModifiedProperty("refRefId");
        _refRefId = refRefId;
    }

    /**
     * [get] REF_REF_NAME: {NotNull, VARCHAR2(100)} <br>
     * @return The value of the column 'REF_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefRefName() {
        checkSpecifiedProperty("refRefName");
        return _refRefName;
    }

    /**
     * [set] REF_REF_NAME: {NotNull, VARCHAR2(100)} <br>
     * @param refRefName The value of the column 'REF_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefName(String refRefName) {
        registerModifiedProperty("refRefName");
        _refRefName = refRefName;
    }

    /**
     * [get] REF_REF_DATE: {NotNull, DATE(7)} <br>
     * @return The value of the column 'REF_REF_DATE'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "oracleDateType")
    public java.time.LocalDate getRefRefDate() {
        checkSpecifiedProperty("refRefDate");
        return _refRefDate;
    }

    /**
     * [set] REF_REF_DATE: {NotNull, DATE(7)} <br>
     * @param refRefDate The value of the column 'REF_REF_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefDate(java.time.LocalDate refRefDate) {
        registerModifiedProperty("refRefDate");
        _refRefDate = refRefDate;
    }
}
