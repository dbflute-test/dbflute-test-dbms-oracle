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
 * The abstract condition-query of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public abstract class AbstractBsVendorSynonymMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorSynonymMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_SYNONYM_MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param minNumber The min number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of memberId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberIdList The collection of memberId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     * @param memberIdList The collection of memberId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_SynonymMemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSynonymMemberLogin</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loginCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_SynonymMemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymMemberLogin(SubQuery<SynonymMemberLoginCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_SynonymMemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    public void xsderiveSynonymMemberLoginList(String fn, SubQuery<SynonymMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SYNONYM_MEMBER_LOGIN where ...)} <br>
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "synonymMemberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(9)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberNameList The collection of memberName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    protected void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberNameList The collection of memberName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    protected void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), xgetCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberName The value of memberName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_LikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_NotLikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, xcLSOPPre());
    }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue xgetCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccountList The collection of memberAccount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    protected void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), xgetCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccountList The collection of memberAccount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    protected void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), xgetCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberAccount_LikeSearch(memberAccount, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), xgetCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberAccount_NotLikeSearch(memberAccount, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), xgetCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, xcLSOPPre());
    }

    protected void regMemberAccount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    protected abstract ConditionValue xgetCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
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
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
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
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_Equal(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_GreaterThan(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_LessThan(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_GreaterEqual(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFormalizedDatetime_LessEqual(java.time.LocalDateTime formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFormalizedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "FORMALIZED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFormalizedDatetime(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of formalizedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setFormalizedDatetime_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setFormalizedDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    protected abstract ConditionValue xgetCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_Equal(java.time.LocalDate birthdate) {
        regBirthdate(CK_EQ,  birthdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_GreaterThan(java.time.LocalDate birthdate) {
        regBirthdate(CK_GT,  birthdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_LessThan(java.time.LocalDate birthdate) {
        regBirthdate(CK_LT,  birthdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_GreaterEqual(java.time.LocalDate birthdate) {
        regBirthdate(CK_GE,  birthdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthdate_LessEqual(java.time.LocalDate birthdate) {
        regBirthdate(CK_LE, birthdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthdate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "BIRTHDATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthdate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of birthdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setBirthdate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setBirthdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (生年月日)BIRTHDATE: {DATE(7)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthdate(), "BIRTHDATE"); }
    protected abstract ConditionValue xgetCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @param registerProcess The value of registerProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue xgetCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(3)(11, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @param updateProcess The value of updateProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdateProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorSynonymMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorSynonymMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorSynonymMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorSynonymMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorSynonymMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorSynonymMemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorSynonymMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorSynonymMemberCQ sq);

    protected VendorSynonymMemberCB xcreateScalarConditionCB() {
        VendorSynonymMemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorSynonymMemberCB xcreateScalarConditionPartitionByCB() {
        VendorSynonymMemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorSynonymMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorSynonymMemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorSynonymMemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorSynonymMemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorSynonymMemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorSynonymMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorSynonymMemberCQ sq);

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
    protected VendorSynonymMemberCB newMyCB() {
        return new VendorSynonymMemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorSynonymMemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
