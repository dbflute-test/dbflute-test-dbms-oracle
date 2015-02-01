package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_SAME_NAME as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SAME_NAME_ID
 * 
 * [column]
 *     SAME_NAME_ID, SAME_NAME_NAME
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
 * Long sameNameId = entity.getSameNameId();
 * String sameNameName = entity.getSameNameName();
 * entity.setSameNameId(sameNameId);
 * entity.setSameNameName(sameNameName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteSameName extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SAME_NAME_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _sameNameId;

    /** SAME_NAME_NAME: {NotNull, VARCHAR2(50)} */
    protected String _sameNameName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_SAME_NAME";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sameNameId == null) { return false; }
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
        if (obj instanceof BsWhiteSameName) {
            BsWhiteSameName other = (BsWhiteSameName)obj;
            if (!xSV(_sameNameId, other._sameNameId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sameNameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sameNameId));
        sb.append(dm).append(xfND(_sameNameName));
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
    public WhiteSameName clone() {
        return (WhiteSameName)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SAME_NAME_ID: {PK, NotNull, NUMBER(16)} <br>
     * @return The value of the column 'SAME_NAME_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] SAME_NAME_ID: {PK, NotNull, NUMBER(16)} <br>
     * @param sameNameId The value of the column 'SAME_NAME_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        registerModifiedProperty("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] SAME_NAME_NAME: {NotNull, VARCHAR2(50)} <br>
     * @return The value of the column 'SAME_NAME_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSameNameName() {
        checkSpecifiedProperty("sameNameName");
        return _sameNameName;
    }

    /**
     * [set] SAME_NAME_NAME: {NotNull, VARCHAR2(50)} <br>
     * @param sameNameName The value of the column 'SAME_NAME_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameName(String sameNameName) {
        registerModifiedProperty("sameNameName");
        _sameNameName = sameNameName;
    }
}
