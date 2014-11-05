package org.docksidestage.oracle.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.utflute.seasar.ContainerTestCase;
import org.docksidestage.oracle.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchasePaymentBhv;

/**
 * The test base of application for Basic Example.
 * @author jflute
 * @since 0.5.9 (2007/12/2 Thursday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    private BehaviorSelector _behaviorSelector;

    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        // TODO jflute test: MemberFollowing in Oracle
        //deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }
}
