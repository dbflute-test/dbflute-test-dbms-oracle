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
 * The DB meta of PURCHASE. (Singleton)
 * @author oracleman
 */
public class PurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseDbm _instance = new PurchaseDbm();
    private PurchaseDbm() {}
    public static PurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseId(), (et, vl) -> ((Purchase)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((Purchase)et).getMemberId(), (et, vl) -> ((Purchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Purchase)et).getProductId(), (et, vl) -> ((Purchase)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseDatetime(), (et, vl) -> ((Purchase)et).setPurchaseDatetime(ctldt(vl)), "purchaseDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchaseCount(), (et, vl) -> ((Purchase)et).setPurchaseCount(cti(vl)), "purchaseCount");
        setupEpg(_epgMap, et -> ((Purchase)et).getPurchasePrice(), (et, vl) -> ((Purchase)et).setPurchasePrice(cti(vl)), "purchasePrice");
        setupEpg(_epgMap, et -> ((Purchase)et).getPaymentCompleteFlg(), (et, vl) -> {
            CDef.Flg cls = (CDef.Flg)gcls(et, columnPaymentCompleteFlg(), vl);
            if (cls != null) {
                ((Purchase)et).setPaymentCompleteFlgAsFlg(cls);
            } else {
                ((Purchase)et).mynativeMappingPaymentCompleteFlg(ctn(vl, Integer.class));
            }
        }, "paymentCompleteFlg");
        setupEpg(_epgMap, et -> ((Purchase)et).getRegisterDatetime(), (et, vl) -> ((Purchase)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getRegisterUser(), (et, vl) -> ((Purchase)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Purchase)et).getRegisterProcess(), (et, vl) -> ((Purchase)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Purchase)et).getUpdateDatetime(), (et, vl) -> ((Purchase)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Purchase)et).getUpdateUser(), (et, vl) -> ((Purchase)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Purchase)et).getUpdateProcess(), (et, vl) -> ((Purchase)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((Purchase)et).getVersionNo(), (et, vl) -> ((Purchase)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Purchase)et).getMember(), (et, vl) -> ((Purchase)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((Purchase)et).getProduct(), (et, vl) -> ((Purchase)et).setProduct((OptionalEntity<Product>)vl), "product");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tableDispName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "購入";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "購入の度ににInsertされる";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Long.class, "purchaseId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, "purchasePaymentList", null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "NUMBER", 9, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "NUMBER", 9, 0, null, null, false, null, null, "product", null, null, false);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, java.time.LocalDateTime.class, "purchaseDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, Integer.class, "purchaseCount", null, false, false, true, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, Integer.class, "purchasePrice", null, false, false, true, "NUMBER", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, Integer.class, "paymentCompleteFlg", null, false, false, true, "NUMBER", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, String.class, "registerProcess", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP(3)", 11, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, String.class, "updateProcess", null, false, false, true, "VARCHAR2", 200, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "NUMBER", 16, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * PURCHASE_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * MEMBER_ID: {UQ+, NotNull, NUMBER(9), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * PRODUCT_ID: {+UQ, IX+, NotNull, NUMBER(9), FK to PRODUCT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * PURCHASE_COUNT: {NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * PURCHASE_PRICE: {IX, NotNull, NUMBER(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * PAYMENT_COMPLETE_FLG: {NotNull, NUMBER(1), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * VERSION_NO: {NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
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
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
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
        return cfi("FK_PURCHASE_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }
    /**
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), ProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT", "product", this, ProductDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchasePaymentList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchasePaymentDbm.getInstance().columnPurchaseId());
        return cri("FK_PURCHASE_PAYMENT_PURCHASE", "purchasePaymentList", this, PurchasePaymentDbm.getInstance(), mp, false, "purchase");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_PURCHASE"; }
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
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.Purchase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.PurchaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Purchase> getEntityType() { return Purchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Purchase newEntity() { return new Purchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Purchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Purchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
