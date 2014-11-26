package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_DIFF_WORLD as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DIFF_WORLD_ID
 * 
 * [column]
 *     DIFF_WORLD_ID, DIFF_WORLD_NAME
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
 * Long diffWorldId = entity.getDiffWorldId();
 * String diffWorldName = entity.getDiffWorldName();
 * entity.setDiffWorldId(diffWorldId);
 * entity.setDiffWorldName(diffWorldName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteDiffWorld extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _diffWorldId;

    /** DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} */
    protected String _diffWorldName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DIFF_WORLD";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_diffWorldId == null) { return false; }
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
        if (obj instanceof BsWhiteDiffWorld) {
            BsWhiteDiffWorld other = (BsWhiteDiffWorld)obj;
            if (!xSV(_diffWorldId, other._diffWorldId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _diffWorldId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_diffWorldId));
        sb.append(dm).append(xfND(_diffWorldName));
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
    public WhiteDiffWorld clone() {
        return (WhiteDiffWorld)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} <br>
     * @return The value of the column 'DIFF_WORLD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDiffWorldId() {
        checkSpecifiedProperty("diffWorldId");
        return _diffWorldId;
    }

    /**
     * [set] DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} <br>
     * @param diffWorldId The value of the column 'DIFF_WORLD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDiffWorldId(Long diffWorldId) {
        registerModifiedProperty("diffWorldId");
        _diffWorldId = diffWorldId;
    }

    /**
     * [get] DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br>
     * @return The value of the column 'DIFF_WORLD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDiffWorldName() {
        checkSpecifiedProperty("diffWorldName");
        return _diffWorldName;
    }

    /**
     * [set] DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br>
     * @param diffWorldName The value of the column 'DIFF_WORLD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDiffWorldName(String diffWorldName) {
        registerModifiedProperty("diffWorldName");
        _diffWorldName = diffWorldName;
    }
}
