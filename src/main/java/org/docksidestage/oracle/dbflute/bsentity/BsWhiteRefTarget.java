package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_TARGET as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REF_TARGET_ID
 * 
 * [column]
 *     REF_TARGET_ID, TARGET_ID
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
 *     WHITE_TARGET
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteTarget
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refTargetId = entity.getRefTargetId();
 * Long targetId = entity.getTargetId();
 * entity.setRefTargetId(refTargetId);
 * entity.setTargetId(targetId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefTarget extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_TARGET_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refTargetId;

    /** TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} */
    protected Long _targetId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_REF_TARGET";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refTargetId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_TARGET by my TARGET_ID, named 'whiteTarget'. */
    protected OptionalEntity<WhiteTarget> _whiteTarget;

    /**
     * [get] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteTarget'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteTarget> getWhiteTarget() {
        if (_whiteTarget == null) { _whiteTarget = OptionalEntity.relationEmpty(this, "whiteTarget"); }
        return _whiteTarget;
    }

    /**
     * [set] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param whiteTarget The entity of foreign property 'whiteTarget'. (NullAllowed)
     */
    public void setWhiteTarget(OptionalEntity<WhiteTarget> whiteTarget) {
        _whiteTarget = whiteTarget;
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
        if (obj instanceof BsWhiteRefTarget) {
            BsWhiteRefTarget other = (BsWhiteRefTarget)obj;
            if (!xSV(_refTargetId, other._refTargetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refTargetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteTarget != null && _whiteTarget.isPresent())
        { sb.append(li).append(xbRDS(_whiteTarget, "whiteTarget")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refTargetId));
        sb.append(dm).append(xfND(_targetId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteTarget != null && _whiteTarget.isPresent())
        { sb.append(dm).append("whiteTarget"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteRefTarget clone() {
        return (WhiteRefTarget)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_TARGET_ID: {PK, NotNull, NUMBER(16)} <br>
     * @return The value of the column 'REF_TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefTargetId() {
        checkSpecifiedProperty("refTargetId");
        return _refTargetId;
    }

    /**
     * [set] REF_TARGET_ID: {PK, NotNull, NUMBER(16)} <br>
     * @param refTargetId The value of the column 'REF_TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefTargetId(Long refTargetId) {
        registerModifiedProperty("refTargetId");
        _refTargetId = refTargetId;
    }

    /**
     * [get] TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} <br>
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTargetId() {
        checkSpecifiedProperty("targetId");
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} <br>
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Long targetId) {
        registerModifiedProperty("targetId");
        _targetId = targetId;
    }
}
