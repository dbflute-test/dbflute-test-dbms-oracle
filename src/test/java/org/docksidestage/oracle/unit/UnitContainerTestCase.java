package org.docksidestage.oracle.unit;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Stack;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.jdbc.PhysicalConnectionDigger;
import org.dbflute.utflute.spring.ContainerTestCase;
import org.docksidestage.oracle.JdbcBeansJavaConfig;
import org.docksidestage.oracle.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.docksidestage.oracle.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.oracle.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchasePaymentBhv;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jflute
 * @since 0.5.9 (2007/12/2 Thursday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final Stack<ConditionBean> _cbStack = new Stack<ConditionBean>();
    private BehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        _cbStack.clear();
    }

    @Override
    protected ApplicationContext provideDefaultApplicationContext() {
        return new AnnotationConfigApplicationContext(JdbcBeansJavaConfig.class, DBFluteBeansJavaConfig.class);
    }

    // ===================================================================================
    //                                                                 ConditionBean Stack
    //                                                                 ===================
    protected void pushCB(ConditionBean cb) {
        _cbStack.push(cb);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> CB popCB() {
        return (CB) _cbStack.pop();
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        // TODO jflute test: Oracle, MemberFollowing
        //deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }

    // ===================================================================================
    //                                                                   Connection Helper
    //                                                                   =================
    protected Connection digUpPhysicalConnection(Connection conn) throws SQLException {
        DBFluteConfig config = DBFluteConfig.getInstance();
        PhysicalConnectionDigger digger = config.getPhysicalConnectionDigger(); // basically not null
        Connection physConn = digger.digUp(conn);
        return physConn;
    }
}
