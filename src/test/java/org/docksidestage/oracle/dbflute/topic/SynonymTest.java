package org.docksidestage.oracle.dbflute.topic;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.docksidestage.oracle.dbflute.cbean.SynonymNextLinkSecretCB;
import org.docksidestage.oracle.dbflute.cbean.SynonymRefExceptCB;
import org.docksidestage.oracle.dbflute.cbean.VendorSynonymMemberCB;
import org.docksidestage.oracle.dbflute.cbean.WhiteRefTargetCB;
import org.docksidestage.oracle.dbflute.exbhv.SynonymExceptBhv;
import org.docksidestage.oracle.dbflute.exbhv.SynonymNextLinkSecretBhv;
import org.docksidestage.oracle.dbflute.exbhv.SynonymRefExceptBhv;
import org.docksidestage.oracle.dbflute.exbhv.VendorSynonymMemberBhv;
import org.docksidestage.oracle.dbflute.exbhv.WhiteRefTargetBhv;
import org.docksidestage.oracle.dbflute.exbhv.WhiteTargetBhv;
import org.docksidestage.oracle.dbflute.exentity.SynonymExcept;
import org.docksidestage.oracle.dbflute.exentity.SynonymNextLinkSecret;
import org.docksidestage.oracle.dbflute.exentity.SynonymRefExcept;
import org.docksidestage.oracle.dbflute.exentity.VendorSynonymMember;
import org.docksidestage.oracle.dbflute.exentity.WhiteRefTarget;
import org.docksidestage.oracle.dbflute.exentity.WhiteTarget;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class SynonymTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorSynonymMemberBhv vendorSynonymMemberBhv;
    private SynonymExceptBhv synonymExceptBhv;
    private SynonymRefExceptBhv synonymRefExceptBhv;
    private SynonymNextLinkSecretBhv synonymNextLinkSecretBhv;
    private WhiteTargetBhv whiteTargetBhv;
    private WhiteRefTargetBhv whiteRefTargetBhv;

    // ===================================================================================
    //                                                                             Synonym
    //                                                                             =======
    public void test_selectList_Synonym() {
        // ## Arrange ##
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.setupSelect_MemberStatus();
        cb.setupSelect_SynonymMemberWithdrawalAsOne();
        cb.query().myselfExists(new SubQuery<VendorSynonymMemberCB>() {
            public void query(VendorSynonymMemberCB subCB) {
                subCB.useInScopeSubQuery();
                subCB.query().setMemberName_PrefixSearch("S");
                subCB.union(new UnionQuery<VendorSynonymMemberCB>() {
                    public void query(VendorSynonymMemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Withdrawal();
                    }
                });
            }
        });

        // ## Act ##
        final ListResultBean<VendorSynonymMember> memberList = vendorSynonymMemberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean existsWithdrawal = false;
        for (VendorSynonymMember member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
            assertNotNull(member.getMemberStatus());
            if (member.getSynonymMemberWithdrawalAsOne() != null) {
                existsWithdrawal = true;
            }
        }
        assertTrue(existsWithdrawal);
    }

    public void test_selectList_SynonymRelation_TableExcept_SynonymOnly() {
        // ## Arrange ##
        SynonymExcept synonymVendorExcept = new SynonymExcept();
        synonymVendorExcept.setExceptId(3L);
        synonymVendorExcept.setExceptName("ExceptName");
        synonymExceptBhv.insert(synonymVendorExcept);

        SynonymRefExcept synonymWhiteRefExcept = new SynonymRefExcept();
        synonymWhiteRefExcept.setRefExceptId(5L);
        synonymWhiteRefExcept.setExceptId(3L);
        synonymRefExceptBhv.insert(synonymWhiteRefExcept);

        SynonymRefExceptCB cb = new SynonymRefExceptCB();
        cb.setupSelect_SynonymExcept();

        // ## Act ##
        final ListResultBean<SynonymRefExcept> memberList = synonymRefExceptBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (SynonymRefExcept ref : memberList) {
            log(ref);
            SynonymExcept foreign = ref.getSynonymExcept().get();
            assertNotNull(foreign);
        }
    }

    public void test_selectList_SynonymRelation_TableTarget_SynonymExceot() {
        // ## Arrange ##
        WhiteTarget vendorTarget = new WhiteTarget();
        vendorTarget.setTargetId(3L);
        vendorTarget.setTargetName("TargetName");
        whiteTargetBhv.insert(vendorTarget);

        WhiteRefTarget vendorRefTarget = new WhiteRefTarget();
        vendorRefTarget.setRefTargetId(5L);
        vendorRefTarget.setTargetId(3L);
        whiteRefTargetBhv.insert(vendorRefTarget);

        WhiteRefTargetCB cb = new WhiteRefTargetCB();
        cb.setupSelect_WhiteTarget();

        // ## Act ##
        final ListResultBean<WhiteRefTarget> memberList = whiteRefTargetBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (WhiteRefTarget ref : memberList) {
            log(ref);
            WhiteTarget foreign = ref.getWhiteTarget().get();
            assertNotNull(foreign);
        }
    }

    public void test_selectList_DBLinkSynonym() {
        // ## Arrange ##
        SynonymNextLinkSecret secret = new SynonymNextLinkSecret();
        secret.setSecretCode("ABC");
        secret.setSecretName("ABC_NAME");
        synonymNextLinkSecretBhv.insert(secret);

        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
        cb.query().setSecretCode_Equal("ABC");

        // ## Act ##
        SynonymNextLinkSecret actual = synonymNextLinkSecretBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertEquals("ABC", actual.getSecretCode());
        assertEquals("ABC_NAME", actual.getSecretName());
    }
}