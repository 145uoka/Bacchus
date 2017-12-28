package com.Bacchus.dbflute.cbean.cq.bs;

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
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.cbean.*;
import com.Bacchus.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of auth_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAuthMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAuthMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "auth_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_Equal(Integer authLevel) {
        doSetAuthLevel_Equal(authLevel);
    }

    protected void doSetAuthLevel_Equal(Integer authLevel) {
        regAuthLevel(CK_EQ, authLevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_NotEqual(Integer authLevel) {
        doSetAuthLevel_NotEqual(authLevel);
    }

    protected void doSetAuthLevel_NotEqual(Integer authLevel) {
        regAuthLevel(CK_NES, authLevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_GreaterThan(Integer authLevel) {
        regAuthLevel(CK_GT, authLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_LessThan(Integer authLevel) {
        regAuthLevel(CK_LT, authLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_GreaterEqual(Integer authLevel) {
        regAuthLevel(CK_GE, authLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevel The value of authLevel as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_LessEqual(Integer authLevel) {
        regAuthLevel(CK_LE, authLevel);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param minNumber The min number of authLevel. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authLevel. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAuthLevel_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAuthLevel_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param minNumber The min number of authLevel. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authLevel. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAuthLevel_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAuthLevel(), "auth_level", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevelList The collection of authLevel as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthLevel_InScope(Collection<Integer> authLevelList) {
        doSetAuthLevel_InScope(authLevelList);
    }

    protected void doSetAuthLevel_InScope(Collection<Integer> authLevelList) {
        regINS(CK_INS, cTL(authLevelList), xgetCValueAuthLevel(), "auth_level");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @param authLevelList The collection of authLevel as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthLevel_NotInScope(Collection<Integer> authLevelList) {
        doSetAuthLevel_NotInScope(authLevelList);
    }

    protected void doSetAuthLevel_NotInScope(Collection<Integer> authLevelList) {
        regINS(CK_NINS, cTL(authLevelList), xgetCValueAuthLevel(), "auth_level");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select auth_level from user_t where ...)} <br>
     * user_t by auth_level, named 'userTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserTList for 'exists'. (NotNull)
     */
    public void existsUserT(SubQuery<UserTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserTCB cb = new UserTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAuthLevel_ExistsReferrer_UserTList(cb.query());
        registerExistsReferrer(cb.query(), "auth_level", "auth_level", pp, "userTList");
    }
    public abstract String keepAuthLevel_ExistsReferrer_UserTList(UserTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select auth_level from user_t where ...)} <br>
     * user_t by auth_level, named 'userTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AuthLevel_NotExistsReferrer_UserTList for 'not exists'. (NotNull)
     */
    public void notExistsUserT(SubQuery<UserTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserTCB cb = new UserTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAuthLevel_NotExistsReferrer_UserTList(cb.query());
        registerNotExistsReferrer(cb.query(), "auth_level", "auth_level", pp, "userTList");
    }
    public abstract String keepAuthLevel_NotExistsReferrer_UserTList(UserTCQ sq);

    public void xsderiveUserTList(String fn, SubQuery<UserTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = new UserTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAuthLevel_SpecifyDerivedReferrer_UserTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "auth_level", "auth_level", pp, "userTList", al, op);
    }
    public abstract String keepAuthLevel_SpecifyDerivedReferrer_UserTList(UserTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_t where ...)} <br>
     * user_t by auth_level, named 'userTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserT()</span>.<span style="color: #CC4747">max</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserTCB> derivedUserT() {
        return xcreateQDRFunctionUserTList();
    }
    protected HpQDRFunction<UserTCB> xcreateQDRFunctionUserTList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserTList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserTList(String fn, SubQuery<UserTCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = new UserTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAuthLevel_QueryDerivedReferrer_UserTList(cb.query()); String prpp = keepAuthLevel_QueryDerivedReferrer_UserTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "auth_level", "auth_level", sqpp, "userTList", rd, vl, prpp, op);
    }
    public abstract String keepAuthLevel_QueryDerivedReferrer_UserTList(UserTCQ sq);
    public abstract String keepAuthLevel_QueryDerivedReferrer_UserTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     */
    public void setAuthLevel_IsNull() { regAuthLevel(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * auth_level: {PK, NotNull, int4(10)}
     */
    public void setAuthLevel_IsNotNull() { regAuthLevel(CK_ISNN, DOBJ); }

    protected void regAuthLevel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuthLevel(), "auth_level"); }
    protected abstract ConditionValue xgetCValueAuthLevel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_Equal(String authName) {
        doSetAuthName_Equal(fRES(authName));
    }

    protected void doSetAuthName_Equal(String authName) {
        regAuthName(CK_EQ, authName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_NotEqual(String authName) {
        doSetAuthName_NotEqual(fRES(authName));
    }

    protected void doSetAuthName_NotEqual(String authName) {
        regAuthName(CK_NES, authName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_GreaterThan(String authName) {
        regAuthName(CK_GT, fRES(authName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_LessThan(String authName) {
        regAuthName(CK_LT, fRES(authName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_GreaterEqual(String authName) {
        regAuthName(CK_GE, fRES(authName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_LessEqual(String authName) {
        regAuthName(CK_LE, fRES(authName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authNameList The collection of authName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_InScope(Collection<String> authNameList) {
        doSetAuthName_InScope(authNameList);
    }

    protected void doSetAuthName_InScope(Collection<String> authNameList) {
        regINS(CK_INS, cTL(authNameList), xgetCValueAuthName(), "auth_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authNameList The collection of authName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthName_NotInScope(Collection<String> authNameList) {
        doSetAuthName_NotInScope(authNameList);
    }

    protected void doSetAuthName_NotInScope(Collection<String> authNameList) {
        regINS(CK_NINS, cTL(authNameList), xgetCValueAuthName(), "auth_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAuthName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param authName The value of authName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthName_LikeSearch(String authName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthName_LikeSearch(authName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAuthName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param authName The value of authName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAuthName_LikeSearch(String authName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(authName), xgetCValueAuthName(), "auth_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthName_NotLikeSearch(String authName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthName_NotLikeSearch(authName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @param authName The value of authName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAuthName_NotLikeSearch(String authName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(authName), xgetCValueAuthName(), "auth_name", likeSearchOption);
    }

    protected void regAuthName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuthName(), "auth_name"); }
    protected abstract ConditionValue xgetCValueAuthName();

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
    public HpSLCFunction<AuthMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AuthMCB.class);
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
    public HpSLCFunction<AuthMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AuthMCB.class);
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
    public HpSLCFunction<AuthMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AuthMCB.class);
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
    public HpSLCFunction<AuthMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AuthMCB.class);
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
    public HpSLCFunction<AuthMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AuthMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AuthMCB&gt;() {
     *     public void query(AuthMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AuthMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AuthMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AuthMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AuthMCQ sq);

    protected AuthMCB xcreateScalarConditionCB() {
        AuthMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AuthMCB xcreateScalarConditionPartitionByCB() {
        AuthMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AuthMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AuthMCB cb = new AuthMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "auth_level";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AuthMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AuthMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AuthMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AuthMCB cb = new AuthMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "auth_level";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AuthMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AuthMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AuthMCB cb = new AuthMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AuthMCQ sq);

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

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected AuthMCB newMyCB() {
        return new AuthMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AuthMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
