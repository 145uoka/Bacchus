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
 * The abstract condition-query of user_type_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserTypeMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserTypeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user_type_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_Equal(Integer userTypeId) {
        doSetUserTypeId_Equal(userTypeId);
    }

    protected void doSetUserTypeId_Equal(Integer userTypeId) {
        regUserTypeId(CK_EQ, userTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_NotEqual(Integer userTypeId) {
        doSetUserTypeId_NotEqual(userTypeId);
    }

    protected void doSetUserTypeId_NotEqual(Integer userTypeId) {
        regUserTypeId(CK_NES, userTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_GreaterThan(Integer userTypeId) {
        regUserTypeId(CK_GT, userTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_LessThan(Integer userTypeId) {
        regUserTypeId(CK_LT, userTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_GreaterEqual(Integer userTypeId) {
        regUserTypeId(CK_GE, userTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeId The value of userTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_LessEqual(Integer userTypeId) {
        regUserTypeId(CK_LE, userTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userTypeId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserTypeId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserTypeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserTypeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserTypeId(), "user_type_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeIdList The collection of userTypeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeId_InScope(Collection<Integer> userTypeIdList) {
        doSetUserTypeId_InScope(userTypeIdList);
    }

    protected void doSetUserTypeId_InScope(Collection<Integer> userTypeIdList) {
        regINS(CK_INS, cTL(userTypeIdList), xgetCValueUserTypeId(), "user_type_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @param userTypeIdList The collection of userTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeId_NotInScope(Collection<Integer> userTypeIdList) {
        doSetUserTypeId_NotInScope(userTypeIdList);
    }

    protected void doSetUserTypeId_NotInScope(Collection<Integer> userTypeIdList) {
        regINS(CK_NINS, cTL(userTypeIdList), xgetCValueUserTypeId(), "user_type_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_type_id from user_t where ...)} <br>
     * user_t by user_type_id, named 'userTAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserTypeId_ExistsReferrer_UserTList(cb.query());
        registerExistsReferrer(cb.query(), "user_type_id", "user_type_id", pp, "userTList");
    }
    public abstract String keepUserTypeId_ExistsReferrer_UserTList(UserTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_type_id from user_t where ...)} <br>
     * user_t by user_type_id, named 'userTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserTypeId_NotExistsReferrer_UserTList for 'not exists'. (NotNull)
     */
    public void notExistsUserT(SubQuery<UserTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserTCB cb = new UserTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserTypeId_NotExistsReferrer_UserTList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_type_id", "user_type_id", pp, "userTList");
    }
    public abstract String keepUserTypeId_NotExistsReferrer_UserTList(UserTCQ sq);

    public void xsderiveUserTList(String fn, SubQuery<UserTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = new UserTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserTypeId_SpecifyDerivedReferrer_UserTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_type_id", "user_type_id", pp, "userTList", al, op);
    }
    public abstract String keepUserTypeId_SpecifyDerivedReferrer_UserTList(UserTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_t where ...)} <br>
     * user_t by user_type_id, named 'userTAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserTypeId_QueryDerivedReferrer_UserTList(cb.query()); String prpp = keepUserTypeId_QueryDerivedReferrer_UserTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_type_id", "user_type_id", sqpp, "userTList", rd, vl, prpp, op);
    }
    public abstract String keepUserTypeId_QueryDerivedReferrer_UserTList(UserTCQ sq);
    public abstract String keepUserTypeId_QueryDerivedReferrer_UserTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserTypeId_IsNull() { regUserTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserTypeId_IsNotNull() { regUserTypeId(CK_ISNN, DOBJ); }

    protected void regUserTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserTypeId(), "user_type_id"); }
    protected abstract ConditionValue xgetCValueUserTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_Equal(String userTypeName) {
        doSetUserTypeName_Equal(fRES(userTypeName));
    }

    protected void doSetUserTypeName_Equal(String userTypeName) {
        regUserTypeName(CK_EQ, userTypeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_NotEqual(String userTypeName) {
        doSetUserTypeName_NotEqual(fRES(userTypeName));
    }

    protected void doSetUserTypeName_NotEqual(String userTypeName) {
        regUserTypeName(CK_NES, userTypeName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_GreaterThan(String userTypeName) {
        regUserTypeName(CK_GT, fRES(userTypeName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_LessThan(String userTypeName) {
        regUserTypeName(CK_LT, fRES(userTypeName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_GreaterEqual(String userTypeName) {
        regUserTypeName(CK_GE, fRES(userTypeName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_LessEqual(String userTypeName) {
        regUserTypeName(CK_LE, fRES(userTypeName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeNameList The collection of userTypeName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_InScope(Collection<String> userTypeNameList) {
        doSetUserTypeName_InScope(userTypeNameList);
    }

    protected void doSetUserTypeName_InScope(Collection<String> userTypeNameList) {
        regINS(CK_INS, cTL(userTypeNameList), xgetCValueUserTypeName(), "user_type_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeNameList The collection of userTypeName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeName_NotInScope(Collection<String> userTypeNameList) {
        doSetUserTypeName_NotInScope(userTypeNameList);
    }

    protected void doSetUserTypeName_NotInScope(Collection<String> userTypeNameList) {
        regINS(CK_NINS, cTL(userTypeNameList), xgetCValueUserTypeName(), "user_type_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setUserTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userTypeName The value of userTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserTypeName_LikeSearch(String userTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserTypeName_LikeSearch(userTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setUserTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userTypeName The value of userTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserTypeName_LikeSearch(String userTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userTypeName), xgetCValueUserTypeName(), "user_type_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserTypeName_NotLikeSearch(String userTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserTypeName_NotLikeSearch(userTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @param userTypeName The value of userTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserTypeName_NotLikeSearch(String userTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userTypeName), xgetCValueUserTypeName(), "user_type_name", likeSearchOption);
    }

    protected void regUserTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserTypeName(), "user_type_name"); }
    protected abstract ConditionValue xgetCValueUserTypeName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_Equal(Integer subsidyAmount) {
        doSetSubsidyAmount_Equal(subsidyAmount);
    }

    protected void doSetSubsidyAmount_Equal(Integer subsidyAmount) {
        regSubsidyAmount(CK_EQ, subsidyAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_NotEqual(Integer subsidyAmount) {
        doSetSubsidyAmount_NotEqual(subsidyAmount);
    }

    protected void doSetSubsidyAmount_NotEqual(Integer subsidyAmount) {
        regSubsidyAmount(CK_NES, subsidyAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_GreaterThan(Integer subsidyAmount) {
        regSubsidyAmount(CK_GT, subsidyAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_LessThan(Integer subsidyAmount) {
        regSubsidyAmount(CK_LT, subsidyAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_GreaterEqual(Integer subsidyAmount) {
        regSubsidyAmount(CK_GE, subsidyAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmount The value of subsidyAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsidyAmount_LessEqual(Integer subsidyAmount) {
        regSubsidyAmount(CK_LE, subsidyAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of subsidyAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of subsidyAmount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSubsidyAmount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSubsidyAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of subsidyAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of subsidyAmount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSubsidyAmount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSubsidyAmount(), "subsidy_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmountList The collection of subsidyAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsidyAmount_InScope(Collection<Integer> subsidyAmountList) {
        doSetSubsidyAmount_InScope(subsidyAmountList);
    }

    protected void doSetSubsidyAmount_InScope(Collection<Integer> subsidyAmountList) {
        regINS(CK_INS, cTL(subsidyAmountList), xgetCValueSubsidyAmount(), "subsidy_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @param subsidyAmountList The collection of subsidyAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsidyAmount_NotInScope(Collection<Integer> subsidyAmountList) {
        doSetSubsidyAmount_NotInScope(subsidyAmountList);
    }

    protected void doSetSubsidyAmount_NotInScope(Collection<Integer> subsidyAmountList) {
        regINS(CK_NINS, cTL(subsidyAmountList), xgetCValueSubsidyAmount(), "subsidy_amount");
    }

    protected void regSubsidyAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubsidyAmount(), "subsidy_amount"); }
    protected abstract ConditionValue xgetCValueSubsidyAmount();

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
    public HpSLCFunction<UserTypeMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserTypeMCB.class);
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
    public HpSLCFunction<UserTypeMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserTypeMCB.class);
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
    public HpSLCFunction<UserTypeMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserTypeMCB.class);
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
    public HpSLCFunction<UserTypeMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserTypeMCB.class);
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
    public HpSLCFunction<UserTypeMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserTypeMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserTypeMCB&gt;() {
     *     public void query(UserTypeMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserTypeMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserTypeMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTypeMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserTypeMCQ sq);

    protected UserTypeMCB xcreateScalarConditionCB() {
        UserTypeMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserTypeMCB xcreateScalarConditionPartitionByCB() {
        UserTypeMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserTypeMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTypeMCB cb = new UserTypeMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_type_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserTypeMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserTypeMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserTypeMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTypeMCB cb = new UserTypeMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_type_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserTypeMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserTypeMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserTypeMCB cb = new UserTypeMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserTypeMCQ sq);

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
    protected UserTypeMCB newMyCB() {
        return new UserTypeMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserTypeMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
