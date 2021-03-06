package org.docksidestage.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The DB meta of MEMBER_ADDRESS. (Singleton)
 * @author oracleman
 */
public class MemberAddressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberAddressDbm _instance = new MemberAddressDbm();
    private MemberAddressDbm() {}
    public static MemberAddressDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MemberAddress)et).getMemberAddressId(), (et, vl) -> ((MemberAddress)et).setMemberAddressId(ctl(vl)), "memberAddressId");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getMemberId(), (et, vl) -> ((MemberAddress)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getValidBeginDate(), (et, vl) -> ((MemberAddress)et).setValidBeginDate(ctld(vl)), "validBeginDate");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getValidEndDate(), (et, vl) -> ((MemberAddress)et).setValidEndDate(ctld(vl)), "validEndDate");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getAddress(), (et, vl) -> ((MemberAddress)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getRegionId(), (et, vl) -> {
            CDef.Region cls = (CDef.Region)gcls(et, columnRegionId(), vl);
            if (cls != null) {
                ((MemberAddress)et).setRegionIdAsRegion(cls);
            } else {
                ((MemberAddress)et).mynativeMappingRegionId(ctn(vl, java.math.BigDecimal.class));
            }
        }, "regionId");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getRegisterDatetime(), (et, vl) -> ((MemberAddress)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getRegisterProcess(), (et, vl) -> ((MemberAddress)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getRegisterUser(), (et, vl) -> ((MemberAddress)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getUpdateDatetime(), (et, vl) -> ((MemberAddress)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getUpdateProcess(), (et, vl) -> ((MemberAddress)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getUpdateUser(), (et, vl) -> ((MemberAddress)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((MemberAddress)et).getVersionNo(), (et, vl) -> ((MemberAddress)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MemberAddress)et).getMember(), (et, vl) -> ((MemberAddress)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((MemberAddress)et).getRegion(), (et, vl) -> ((MemberAddress)et).setRegion((OptionalEntity<Region>)vl), "region");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_ADDRESS";
    protected final String _tableDispName = "MEMBER_ADDRESS";
    protected final String _tablePropertyName = "memberAddress";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_ADDRESS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberAddressId = cci("MEMBER_ADDRESS_ID", "MEMBER_ADDRESS_ID", null, null, Long.class, "memberAddressId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "NUMBER", 9, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnValidBeginDate = cci("VALID_BEGIN_DATE", "VALID_BEGIN_DATE", null, null, java.time.LocalDate.class, "validBeginDate", null, false, false, true, "DATE", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidEndDate = cci("VALID_END_DATE", "VALID_END_DATE", null, null, java.time.LocalDate.class, "validEndDate", null, false, false, true, "DATE", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress = cci("ADDRESS", "ADDRESS", null, null, String.class, "address", null, false, false, true, "VARCHAR2", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegionId = cci("REGION_ID", "REGION_ID", null, null, java.math.BigDecimal.class, "regionId", null, false, false, true, "NUMBER", 38, 0, null, null, false, null, null, "region", null, CDef.DefMeta.Region, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "NUMBER", 16, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MEMBER_ADDRESS_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberAddressId() { return _columnMemberAddressId; }
    /**
     * MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidBeginDate() { return _columnValidBeginDate; }
    /**
     * VALID_END_DATE: {NotNull, DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidEndDate() { return _columnValidEndDate; }
    /**
     * ADDRESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * REGION_ID: {NotNull, NUMBER(38), FK to REGION, classification=Region}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegionId() { return _columnRegionId; }
    /**
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberAddressId());
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        ls.add(columnValidEndDate());
        ls.add(columnAddress());
        ls.add(columnRegionId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterProcess());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateProcess());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberAddressId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_ADDRESS_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberAddressList", false);
    }
    /**
     * REGION by my REGION_ID, named 'region'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRegion() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRegionId(), RegionDbm.getInstance().columnRegionId());
        return cfi("FK_MEMBER_ADDRESS_REGION", "region", this, RegionDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberAddressList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_MEMBER_ADDRESS"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.MemberAddress"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.MemberAddressCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.MemberAddressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberAddress> getEntityType() { return MemberAddress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberAddress newEntity() { return new MemberAddress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberAddress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberAddress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
