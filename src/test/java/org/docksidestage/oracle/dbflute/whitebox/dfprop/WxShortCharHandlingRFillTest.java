package org.docksidestage.oracle.dbflute.whitebox.dfprop;

import java.lang.reflect.Field;

import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.oracle.dbflute.cbean.MemberCB;
import org.docksidestage.oracle.dbflute.cbean.MemberStatusCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.OptionMemberPmb;
import org.docksidestage.oracle.dbflute.exentity.MemberStatus;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class WxShortCharHandlingRFillTest extends UnitContainerTestCase {

    private MemberStatusBhv memberStatusBhv;

    public void test_shortChar_conditionBean_rfill() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act ##
        cb.query().invokeQueryEqual("MEMBER_STATUS_CODE", "AB");

        // ## Assert ##
        assertEquals("AB ", cb.query().xdfgetMemberStatusCode().getFixedQuery().get("equal"));
    }

    public void test_shortChar_conditionBean_rfill_select() {
        // ## Arrange ##
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.mynativeMappingMemberStatusCode("AB ");
        memberStatus.setMemberStatusName("ShortTest "); // varchar
        memberStatus.setDescription("foo");
        memberStatus.setDisplayOrder(99);
        memberStatusBhv.insert(memberStatus);

        MemberStatusCB cb = new MemberStatusCB();
        cb.query().invokeQueryEqual("MEMBER_STATUS_CODE", "AB");

        // ## Act ##
        MemberStatus actual = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("ShortTest ", actual.getMemberStatusName()); // varchar
        assertEquals("AB ", actual.getMemberStatusCode());
    }

    public void test_shortChar_parameterBean_rfill() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        setMemberStatusCode(pmb, "AB");
        setStatus(pmb, "AB");

        // ## Assert ##
        assertEquals("AB", pmb.getMemberStatusCode());
        assertEquals("AB ", pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_null() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        setMemberStatusCode(pmb, null);
        setStatus(pmb, null);

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_empty() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        setMemberStatusCode(pmb, "");
        setStatus(pmb, "");

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfill_oneSpace() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        setMemberStatusCode(pmb, " ");
        setStatus(pmb, " ");

        // ## Assert ##
        assertEquals(" ", pmb.getMemberStatusCode());
        assertEquals("   ", pmb.getStatus());
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void setMemberStatusCode(OptionMemberPmb pmb, String value) {
        Field field = DfReflectionUtil.getWholeField(pmb.getClass(), "_memberStatusCode");
        field.setAccessible(true);
        DfReflectionUtil.setValue(field, pmb, value);
    }

    protected void setStatus(OptionMemberPmb pmb, String value) {
        Field field = DfReflectionUtil.getWholeField(pmb.getClass(), "_status");
        field.setAccessible(true);
        DfReflectionUtil.setValue(field, pmb, value);
    }
}
