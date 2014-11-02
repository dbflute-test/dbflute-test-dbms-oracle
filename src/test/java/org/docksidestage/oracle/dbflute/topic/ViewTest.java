package org.docksidestage.oracle.dbflute.topic;

import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.oracle.dbflute.cbean.ProductStatusCB;
import org.docksidestage.oracle.dbflute.cbean.SummaryMemberPurchaseCB;
import org.docksidestage.oracle.dbflute.cbean.SummaryProductCB;
import org.docksidestage.oracle.dbflute.exbhv.ProductStatusBhv;
import org.docksidestage.oracle.dbflute.exbhv.SummaryMemberPurchaseBhv;
import org.docksidestage.oracle.dbflute.exbhv.SummaryProductBhv;
import org.docksidestage.oracle.dbflute.exentity.ProductStatus;
import org.docksidestage.oracle.dbflute.exentity.SummaryMemberPurchase;
import org.docksidestage.oracle.dbflute.exentity.SummaryProduct;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class ViewTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private SummaryProductBhv summaryProductBhv;
    private SummaryMemberPurchaseBhv summaryMemberPurchaseBhv;
    private ProductStatusBhv productStatusBhv;

    // ===================================================================================
    //                                                                       Relation Test
    //                                                                       =============
    public void test_setupSelect() {
        // ## Arrange ##
        SummaryProductCB cb = new SummaryProductCB();
        cb.setupSelect_ProductStatus();

        // ## Act ##
        ListResultBean<SummaryProduct> productList = summaryProductBhv.selectList(cb);

        // ## Assert ##
        for (SummaryProduct product : productList) {
            assertNotNull(product.getProductStatus());
        }
    }

    public void test_foreign_loadReferrer() {
        // ## Arrange ##
        ProductStatusCB cb = new ProductStatusCB();
        ListResultBean<ProductStatus> productStatusList = productStatusBhv.selectList(cb);

        // ## Act ##
        productStatusBhv.loadSummaryProduct(productStatusList, new ConditionBeanSetupper<SummaryProductCB>() {
            public void setup(SummaryProductCB cb) {
                cb.query().addOrderBy_LatestPurchaseDatetime_Desc();
            }
        });

        // ## Assert ##
        boolean existsSummaryProduct = false;
        for (ProductStatus productStatus : productStatusList) {
            log(productStatus);
            List<SummaryProduct> summaryProductList = productStatus.getSummaryProductList();
            for (SummaryProduct summaryProduct : summaryProductList) {
                log("    " + summaryProduct.toString());
                existsSummaryProduct = true;
            }
        }
        assertTrue(existsSummaryProduct);
    }

    // ===================================================================================
    //                                                                   Materialized View
    //                                                                   =================
    public void test_selectList_materialized_view() {
        // ## Arrange ##
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();

        // ## Act ##
        ListResultBean<SummaryMemberPurchase> mempurList = summaryMemberPurchaseBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mempurList.size());
        for (SummaryMemberPurchase member : mempurList) {
            log(member.toString());
        }
    }
}
