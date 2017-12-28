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
 * The abstract condition-query of user_t.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserTCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user_t";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_id from entry_t where ...)} <br>
     * entry_t by user_id, named 'entryTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsEntryT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EntryTList for 'exists'. (NotNull)
     */
    public void existsEntryT(SubQuery<EntryTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EntryTCB cb = new EntryTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_EntryTList(cb.query());
        registerExistsReferrer(cb.query(), "user_id", "user_id", pp, "entryTList");
    }
    public abstract String keepUserId_ExistsReferrer_EntryTList(EntryTCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select user_id from event_t where ...)} <br>
     * event_t by user_id, named 'eventTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsEventT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EventTList for 'exists'. (NotNull)
     */
    public void existsEventT(SubQuery<EventTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventTCB cb = new EventTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_EventTList(cb.query());
        registerExistsReferrer(cb.query(), "user_id", "user_id", pp, "eventTList");
    }
    public abstract String keepUserId_ExistsReferrer_EventTList(EventTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_id from entry_t where ...)} <br>
     * entry_t by user_id, named 'entryTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsEntryT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_EntryTList for 'not exists'. (NotNull)
     */
    public void notExistsEntryT(SubQuery<EntryTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EntryTCB cb = new EntryTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_EntryTList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", pp, "entryTList");
    }
    public abstract String keepUserId_NotExistsReferrer_EntryTList(EntryTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select user_id from event_t where ...)} <br>
     * event_t by user_id, named 'eventTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsEventT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_EventTList for 'not exists'. (NotNull)
     */
    public void notExistsEventT(SubQuery<EventTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventTCB cb = new EventTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_EventTList(cb.query());
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", pp, "eventTList");
    }
    public abstract String keepUserId_NotExistsReferrer_EventTList(EventTCQ sq);

    public void xsderiveEntryTList(String fn, SubQuery<EntryTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = new EntryTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_EntryTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_id", "user_id", pp, "entryTList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_EntryTList(EntryTCQ sq);

    public void xsderiveEventTList(String fn, SubQuery<EventTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = new EventTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_EventTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "user_id", "user_id", pp, "eventTList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_EventTList(EventTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from entry_t where ...)} <br>
     * entry_t by user_id, named 'entryTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedEntryT()</span>.<span style="color: #CC4747">max</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<EntryTCB> derivedEntryT() {
        return xcreateQDRFunctionEntryTList();
    }
    protected HpQDRFunction<EntryTCB> xcreateQDRFunctionEntryTList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveEntryTList(fn, sq, rd, vl, op));
    }
    public void xqderiveEntryTList(String fn, SubQuery<EntryTCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = new EntryTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_EntryTList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_EntryTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_id", "user_id", sqpp, "entryTList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_EntryTList(EntryTCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_EntryTListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from event_t where ...)} <br>
     * event_t by user_id, named 'eventTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedEventT()</span>.<span style="color: #CC4747">max</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<EventTCB> derivedEventT() {
        return xcreateQDRFunctionEventTList();
    }
    protected HpQDRFunction<EventTCB> xcreateQDRFunctionEventTList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveEventTList(fn, sq, rd, vl, op));
    }
    public void xqderiveEventTList(String fn, SubQuery<EventTCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = new EventTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_EventTList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_EventTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "user_id", "user_id", sqpp, "eventTList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_EventTList(EventTCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_EventTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_Equal(String loginId) {
        doSetLoginId_Equal(fRES(loginId));
    }

    protected void doSetLoginId_Equal(String loginId) {
        regLoginId(CK_EQ, loginId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_NotEqual(String loginId) {
        doSetLoginId_NotEqual(fRES(loginId));
    }

    protected void doSetLoginId_NotEqual(String loginId) {
        regLoginId(CK_NES, loginId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_GreaterThan(String loginId) {
        regLoginId(CK_GT, fRES(loginId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_LessThan(String loginId) {
        regLoginId(CK_LT, fRES(loginId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_GreaterEqual(String loginId) {
        regLoginId(CK_GE, fRES(loginId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_LessEqual(String loginId) {
        regLoginId(CK_LE, fRES(loginId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginIdList The collection of loginId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_InScope(Collection<String> loginIdList) {
        doSetLoginId_InScope(loginIdList);
    }

    protected void doSetLoginId_InScope(Collection<String> loginIdList) {
        regINS(CK_INS, cTL(loginIdList), xgetCValueLoginId(), "login_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginIdList The collection of loginId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginId_NotInScope(Collection<String> loginIdList) {
        doSetLoginId_NotInScope(loginIdList);
    }

    protected void doSetLoginId_NotInScope(Collection<String> loginIdList) {
        regINS(CK_NINS, cTL(loginIdList), xgetCValueLoginId(), "login_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)} <br>
     * <pre>e.g. setLoginId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param loginId The value of loginId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoginId_LikeSearch(String loginId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoginId_LikeSearch(loginId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)} <br>
     * <pre>e.g. setLoginId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginId The value of loginId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLoginId_LikeSearch(String loginId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginId), xgetCValueLoginId(), "login_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoginId_NotLikeSearch(String loginId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoginId_NotLikeSearch(loginId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     * @param loginId The value of loginId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLoginId_NotLikeSearch(String loginId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginId), xgetCValueLoginId(), "login_id", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     */
    public void setLoginId_IsNull() { regLoginId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     */
    public void setLoginId_IsNullOrEmpty() { regLoginId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * login_id: {UQ, text(2147483647)}
     */
    public void setLoginId_IsNotNull() { regLoginId(CK_ISNN, DOBJ); }

    protected void regLoginId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginId(), "login_id"); }
    protected abstract ConditionValue xgetCValueLoginId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_Equal(Integer lineFlg) {
        doSetLineFlg_Equal(lineFlg);
    }

    protected void doSetLineFlg_Equal(Integer lineFlg) {
        regLineFlg(CK_EQ, lineFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_NotEqual(Integer lineFlg) {
        doSetLineFlg_NotEqual(lineFlg);
    }

    protected void doSetLineFlg_NotEqual(Integer lineFlg) {
        regLineFlg(CK_NES, lineFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_GreaterThan(Integer lineFlg) {
        regLineFlg(CK_GT, lineFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_LessThan(Integer lineFlg) {
        regLineFlg(CK_LT, lineFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_GreaterEqual(Integer lineFlg) {
        regLineFlg(CK_GE, lineFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlg The value of lineFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineFlg_LessEqual(Integer lineFlg) {
        regLineFlg(CK_LE, lineFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of lineFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lineFlg. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLineFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLineFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of lineFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lineFlg. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLineFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineFlg(), "line_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlgList The collection of lineFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineFlg_InScope(Collection<Integer> lineFlgList) {
        doSetLineFlg_InScope(lineFlgList);
    }

    protected void doSetLineFlg_InScope(Collection<Integer> lineFlgList) {
        regINS(CK_INS, cTL(lineFlgList), xgetCValueLineFlg(), "line_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line_flg: {NotNull, int4(10), default=[0]}
     * @param lineFlgList The collection of lineFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineFlg_NotInScope(Collection<Integer> lineFlgList) {
        doSetLineFlg_NotInScope(lineFlgList);
    }

    protected void doSetLineFlg_NotInScope(Collection<Integer> lineFlgList) {
        regINS(CK_NINS, cTL(lineFlgList), xgetCValueLineFlg(), "line_flg");
    }

    protected void regLineFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineFlg(), "line_flg"); }
    protected abstract ConditionValue xgetCValueLineFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_Equal(String lineId) {
        doSetLineId_Equal(fRES(lineId));
    }

    protected void doSetLineId_Equal(String lineId) {
        regLineId(CK_EQ, lineId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_NotEqual(String lineId) {
        doSetLineId_NotEqual(fRES(lineId));
    }

    protected void doSetLineId_NotEqual(String lineId) {
        regLineId(CK_NES, lineId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_GreaterThan(String lineId) {
        regLineId(CK_GT, fRES(lineId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_LessThan(String lineId) {
        regLineId(CK_LT, fRES(lineId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_GreaterEqual(String lineId) {
        regLineId(CK_GE, fRES(lineId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_LessEqual(String lineId) {
        regLineId(CK_LE, fRES(lineId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineIdList The collection of lineId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_InScope(Collection<String> lineIdList) {
        doSetLineId_InScope(lineIdList);
    }

    protected void doSetLineId_InScope(Collection<String> lineIdList) {
        regINS(CK_INS, cTL(lineIdList), xgetCValueLineId(), "line_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineIdList The collection of lineId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineId_NotInScope(Collection<String> lineIdList) {
        doSetLineId_NotInScope(lineIdList);
    }

    protected void doSetLineId_NotInScope(Collection<String> lineIdList) {
        regINS(CK_NINS, cTL(lineIdList), xgetCValueLineId(), "line_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)} <br>
     * <pre>e.g. setLineId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lineId The value of lineId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineId_LikeSearch(String lineId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineId_LikeSearch(lineId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)} <br>
     * <pre>e.g. setLineId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineId The value of lineId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLineId_LikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineId), xgetCValueLineId(), "line_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineId_NotLikeSearch(String lineId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineId_NotLikeSearch(lineId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_id: {text(2147483647)}
     * @param lineId The value of lineId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLineId_NotLikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineId), xgetCValueLineId(), "line_id", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     */
    public void setLineId_IsNull() { regLineId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     */
    public void setLineId_IsNullOrEmpty() { regLineId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * line_id: {text(2147483647)}
     */
    public void setLineId_IsNotNull() { regLineId(CK_ISNN, DOBJ); }

    protected void regLineId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineId(), "line_id"); }
    protected abstract ConditionValue xgetCValueLineId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_Equal(String lineUserName) {
        doSetLineUserName_Equal(fRES(lineUserName));
    }

    protected void doSetLineUserName_Equal(String lineUserName) {
        regLineUserName(CK_EQ, lineUserName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_NotEqual(String lineUserName) {
        doSetLineUserName_NotEqual(fRES(lineUserName));
    }

    protected void doSetLineUserName_NotEqual(String lineUserName) {
        regLineUserName(CK_NES, lineUserName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_GreaterThan(String lineUserName) {
        regLineUserName(CK_GT, fRES(lineUserName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_LessThan(String lineUserName) {
        regLineUserName(CK_LT, fRES(lineUserName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_GreaterEqual(String lineUserName) {
        regLineUserName(CK_GE, fRES(lineUserName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_LessEqual(String lineUserName) {
        regLineUserName(CK_LE, fRES(lineUserName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserNameList The collection of lineUserName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_InScope(Collection<String> lineUserNameList) {
        doSetLineUserName_InScope(lineUserNameList);
    }

    protected void doSetLineUserName_InScope(Collection<String> lineUserNameList) {
        regINS(CK_INS, cTL(lineUserNameList), xgetCValueLineUserName(), "line_user_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserNameList The collection of lineUserName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineUserName_NotInScope(Collection<String> lineUserNameList) {
        doSetLineUserName_NotInScope(lineUserNameList);
    }

    protected void doSetLineUserName_NotInScope(Collection<String> lineUserNameList) {
        regINS(CK_NINS, cTL(lineUserNameList), xgetCValueLineUserName(), "line_user_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)} <br>
     * <pre>e.g. setLineUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lineUserName The value of lineUserName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineUserName_LikeSearch(String lineUserName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineUserName_LikeSearch(lineUserName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)} <br>
     * <pre>e.g. setLineUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineUserName The value of lineUserName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLineUserName_LikeSearch(String lineUserName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineUserName), xgetCValueLineUserName(), "line_user_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineUserName_NotLikeSearch(String lineUserName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineUserName_NotLikeSearch(lineUserName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * line_user_name: {text(2147483647)}
     * @param lineUserName The value of lineUserName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLineUserName_NotLikeSearch(String lineUserName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineUserName), xgetCValueLineUserName(), "line_user_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     */
    public void setLineUserName_IsNull() { regLineUserName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     */
    public void setLineUserName_IsNullOrEmpty() { regLineUserName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * line_user_name: {text(2147483647)}
     */
    public void setLineUserName_IsNotNull() { regLineUserName(CK_ISNN, DOBJ); }

    protected void regLineUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineUserName(), "line_user_name"); }
    protected abstract ConditionValue xgetCValueLineUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_Equal(String userName) {
        doSetUserName_Equal(fRES(userName));
    }

    protected void doSetUserName_Equal(String userName) {
        regUserName(CK_EQ, userName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_NotEqual(String userName) {
        doSetUserName_NotEqual(fRES(userName));
    }

    protected void doSetUserName_NotEqual(String userName) {
        regUserName(CK_NES, userName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_GreaterThan(String userName) {
        regUserName(CK_GT, fRES(userName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_LessThan(String userName) {
        regUserName(CK_LT, fRES(userName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_GreaterEqual(String userName) {
        regUserName(CK_GE, fRES(userName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_LessEqual(String userName) {
        regUserName(CK_LE, fRES(userName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userNameList The collection of userName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_InScope(Collection<String> userNameList) {
        doSetUserName_InScope(userNameList);
    }

    protected void doSetUserName_InScope(Collection<String> userNameList) {
        regINS(CK_INS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userNameList The collection of userName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_NotInScope(Collection<String> userNameList) {
        doSetUserName_NotInScope(userNameList);
    }

    protected void doSetUserName_NotInScope(Collection<String> userNameList) {
        regINS(CK_NINS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userName The value of userName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_LikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_LikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userName The value of userName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserName_LikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_NotLikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_NotLikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {text(2147483647)}
     * @param userName The value of userName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserName_NotLikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     */
    public void setUserName_IsNull() { regUserName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     */
    public void setUserName_IsNullOrEmpty() { regUserName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_name: {text(2147483647)}
     */
    public void setUserName_IsNotNull() { regUserName(CK_ISNN, DOBJ); }

    protected void regUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserName(), "user_name"); }
    protected abstract ConditionValue xgetCValueUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_Equal(String lastName) {
        doSetLastName_Equal(fRES(lastName));
    }

    protected void doSetLastName_Equal(String lastName) {
        regLastName(CK_EQ, lastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_NotEqual(String lastName) {
        doSetLastName_NotEqual(fRES(lastName));
    }

    protected void doSetLastName_NotEqual(String lastName) {
        regLastName(CK_NES, lastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_GreaterThan(String lastName) {
        regLastName(CK_GT, fRES(lastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_LessThan(String lastName) {
        regLastName(CK_LT, fRES(lastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_GreaterEqual(String lastName) {
        regLastName(CK_GE, fRES(lastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_LessEqual(String lastName) {
        regLastName(CK_LE, fRES(lastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastNameList The collection of lastName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_InScope(Collection<String> lastNameList) {
        doSetLastName_InScope(lastNameList);
    }

    protected void doSetLastName_InScope(Collection<String> lastNameList) {
        regINS(CK_INS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastNameList The collection of lastName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLastName_NotInScope(Collection<String> lastNameList) {
        doSetLastName_NotInScope(lastNameList);
    }

    protected void doSetLastName_NotInScope(Collection<String> lastNameList) {
        regINS(CK_NINS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lastName The value of lastName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_LikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_LikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastName The value of lastName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLastName_LikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_NotLikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_NotLikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {text(2147483647)}
     * @param lastName The value of lastName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLastName_NotLikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     */
    public void setLastName_IsNull() { regLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     */
    public void setLastName_IsNullOrEmpty() { regLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * last_name: {text(2147483647)}
     */
    public void setLastName_IsNotNull() { regLastName(CK_ISNN, DOBJ); }

    protected void regLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastName(), "last_name"); }
    protected abstract ConditionValue xgetCValueLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_Equal(String firstName) {
        doSetFirstName_Equal(fRES(firstName));
    }

    protected void doSetFirstName_Equal(String firstName) {
        regFirstName(CK_EQ, firstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_NotEqual(String firstName) {
        doSetFirstName_NotEqual(fRES(firstName));
    }

    protected void doSetFirstName_NotEqual(String firstName) {
        regFirstName(CK_NES, firstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_GreaterThan(String firstName) {
        regFirstName(CK_GT, fRES(firstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_LessThan(String firstName) {
        regFirstName(CK_LT, fRES(firstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_GreaterEqual(String firstName) {
        regFirstName(CK_GE, fRES(firstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_LessEqual(String firstName) {
        regFirstName(CK_LE, fRES(firstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstNameList The collection of firstName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_InScope(Collection<String> firstNameList) {
        doSetFirstName_InScope(firstNameList);
    }

    protected void doSetFirstName_InScope(Collection<String> firstNameList) {
        regINS(CK_INS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstNameList The collection of firstName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstName_NotInScope(Collection<String> firstNameList) {
        doSetFirstName_NotInScope(firstNameList);
    }

    protected void doSetFirstName_NotInScope(Collection<String> firstNameList) {
        regINS(CK_NINS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstName The value of firstName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_LikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_LikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstName The value of firstName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstName_LikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_NotLikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_NotLikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {text(2147483647)}
     * @param firstName The value of firstName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstName_NotLikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     */
    public void setFirstName_IsNull() { regFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     */
    public void setFirstName_IsNullOrEmpty() { regFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * first_name: {text(2147483647)}
     */
    public void setFirstName_IsNotNull() { regFirstName(CK_ISNN, DOBJ); }

    protected void regFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstName(), "first_name"); }
    protected abstract ConditionValue xgetCValueFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)}
     * @param emailList The collection of email as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    protected void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), xgetCValueEmail(), "email");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)}
     * @param emailList The collection of email as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    protected void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), xgetCValueEmail(), "email");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param email The value of email as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_LikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), xgetCValueEmail(), "email", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_NotLikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {text(2147483647)}
     * @param email The value of email as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "email", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     */
    public void setEmail_IsNull() { regEmail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     */
    public void setEmail_IsNullOrEmpty() { regEmail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * email: {text(2147483647)}
     */
    public void setEmail_IsNotNull() { regEmail(CK_ISNN, DOBJ); }

    protected void regEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail(), "email"); }
    protected abstract ConditionValue xgetCValueEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "password");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "password");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "password", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * password: {text(2147483647)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "password", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     */
    public void setPassword_IsNull() { regPassword(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     */
    public void setPassword_IsNullOrEmpty() { regPassword(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * password: {text(2147483647)}
     */
    public void setPassword_IsNotNull() { regPassword(CK_ISNN, DOBJ); }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "password"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
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
     * auth_level: {NotNull, int4(10), default=[0]}
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
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param authLevel The value of authLevel as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_GreaterThan(Integer authLevel) {
        regAuthLevel(CK_GT, authLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param authLevel The value of authLevel as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_LessThan(Integer authLevel) {
        regAuthLevel(CK_LT, authLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param authLevel The value of authLevel as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_GreaterEqual(Integer authLevel) {
        regAuthLevel(CK_GE, authLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param authLevel The value of authLevel as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuthLevel_LessEqual(Integer authLevel) {
        regAuthLevel(CK_LE, authLevel);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
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
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of authLevel. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of authLevel. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAuthLevel_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAuthLevel(), "auth_level", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * auth_level: {NotNull, int4(10), default=[0]}
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
     * auth_level: {NotNull, int4(10), default=[0]}
     * @param authLevelList The collection of authLevel as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuthLevel_NotInScope(Collection<Integer> authLevelList) {
        doSetAuthLevel_NotInScope(authLevelList);
    }

    protected void doSetAuthLevel_NotInScope(Collection<Integer> authLevelList) {
        regINS(CK_NINS, cTL(authLevelList), xgetCValueAuthLevel(), "auth_level");
    }

    protected void regAuthLevel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuthLevel(), "auth_level"); }
    protected abstract ConditionValue xgetCValueAuthLevel();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
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
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
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
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param userTypeId The value of userTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_GreaterThan(Integer userTypeId) {
        regUserTypeId(CK_GT, userTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param userTypeId The value of userTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_LessThan(Integer userTypeId) {
        regUserTypeId(CK_LT, userTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param userTypeId The value of userTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_GreaterEqual(Integer userTypeId) {
        regUserTypeId(CK_GE, userTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param userTypeId The value of userTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserTypeId_LessEqual(Integer userTypeId) {
        regUserTypeId(CK_LE, userTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
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
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param minNumber The min number of userTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserTypeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserTypeId(), "user_type_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
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
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @param userTypeIdList The collection of userTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserTypeId_NotInScope(Collection<Integer> userTypeIdList) {
        doSetUserTypeId_NotInScope(userTypeIdList);
    }

    protected void doSetUserTypeId_NotInScope(Collection<Integer> userTypeIdList) {
        regINS(CK_NINS, cTL(userTypeIdList), xgetCValueUserTypeId(), "user_type_id");
    }

    protected void regUserTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserTypeId(), "user_type_id"); }
    protected abstract ConditionValue xgetCValueUserTypeId();

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
    public HpSLCFunction<UserTCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserTCB.class);
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
    public HpSLCFunction<UserTCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserTCB.class);
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
    public HpSLCFunction<UserTCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserTCB.class);
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
    public HpSLCFunction<UserTCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserTCB.class);
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
    public HpSLCFunction<UserTCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserTCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserTCB&gt;() {
     *     public void query(UserTCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserTCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserTCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserTCQ sq);

    protected UserTCB xcreateScalarConditionCB() {
        UserTCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserTCB xcreateScalarConditionPartitionByCB() {
        UserTCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = new UserTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserTCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserTCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserTCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserTCB cb = new UserTCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserTCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserTCB cb = new UserTCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserTCQ sq);

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
    protected UserTCB newMyCB() {
        return new UserTCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserTCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
