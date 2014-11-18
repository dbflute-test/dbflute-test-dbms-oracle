package org.docksidestage.oracle.dbflute.resola.allcommon;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBFluteInitializer;
import org.docksidestage.oracle.dbflute.resola.exbhv.*;

/**
 * The Java configuration of DBFlute beans for Spring Framework. <br>
 * You can inject them by importing this class in your auto configuration class.
 * @author DBFlute(AutoGenerator)
 */
@Configuration
public class ResolaDBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    protected ApplicationContext _container;

    @Resource(name="resolaDataSource")
    protected DataSource _dataSource; // name basis here for multiple DB

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="resolaIntroduction")
    public ResolaDBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBFluteInitializer(_dataSource);
    }

    @Bean(name="resolaInvokerAssistant")
    public InvokerAssistant createImplementedInvokerAssistant() {
        ResolaImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(_dataSource);
        return assistant;
    }

    protected ResolaImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new org.docksidestage.oracle.dbflute.resola.allcommon.ResolaImplementedInvokerAssistant();
    }

    @Bean(name="resolaBehaviorCommandInvoker")
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(createImplementedInvokerAssistant());
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Bean(name="resolaBehaviorSelector")
    public ResolaImplementedBehaviorSelector createImplementedBehaviorSelector() {
        ResolaImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_container);
        return selector;
    }

    protected ResolaImplementedBehaviorSelector newImplementedBehaviorSelector() {
        return new ResolaImplementedBehaviorSelector();
    }

    @Bean(name="resolaCommonColumnAutoSetupper")
    public ResolaImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return newImplementedCommonColumnAutoSetupper();
    }

    protected ResolaImplementedCommonColumnAutoSetupper newImplementedCommonColumnAutoSetupper() {
        return new ResolaImplementedCommonColumnAutoSetupper();
    }

    // ===================================================================================
    //                                                                            Behavior
    //                                                                            ========
    @Bean(name="resolaStationBhv")
    public ResolaStationBhv createResolaStationBhv() {
        ResolaStationBhv bhv = newResolaStationBhv();
        bhv.setBehaviorCommandInvoker(createBehaviorCommandInvoker()); bhv.setBehaviorSelector(createImplementedBehaviorSelector());
        bhv.setCommonColumnAutoSetupper(createImplementedCommonColumnAutoSetupper());
        return bhv;
    }
    protected ResolaStationBhv newResolaStationBhv() { return new ResolaStationBhv(); }
}
