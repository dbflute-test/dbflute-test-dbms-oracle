package org.docksidestage.oracle.dbflute.whitebox.resola;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.oracle.dbflute.cbean.MemberCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberBhv;
import org.docksidestage.oracle.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.oracle.dbflute.exentity.Member;
import org.docksidestage.oracle.dbflute.resola.exbhv.ResolaStationBhv;
import org.docksidestage.oracle.dbflute.resola.exentity.ResolaStation;
import org.docksidestage.oracle.unit.UnitResolaContainerTestCase;

/**
 * @author jflute
 */
@SuppressWarnings("unused")
public class WxMultipleDBResolaOracleTest extends UnitResolaContainerTestCase {

    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private ResolaStationBhv resolaStationBhv;

    public void test_acceesible() throws Exception {
        // #thinking jflute test: Oracle, only one test OK but batch test NG
        checkSelectToMainSchema();
        ResolaStation registered = registerTestStation();
        checkSelectToMainSchema();
        ListResultBean<ResolaStation> stationList = resolaStationBhv.selectList(cb -> {
            cb.orScopeQuery(orCB -> {
                orCB.query().setBirthdate_GreaterEqual(toLocalDateTime("1970/01/01")); /* should be DateTime */
                orCB.query().setFormalizedDatetime_GreaterEqual(toLocalDateTime("1970/01/01"));
                orCB.query().setHomeCount_GreaterEqual(0);
            });
        });
        assertHasAnyElement(stationList);
        for (ResolaStation station : stationList) {
            log(station);
            if (station.getStationId().equals(registered.getStationId())) {
                markHere("exists");
            }
        }
        assertMarked("exists");
        checkInsertToMainSchema();

        DataSource dataSource = getDataSource();
        log(dataSource);
        assertNotNull(dataSource); // maihamadb (test of UTFlute)
    }

    protected ResolaStation registerTestStation() {
        LocalDateTime currentLocalDateTime = currentLocalDateTime();
        BigDecimal workingKilometer = new BigDecimal("7.8");
        ResolaStation station = new ResolaStation();
        station.setStationId(88888);
        station.setStationName("MultipleDB Test");
        station.setBirthdate(currentLocalDateTime);
        station.setFormalizedDatetime(currentLocalDateTime());
        station.setHomeCount(3);
        station.setWorkingKilometer(workingKilometer);
        resolaStationBhv.insert(station);

        resolaStationBhv.selectEntity(cb -> {
            cb.query().setBirthdate_Equal(currentLocalDateTime.withNano(0));
            cb.query().setStationId_Equal(88888);
        }).alwaysPresent(actual -> {
            assertEquals(3, actual.getHomeCount());
            assertEquals(workingKilometer.setScale(2), actual.getWorkingKilometer().setScale(2));
        });
        return station;
    }

    protected void checkInsertToMainSchema() {
        Member member = new Member();
        member.setMemberName("multipleDbTest");
        member.setMemberAccount("multipleDbTest");
        member.setMemberStatusCode_Provisional();
        memberBhv.insert(member);
    }

    protected void checkSelectToMainSchema() {
        MemberCB cb = new MemberCB();
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        assertHasAnyElement(memberList);
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
