package org.docksidestage.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.oracle.dbflute.exentity.customize.*;

/**
 * The entity of VendorCheckDecimalSum. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     DECIMAL_DIGIT_SUM
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
 * java.math.BigDecimal decimalDigitSum = entity.getDecimalDigitSum();
 * entity.setDecimalDigitSum(decimalDigitSum);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorCheckDecimalSum extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DECIMAL_DIGIT_SUM: {NUMBER(22)} */
    protected java.math.BigDecimal _decimalDigitSum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.oracle.dbflute.bsentity.customize.dbmeta.VendorCheckDecimalSumDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VendorCheckDecimalSum";
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
        if (obj instanceof BsVendorCheckDecimalSum) {
            BsVendorCheckDecimalSum other = (BsVendorCheckDecimalSum)obj;
            if (!xSV(_decimalDigitSum, other._decimalDigitSum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _decimalDigitSum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_decimalDigitSum));
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
    public VendorCheckDecimalSum clone() {
        return (VendorCheckDecimalSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DECIMAL_DIGIT_SUM: {NUMBER(22)} <br>
     * @return The value of the column 'DECIMAL_DIGIT_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDecimalDigitSum() {
        checkSpecifiedProperty("decimalDigitSum");
        return _decimalDigitSum;
    }

    /**
     * [set] DECIMAL_DIGIT_SUM: {NUMBER(22)} <br>
     * @param decimalDigitSum The value of the column 'DECIMAL_DIGIT_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDecimalDigitSum(java.math.BigDecimal decimalDigitSum) {
        registerModifiedProperty("decimalDigitSum");
        _decimalDigitSum = decimalDigitSum;
    }
}
