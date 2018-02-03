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
 * The abstract condition-query of event_type_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEventTypeMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEventTypeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "event_type_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_Equal(Integer eventTypeId) {
        doSetEventTypeId_Equal(eventTypeId);
    }

    protected void doSetEventTypeId_Equal(Integer eventTypeId) {
        regEventTypeId(CK_EQ, eventTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_NotEqual(Integer eventTypeId) {
        doSetEventTypeId_NotEqual(eventTypeId);
    }

    protected void doSetEventTypeId_NotEqual(Integer eventTypeId) {
        regEventTypeId(CK_NES, eventTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_GreaterThan(Integer eventTypeId) {
        regEventTypeId(CK_GT, eventTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_LessThan(Integer eventTypeId) {
        regEventTypeId(CK_LT, eventTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_GreaterEqual(Integer eventTypeId) {
        regEventTypeId(CK_GE, eventTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeId The value of eventTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_LessEqual(Integer eventTypeId) {
        regEventTypeId(CK_LE, eventTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of eventTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventTypeId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEventTypeId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEventTypeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of eventTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventTypeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventTypeId(), "event_type_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeIdList The collection of eventTypeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeId_InScope(Collection<Integer> eventTypeIdList) {
        doSetEventTypeId_InScope(eventTypeIdList);
    }

    protected void doSetEventTypeId_InScope(Collection<Integer> eventTypeIdList) {
        regINS(CK_INS, cTL(eventTypeIdList), xgetCValueEventTypeId(), "event_type_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @param eventTypeIdList The collection of eventTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeId_NotInScope(Collection<Integer> eventTypeIdList) {
        doSetEventTypeId_NotInScope(eventTypeIdList);
    }

    protected void doSetEventTypeId_NotInScope(Collection<Integer> eventTypeIdList) {
        regINS(CK_NINS, cTL(eventTypeIdList), xgetCValueEventTypeId(), "event_type_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select event_type_id from event_t where ...)} <br>
     * event_t by event_type_id, named 'eventTAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEventTypeId_ExistsReferrer_EventTList(cb.query());
        registerExistsReferrer(cb.query(), "event_type_id", "event_type_id", pp, "eventTList");
    }
    public abstract String keepEventTypeId_ExistsReferrer_EventTList(EventTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select event_type_id from event_t where ...)} <br>
     * event_t by event_type_id, named 'eventTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsEventT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EventTypeId_NotExistsReferrer_EventTList for 'not exists'. (NotNull)
     */
    public void notExistsEventT(SubQuery<EventTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventTCB cb = new EventTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEventTypeId_NotExistsReferrer_EventTList(cb.query());
        registerNotExistsReferrer(cb.query(), "event_type_id", "event_type_id", pp, "eventTList");
    }
    public abstract String keepEventTypeId_NotExistsReferrer_EventTList(EventTCQ sq);

    public void xsderiveEventTList(String fn, SubQuery<EventTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = new EventTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEventTypeId_SpecifyDerivedReferrer_EventTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "event_type_id", "event_type_id", pp, "eventTList", al, op);
    }
    public abstract String keepEventTypeId_SpecifyDerivedReferrer_EventTList(EventTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from event_t where ...)} <br>
     * event_t by event_type_id, named 'eventTAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepEventTypeId_QueryDerivedReferrer_EventTList(cb.query()); String prpp = keepEventTypeId_QueryDerivedReferrer_EventTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "event_type_id", "event_type_id", sqpp, "eventTList", rd, vl, prpp, op);
    }
    public abstract String keepEventTypeId_QueryDerivedReferrer_EventTList(EventTCQ sq);
    public abstract String keepEventTypeId_QueryDerivedReferrer_EventTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     */
    public void setEventTypeId_IsNull() { regEventTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     */
    public void setEventTypeId_IsNotNull() { regEventTypeId(CK_ISNN, DOBJ); }

    protected void regEventTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventTypeId(), "event_type_id"); }
    protected abstract ConditionValue xgetCValueEventTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_Equal(String eventTypeName) {
        doSetEventTypeName_Equal(fRES(eventTypeName));
    }

    protected void doSetEventTypeName_Equal(String eventTypeName) {
        regEventTypeName(CK_EQ, eventTypeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_NotEqual(String eventTypeName) {
        doSetEventTypeName_NotEqual(fRES(eventTypeName));
    }

    protected void doSetEventTypeName_NotEqual(String eventTypeName) {
        regEventTypeName(CK_NES, eventTypeName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_GreaterThan(String eventTypeName) {
        regEventTypeName(CK_GT, fRES(eventTypeName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_LessThan(String eventTypeName) {
        regEventTypeName(CK_LT, fRES(eventTypeName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_GreaterEqual(String eventTypeName) {
        regEventTypeName(CK_GE, fRES(eventTypeName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_LessEqual(String eventTypeName) {
        regEventTypeName(CK_LE, fRES(eventTypeName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeNameList The collection of eventTypeName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_InScope(Collection<String> eventTypeNameList) {
        doSetEventTypeName_InScope(eventTypeNameList);
    }

    protected void doSetEventTypeName_InScope(Collection<String> eventTypeNameList) {
        regINS(CK_INS, cTL(eventTypeNameList), xgetCValueEventTypeName(), "event_type_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeNameList The collection of eventTypeName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeName_NotInScope(Collection<String> eventTypeNameList) {
        doSetEventTypeName_NotInScope(eventTypeNameList);
    }

    protected void doSetEventTypeName_NotInScope(Collection<String> eventTypeNameList) {
        regINS(CK_NINS, cTL(eventTypeNameList), xgetCValueEventTypeName(), "event_type_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setEventTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param eventTypeName The value of eventTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventTypeName_LikeSearch(String eventTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventTypeName_LikeSearch(eventTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setEventTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eventTypeName The value of eventTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEventTypeName_LikeSearch(String eventTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventTypeName), xgetCValueEventTypeName(), "event_type_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventTypeName_NotLikeSearch(String eventTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventTypeName_NotLikeSearch(eventTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @param eventTypeName The value of eventTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEventTypeName_NotLikeSearch(String eventTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventTypeName), xgetCValueEventTypeName(), "event_type_name", likeSearchOption);
    }

    protected void regEventTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventTypeName(), "event_type_name"); }
    protected abstract ConditionValue xgetCValueEventTypeName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_Equal(Integer orderNum) {
        doSetOrderNum_Equal(orderNum);
    }

    protected void doSetOrderNum_Equal(Integer orderNum) {
        regOrderNum(CK_EQ, orderNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_NotEqual(Integer orderNum) {
        doSetOrderNum_NotEqual(orderNum);
    }

    protected void doSetOrderNum_NotEqual(Integer orderNum) {
        regOrderNum(CK_NES, orderNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterThan(Integer orderNum) {
        regOrderNum(CK_GT, orderNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessThan(Integer orderNum) {
        regOrderNum(CK_LT, orderNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_GreaterEqual(Integer orderNum) {
        regOrderNum(CK_GE, orderNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNum The value of orderNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNum_LessEqual(Integer orderNum) {
        regOrderNum(CK_LE, orderNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param minNumber The min number of orderNum. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of orderNum. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOrderNum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOrderNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     * @param minNumber The min number of orderNum. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of orderNum. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOrderNum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderNum(), "order_num", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNumList The collection of orderNum as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrderNum_InScope(Collection<Integer> orderNumList) {
        doSetOrderNum_InScope(orderNumList);
    }

    protected void doSetOrderNum_InScope(Collection<Integer> orderNumList) {
        regINS(CK_INS, cTL(orderNumList), xgetCValueOrderNum(), "order_num");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * order_num: {int4(10)}
     * @param orderNumList The collection of orderNum as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrderNum_NotInScope(Collection<Integer> orderNumList) {
        doSetOrderNum_NotInScope(orderNumList);
    }

    protected void doSetOrderNum_NotInScope(Collection<Integer> orderNumList) {
        regINS(CK_NINS, cTL(orderNumList), xgetCValueOrderNum(), "order_num");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     */
    public void setOrderNum_IsNull() { regOrderNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * order_num: {int4(10)}
     */
    public void setOrderNum_IsNotNull() { regOrderNum(CK_ISNN, DOBJ); }

    protected void regOrderNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNum(), "order_num"); }
    protected abstract ConditionValue xgetCValueOrderNum();

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
    public HpSLCFunction<EventTypeMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EventTypeMCB.class);
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
    public HpSLCFunction<EventTypeMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EventTypeMCB.class);
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
    public HpSLCFunction<EventTypeMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EventTypeMCB.class);
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
    public HpSLCFunction<EventTypeMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EventTypeMCB.class);
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
    public HpSLCFunction<EventTypeMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EventTypeMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EventTypeMCB&gt;() {
     *     public void query(EventTypeMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EventTypeMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EventTypeMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTypeMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EventTypeMCQ sq);

    protected EventTypeMCB xcreateScalarConditionCB() {
        EventTypeMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EventTypeMCB xcreateScalarConditionPartitionByCB() {
        EventTypeMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EventTypeMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTypeMCB cb = new EventTypeMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "event_type_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EventTypeMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EventTypeMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EventTypeMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTypeMCB cb = new EventTypeMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "event_type_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EventTypeMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EventTypeMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventTypeMCB cb = new EventTypeMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EventTypeMCQ sq);

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
    protected EventTypeMCB newMyCB() {
        return new EventTypeMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EventTypeMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
