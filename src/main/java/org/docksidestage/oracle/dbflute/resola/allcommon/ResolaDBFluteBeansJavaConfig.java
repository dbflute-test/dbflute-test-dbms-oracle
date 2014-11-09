package org.docksidestage.oracle.dbflute.resola.allcommon;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBFluteInitializer;
import org.docksidestage.oracle.dbflute.resola.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
@Configuration
public class ResolaDBFluteBeansJavaConfig {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // *according to dependency order
    // and all injections use 'Resource' annotation to keep the order
    // probably 'Resource' is processed before 'Autowired'
    // besides, 'Resource' finds by name (specified or field name) first
    // but secondly finds by type (only once so not case with small performance)
    @Resource
    protected ApplicationContext _xcontainer;

    // injections are on name basic here for multiple DB
    @Resource(name="resolaDataSource")
    protected DataSource dataSource;

    @Resource(name="resolaInvokerAssistant")
    protected InvokerAssistant invokerAssistant;

    @Resource(name="resolaBehaviorCommandInvoker")
    protected BehaviorCommandInvoker behaviorCommandInvoker;

    @Resource(name="resolaBehaviorSelector")
    protected BehaviorSelector behaviorSelector;

    @Resource(name="resolaCommonColumnAutoSetupper")
    protected CommonColumnAutoSetupper commonColumnAutoSetupper;

    // ===================================================================================
    //                                                                   Runtime Component
    //                                                                   =================
    @Bean(name="resolaIntroduction")
    public ResolaDBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBFluteInitializer(dataSource);
    }

    @Bean(name="resolaInvokerAssistant")
    public InvokerAssistant createImplementedInvokerAssistant() {
        ResolaImplementedInvokerAssistant assistant = newImplementedInvokerAssistant();
        assistant.setDataSource(dataSource);
        return assistant;
    }

    protected ResolaImplementedInvokerAssistant newImplementedInvokerAssistant() {
        return new org.docksidestage.oracle.dbflute.resola.allcommon.ResolaImplementedInvokerAssistant();
    }

    @Bean(name="resolaBehaviorCommandInvoker")
    public BehaviorCommandInvoker createBehaviorCommandInvoker() {
        BehaviorCommandInvoker invoker = newBehaviorCommandInvoker();
        invoker.setInvokerAssistant(invokerAssistant);
        return invoker;
    }

    protected BehaviorCommandInvoker newBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    @Bean(name="resolaBehaviorSelector")
    public ResolaImplementedBehaviorSelector createImplementedBehaviorSelector() {
        ResolaImplementedBehaviorSelector selector = newImplementedBehaviorSelector();
        selector.setContainer(_xcontainer);
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
        bhv.setBehaviorCommandInvoker(behaviorCommandInvoker); bhv.setBehaviorSelector(behaviorSelector);
        bhv.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
        return bhv;
    }
    protected ResolaStationBhv newResolaStationBhv() { return new ResolaStationBhv(); }
}
