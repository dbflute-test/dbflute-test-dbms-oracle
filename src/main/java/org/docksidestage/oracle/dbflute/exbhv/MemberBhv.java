package org.docksidestage.oracle.dbflute.exbhv;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.docksidestage.oracle.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.oracle.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.oracle.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;

/**
 * The behavior of MEMBER. <br />
 * You can implement your original methods here. <br />
 * This class is NOT overrided when re-generating. <br />
 * 
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("memberBhv")
public class MemberBhv extends org.docksidestage.oracle.dbflute.bsbhv.BsMemberBhv {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          Csv Output
    //                                                                          ==========
    /**
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final Long purchaseSummary = cursor.getPurchaseSummary();

                    _log.debug("  " + memberId + ", " + memberName + ", " + purchaseSummary);

                }
                return null;
            }
        };
        outsideSql().selectCursor(pmb, handler);
    }
}
