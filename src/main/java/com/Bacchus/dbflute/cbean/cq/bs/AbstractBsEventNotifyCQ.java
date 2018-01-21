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
 * The abstract condition-query of event_notify.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEventNotifyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEventNotifyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "event_notify";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_Equal(Integer eventNotifyNo) {
        doSetEventNotifyNo_Equal(eventNotifyNo);
    }

    protected void doSetEventNotifyNo_Equal(Integer eventNotifyNo) {
        regEventNotifyNo(CK_EQ, eventNotifyNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_NotEqual(Integer eventNotifyNo) {
        doSetEventNotifyNo_NotEqual(eventNotifyNo);
    }

    protected void doSetEventNotifyNo_NotEqual(Integer eventNotifyNo) {
        regEventNotifyNo(CK_NES, eventNotifyNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_GreaterThan(Integer eventNotifyNo) {
        regEventNotifyNo(CK_GT, eventNotifyNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_LessThan(Integer eventNotifyNo) {
        regEventNotifyNo(CK_LT, eventNotifyNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_GreaterEqual(Integer eventNotifyNo) {
        regEventNotifyNo(CK_GE, eventNotifyNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNo The value of eventNotifyNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNotifyNo_LessEqual(Integer eventNotifyNo) {
        regEventNotifyNo(CK_LE, eventNotifyNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of eventNotifyNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventNotifyNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEventNotifyNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEventNotifyNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of eventNotifyNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventNotifyNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventNotifyNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventNotifyNo(), "event_notify_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNoList The collection of eventNotifyNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventNotifyNo_InScope(Collection<Integer> eventNotifyNoList) {
        doSetEventNotifyNo_InScope(eventNotifyNoList);
    }

    protected void doSetEventNotifyNo_InScope(Collection<Integer> eventNotifyNoList) {
        regINS(CK_INS, cTL(eventNotifyNoList), xgetCValueEventNotifyNo(), "event_notify_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @param eventNotifyNoList The collection of eventNotifyNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventNotifyNo_NotInScope(Collection<Integer> eventNotifyNoList) {
        doSetEventNotifyNo_NotInScope(eventNotifyNoList);
    }

    protected void doSetEventNotifyNo_NotInScope(Collection<Integer> eventNotifyNoList) {
        regINS(CK_NINS, cTL(eventNotifyNoList), xgetCValueEventNotifyNo(), "event_notify_no");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     */
    public void setEventNotifyNo_IsNull() { regEventNotifyNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     */
    public void setEventNotifyNo_IsNotNull() { regEventNotifyNo(CK_ISNN, DOBJ); }

    protected void regEventNotifyNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventNotifyNo(), "event_notify_no"); }
    protected abstract ConditionValue xgetCValueEventNotifyNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_Equal(Integer eventNo) {
        doSetEventNo_Equal(eventNo);
    }

    protected void doSetEventNo_Equal(Integer eventNo) {
        regEventNo(CK_EQ, eventNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_NotEqual(Integer eventNo) {
        doSetEventNo_NotEqual(eventNo);
    }

    protected void doSetEventNo_NotEqual(Integer eventNo) {
        regEventNo(CK_NES, eventNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_GreaterThan(Integer eventNo) {
        regEventNo(CK_GT, eventNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_LessThan(Integer eventNo) {
        regEventNo(CK_LT, eventNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_GreaterEqual(Integer eventNo) {
        regEventNo(CK_GE, eventNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNo The value of eventNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_LessEqual(Integer eventNo) {
        regEventNo(CK_LE, eventNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param minNumber The min number of eventNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEventNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEventNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param minNumber The min number of eventNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventNo(), "event_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNoList The collection of eventNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventNo_InScope(Collection<Integer> eventNoList) {
        doSetEventNo_InScope(eventNoList);
    }

    protected void doSetEventNo_InScope(Collection<Integer> eventNoList) {
        regINS(CK_INS, cTL(eventNoList), xgetCValueEventNo(), "event_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @param eventNoList The collection of eventNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventNo_NotInScope(Collection<Integer> eventNoList) {
        doSetEventNo_NotInScope(eventNoList);
    }

    protected void doSetEventNo_NotInScope(Collection<Integer> eventNoList) {
        regINS(CK_NINS, cTL(eventNoList), xgetCValueEventNo(), "event_no");
    }

    protected void regEventNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventNo(), "event_no"); }
    protected abstract ConditionValue xgetCValueEventNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
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
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
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
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
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
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
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
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @param notifyDatetime The value of notifyDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotifyDatetime_Equal(java.time.LocalDateTime notifyDatetime) {
        regNotifyDatetime(CK_EQ,  notifyDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @param notifyDatetime The value of notifyDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotifyDatetime_GreaterThan(java.time.LocalDateTime notifyDatetime) {
        regNotifyDatetime(CK_GT,  notifyDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @param notifyDatetime The value of notifyDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotifyDatetime_LessThan(java.time.LocalDateTime notifyDatetime) {
        regNotifyDatetime(CK_LT,  notifyDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @param notifyDatetime The value of notifyDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotifyDatetime_GreaterEqual(java.time.LocalDateTime notifyDatetime) {
        regNotifyDatetime(CK_GE,  notifyDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @param notifyDatetime The value of notifyDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotifyDatetime_LessEqual(java.time.LocalDateTime notifyDatetime) {
        regNotifyDatetime(CK_LE, notifyDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * <pre>e.g. setNotifyDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notifyDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notifyDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNotifyDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNotifyDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     * <pre>e.g. setNotifyDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notifyDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notifyDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNotifyDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "notify_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNotifyDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     */
    public void setNotifyDatetime_IsNull() { regNotifyDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * notify_datetime: {timestamp(29, 6)}
     */
    public void setNotifyDatetime_IsNotNull() { regNotifyDatetime(CK_ISNN, DOBJ); }

    protected void regNotifyDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotifyDatetime(), "notify_datetime"); }
    protected abstract ConditionValue xgetCValueNotifyDatetime();

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
    public HpSLCFunction<EventNotifyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EventNotifyCB.class);
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
    public HpSLCFunction<EventNotifyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EventNotifyCB.class);
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
    public HpSLCFunction<EventNotifyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EventNotifyCB.class);
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
    public HpSLCFunction<EventNotifyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EventNotifyCB.class);
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
    public HpSLCFunction<EventNotifyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EventNotifyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EventNotifyCB&gt;() {
     *     public void query(EventNotifyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EventNotifyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EventNotifyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EventNotifyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EventNotifyCQ sq);

    protected EventNotifyCB xcreateScalarConditionCB() {
        EventNotifyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EventNotifyCB xcreateScalarConditionPartitionByCB() {
        EventNotifyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EventNotifyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventNotifyCB cb = new EventNotifyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "event_notify_no";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EventNotifyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EventNotifyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EventNotifyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventNotifyCB cb = new EventNotifyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "event_notify_no";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EventNotifyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EventNotifyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventNotifyCB cb = new EventNotifyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EventNotifyCQ sq);

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
    protected EventNotifyCB newMyCB() {
        return new EventNotifyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EventNotifyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
