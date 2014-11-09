package org.docksidestage.oracle.unit;

import org.docksidestage.oracle.JdbcBeansJavaConfig;
import org.docksidestage.oracle.JdbcBeansResolaJavaConfig;
import org.docksidestage.oracle.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.docksidestage.oracle.dbflute.resola.allcommon.ResolaDBFluteBeansJavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The test base of application for ResortLine DB.
 * @author jflute
 * @since 1.1.0 (2014/11/09 Sunday)
 */
public abstract class UnitResolaContainerTestCase extends UnitContainerTestCase {
    // #multipleDb: configuration and transaction

    @Override
    protected ApplicationContext provideDefaultApplicationContext() {
        return new AnnotationConfigApplicationContext( //
                JdbcBeansJavaConfig.class, DBFluteBeansJavaConfig.class // maihamadb
                , JdbcBeansResolaJavaConfig.class, ResolaDBFluteBeansJavaConfig.class // resortlinedb
        );
    }

    @Override
    protected String[] prepareAdditionalTransactionManagerNames() {
        return new String[] { "resolaTransactionManager" };
    }
}
