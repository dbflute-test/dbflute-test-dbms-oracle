package org.docksidestage.oracle.dbflute.whitebox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.dream.SpecifiedColumn;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.Srl;
import org.docksidestage.oracle.dbflute.cbean.MemberCB;
import org.docksidestage.oracle.dbflute.cbean.MemberSecurityCB;
import org.docksidestage.oracle.dbflute.cbean.MemberServiceCB;
import org.docksidestage.oracle.dbflute.cbean.PurchaseCB;
import org.docksidestage.oracle.dbflute.exbhv.MemberBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.oracle.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.oracle.dbflute.exentity.Member;
import org.docksidestage.oracle.dbflute.exentity.MemberSecurity;
import org.docksidestage.oracle.dbflute.exentity.MemberService;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/09/14 Sunday)
 */
public class WxCBDreamCruiseOracleTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberSecurityBhv memberSecurityBhv;
    private MemberServiceBhv memberServiceBhv;

    // ===================================================================================
    //                                                                        OverTheWaves
    //                                                                        ============
    public void test_DreamCruise_ColumnQuery_basic() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchase(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().columnMemberId());
                            }
                        });
                    }
                });
            }
        });
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
    }

    public void test_DreamCruise_ColumnQuery_calculation_basic() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchase(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        SpecifiedColumn pointColumn = dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount();
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().columnMemberId());
                            }
                        }).multiply(pointColumn).divide(pointColumn);
                    }
                });
            }
        });
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(sql, "*", "/"));
    }

    protected List<Member> selectMyOnlyProductMember() throws Exception {
        MemberCB cb = new MemberCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().derivedPurchase().countDistinct(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnMemberId();
                    }
                }).equal(1);
            }
        });
        cb.addOrderBy_PK_Asc();
        return memberBhv.selectList(cb);
    }

    public void test_DreamCruise_ColumnQuery_relation_convert() throws Exception {
        // ## Arrange ##
        List<Member> expectedList = selectMyOnlyProductMember();
        MemberCB cb = new MemberCB();
        cb.specify().columnBirthdate();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().notExistsPurchase(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.columnQuery(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.specify().columnMemberId();
                            }
                        }).notEqual(new SpecifyQuery<PurchaseCB>() {
                            public void specify(PurchaseCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnMemberId());
                            }
                        }).convert(op -> op.trunc(1));
                    }
                });
            }
        });
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
        assertEquals(expectedList, memberList);
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("trunc"));
    }

    // ===================================================================================
    //                                                                        MysticRythms
    //                                                                        ============
    public void test_ColumnQuery_MysticRythms_utilDate() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setBirthdate(toLocalDate("2014/09/10"));
            memberBhv.varyingQueryUpdate(member, new MemberCB(), op -> op.allowNonQueryUpdate());
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDate("2015/04/05"));
            }
        }).convert(op -> op.addMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessThan(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDate("2014/09/01"));
            }
        }).convert(op -> op.addDay(dreamCruiseCB.specify().columnMemberId()).addMinute(1));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toUtilDate("2006/09/26"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            log(memberId, member.getMemberName());
            assertTrue(memberId >= 9);
            if (memberId.equals(9)) {
                markHere("exists");
            }
        }
        assertMarked("exists");
        String sql = cb.toDisplaySql();
        assertContains(sql, "where dfloc.BIRTHDATE <= add_months(date '2015-04-05', dfloc.VERSION_NO)");
        assertContains(sql, "and dfloc.BIRTHDATE < date '2014-09-01' + dfloc.MEMBER_ID + 1 / 1440");
        assertContains(sql, "and dfloc.BIRTHDATE >= date '2006-09-26'");
    }

    public void test_ColumnQuery_MysticRythms_timestamp() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setFormalizedDatetime(toLocalDateTime("2014/09/10 12:34:56"));
            memberBhv.varyingQueryUpdate(member, new MemberCB(), op -> op.allowNonQueryUpdate());
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDateTime("2015/04/05 12:34:56"));
            }
        }).convert(op -> op.addMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDateTime("2014/09/01 15:00:00"));
            }
        }).convert(op -> op.addDay(dreamCruiseCB.specify().columnMemberId()).addHour(-3));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toTimestamp("2006/09/26 12:34:56.789"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member.getMemberId(), member.getMemberName());
            assertTrue(member.getMemberId() >= 10L);
        }
        String sql = cb.toDisplaySql();
        assertContains(sql, "where dfloc.FORMALIZED_DATETIME <= add_months(timestamp '2015-04-05 12:34:56.000', dfloc.VERSION_NO)");
        assertContains(sql, "and dfloc.FORMALIZED_DATETIME <= timestamp '2014-09-01 15:00:00.000' + dfloc.MEMBER_ID + -3 / 24");
        assertContains(sql, "and dfloc.FORMALIZED_DATETIME >= timestamp '2006-09-26 12:34:56.789'");
    }

    public void test_ColumnQuery_MysticRhythms_subtract() throws Exception {
        // ## Arrange ##
        {
            Member member = new Member();
            member.setBirthdate(toLocalDate("2014/09/10"));
            memberBhv.varyingQueryUpdate(member, new MemberCB(), op -> op.allowNonQueryUpdate());
        }
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toUtilDate("2006/09/26"));
            }
        }).convert(op -> op.subtractMonth(dreamCruiseCB.specify().columnVersionNo()));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDate("2014/09/20"));
            }
        }).convert(op -> op.subtractDay(dreamCruiseCB.specify().columnMemberId()).addMinute(-1));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(toLocalDate("2015/04/05"));
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            log(memberId, member.getMemberName());
            assertTrue(memberId <= 9);
            if (memberId.equals(9)) {
                markHere("exists");
            }
        }
        assertMarked("exists");
        String sql = cb.toDisplaySql();
        assertContains(sql, "where dfloc.BIRTHDATE >= add_months(date '2006-09-26', -dfloc.VERSION_NO)");
        assertContains(sql, "and dfloc.BIRTHDATE <= date '2014-09-20' - dfloc.MEMBER_ID + -1 / 1440");
        assertContains(sql, "and dfloc.BIRTHDATE <= date '2015-04-05'");
    }

    // ===================================================================================
    //                                                                          LikeSearch
    //                                                                          ==========
    public void test_DreamCruise_LikeSearch_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        LikeSearchOption option = new LikeSearchOption().likeContain();
        option.addCompoundColumn(dreamCruiseCB.specify().columnMemberAccount());
        cb.query().setMemberName_LikeSearch("P", option);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        boolean existsAccountOnly = false;
        boolean existsBoth = false;
        for (Member member : memberList) {
            log(member);
            String memberName = member.getMemberName();
            String memberAccount = member.getMemberAccount();
            if (!memberName.contains("P") && memberAccount.contains("P")) {
                existsAccountOnly = true;
            }
            if (memberName.contains("P") && memberAccount.contains("P")) {
                existsBoth = true;
            }
        }
        assertTrue(existsAccountOnly);
        assertTrue(existsBoth);
    }

    // ===================================================================================
    //                                                                         ManualOrder
    //                                                                         ===========
    public void test_DreamCruise_ManualOrder_basic() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        MemberCB cb = new MemberCB();
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(op -> {
            op.multiply(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        Integer previousSortValue = null;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer servicePointCount = serviceMap.get(memberId).getServicePointCount();
            Integer sortValue = memberId * servicePointCount;
            if (previousSortValue != null && previousSortValue > sortValue) {
                fail();
            }
            previousSortValue = sortValue;
            log(member.getMemberId() + ", " + servicePointCount + ", " + sortValue);
        }
    }

    public void test_DreamCruise_ManualOrder_derivedColumn_basic() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }, Member.ALIAS_highestPurchasePrice);
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(op -> {
            op.multiply(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        log(ln() + sql);
        String exp = "dfloc.MEMBER_ID * HIGHEST_PURCHASE_PRICE";
        assertTrue(sql.contains("order by " + exp + " asc"));
    }

    public void test_DreamCruise_ManualOrder_derivedColumn_twice() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberService> serviceList = memberServiceBhv.selectList(new MemberServiceCB());
        Map<Integer, MemberService> serviceMap = new HashMap<Integer, MemberService>();
        for (MemberService service : serviceList) {
            serviceMap.put(service.getMemberId(), service);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }, Member.ALIAS_highestPurchasePrice);
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_loginCount);
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(op -> {
            op.multiply(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
            op.plus(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_loginCount));
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        log(ln() + sql);
        String exp = "(dfloc.MEMBER_ID * HIGHEST_PURCHASE_PRICE) + LOGIN_COUNT";
        assertTrue(sql.contains("order by " + exp + " asc"));
    }

    public void test_DreamCruise_ManualOrder_union() throws Exception {
        // ## Arrange ##
        ListResultBean<MemberSecurity> securityList = memberSecurityBhv.selectList(new MemberSecurityCB());
        Map<Integer, MemberSecurity> securityMap = new HashMap<Integer, MemberSecurity>();
        for (MemberSecurity security : securityList) {
            securityMap.put(security.getMemberId(), security);
        }
        MemberCB cb = new MemberCB();
        //cb.setupSelect_MemberSecurityAsOne(); // auto-resolved
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
            }
        });
        MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.query().addOrderBy_MemberId_Asc().withManualOrder(op -> {
            op.multiply(dreamCruiseCB.specify().specifyMemberSecurityAsOne().columnReminderUseCount());
        });

        // ## Act ##
        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            log(e.getMessage());
        }

        // ## Assert ##
        // java.sql.SQLSyntaxErrorException: ORA-01785
        //assertHasAnyElement(memberList);
        //Long previousSortValue = null;
        //for (Member member : memberList) {
        //    Integer memberId = member.getMemberId();
        //    Integer useCount = securityMap.get(memberId).getReminderUseCount();
        //    Long sortValue = memberId * useCount;
        //    if (previousSortValue != null && previousSortValue > sortValue) {
        //        fail();
        //    }
        //    previousSortValue = sortValue;
        //    log(member.getMemberId() + ", " + useCount + ", " + sortValue);
        //}
        String sql = cb.toDisplaySql();
        assertContains(sql, "order by MEMBER_ID * REMINDER_USE_COUNT_3 asc");
    }
}
