package org.docksidestage.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The entity of ForcedType. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MAX_MEMBER_ID
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
 * java.math.BigInteger maxMemberId = entity.getMaxMemberId();
 * entity.setMaxMemberId(maxMemberId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsForcedType extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MAX_MEMBER_ID: {NUMBER(22)} */
    protected java.math.BigInteger _maxMemberId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta.ForcedTypeDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ForcedType";
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
        if (obj instanceof BsForcedType) {
            BsForcedType other = (BsForcedType)obj;
            if (!xSV(_maxMemberId, other._maxMemberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _maxMemberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_maxMemberId));
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
    public ForcedType clone() {
        return (ForcedType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MAX_MEMBER_ID: {NUMBER(22)} <br>
     * @return The value of the column 'MAX_MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigInteger getMaxMemberId() {
        checkSpecifiedProperty("maxMemberId");
        return _maxMemberId;
    }

    /**
     * [set] MAX_MEMBER_ID: {NUMBER(22)} <br>
     * @param maxMemberId The value of the column 'MAX_MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxMemberId(java.math.BigInteger maxMemberId) {
        registerModifiedProperty("maxMemberId");
        _maxMemberId = maxMemberId;
    }
}
