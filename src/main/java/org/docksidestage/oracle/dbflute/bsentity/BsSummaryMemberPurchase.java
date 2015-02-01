package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of (会員購入さまりまてびゅー)SUMMARY_MEMBER_PURCHASE as TABLE. <br>
 * まてびゅーのコメントはALL_MVIEW_COMMENTSだって
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, ALLSUM_PURCHASE_PRICE, LATEST_PURCHASE_DATETIME
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
 * java.math.BigDecimal allsumPurchasePrice = entity.getAllsumPurchasePrice();
 * java.time.LocalDateTime latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setMemberId(memberId);
 * entity.setAllsumPurchasePrice(allsumPurchasePrice);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSummaryMemberPurchase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: {NotNull, NUMBER(9)} */
    protected Integer _memberId;

    /** ALLSUM_PURCHASE_PRICE: {NUMBER(22)} */
    protected java.math.BigDecimal _allsumPurchasePrice;

    /** LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} */
    protected java.time.LocalDateTime _latestPurchaseDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SUMMARY_MEMBER_PURCHASE";
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
        if (obj instanceof BsSummaryMemberPurchase) {
            BsSummaryMemberPurchase other = (BsSummaryMemberPurchase)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_allsumPurchasePrice, other._allsumPurchasePrice)) { return false; }
            if (!xSV(_latestPurchaseDatetime, other._latestPurchaseDatetime)) { return false; }
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
        hs = xCH(hs, _allsumPurchasePrice);
        hs = xCH(hs, _latestPurchaseDatetime);
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
        sb.append(dm).append(xfND(_allsumPurchasePrice));
        sb.append(dm).append(xfND(_latestPurchaseDatetime));
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
    public SummaryMemberPurchase clone() {
        return (SummaryMemberPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {NotNull, NUMBER(9)} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, NUMBER(9)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] ALLSUM_PURCHASE_PRICE: {NUMBER(22)} <br>
     * @return The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllsumPurchasePrice() {
        checkSpecifiedProperty("allsumPurchasePrice");
        return _allsumPurchasePrice;
    }

    /**
     * [set] ALLSUM_PURCHASE_PRICE: {NUMBER(22)} <br>
     * @param allsumPurchasePrice The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllsumPurchasePrice(java.math.BigDecimal allsumPurchasePrice) {
        registerModifiedProperty("allsumPurchasePrice");
        _allsumPurchasePrice = allsumPurchasePrice;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} <br>
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLatestPurchaseDatetime() {
        checkSpecifiedProperty("latestPurchaseDatetime");
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} <br>
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(java.time.LocalDateTime latestPurchaseDatetime) {
        registerModifiedProperty("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }
}
