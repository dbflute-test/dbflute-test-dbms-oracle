package org.docksidestage.oracle.dbflute.allcommon;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.docksidestage.oracle.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.oracle.dbflute.exbhv.*;

/**
 * The Java configuration of DBFlute beans for Spring Framework. <br>
 * You can inject them by importing this class in your auto configuration class.
 * @author oracleman
 */
@Configuration
public class DBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    protected ApplicationContext _container;

    @Resource(name="dataSource")
    protected DataSource _dataSource; // name basis here for multiple DB

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="introduction")
    public DBFluteInitializer createDBFluteInitializer() { // no lazy for initialize-only component
        return new org.docksidestage.oracle.dbflute.allcommon.DBFluteInitializer(_dataSource);
    }

    @Lazy
    @Bean(name="invokerAssistant")
    public InvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(_dataSource);
        return assistant;
    }

    protected ImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new org.docksidestage.oracle.dbflute.allcommon.ImplementedInvokerAssistant();
    }

    @Lazy
    @Bean(name="behaviorCommandInvoker")
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(createImplementedInvokerAssistant());
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Lazy
    @Bean(name="behaviorSelector")
    public ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        ImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_container);
        return selector;
    }

    protected ImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    @Lazy
    @Bean(name="commonColumnAutoSetupper")
    public ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return newImplementedCommonColumnAutoSetupper();
    }

    protected ImplementedCommonColumnAutoSetupper newImplementedCommonColumnAutoSetupper() {
        return new ImplementedCommonColumnAutoSetupper();
    }

    // ===================================================================================
    //                                                                            Behavior
    //                                                                            ========
    @Lazy
    @Bean(name="memberBhv")
    public MemberBhv createMemberBhv() {
        MemberBhv bhv = newMemberBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberBhv newMemberBhv() { return new MemberBhv(); }

    @Lazy
    @Bean(name="memberAddressBhv")
    public MemberAddressBhv createMemberAddressBhv() {
        MemberAddressBhv bhv = newMemberAddressBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberAddressBhv newMemberAddressBhv() { return new MemberAddressBhv(); }

    @Lazy
    @Bean(name="memberLoginBhv")
    public MemberLoginBhv createMemberLoginBhv() {
        MemberLoginBhv bhv = newMemberLoginBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberLoginBhv newMemberLoginBhv() { return new MemberLoginBhv(); }

    @Lazy
    @Bean(name="memberSecurityBhv")
    public MemberSecurityBhv createMemberSecurityBhv() {
        MemberSecurityBhv bhv = newMemberSecurityBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberSecurityBhv newMemberSecurityBhv() { return new MemberSecurityBhv(); }

    @Lazy
    @Bean(name="memberServiceBhv")
    public MemberServiceBhv createMemberServiceBhv() {
        MemberServiceBhv bhv = newMemberServiceBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberServiceBhv newMemberServiceBhv() { return new MemberServiceBhv(); }

    @Lazy
    @Bean(name="memberStatusBhv")
    public MemberStatusBhv createMemberStatusBhv() {
        MemberStatusBhv bhv = newMemberStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberStatusBhv newMemberStatusBhv() { return new MemberStatusBhv(); }

    @Lazy
    @Bean(name="memberVendorSynonymBhv")
    public MemberVendorSynonymBhv createMemberVendorSynonymBhv() {
        MemberVendorSynonymBhv bhv = newMemberVendorSynonymBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberVendorSynonymBhv newMemberVendorSynonymBhv() { return new MemberVendorSynonymBhv(); }

    @Lazy
    @Bean(name="memberWithdrawalBhv")
    public MemberWithdrawalBhv createMemberWithdrawalBhv() {
        MemberWithdrawalBhv bhv = newMemberWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected MemberWithdrawalBhv newMemberWithdrawalBhv() { return new MemberWithdrawalBhv(); }

    @Lazy
    @Bean(name="productBhv")
    public ProductBhv createProductBhv() {
        ProductBhv bhv = newProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductBhv newProductBhv() { return new ProductBhv(); }

    @Lazy
    @Bean(name="productCategoryBhv")
    public ProductCategoryBhv createProductCategoryBhv() {
        ProductCategoryBhv bhv = newProductCategoryBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductCategoryBhv newProductCategoryBhv() { return new ProductCategoryBhv(); }

    @Lazy
    @Bean(name="productStatusBhv")
    public ProductStatusBhv createProductStatusBhv() {
        ProductStatusBhv bhv = newProductStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ProductStatusBhv newProductStatusBhv() { return new ProductStatusBhv(); }

    @Lazy
    @Bean(name="purchaseBhv")
    public PurchaseBhv createPurchaseBhv() {
        PurchaseBhv bhv = newPurchaseBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected PurchaseBhv newPurchaseBhv() { return new PurchaseBhv(); }

    @Lazy
    @Bean(name="purchasePaymentBhv")
    public PurchasePaymentBhv createPurchasePaymentBhv() {
        PurchasePaymentBhv bhv = newPurchasePaymentBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected PurchasePaymentBhv newPurchasePaymentBhv() { return new PurchasePaymentBhv(); }

    @Lazy
    @Bean(name="regionBhv")
    public RegionBhv createRegionBhv() {
        RegionBhv bhv = newRegionBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected RegionBhv newRegionBhv() { return new RegionBhv(); }

    @Lazy
    @Bean(name="serviceRankBhv")
    public ServiceRankBhv createServiceRankBhv() {
        ServiceRankBhv bhv = newServiceRankBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ServiceRankBhv newServiceRankBhv() { return new ServiceRankBhv(); }

    @Lazy
    @Bean(name="summaryMemberPurchaseBhv")
    public SummaryMemberPurchaseBhv createSummaryMemberPurchaseBhv() {
        SummaryMemberPurchaseBhv bhv = newSummaryMemberPurchaseBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        return bhv;
    }
    protected SummaryMemberPurchaseBhv newSummaryMemberPurchaseBhv() { return new SummaryMemberPurchaseBhv(); }

    @Lazy
    @Bean(name="summaryProductBhv")
    public SummaryProductBhv createSummaryProductBhv() {
        SummaryProductBhv bhv = newSummaryProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SummaryProductBhv newSummaryProductBhv() { return new SummaryProductBhv(); }

    @Lazy
    @Bean(name="synonymExceptBhv")
    public SynonymExceptBhv createSynonymExceptBhv() {
        SynonymExceptBhv bhv = newSynonymExceptBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymExceptBhv newSynonymExceptBhv() { return new SynonymExceptBhv(); }

    @Lazy
    @Bean(name="synonymMemberBhv")
    public SynonymMemberBhv createSynonymMemberBhv() {
        SynonymMemberBhv bhv = newSynonymMemberBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymMemberBhv newSynonymMemberBhv() { return new SynonymMemberBhv(); }

    @Lazy
    @Bean(name="synonymMemberLoginBhv")
    public SynonymMemberLoginBhv createSynonymMemberLoginBhv() {
        SynonymMemberLoginBhv bhv = newSynonymMemberLoginBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymMemberLoginBhv newSynonymMemberLoginBhv() { return new SynonymMemberLoginBhv(); }

    @Lazy
    @Bean(name="synonymMemberWithdrawalBhv")
    public SynonymMemberWithdrawalBhv createSynonymMemberWithdrawalBhv() {
        SynonymMemberWithdrawalBhv bhv = newSynonymMemberWithdrawalBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymMemberWithdrawalBhv newSynonymMemberWithdrawalBhv() { return new SynonymMemberWithdrawalBhv(); }

    @Lazy
    @Bean(name="synonymNextLinkSecretBhv")
    public SynonymNextLinkSecretBhv createSynonymNextLinkSecretBhv() {
        SynonymNextLinkSecretBhv bhv = newSynonymNextLinkSecretBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymNextLinkSecretBhv newSynonymNextLinkSecretBhv() { return new SynonymNextLinkSecretBhv(); }

    @Lazy
    @Bean(name="synonymNextLinkSynonymBhv")
    public SynonymNextLinkSynonymBhv createSynonymNextLinkSynonymBhv() {
        SynonymNextLinkSynonymBhv bhv = newSynonymNextLinkSynonymBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymNextLinkSynonymBhv newSynonymNextLinkSynonymBhv() { return new SynonymNextLinkSynonymBhv(); }

    @Lazy
    @Bean(name="synonymNextLinkTableBhv")
    public SynonymNextLinkTableBhv createSynonymNextLinkTableBhv() {
        SynonymNextLinkTableBhv bhv = newSynonymNextLinkTableBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymNextLinkTableBhv newSynonymNextLinkTableBhv() { return new SynonymNextLinkTableBhv(); }

    @Lazy
    @Bean(name="synonymNextSameNameFkBhv")
    public SynonymNextSameNameFkBhv createSynonymNextSameNameFkBhv() {
        SynonymNextSameNameFkBhv bhv = newSynonymNextSameNameFkBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymNextSameNameFkBhv newSynonymNextSameNameFkBhv() { return new SynonymNextSameNameFkBhv(); }

    @Lazy
    @Bean(name="synonymNextSecretAuthBhv")
    public SynonymNextSecretAuthBhv createSynonymNextSecretAuthBhv() {
        SynonymNextSecretAuthBhv bhv = newSynonymNextSecretAuthBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymNextSecretAuthBhv newSynonymNextSecretAuthBhv() { return new SynonymNextSecretAuthBhv(); }

    @Lazy
    @Bean(name="synonymProductBhv")
    public SynonymProductBhv createSynonymProductBhv() {
        SynonymProductBhv bhv = newSynonymProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymProductBhv newSynonymProductBhv() { return new SynonymProductBhv(); }

    @Lazy
    @Bean(name="synonymProductStatusBhv")
    public SynonymProductStatusBhv createSynonymProductStatusBhv() {
        SynonymProductStatusBhv bhv = newSynonymProductStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymProductStatusBhv newSynonymProductStatusBhv() { return new SynonymProductStatusBhv(); }

    @Lazy
    @Bean(name="synonymRefExceptBhv")
    public SynonymRefExceptBhv createSynonymRefExceptBhv() {
        SynonymRefExceptBhv bhv = newSynonymRefExceptBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected SynonymRefExceptBhv newSynonymRefExceptBhv() { return new SynonymRefExceptBhv(); }

    @Lazy
    @Bean(name="vendorDollarBhv")
    public Vendor$DollarBhv createVendor$DollarBhv() {
        Vendor$DollarBhv bhv = newVendor$DollarBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected Vendor$DollarBhv newVendor$DollarBhv() { return new Vendor$DollarBhv(); }

    @Lazy
    @Bean(name="vendorCheckBhv")
    public VendorCheckBhv createVendorCheckBhv() {
        VendorCheckBhv bhv = newVendorCheckBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorCheckBhv newVendorCheckBhv() { return new VendorCheckBhv(); }

    @Lazy
    @Bean(name="vendorLargeDataBhv")
    public VendorLargeDataBhv createVendorLargeDataBhv() {
        VendorLargeDataBhv bhv = newVendorLargeDataBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorLargeDataBhv newVendorLargeDataBhv() { return new VendorLargeDataBhv(); }

    @Lazy
    @Bean(name="vendorLargeDataRefBhv")
    public VendorLargeDataRefBhv createVendorLargeDataRefBhv() {
        VendorLargeDataRefBhv bhv = newVendorLargeDataRefBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorLargeDataRefBhv newVendorLargeDataRefBhv() { return new VendorLargeDataRefBhv(); }

    @Lazy
    @Bean(name="vendorLargeName901234567890Bhv")
    public VendorLargeName901234567890Bhv createVendorLargeName901234567890Bhv() {
        VendorLargeName901234567890Bhv bhv = newVendorLargeName901234567890Bhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorLargeName901234567890Bhv newVendorLargeName901234567890Bhv() { return new VendorLargeName901234567890Bhv(); }

    @Lazy
    @Bean(name="vendorLargeName90123456RefBhv")
    public VendorLargeName90123456RefBhv createVendorLargeName90123456RefBhv() {
        VendorLargeName90123456RefBhv bhv = newVendorLargeName90123456RefBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorLargeName90123456RefBhv newVendorLargeName90123456RefBhv() { return new VendorLargeName90123456RefBhv(); }

    @Lazy
    @Bean(name="vendorSynonymMemberBhv")
    public VendorSynonymMemberBhv createVendorSynonymMemberBhv() {
        VendorSynonymMemberBhv bhv = newVendorSynonymMemberBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected VendorSynonymMemberBhv newVendorSynonymMemberBhv() { return new VendorSynonymMemberBhv(); }

    @Lazy
    @Bean(name="whiteDiffWorldBhv")
    public WhiteDiffWorldBhv createWhiteDiffWorldBhv() {
        WhiteDiffWorldBhv bhv = newWhiteDiffWorldBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteDiffWorldBhv newWhiteDiffWorldBhv() { return new WhiteDiffWorldBhv(); }

    @Lazy
    @Bean(name="whiteRefNextExceptBhv")
    public WhiteRefNextExceptBhv createWhiteRefNextExceptBhv() {
        WhiteRefNextExceptBhv bhv = newWhiteRefNextExceptBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteRefNextExceptBhv newWhiteRefNextExceptBhv() { return new WhiteRefNextExceptBhv(); }

    @Lazy
    @Bean(name="whiteRefNextTargetBhv")
    public WhiteRefNextTargetBhv createWhiteRefNextTargetBhv() {
        WhiteRefNextTargetBhv bhv = newWhiteRefNextTargetBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteRefNextTargetBhv newWhiteRefNextTargetBhv() { return new WhiteRefNextTargetBhv(); }

    @Lazy
    @Bean(name="whiteRefTargetBhv")
    public WhiteRefTargetBhv createWhiteRefTargetBhv() {
        WhiteRefTargetBhv bhv = newWhiteRefTargetBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteRefTargetBhv newWhiteRefTargetBhv() { return new WhiteRefTargetBhv(); }

    @Lazy
    @Bean(name="whiteSameNameBhv")
    public WhiteSameNameBhv createWhiteSameNameBhv() {
        WhiteSameNameBhv bhv = newWhiteSameNameBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteSameNameBhv newWhiteSameNameBhv() { return new WhiteSameNameBhv(); }

    @Lazy
    @Bean(name="whiteSameNameRefRefBhv")
    public WhiteSameNameRefRefBhv createWhiteSameNameRefRefBhv() {
        WhiteSameNameRefRefBhv bhv = newWhiteSameNameRefRefBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteSameNameRefRefBhv newWhiteSameNameRefRefBhv() { return new WhiteSameNameRefRefBhv(); }

    @Lazy
    @Bean(name="whiteTargetBhv")
    public WhiteTargetBhv createWhiteTargetBhv() {
        WhiteTargetBhv bhv = newWhiteTargetBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteTargetBhv newWhiteTargetBhv() { return new WhiteTargetBhv(); }

    @Lazy
    @Bean(name="whiteUqFkBhv")
    public WhiteUqFkBhv createWhiteUqFkBhv() {
        WhiteUqFkBhv bhv = newWhiteUqFkBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteUqFkBhv newWhiteUqFkBhv() { return new WhiteUqFkBhv(); }

    @Lazy
    @Bean(name="whiteUqFkRefBhv")
    public WhiteUqFkRefBhv createWhiteUqFkRefBhv() {
        WhiteUqFkRefBhv bhv = newWhiteUqFkRefBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteUqFkRefBhv newWhiteUqFkRefBhv() { return new WhiteUqFkRefBhv(); }

    @Lazy
    @Bean(name="whiteUqFkRefNestBhv")
    public WhiteUqFkRefNestBhv createWhiteUqFkRefNestBhv() {
        WhiteUqFkRefNestBhv bhv = newWhiteUqFkRefNestBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WhiteUqFkRefNestBhv newWhiteUqFkRefNestBhv() { return new WhiteUqFkRefNestBhv(); }

    @Lazy
    @Bean(name="whiteUqFkWithoutPkBhv")
    public WhiteUqFkWithoutPkBhv createWhiteUqFkWithoutPkBhv() {
        WhiteUqFkWithoutPkBhv bhv = newWhiteUqFkWithoutPkBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        return bhv;
    }
    protected WhiteUqFkWithoutPkBhv newWhiteUqFkWithoutPkBhv() { return new WhiteUqFkWithoutPkBhv(); }

    @Lazy
    @Bean(name="whiteUqFkWithoutPkRefBhv")
    public WhiteUqFkWithoutPkRefBhv createWhiteUqFkWithoutPkRefBhv() {
        WhiteUqFkWithoutPkRefBhv bhv = newWhiteUqFkWithoutPkRefBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        return bhv;
    }
    protected WhiteUqFkWithoutPkRefBhv newWhiteUqFkWithoutPkRefBhv() { return new WhiteUqFkWithoutPkRefBhv(); }

    @Lazy
    @Bean(name="withdrawalReasonBhv")
    public WithdrawalReasonBhv createWithdrawalReasonBhv() {
        WithdrawalReasonBhv bhv = newWithdrawalReasonBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected WithdrawalReasonBhv newWithdrawalReasonBhv() { return new WithdrawalReasonBhv(); }

    @Lazy
    @Bean(name="nextSchemaProductBhv")
    public NextSchemaProductBhv createNextSchemaProductBhv() {
        NextSchemaProductBhv bhv = newNextSchemaProductBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected NextSchemaProductBhv newNextSchemaProductBhv() { return new NextSchemaProductBhv(); }

    @Lazy
    @Bean(name="nextSchemaProductStatusBhv")
    public NextSchemaProductStatusBhv createNextSchemaProductStatusBhv() {
        NextSchemaProductStatusBhv bhv = newNextSchemaProductStatusBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected NextSchemaProductStatusBhv newNextSchemaProductStatusBhv() { return new NextSchemaProductStatusBhv(); }
}
