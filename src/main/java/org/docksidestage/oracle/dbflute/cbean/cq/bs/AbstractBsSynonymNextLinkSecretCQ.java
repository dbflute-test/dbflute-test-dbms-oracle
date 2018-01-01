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
 * The abstract condition-query of SYNONYM_NEXT_LINK_SECRET.
 * @author oracleman
 */
public abstract class AbstractBsSynonymNextLinkSecretCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymNextLinkSecretCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretCode_Equal(String secretCode) {
        doSetSecretCode_Equal(fRES(secretCode));
    }

    protected void doSetSecretCode_Equal(String secretCode) {
        regSecretCode(CK_EQ, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretCode_NotEqual(String secretCode) {
        doSetSecretCode_NotEqual(fRES(secretCode));
    }

    protected void doSetSecretCode_NotEqual(String secretCode) {
        regSecretCode(CK_NES, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretCode_InScope(Collection<String> secretCodeList) {
        doSetSecretCode_InScope(secretCodeList);
    }

    protected void doSetSecretCode_InScope(Collection<String> secretCodeList) {
        regINS(CK_INS, cTL(secretCodeList), xgetCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretCode_NotInScope(Collection<String> secretCodeList) {
        doSetSecretCode_NotInScope(secretCodeList);
    }

    protected void doSetSecretCode_NotInScope(Collection<String> secretCodeList) {
        regINS(CK_NINS, cTL(secretCodeList), xgetCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecretCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secretCode The value of secretCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretCode_LikeSearch(String secretCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretCode_LikeSearch(secretCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)} <br>
     * <pre>e.g. setSecretCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretCode The value of secretCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretCode_LikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretCode), xgetCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretCode_NotLikeSearch(String secretCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretCode_NotLikeSearch(secretCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretCode_NotLikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretCode), xgetCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretCode_PrefixSearch(String secretCode) {
        setSecretCode_LikeSearch(secretCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNull() { regSecretCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNotNull() { regSecretCode(CK_ISNN, DOBJ); }

    protected void regSecretCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecretCode(), "SECRET_CODE"); }
    protected abstract ConditionValue xgetCValueSecretCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretName_Equal(String secretName) {
        doSetSecretName_Equal(fRES(secretName));
    }

    protected void doSetSecretName_Equal(String secretName) {
        regSecretName(CK_EQ, secretName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretName_NotEqual(String secretName) {
        doSetSecretName_NotEqual(fRES(secretName));
    }

    protected void doSetSecretName_NotEqual(String secretName) {
        regSecretName(CK_NES, secretName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretName_InScope(Collection<String> secretNameList) {
        doSetSecretName_InScope(secretNameList);
    }

    protected void doSetSecretName_InScope(Collection<String> secretNameList) {
        regINS(CK_INS, cTL(secretNameList), xgetCValueSecretName(), "SECRET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretName_NotInScope(Collection<String> secretNameList) {
        doSetSecretName_NotInScope(secretNameList);
    }

    protected void doSetSecretName_NotInScope(Collection<String> secretNameList) {
        regINS(CK_NINS, cTL(secretNameList), xgetCValueSecretName(), "SECRET_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setSecretName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secretName The value of secretName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretName_LikeSearch(String secretName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretName_LikeSearch(secretName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br>
     * <pre>e.g. setSecretName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretName The value of secretName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretName_LikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretName), xgetCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretName_NotLikeSearch(String secretName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretName_NotLikeSearch(secretName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretName_NotLikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretName), xgetCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretName_PrefixSearch(String secretName) {
        setSecretName_LikeSearch(secretName, xcLSOPPre());
    }

    protected void regSecretName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecretName(), "SECRET_NAME"); }
    protected abstract ConditionValue xgetCValueSecretName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretAuthCode_Equal(String secretAuthCode) {
        doSetSecretAuthCode_Equal(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_Equal(String secretAuthCode) {
        regSecretAuthCode(CK_EQ, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretAuthCode_NotEqual(String secretAuthCode) {
        doSetSecretAuthCode_NotEqual(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_NotEqual(String secretAuthCode) {
        regSecretAuthCode(CK_NES, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_InScope(secretAuthCodeList);
    }

    protected void doSetSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        regINS(CK_INS, cTL(secretAuthCodeList), xgetCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_NotInScope(secretAuthCodeList);
    }

    protected void doSetSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        regINS(CK_NINS, cTL(secretAuthCodeList), xgetCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)} <br>
     * <pre>e.g. setSecretAuthCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param secretAuthCode The value of secretAuthCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretAuthCode_LikeSearch(String secretAuthCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretAuthCode_LikeSearch(secretAuthCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)} <br>
     * <pre>e.g. setSecretAuthCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretAuthCode The value of secretAuthCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretAuthCode_LikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretAuthCode), xgetCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSecretAuthCode_NotLikeSearch(String secretAuthCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSecretAuthCode_NotLikeSearch(secretAuthCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretAuthCode_NotLikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretAuthCode), xgetCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSecretAuthCode_PrefixSearch(String secretAuthCode) {
        setSecretAuthCode_LikeSearch(secretAuthCode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNull() { regSecretAuthCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNullOrEmpty() { regSecretAuthCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNotNull() { regSecretAuthCode(CK_ISNN, DOBJ); }

    protected void regSecretAuthCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecretAuthCode(), "SECRET_AUTH_CODE"); }
    protected abstract ConditionValue xgetCValueSecretAuthCode();

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
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SynonymNextLinkSecretCB.class);
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
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SynonymNextLinkSecretCB.class);
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
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SynonymNextLinkSecretCB.class);
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
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SynonymNextLinkSecretCB.class);
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
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SynonymNextLinkSecretCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SynonymNextLinkSecretCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SynonymNextLinkSecretCQ sq);

    protected SynonymNextLinkSecretCB xcreateScalarConditionCB() {
        SynonymNextLinkSecretCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SynonymNextLinkSecretCB xcreateScalarConditionPartitionByCB() {
        SynonymNextLinkSecretCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymNextLinkSecretCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SECRET_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymNextLinkSecretCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymNextLinkSecretCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SynonymNextLinkSecretCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SECRET_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymNextLinkSecretCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymNextLinkSecretCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymNextLinkSecretCQ sq);

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
    protected SynonymNextLinkSecretCB newMyCB() {
        return new SynonymNextLinkSecretCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SynonymNextLinkSecretCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
