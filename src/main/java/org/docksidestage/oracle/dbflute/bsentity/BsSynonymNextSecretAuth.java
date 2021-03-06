package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of (隣の秘密で権限あり)SYNONYM_NEXT_SECRET_AUTH as SYNONYM. <br>
 * シノニムで見えてOK。まあ権限あるから結局直接見えるけど
 * <pre>
 * [primary-key]
 *     SECRET_AUTH_CODE
 *
 * [column]
 *     SECRET_AUTH_CODE, SECRET_AUTH_NAME
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
 * String secretAuthCode = entity.getSecretAuthCode();
 * String secretAuthName = entity.getSecretAuthName();
 * entity.setSecretAuthCode(secretAuthCode);
 * entity.setSecretAuthName(secretAuthName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextSecretAuth extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secretAuthCode;

    /** (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} */
    protected String _secretAuthName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SYNONYM_NEXT_SECRET_AUTH";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_secretAuthCode == null) { return false; }
        return true;
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
        if (obj instanceof BsSynonymNextSecretAuth) {
            BsSynonymNextSecretAuth other = (BsSynonymNextSecretAuth)obj;
            if (!xSV(_secretAuthCode, other._secretAuthCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _secretAuthCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_secretAuthCode));
        sb.append(dm).append(xfND(_secretAuthName));
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
    public SynonymNextSecretAuth clone() {
        return (SynonymNextSecretAuth)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} <br>
     * 隣の商品を秘密するかもしれない
     * @return The value of the column 'SECRET_AUTH_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretAuthCode() {
        checkSpecifiedProperty("secretAuthCode");
        return _secretAuthCode;
    }

    /**
     * [set] (隣の秘密２コード)SECRET_AUTH_CODE: {PK, NotNull, CHAR(3)} <br>
     * 隣の商品を秘密するかもしれない
     * @param secretAuthCode The value of the column 'SECRET_AUTH_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecretAuthCode(String secretAuthCode) {
        registerModifiedProperty("secretAuthCode");
        _secretAuthCode = secretAuthCode;
    }

    /**
     * [get] (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} <br>
     * @return The value of the column 'SECRET_AUTH_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretAuthName() {
        checkSpecifiedProperty("secretAuthName");
        return _secretAuthName;
    }

    /**
     * [set] (隣の秘密２名称)SECRET_AUTH_NAME: {NotNull, VARCHAR2(50)} <br>
     * @param secretAuthName The value of the column 'SECRET_AUTH_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSecretAuthName(String secretAuthName) {
        registerModifiedProperty("secretAuthName");
        _secretAuthName = secretAuthName;
    }
}
