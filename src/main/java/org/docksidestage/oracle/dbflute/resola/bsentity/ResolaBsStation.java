package org.docksidestage.oracle.dbflute.resola.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBMetaInstanceHandler;
import org.docksidestage.oracle.dbflute.resola.exentity.*;

/**
 * The entity of STATION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     STATION_ID
 * 
 * [column]
 *     STATION_ID, STATION_NAME, BIRTHDATE, FORMALIZED_DATETIME, HOME_COUNT, WORKING_KILOMETER
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
 * Integer stationId = entity.getStationId();
 * String stationName = entity.getStationName();
 * java.time.LocalDateTime birthdate = entity.getBirthdate();
 * java.time.LocalDateTime formalizedDatetime = entity.getFormalizedDatetime();
 * Integer homeCount = entity.getHomeCount();
 * java.math.BigDecimal workingKilometer = entity.getWorkingKilometer();
 * entity.setStationId(stationId);
 * entity.setStationName(stationName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setHomeCount(homeCount);
 * entity.setWorkingKilometer(workingKilometer);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class ResolaBsStation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STATION_ID: {PK, NotNull, NUMBER(9)} */
    protected Integer _stationId;

    /** STATION_NAME: {NotNull, VARCHAR2(200)} */
    protected String _stationName;

    /** BIRTHDATE: {DATE(7)} */
    protected java.time.LocalDateTime _birthdate;

    /** FORMALIZED_DATETIME: {TIMESTAMP(3)(11, 3)} */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** HOME_COUNT: {NUMBER(9)} */
    protected Integer _homeCount;

    /** WORKING_KILOMETER: {NUMBER(4, 2)} */
    protected java.math.BigDecimal _workingKilometer;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "STATION";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "station";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return ResolaDBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_stationId == null) { return false; }
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
        if (obj instanceof ResolaBsStation) {
            ResolaBsStation other = (ResolaBsStation)obj;
            if (!xSV(_stationId, other._stationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _stationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stationId));
        sb.append(dm).append(xfND(_stationName));
        sb.append(dm).append(xfND(_birthdate));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_homeCount));
        sb.append(dm).append(xfND(_workingKilometer));
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
    public ResolaStation clone() {
        return (ResolaStation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATION_ID: {PK, NotNull, NUMBER(9)} <br>
     * @return The value of the column 'STATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStationId() {
        checkSpecifiedProperty("stationId");
        return _stationId;
    }

    /**
     * [set] STATION_ID: {PK, NotNull, NUMBER(9)} <br>
     * @param stationId The value of the column 'STATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStationId(Integer stationId) {
        registerModifiedProperty("stationId");
        _stationId = stationId;
    }

    /**
     * [get] STATION_NAME: {NotNull, VARCHAR2(200)} <br>
     * @return The value of the column 'STATION_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getStationName() {
        checkSpecifiedProperty("stationName");
        return _stationName;
    }

    /**
     * [set] STATION_NAME: {NotNull, VARCHAR2(200)} <br>
     * @param stationName The value of the column 'STATION_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setStationName(String stationName) {
        registerModifiedProperty("stationName");
        _stationName = stationName;
    }

    /**
     * [get] BIRTHDATE: {DATE(7)} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(7)} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.time.LocalDateTime birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(3)(11, 3)} <br>
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {TIMESTAMP(3)(11, 3)} <br>
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] HOME_COUNT: {NUMBER(9)} <br>
     * @return The value of the column 'HOME_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getHomeCount() {
        checkSpecifiedProperty("homeCount");
        return _homeCount;
    }

    /**
     * [set] HOME_COUNT: {NUMBER(9)} <br>
     * @param homeCount The value of the column 'HOME_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHomeCount(Integer homeCount) {
        registerModifiedProperty("homeCount");
        _homeCount = homeCount;
    }

    /**
     * [get] WORKING_KILOMETER: {NUMBER(4, 2)} <br>
     * @return The value of the column 'WORKING_KILOMETER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWorkingKilometer() {
        checkSpecifiedProperty("workingKilometer");
        return _workingKilometer;
    }

    /**
     * [set] WORKING_KILOMETER: {NUMBER(4, 2)} <br>
     * @param workingKilometer The value of the column 'WORKING_KILOMETER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkingKilometer(java.math.BigDecimal workingKilometer) {
        registerModifiedProperty("workingKilometer");
        _workingKilometer = workingKilometer;
    }
}
