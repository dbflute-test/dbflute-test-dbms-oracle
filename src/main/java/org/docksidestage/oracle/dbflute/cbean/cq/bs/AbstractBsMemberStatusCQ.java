package org.docksidestage.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.cbean.*;
import org.docksidestage.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_STATUS.
 * @author oracleman
 */
public abstract class AbstractBsMemberStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "MEMBER_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br>
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Equal_Formalized() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Equal_Withdrawal() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Equal_Provisional() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br>
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_NotEqual_Formalized() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_NotEqual_Withdrawal() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_NotEqual_Provisional() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_STATUS_CODE from MEMBER where ...)} <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberList for 'exists'. (NotNull)
     */
    public void existsMember(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_MemberList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOGIN_MEMBER_STATUS_CODE from MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    public void existsMemberLogin(SubQuery<MemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_MemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "memberLoginList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MemberLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_STATUS_CODE from MEMBER_VENDOR_SYNONYM where ...)} <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberVendorSynonym</span>(synonymCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     synonymCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberVendorSynonymList for 'exists'. (NotNull)
     */
    public void existsMemberVendorSynonym(SubQuery<MemberVendorSynonymCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberVendorSynonymCB cb = new MemberVendorSynonymCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_MemberVendorSynonymList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberVendorSynonymList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_STATUS_CODE from SYNONYM_MEMBER where ...)} <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSynonymMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SynonymMemberList for 'exists'. (NotNull)
     */
    public void existsSynonymMember(SubQuery<SynonymMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymMemberCB cb = new SynonymMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_SynonymMemberList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "synonymMemberList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_SynonymMemberList(SynonymMemberCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LOGIN_MEMBER_STATUS_CODE from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSynonymMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SynonymMemberLoginList for 'exists'. (NotNull)
     */
    public void existsSynonymMemberLogin(SubQuery<SynonymMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_SynonymMemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_STATUS_CODE from VENDOR_SYNONYM_MEMBER where ...)} <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendorSynonymMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VendorSynonymMemberList for 'exists'. (NotNull)
     */
    public void existsVendorSynonymMember(SubQuery<VendorSynonymMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_ExistsReferrer_VendorSynonymMemberList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "vendorSynonymMemberList");
    }
    public abstract String keepMemberStatusCode_ExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_STATUS_CODE from MEMBER where ...)} <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_MemberList for 'not exists'. (NotNull)
     */
    public void notExistsMember(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_MemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOGIN_MEMBER_STATUS_CODE from MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsMemberLogin(SubQuery<MemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_MemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "memberLoginList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_STATUS_CODE from MEMBER_VENDOR_SYNONYM where ...)} <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberVendorSynonym</span>(synonymCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     synonymCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_MemberVendorSynonymList for 'not exists'. (NotNull)
     */
    public void notExistsMemberVendorSynonym(SubQuery<MemberVendorSynonymCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberVendorSynonymCB cb = new MemberVendorSynonymCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberVendorSynonymList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_STATUS_CODE from SYNONYM_MEMBER where ...)} <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSynonymMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_SynonymMemberList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymMember(SubQuery<SynonymMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymMemberCB cb = new SynonymMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_SynonymMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "synonymMemberList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_SynonymMemberList(SynonymMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LOGIN_MEMBER_STATUS_CODE from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSynonymMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_SynonymMemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymMemberLogin(SubQuery<SynonymMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_STATUS_CODE from VENDOR_SYNONYM_MEMBER where ...)} <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendorSynonymMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberStatusCode_NotExistsReferrer_VendorSynonymMemberList for 'not exists'. (NotNull)
     */
    public void notExistsVendorSynonymMember(SubQuery<VendorSynonymMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "vendorSynonymMemberList");
    }
    public abstract String keepMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq);

    public void xsderiveMemberList(String fn, SubQuery<MemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq);

    public void xsderiveMemberLoginList(String fn, SubQuery<MemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "memberLoginList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq);

    public void xsderiveMemberVendorSynonymList(String fn, SubQuery<MemberVendorSynonymCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberVendorSynonymCB cb = new MemberVendorSynonymCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberVendorSynonymList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq);

    public void xsderiveSynonymMemberList(String fn, SubQuery<SynonymMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberCB cb = new SynonymMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "synonymMemberList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq);

    public void xsderiveSynonymMemberLoginList(String fn, SubQuery<SynonymMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", pp, "synonymMemberLoginList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    public void xsderiveVendorSynonymMemberList(String fn, SubQuery<VendorSynonymMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "vendorSynonymMemberList", al, op);
    }
    public abstract String keepMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER where ...)} <br>
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberCB> derivedMember() {
        return xcreateQDRFunctionMemberList();
    }
    protected HpQDRFunction<MemberCB> xcreateQDRFunctionMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberList(String fn, SubQuery<MemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_MemberList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", sqpp, "memberList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberLogin()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> derivedMemberLogin() {
        return xcreateQDRFunctionMemberLoginList();
    }
    protected HpQDRFunction<MemberLoginCB> xcreateQDRFunctionMemberLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberLoginList(String fn, SubQuery<MemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", sqpp, "memberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from MEMBER_VENDOR_SYNONYM where ...)} <br>
     * (会員)MEMBER_VENDOR_SYNONYM by MEMBER_STATUS_CODE, named 'memberVendorSynonymAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberVendorSynonym()</span>.<span style="color: #CC4747">max</span>(synonymCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     synonymCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     synonymCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberVendorSynonymCB> derivedMemberVendorSynonym() {
        return xcreateQDRFunctionMemberVendorSynonymList();
    }
    protected HpQDRFunction<MemberVendorSynonymCB> xcreateQDRFunctionMemberVendorSynonymList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberVendorSynonymList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberVendorSynonymList(String fn, SubQuery<MemberVendorSynonymCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberVendorSynonymCB cb = new MemberVendorSynonymCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", sqpp, "memberVendorSynonymList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SYNONYM_MEMBER where ...)} <br>
     * (会員)SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'synonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSynonymMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SynonymMemberCB> derivedSynonymMember() {
        return xcreateQDRFunctionSynonymMemberList();
    }
    protected HpQDRFunction<SynonymMemberCB> xcreateQDRFunctionSynonymMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSynonymMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveSynonymMemberList(String fn, SubQuery<SynonymMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberCB cb = new SynonymMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", sqpp, "synonymMemberList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSynonymMemberLogin()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loginCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SynonymMemberLoginCB> derivedSynonymMemberLogin() {
        return xcreateQDRFunctionSynonymMemberLoginList();
    }
    protected HpQDRFunction<SynonymMemberLoginCB> xcreateQDRFunctionSynonymMemberLoginList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSynonymMemberLoginList(fn, sq, rd, vl, op));
    }
    public void xqderiveSynonymMemberLoginList(String fn, SubQuery<SynonymMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", sqpp, "synonymMemberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from VENDOR_SYNONYM_MEMBER where ...)} <br>
     * (会員)VENDOR_SYNONYM_MEMBER by MEMBER_STATUS_CODE, named 'vendorSynonymMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendorSynonymMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorSynonymMemberCB> derivedVendorSynonymMember() {
        return xcreateQDRFunctionVendorSynonymMemberList();
    }
    protected HpQDRFunction<VendorSynonymMemberCB> xcreateQDRFunctionVendorSynonymMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendorSynonymMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendorSynonymMemberList(String fn, SubQuery<VendorSynonymMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList(cb.query()); String prpp = keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", sqpp, "vendorSynonymMemberList", rd, vl, prpp, op);
    }
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq);
    public abstract String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     */
    public void setMemberStatusCode_IsNull() { regMemberStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     */
    public void setMemberStatusCode_IsNotNull() { regMemberStatusCode(CK_ISNN, DOBJ); }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueMemberStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusName The value of memberStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_Equal(String memberStatusName) {
        doSetMemberStatusName_Equal(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_Equal(String memberStatusName) {
        regMemberStatusName(CK_EQ, memberStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusName The value of memberStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotEqual(String memberStatusName) {
        doSetMemberStatusName_NotEqual(fRES(memberStatusName));
    }

    protected void doSetMemberStatusName_NotEqual(String memberStatusName) {
        regMemberStatusName(CK_NES, memberStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusNameList The collection of memberStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_InScope(memberStatusNameList);
    }

    protected void doSetMemberStatusName_InScope(Collection<String> memberStatusNameList) {
        regINS(CK_INS, cTL(memberStatusNameList), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusNameList The collection of memberStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        doSetMemberStatusName_NotInScope(memberStatusNameList);
    }

    protected void doSetMemberStatusName_NotInScope(Collection<String> memberStatusNameList) {
        regINS(CK_NINS, cTL(memberStatusNameList), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setMemberStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberStatusName The value of memberStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberStatusName_LikeSearch(String memberStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberStatusName_LikeSearch(memberStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setMemberStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusName The value of memberStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusName_LikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusName), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusName The value of memberStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberStatusName_NotLikeSearch(String memberStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberStatusName_NotLikeSearch(memberStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusName The value of memberStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusName_NotLikeSearch(String memberStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusName), xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param memberStatusName The value of memberStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusName_PrefixSearch(String memberStatusName) {
        setMemberStatusName_LikeSearch(memberStatusName, xcLSOPPre());
    }

    protected void regMemberStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusName(), "MEMBER_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueMemberStatusName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param description The value of description as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param descriptionList The collection of description as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param descriptionList The collection of description as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @param description The value of description as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_PrefixSearch(String description) {
        setDescription_LikeSearch(description, xcLSOPPre());
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrder The value of displayOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrder The value of displayOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrder The value of displayOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrder The value of displayOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrderList The collection of displayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), xgetCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(8)}
     * @param displayOrderList The collection of displayOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), xgetCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberStatusCQ sq);

    protected MemberStatusCB xcreateScalarConditionCB() {
        MemberStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberStatusCB xcreateScalarConditionPartitionByCB() {
        MemberStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_STATUS_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberStatusCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br>
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MemberStatusCB newMyCB() {
        return new MemberStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
