package org.docksidestage.oracle.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.utflute.seasar.ContainerTestCase;
import org.docksidestage.oracle.dbflute.cbean.MemberAddressCB;
import org.docksidestage.oracle.dbflute.cbean.MemberLoginCB;
import org.docksidestage.oracle.dbflute.cbean.MemberSecurityCB;
import org.docksidestage.oracle.dbflute.cbean.MemberServiceCB;
import org.docksidestage.oracle.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.oracle.dbflute.cbean.PurchaseCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv;

/**
 * The test base of application for Basic Example.
 * @author jflute
 * @since 0.5.9 (2007/12/2 Thursday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
        {
            MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            MemberAddressCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberLoginBhv bhv = _behaviorSelector.select(MemberLoginBhv.class);
            MemberLoginCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberSecurityBhv bhv = _behaviorSelector.select(MemberSecurityBhv.class);
            MemberSecurityCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberServiceBhv bhv = _behaviorSelector.select(MemberServiceBhv.class);
            MemberServiceCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            MemberWithdrawalBhv bhv = _behaviorSelector.select(MemberWithdrawalBhv.class);
            MemberWithdrawalCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
        {
            PurchaseBhv bhv = _behaviorSelector.select(PurchaseBhv.class);
            PurchaseCB cb = bhv.newConditionBean();
            bhv.varyingQueryDelete(cb, op -> op.allowNonQueryDelete());
        }
    }
}
