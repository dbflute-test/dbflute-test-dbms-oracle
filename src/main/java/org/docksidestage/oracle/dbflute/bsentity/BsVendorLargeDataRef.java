package org.docksidestage.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.dbmeta.accessory.MappingValueType;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_DATA_REF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LARGE_DATA_REF_ID
 * 
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
 *     VENDOR_LARGE_DATA, VENDOR_LARGE_DATA_REF
 * 
 * [referrer table]
 *     VENDOR_LARGE_DATA_REF
 * 
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 * 
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataRefId = entity.getLargeDataRefId();
 * Long largeDataId = entity.getLargeDataId();
 * java.time.LocalDate dateIndex = entity.getDateIndex();
 * java.time.LocalDate dateNoIndex = entity.getDateNoIndex();
 * java.time.LocalDateTime timestampIndex = entity.getTimestampIndex();
 * java.time.LocalDateTime timestampNoIndex = entity.getTimestampNoIndex();
 * java.math.BigDecimal nullableDecimalIndex = entity.getNullableDecimalIndex();
 * java.math.BigDecimal nullableDecimalNoIndex = entity.getNullableDecimalNoIndex();
 * Long selfParentId = entity.getSelfParentId();
 * entity.setLargeDataRefId(largeDataRefId);
 * entity.setLargeDataId(largeDataId);
 * entity.setDateIndex(dateIndex);
 * entity.setDateNoIndex(dateNoIndex);
 * entity.setTimestampIndex(timestampIndex);
 * entity.setTimestampNoIndex(timestampNoIndex);
 * entity.setNullableDecimalIndex(nullableDecimalIndex);
 * entity.setNullableDecimalNoIndex(nullableDecimalNoIndex);
 * entity.setSelfParentId(selfParentId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeDataRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)} */
    protected Long _largeDataRefId;

    /** LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA} */
    protected Long _largeDataId;

    /** DATE_INDEX: {IX, NotNull, DATE(7)} */
    protected java.time.LocalDate _dateIndex;

    /** DATE_NO_INDEX: {NotNull, DATE(7)} */
    protected java.time.LocalDate _dateNoIndex;

    /** TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.time.LocalDateTime _timestampIndex;

    /** TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.time.LocalDateTime _timestampNoIndex;

    /** NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF} */
    protected Long _selfParentId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "VENDOR_LARGE_DATA_REF";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "vendorLargeDataRef";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_largeDataRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'. */
    protected OptionalEntity<VendorLargeData> _vendorLargeData;

    /**
     * [get] VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeData'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeData> getVendorLargeData() {
        if (_vendorLargeData == null) { _vendorLargeData = OptionalEntity.relationEmpty(this, "vendorLargeData"); }
        return _vendorLargeData;
    }

    /**
     * [set] VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(OptionalEntity<VendorLargeData> vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. */
    protected OptionalEntity<VendorLargeDataRef> _vendorLargeDataRefSelf;

    /**
     * [get] VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeDataRef> getVendorLargeDataRefSelf() {
        if (_vendorLargeDataRefSelf == null) { _vendorLargeDataRefSelf = OptionalEntity.relationEmpty(this, "vendorLargeDataRefSelf"); }
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(OptionalEntity<VendorLargeDataRef> vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * [get] VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] VENDOR_LARGE_DATA_REF by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeDataRef) {
            BsVendorLargeDataRef other = (BsVendorLargeDataRef)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _largeDataRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (VendorLargeDataRef et : _vendorLargeDataRefSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeDataRefId));
        sb.append(dm).append(xfND(_largeDataId));
        sb.append(dm).append(xfND(_dateIndex));
        sb.append(dm).append(xfND(_dateNoIndex));
        sb.append(dm).append(xfND(_timestampIndex));
        sb.append(dm).append(xfND(_timestampNoIndex));
        sb.append(dm).append(xfND(_nullableDecimalIndex));
        sb.append(dm).append(xfND(_nullableDecimalNoIndex));
        sb.append(dm).append(xfND(_selfParentId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(dm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(dm).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(dm).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeDataRef clone() {
        return (VendorLargeDataRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)} <br>
     * @return The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] LARGE_DATA_REF_ID: {PK, NotNull, NUMBER(12)} <br>
     * @param largeDataRefId The value of the column 'LARGE_DATA_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA} <br>
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {IX, NotNull, NUMBER(12), FK to VENDOR_LARGE_DATA} <br>
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] DATE_INDEX: {IX, NotNull, DATE(7)} <br>
     * @return The value of the column 'DATE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "oracleDateType")
    public java.time.LocalDate getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] DATE_INDEX: {IX, NotNull, DATE(7)} <br>
     * @param dateIndex The value of the column 'DATE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.time.LocalDate dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] DATE_NO_INDEX: {NotNull, DATE(7)} <br>
     * @return The value of the column 'DATE_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "oracleDateType")
    public java.time.LocalDate getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] DATE_NO_INDEX: {NotNull, DATE(7)} <br>
     * @param dateNoIndex The value of the column 'DATE_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.time.LocalDate dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br>
     * @return The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] TIMESTAMP_INDEX: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br>
     * @param timestampIndex The value of the column 'TIMESTAMP_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.time.LocalDateTime timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)} <br>
     * @return The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] TIMESTAMP_NO_INDEX: {NotNull, TIMESTAMP(6)(11, 6)} <br>
     * @param timestampNoIndex The value of the column 'TIMESTAMP_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.time.LocalDateTime timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)} <br>
     * @return The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_INDEX: {IX, NUMBER(12, 3)} <br>
     * @param nullableDecimalIndex The value of the column 'NULLABLE_DECIMAL_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)} <br>
     * @return The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] NULLABLE_DECIMAL_NO_INDEX: {NUMBER(12, 3)} <br>
     * @param nullableDecimalNoIndex The value of the column 'NULLABLE_DECIMAL_NO_INDEX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF} <br>
     * @return The value of the column 'SELF_PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] SELF_PARENT_ID: {NUMBER(12), FK to VENDOR_LARGE_DATA_REF} <br>
     * @param selfParentId The value of the column 'SELF_PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
