package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br>
 * <pre>
 * [primary-key]
 *     SECRET_CODE
 *
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
 * String secretCode = entity.getSecretCode();
 * String secretName = entity.getSecretName();
 * String secretAuthCode = entity.getSecretAuthCode();
 * entity.setSecretCode(secretCode);
 * entity.setSecretName(secretName);
 * entity.setSecretAuthCode(secretAuthCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSecret extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SECRET_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secretCode;

    /** SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _secretName;

    /** SECRET_AUTH_CODE: {CHAR(3)} */
    protected String _secretAuthCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_secretCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param secretName : UQ, NotNull, VARCHAR2(50). (NotNull)
     */
    public void uniqueBy(String secretName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("secretName");
        setSecretName(secretName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSynonymNextLinkSecret) {
            BsSynonymNextLinkSecret other = (BsSynonymNextLinkSecret)obj;
            if (!xSV(_secretCode, other._secretCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _secretCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_secretCode));
        sb.append(dm).append(xfND(_secretName));
        sb.append(dm).append(xfND(_secretAuthCode));
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
    public SynonymNextLinkSecret clone() {
        return (SynonymNextLinkSecret)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SECRET_CODE: {PK, NotNull, CHAR(3)} <br>
     * @return The value of the column 'SECRET_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretCode() {
        checkSpecifiedProperty("secretCode");
        return _secretCode;
    }

    /**
     * [set] SECRET_CODE: {PK, NotNull, CHAR(3)} <br>
     * @param secretCode The value of the column 'SECRET_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecretCode(String secretCode) {
        registerModifiedProperty("secretCode");
        _secretCode = secretCode;
    }

    /**
     * [get] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * @return The value of the column 'SECRET_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretName() {
        checkSpecifiedProperty("secretName");
        return _secretName;
    }

    /**
     * [set] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * @param secretName The value of the column 'SECRET_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSecretName(String secretName) {
        registerModifiedProperty("secretName");
        _secretName = secretName;
    }

    /**
     * [get] SECRET_AUTH_CODE: {CHAR(3)} <br>
     * @return The value of the column 'SECRET_AUTH_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSecretAuthCode() {
        checkSpecifiedProperty("secretAuthCode");
        return _secretAuthCode;
    }

    /**
     * [set] SECRET_AUTH_CODE: {CHAR(3)} <br>
     * @param secretAuthCode The value of the column 'SECRET_AUTH_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSecretAuthCode(String secretAuthCode) {
        registerModifiedProperty("secretAuthCode");
        _secretAuthCode = secretAuthCode;
    }
}
