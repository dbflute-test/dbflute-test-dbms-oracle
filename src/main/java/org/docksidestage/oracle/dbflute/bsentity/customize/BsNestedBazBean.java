package org.docksidestage.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_BAZ_BEAN. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAZ_ID, BAZ_NAME, BAZ_DATE, BAZ_LIST
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
 * Integer bazId = entity.getBazId();
 * String bazName = entity.getBazName();
 * java.time.LocalDate bazDate = entity.getBazDate();
 * List<List<BarBean>> bazList = entity.getBazList();
 * entity.setBazId(bazId);
 * entity.setBazName(bazName);
 * entity.setBazDate(bazDate);
 * entity.setBazList(bazList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedBazBean extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BAZ_ID: {NUMBER(8)} */
    protected Integer _bazId;

    /** BAZ_NAME: {VARCHAR2(20)} */
    protected String _bazName;

    /** BAZ_DATE: {DATE} */
    protected java.time.LocalDate _bazDate;

    /** BAZ_LIST: {BAZ_TABLE} */
    protected List<List<BarBean>> _bazList;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "NESTED_BAZ_BEAN";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "nestedBazBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta.NestedBazBeanDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
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
        if (obj instanceof BsNestedBazBean) {
            BsNestedBazBean other = (BsNestedBazBean)obj;
            if (!xSV(_bazId, other._bazId)) { return false; }
            if (!xSV(_bazName, other._bazName)) { return false; }
            if (!xSV(_bazDate, other._bazDate)) { return false; }
            if (!xSV(_bazList, other._bazList)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _bazId);
        hs = xCH(hs, _bazName);
        hs = xCH(hs, _bazDate);
        hs = xCH(hs, _bazList);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bazId));
        sb.append(dm).append(xfND(_bazName));
        sb.append(dm).append(xfND(_bazDate));
        sb.append(dm).append(xfND(_bazList));
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
    public NestedBazBean clone() {
        return (NestedBazBean)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BAZ_ID: {NUMBER(8)} <br>
     * @return The value of the column 'BAZ_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBazId() {
        checkSpecifiedProperty("bazId");
        return _bazId;
    }

    /**
     * [set] BAZ_ID: {NUMBER(8)} <br>
     * @param bazId The value of the column 'BAZ_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazId(Integer bazId) {
        registerModifiedProperty("bazId");
        _bazId = bazId;
    }

    /**
     * [get] BAZ_NAME: {VARCHAR2(20)} <br>
     * @return The value of the column 'BAZ_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBazName() {
        checkSpecifiedProperty("bazName");
        return _bazName;
    }

    /**
     * [set] BAZ_NAME: {VARCHAR2(20)} <br>
     * @param bazName The value of the column 'BAZ_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazName(String bazName) {
        registerModifiedProperty("bazName");
        _bazName = bazName;
    }

    /**
     * [get] BAZ_DATE: {DATE} <br>
     * @return The value of the column 'BAZ_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBazDate() {
        checkSpecifiedProperty("bazDate");
        return _bazDate;
    }

    /**
     * [set] BAZ_DATE: {DATE} <br>
     * @param bazDate The value of the column 'BAZ_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazDate(java.time.LocalDate bazDate) {
        registerModifiedProperty("bazDate");
        _bazDate = bazDate;
    }

    /**
     * [get] BAZ_LIST: {BAZ_TABLE} <br>
     * @return The value of the column 'BAZ_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<List<BarBean>> getBazList() {
        checkSpecifiedProperty("bazList");
        return _bazList;
    }

    /**
     * [set] BAZ_LIST: {BAZ_TABLE} <br>
     * @param bazList The value of the column 'BAZ_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazList(List<List<BarBean>> bazList) {
        registerModifiedProperty("bazList");
        _bazList = bazList;
    }
}
