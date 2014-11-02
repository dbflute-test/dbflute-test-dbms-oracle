package org.docksidestage.oracle.dbflute.whitebox;

import org.dbflute.cbean.scoping.SubQuery;
import org.docksidestage.oracle.dbflute.cbean.WhiteUqFkCB;
import org.docksidestage.oracle.dbflute.cbean.WhiteUqFkRefCB;
import org.docksidestage.oracle.dbflute.cbean.WhiteUqFkRefNestCB;
import org.docksidestage.oracle.dbflute.cbean.WhiteUqFkWithoutPkCB;
import org.docksidestage.oracle.dbflute.cbean.WhiteUqFkWithoutPkRefCB;
import org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkBhv;
import org.docksidestage.oracle.dbflute.exbhv.WhiteUqFkWithoutPkBhv;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5A (2013/11/04 Monday)
 */
public class WxUniqueKeyFkTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteUqFkBhv whiteUqFkBhv;
    private WhiteUqFkWithoutPkBhv whiteUqFkWithoutPkBhv;

    // ===================================================================================
    //                                                                           Generated
    //                                                                           =========
    public void test_generated_basic() throws Exception {
        // ## Arrange ##
        WhiteUqFkCB cb = new WhiteUqFkCB();
        cb.query().existsWhiteUqFkRefByFkToUqCode(new SubQuery<WhiteUqFkRefCB>() {
            public void query(WhiteUqFkRefCB subCB) {
                subCB.query().existsWhiteUqFkRefNest(new SubQuery<WhiteUqFkRefNestCB>() {
                    public void query(WhiteUqFkRefNestCB subCB) {
                        subCB.query().queryWhiteUqFkRef().queryWhiteUqFkByFkToUqCode().setUqFkId_Equal(3L);
                    }
                });
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqFkBhv.selectList(cb); // expect no exception
    }

    public void test_generated_withoutPk() throws Exception {
        // ## Arrange ##
        WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
        cb.query().existsWhiteUqFkWithoutPkRef(new SubQuery<WhiteUqFkWithoutPkRefCB>() {
            public void query(WhiteUqFkWithoutPkRefCB subCB) {
                subCB.query().queryWhiteUqFkWithoutPk().setUqFkCode_Equal("FOO");
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqFkWithoutPkBhv.selectList(cb); // expect no exception
    }
}
