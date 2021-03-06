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
 * The abstract condition-query of event_t.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEventTCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEventTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "event_t";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
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
     * event_no: {PK, ID, NotNull, serial(10)}
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
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param eventNo The value of eventNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_GreaterThan(Integer eventNo) {
        regEventNo(CK_GT, eventNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param eventNo The value of eventNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_LessThan(Integer eventNo) {
        regEventNo(CK_LT, eventNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param eventNo The value of eventNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_GreaterEqual(Integer eventNo) {
        regEventNo(CK_GE, eventNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param eventNo The value of eventNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventNo_LessEqual(Integer eventNo) {
        regEventNo(CK_LE, eventNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
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
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of eventNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventNo(), "event_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
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
     * event_no: {PK, ID, NotNull, serial(10)}
     * @param eventNoList The collection of eventNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventNo_NotInScope(Collection<Integer> eventNoList) {
        doSetEventNo_NotInScope(eventNoList);
    }

    protected void doSetEventNo_NotInScope(Collection<Integer> eventNoList) {
        regINS(CK_NINS, cTL(eventNoList), xgetCValueEventNo(), "event_no");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select event_no from candidate_t where ...)} <br>
     * candidate_t by event_no, named 'candidateTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCandidateT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CandidateTList for 'exists'. (NotNull)
     */
    public void existsCandidateT(SubQuery<CandidateTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEventNo_ExistsReferrer_CandidateTList(cb.query());
        registerExistsReferrer(cb.query(), "event_no", "event_no", pp, "candidateTList");
    }
    public abstract String keepEventNo_ExistsReferrer_CandidateTList(CandidateTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select event_no from candidate_t where ...)} <br>
     * candidate_t by event_no, named 'candidateTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCandidateT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of EventNo_NotExistsReferrer_CandidateTList for 'not exists'. (NotNull)
     */
    public void notExistsCandidateT(SubQuery<CandidateTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepEventNo_NotExistsReferrer_CandidateTList(cb.query());
        registerNotExistsReferrer(cb.query(), "event_no", "event_no", pp, "candidateTList");
    }
    public abstract String keepEventNo_NotExistsReferrer_CandidateTList(CandidateTCQ sq);

    public void xsderiveCandidateTList(String fn, SubQuery<CandidateTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepEventNo_SpecifyDerivedReferrer_CandidateTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "event_no", "event_no", pp, "candidateTList", al, op);
    }
    public abstract String keepEventNo_SpecifyDerivedReferrer_CandidateTList(CandidateTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from candidate_t where ...)} <br>
     * candidate_t by event_no, named 'candidateTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCandidateT()</span>.<span style="color: #CC4747">max</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CandidateTCB> derivedCandidateT() {
        return xcreateQDRFunctionCandidateTList();
    }
    protected HpQDRFunction<CandidateTCB> xcreateQDRFunctionCandidateTList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCandidateTList(fn, sq, rd, vl, op));
    }
    public void xqderiveCandidateTList(String fn, SubQuery<CandidateTCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepEventNo_QueryDerivedReferrer_CandidateTList(cb.query()); String prpp = keepEventNo_QueryDerivedReferrer_CandidateTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "event_no", "event_no", sqpp, "candidateTList", rd, vl, prpp, op);
    }
    public abstract String keepEventNo_QueryDerivedReferrer_CandidateTList(CandidateTCQ sq);
    public abstract String keepEventNo_QueryDerivedReferrer_CandidateTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     */
    public void setEventNo_IsNull() { regEventNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     */
    public void setEventNo_IsNotNull() { regEventNo(CK_ISNN, DOBJ); }

    protected void regEventNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventNo(), "event_no"); }
    protected abstract ConditionValue xgetCValueEventNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_Equal(String eventName) {
        doSetEventName_Equal(fRES(eventName));
    }

    protected void doSetEventName_Equal(String eventName) {
        regEventName(CK_EQ, eventName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_NotEqual(String eventName) {
        doSetEventName_NotEqual(fRES(eventName));
    }

    protected void doSetEventName_NotEqual(String eventName) {
        regEventName(CK_NES, eventName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_GreaterThan(String eventName) {
        regEventName(CK_GT, fRES(eventName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_LessThan(String eventName) {
        regEventName(CK_LT, fRES(eventName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_GreaterEqual(String eventName) {
        regEventName(CK_GE, fRES(eventName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_LessEqual(String eventName) {
        regEventName(CK_LE, fRES(eventName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventNameList The collection of eventName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_InScope(Collection<String> eventNameList) {
        doSetEventName_InScope(eventNameList);
    }

    protected void doSetEventName_InScope(Collection<String> eventNameList) {
        regINS(CK_INS, cTL(eventNameList), xgetCValueEventName(), "event_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventNameList The collection of eventName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventName_NotInScope(Collection<String> eventNameList) {
        doSetEventName_NotInScope(eventNameList);
    }

    protected void doSetEventName_NotInScope(Collection<String> eventNameList) {
        regINS(CK_NINS, cTL(eventNameList), xgetCValueEventName(), "event_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)} <br>
     * <pre>e.g. setEventName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param eventName The value of eventName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventName_LikeSearch(String eventName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventName_LikeSearch(eventName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)} <br>
     * <pre>e.g. setEventName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eventName The value of eventName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEventName_LikeSearch(String eventName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventName), xgetCValueEventName(), "event_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventName_NotLikeSearch(String eventName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventName_NotLikeSearch(eventName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_name: {text(2147483647)}
     * @param eventName The value of eventName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEventName_NotLikeSearch(String eventName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventName), xgetCValueEventName(), "event_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     */
    public void setEventName_IsNull() { regEventName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     */
    public void setEventName_IsNullOrEmpty() { regEventName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_name: {text(2147483647)}
     */
    public void setEventName_IsNotNull() { regEventName(CK_ISNN, DOBJ); }

    protected void regEventName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventName(), "event_name"); }
    protected abstract ConditionValue xgetCValueEventName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_Equal(String eventDetail) {
        doSetEventDetail_Equal(fRES(eventDetail));
    }

    protected void doSetEventDetail_Equal(String eventDetail) {
        regEventDetail(CK_EQ, eventDetail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_NotEqual(String eventDetail) {
        doSetEventDetail_NotEqual(fRES(eventDetail));
    }

    protected void doSetEventDetail_NotEqual(String eventDetail) {
        regEventDetail(CK_NES, eventDetail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_GreaterThan(String eventDetail) {
        regEventDetail(CK_GT, fRES(eventDetail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_LessThan(String eventDetail) {
        regEventDetail(CK_LT, fRES(eventDetail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_GreaterEqual(String eventDetail) {
        regEventDetail(CK_GE, fRES(eventDetail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_LessEqual(String eventDetail) {
        regEventDetail(CK_LE, fRES(eventDetail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetailList The collection of eventDetail as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_InScope(Collection<String> eventDetailList) {
        doSetEventDetail_InScope(eventDetailList);
    }

    protected void doSetEventDetail_InScope(Collection<String> eventDetailList) {
        regINS(CK_INS, cTL(eventDetailList), xgetCValueEventDetail(), "event_detail");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetailList The collection of eventDetail as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventDetail_NotInScope(Collection<String> eventDetailList) {
        doSetEventDetail_NotInScope(eventDetailList);
    }

    protected void doSetEventDetail_NotInScope(Collection<String> eventDetailList) {
        regINS(CK_NINS, cTL(eventDetailList), xgetCValueEventDetail(), "event_detail");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)} <br>
     * <pre>e.g. setEventDetail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param eventDetail The value of eventDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventDetail_LikeSearch(String eventDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventDetail_LikeSearch(eventDetail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)} <br>
     * <pre>e.g. setEventDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eventDetail The value of eventDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEventDetail_LikeSearch(String eventDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventDetail), xgetCValueEventDetail(), "event_detail", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventDetail_NotLikeSearch(String eventDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventDetail_NotLikeSearch(eventDetail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_detail: {text(2147483647)}
     * @param eventDetail The value of eventDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEventDetail_NotLikeSearch(String eventDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventDetail), xgetCValueEventDetail(), "event_detail", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     */
    public void setEventDetail_IsNull() { regEventDetail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     */
    public void setEventDetail_IsNullOrEmpty() { regEventDetail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_detail: {text(2147483647)}
     */
    public void setEventDetail_IsNotNull() { regEventDetail(CK_ISNN, DOBJ); }

    protected void regEventDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventDetail(), "event_detail"); }
    protected abstract ConditionValue xgetCValueEventDetail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_Equal(String eventPlace) {
        doSetEventPlace_Equal(fRES(eventPlace));
    }

    protected void doSetEventPlace_Equal(String eventPlace) {
        regEventPlace(CK_EQ, eventPlace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_NotEqual(String eventPlace) {
        doSetEventPlace_NotEqual(fRES(eventPlace));
    }

    protected void doSetEventPlace_NotEqual(String eventPlace) {
        regEventPlace(CK_NES, eventPlace);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_GreaterThan(String eventPlace) {
        regEventPlace(CK_GT, fRES(eventPlace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_LessThan(String eventPlace) {
        regEventPlace(CK_LT, fRES(eventPlace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_GreaterEqual(String eventPlace) {
        regEventPlace(CK_GE, fRES(eventPlace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_LessEqual(String eventPlace) {
        regEventPlace(CK_LE, fRES(eventPlace));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlaceList The collection of eventPlace as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_InScope(Collection<String> eventPlaceList) {
        doSetEventPlace_InScope(eventPlaceList);
    }

    protected void doSetEventPlace_InScope(Collection<String> eventPlaceList) {
        regINS(CK_INS, cTL(eventPlaceList), xgetCValueEventPlace(), "event_place");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlaceList The collection of eventPlace as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventPlace_NotInScope(Collection<String> eventPlaceList) {
        doSetEventPlace_NotInScope(eventPlaceList);
    }

    protected void doSetEventPlace_NotInScope(Collection<String> eventPlaceList) {
        regINS(CK_NINS, cTL(eventPlaceList), xgetCValueEventPlace(), "event_place");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)} <br>
     * <pre>e.g. setEventPlace_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param eventPlace The value of eventPlace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventPlace_LikeSearch(String eventPlace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventPlace_LikeSearch(eventPlace, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)} <br>
     * <pre>e.g. setEventPlace_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eventPlace The value of eventPlace as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEventPlace_LikeSearch(String eventPlace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventPlace), xgetCValueEventPlace(), "event_place", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventPlace_NotLikeSearch(String eventPlace, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventPlace_NotLikeSearch(eventPlace, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_place: {text(2147483647)}
     * @param eventPlace The value of eventPlace as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEventPlace_NotLikeSearch(String eventPlace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventPlace), xgetCValueEventPlace(), "event_place", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     */
    public void setEventPlace_IsNull() { regEventPlace(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     */
    public void setEventPlace_IsNullOrEmpty() { regEventPlace(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_place: {text(2147483647)}
     */
    public void setEventPlace_IsNotNull() { regEventPlace(CK_ISNN, DOBJ); }

    protected void regEventPlace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventPlace(), "event_place"); }
    protected abstract ConditionValue xgetCValueEventPlace();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_Equal(String eventUrl) {
        doSetEventUrl_Equal(fRES(eventUrl));
    }

    protected void doSetEventUrl_Equal(String eventUrl) {
        regEventUrl(CK_EQ, eventUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_NotEqual(String eventUrl) {
        doSetEventUrl_NotEqual(fRES(eventUrl));
    }

    protected void doSetEventUrl_NotEqual(String eventUrl) {
        regEventUrl(CK_NES, eventUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_GreaterThan(String eventUrl) {
        regEventUrl(CK_GT, fRES(eventUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_LessThan(String eventUrl) {
        regEventUrl(CK_LT, fRES(eventUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_GreaterEqual(String eventUrl) {
        regEventUrl(CK_GE, fRES(eventUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_LessEqual(String eventUrl) {
        regEventUrl(CK_LE, fRES(eventUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrlList The collection of eventUrl as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_InScope(Collection<String> eventUrlList) {
        doSetEventUrl_InScope(eventUrlList);
    }

    protected void doSetEventUrl_InScope(Collection<String> eventUrlList) {
        regINS(CK_INS, cTL(eventUrlList), xgetCValueEventUrl(), "event_url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrlList The collection of eventUrl as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventUrl_NotInScope(Collection<String> eventUrlList) {
        doSetEventUrl_NotInScope(eventUrlList);
    }

    protected void doSetEventUrl_NotInScope(Collection<String> eventUrlList) {
        regINS(CK_NINS, cTL(eventUrlList), xgetCValueEventUrl(), "event_url");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)} <br>
     * <pre>e.g. setEventUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param eventUrl The value of eventUrl as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventUrl_LikeSearch(String eventUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventUrl_LikeSearch(eventUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)} <br>
     * <pre>e.g. setEventUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eventUrl The value of eventUrl as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEventUrl_LikeSearch(String eventUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eventUrl), xgetCValueEventUrl(), "event_url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEventUrl_NotLikeSearch(String eventUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEventUrl_NotLikeSearch(eventUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * event_url: {text(2147483647)}
     * @param eventUrl The value of eventUrl as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEventUrl_NotLikeSearch(String eventUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eventUrl), xgetCValueEventUrl(), "event_url", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     */
    public void setEventUrl_IsNull() { regEventUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     */
    public void setEventUrl_IsNullOrEmpty() { regEventUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_url: {text(2147483647)}
     */
    public void setEventUrl_IsNotNull() { regEventUrl(CK_ISNN, DOBJ); }

    protected void regEventUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventUrl(), "event_url"); }
    protected abstract ConditionValue xgetCValueEventUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_Equal(String tell) {
        doSetTell_Equal(fRES(tell));
    }

    protected void doSetTell_Equal(String tell) {
        regTell(CK_EQ, tell);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_NotEqual(String tell) {
        doSetTell_NotEqual(fRES(tell));
    }

    protected void doSetTell_NotEqual(String tell) {
        regTell(CK_NES, tell);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_GreaterThan(String tell) {
        regTell(CK_GT, fRES(tell));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_LessThan(String tell) {
        regTell(CK_LT, fRES(tell));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_GreaterEqual(String tell) {
        regTell(CK_GE, fRES(tell));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_LessEqual(String tell) {
        regTell(CK_LE, fRES(tell));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)}
     * @param tellList The collection of tell as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_InScope(Collection<String> tellList) {
        doSetTell_InScope(tellList);
    }

    protected void doSetTell_InScope(Collection<String> tellList) {
        regINS(CK_INS, cTL(tellList), xgetCValueTell(), "tell");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)}
     * @param tellList The collection of tell as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTell_NotInScope(Collection<String> tellList) {
        doSetTell_NotInScope(tellList);
    }

    protected void doSetTell_NotInScope(Collection<String> tellList) {
        regINS(CK_NINS, cTL(tellList), xgetCValueTell(), "tell");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)} <br>
     * <pre>e.g. setTell_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tell The value of tell as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTell_LikeSearch(String tell, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTell_LikeSearch(tell, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)} <br>
     * <pre>e.g. setTell_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tell The value of tell as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTell_LikeSearch(String tell, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tell), xgetCValueTell(), "tell", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTell_NotLikeSearch(String tell, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTell_NotLikeSearch(tell, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tell: {text(2147483647)}
     * @param tell The value of tell as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTell_NotLikeSearch(String tell, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tell), xgetCValueTell(), "tell", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     */
    public void setTell_IsNull() { regTell(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     */
    public void setTell_IsNullOrEmpty() { regTell(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * tell: {text(2147483647)}
     */
    public void setTell_IsNotNull() { regTell(CK_ISNN, DOBJ); }

    protected void regTell(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTell(), "tell"); }
    protected abstract ConditionValue xgetCValueTell();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_Equal(Integer eventEntryFee) {
        doSetEventEntryFee_Equal(eventEntryFee);
    }

    protected void doSetEventEntryFee_Equal(Integer eventEntryFee) {
        regEventEntryFee(CK_EQ, eventEntryFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_NotEqual(Integer eventEntryFee) {
        doSetEventEntryFee_NotEqual(eventEntryFee);
    }

    protected void doSetEventEntryFee_NotEqual(Integer eventEntryFee) {
        regEventEntryFee(CK_NES, eventEntryFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_GreaterThan(Integer eventEntryFee) {
        regEventEntryFee(CK_GT, eventEntryFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_LessThan(Integer eventEntryFee) {
        regEventEntryFee(CK_LT, eventEntryFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_GreaterEqual(Integer eventEntryFee) {
        regEventEntryFee(CK_GE, eventEntryFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFee The value of eventEntryFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEntryFee_LessEqual(Integer eventEntryFee) {
        regEventEntryFee(CK_LE, eventEntryFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param minNumber The min number of eventEntryFee. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventEntryFee. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEventEntryFee_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEventEntryFee_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param minNumber The min number of eventEntryFee. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventEntryFee. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventEntryFee_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventEntryFee(), "event_entry_fee", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFeeList The collection of eventEntryFee as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventEntryFee_InScope(Collection<Integer> eventEntryFeeList) {
        doSetEventEntryFee_InScope(eventEntryFeeList);
    }

    protected void doSetEventEntryFee_InScope(Collection<Integer> eventEntryFeeList) {
        regINS(CK_INS, cTL(eventEntryFeeList), xgetCValueEventEntryFee(), "event_entry_fee");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_entry_fee: {int4(10)}
     * @param eventEntryFeeList The collection of eventEntryFee as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventEntryFee_NotInScope(Collection<Integer> eventEntryFeeList) {
        doSetEventEntryFee_NotInScope(eventEntryFeeList);
    }

    protected void doSetEventEntryFee_NotInScope(Collection<Integer> eventEntryFeeList) {
        regINS(CK_NINS, cTL(eventEntryFeeList), xgetCValueEventEntryFee(), "event_entry_fee");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     */
    public void setEventEntryFee_IsNull() { regEventEntryFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_entry_fee: {int4(10)}
     */
    public void setEventEntryFee_IsNotNull() { regEventEntryFee(CK_ISNN, DOBJ); }

    protected void regEventEntryFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventEntryFee(), "event_entry_fee"); }
    protected abstract ConditionValue xgetCValueEventEntryFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_Equal(Integer auxiliaryFlg) {
        doSetAuxiliaryFlg_Equal(auxiliaryFlg);
    }

    protected void doSetAuxiliaryFlg_Equal(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_EQ, auxiliaryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_NotEqual(Integer auxiliaryFlg) {
        doSetAuxiliaryFlg_NotEqual(auxiliaryFlg);
    }

    protected void doSetAuxiliaryFlg_NotEqual(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_NES, auxiliaryFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_GreaterThan(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_GT, auxiliaryFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_LessThan(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_LT, auxiliaryFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_GreaterEqual(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_GE, auxiliaryFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlg The value of auxiliaryFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAuxiliaryFlg_LessEqual(Integer auxiliaryFlg) {
        regAuxiliaryFlg(CK_LE, auxiliaryFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param minNumber The min number of auxiliaryFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of auxiliaryFlg. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAuxiliaryFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAuxiliaryFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param minNumber The min number of auxiliaryFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of auxiliaryFlg. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAuxiliaryFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAuxiliaryFlg(), "auxiliary_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlgList The collection of auxiliaryFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuxiliaryFlg_InScope(Collection<Integer> auxiliaryFlgList) {
        doSetAuxiliaryFlg_InScope(auxiliaryFlgList);
    }

    protected void doSetAuxiliaryFlg_InScope(Collection<Integer> auxiliaryFlgList) {
        regINS(CK_INS, cTL(auxiliaryFlgList), xgetCValueAuxiliaryFlg(), "auxiliary_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * auxiliary_flg: {int2(5)}
     * @param auxiliaryFlgList The collection of auxiliaryFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAuxiliaryFlg_NotInScope(Collection<Integer> auxiliaryFlgList) {
        doSetAuxiliaryFlg_NotInScope(auxiliaryFlgList);
    }

    protected void doSetAuxiliaryFlg_NotInScope(Collection<Integer> auxiliaryFlgList) {
        regINS(CK_NINS, cTL(auxiliaryFlgList), xgetCValueAuxiliaryFlg(), "auxiliary_flg");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     */
    public void setAuxiliaryFlg_IsNull() { regAuxiliaryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * auxiliary_flg: {int2(5)}
     */
    public void setAuxiliaryFlg_IsNotNull() { regAuxiliaryFlg(CK_ISNN, DOBJ); }

    protected void regAuxiliaryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuxiliaryFlg(), "auxiliary_flg"); }
    protected abstract ConditionValue xgetCValueAuxiliaryFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_Equal(Integer fixFlg) {
        doSetFixFlg_Equal(fixFlg);
    }

    protected void doSetFixFlg_Equal(Integer fixFlg) {
        regFixFlg(CK_EQ, fixFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_NotEqual(Integer fixFlg) {
        doSetFixFlg_NotEqual(fixFlg);
    }

    protected void doSetFixFlg_NotEqual(Integer fixFlg) {
        regFixFlg(CK_NES, fixFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_GreaterThan(Integer fixFlg) {
        regFixFlg(CK_GT, fixFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_LessThan(Integer fixFlg) {
        regFixFlg(CK_LT, fixFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_GreaterEqual(Integer fixFlg) {
        regFixFlg(CK_GE, fixFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlg The value of fixFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFixFlg_LessEqual(Integer fixFlg) {
        regFixFlg(CK_LE, fixFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param minNumber The min number of fixFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fixFlg. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFixFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFixFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     * @param minNumber The min number of fixFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fixFlg. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFixFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFixFlg(), "fix_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlgList The collection of fixFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFixFlg_InScope(Collection<Integer> fixFlgList) {
        doSetFixFlg_InScope(fixFlgList);
    }

    protected void doSetFixFlg_InScope(Collection<Integer> fixFlgList) {
        regINS(CK_INS, cTL(fixFlgList), xgetCValueFixFlg(), "fix_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fix_flg: {int2(5)}
     * @param fixFlgList The collection of fixFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFixFlg_NotInScope(Collection<Integer> fixFlgList) {
        doSetFixFlg_NotInScope(fixFlgList);
    }

    protected void doSetFixFlg_NotInScope(Collection<Integer> fixFlgList) {
        regINS(CK_NINS, cTL(fixFlgList), xgetCValueFixFlg(), "fix_flg");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     */
    public void setFixFlg_IsNull() { regFixFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fix_flg: {int2(5)}
     */
    public void setFixFlg_IsNotNull() { regFixFlg(CK_ISNN, DOBJ); }

    protected void regFixFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFixFlg(), "fix_flg"); }
    protected abstract ConditionValue xgetCValueFixFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_Equal(Integer candidateNo) {
        doSetCandidateNo_Equal(candidateNo);
    }

    protected void doSetCandidateNo_Equal(Integer candidateNo) {
        regCandidateNo(CK_EQ, candidateNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_NotEqual(Integer candidateNo) {
        doSetCandidateNo_NotEqual(candidateNo);
    }

    protected void doSetCandidateNo_NotEqual(Integer candidateNo) {
        regCandidateNo(CK_NES, candidateNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterThan(Integer candidateNo) {
        regCandidateNo(CK_GT, candidateNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessThan(Integer candidateNo) {
        regCandidateNo(CK_LT, candidateNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterEqual(Integer candidateNo) {
        regCandidateNo(CK_GE, candidateNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNo The value of candidateNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessEqual(Integer candidateNo) {
        regCandidateNo(CK_LE, candidateNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param minNumber The min number of candidateNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of candidateNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCandidateNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCandidateNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     * @param minNumber The min number of candidateNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of candidateNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCandidateNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCandidateNo(), "candidate_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNoList The collection of candidateNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCandidateNo_InScope(Collection<Integer> candidateNoList) {
        doSetCandidateNo_InScope(candidateNoList);
    }

    protected void doSetCandidateNo_InScope(Collection<Integer> candidateNoList) {
        regINS(CK_INS, cTL(candidateNoList), xgetCValueCandidateNo(), "candidate_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * candidate_no: {int4(10)}
     * @param candidateNoList The collection of candidateNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        doSetCandidateNo_NotInScope(candidateNoList);
    }

    protected void doSetCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        regINS(CK_NINS, cTL(candidateNoList), xgetCValueCandidateNo(), "candidate_no");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     */
    public void setCandidateNo_IsNull() { regCandidateNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * candidate_no: {int4(10)}
     */
    public void setCandidateNo_IsNotNull() { regCandidateNo(CK_ISNN, DOBJ); }

    protected void regCandidateNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCandidateNo(), "candidate_no"); }
    protected abstract ConditionValue xgetCValueCandidateNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_Equal(String storeName) {
        doSetStoreName_Equal(fRES(storeName));
    }

    protected void doSetStoreName_Equal(String storeName) {
        regStoreName(CK_EQ, storeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_NotEqual(String storeName) {
        doSetStoreName_NotEqual(fRES(storeName));
    }

    protected void doSetStoreName_NotEqual(String storeName) {
        regStoreName(CK_NES, storeName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_GreaterThan(String storeName) {
        regStoreName(CK_GT, fRES(storeName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_LessThan(String storeName) {
        regStoreName(CK_LT, fRES(storeName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_GreaterEqual(String storeName) {
        regStoreName(CK_GE, fRES(storeName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_LessEqual(String storeName) {
        regStoreName(CK_LE, fRES(storeName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeNameList The collection of storeName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_InScope(Collection<String> storeNameList) {
        doSetStoreName_InScope(storeNameList);
    }

    protected void doSetStoreName_InScope(Collection<String> storeNameList) {
        regINS(CK_INS, cTL(storeNameList), xgetCValueStoreName(), "store_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeNameList The collection of storeName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStoreName_NotInScope(Collection<String> storeNameList) {
        doSetStoreName_NotInScope(storeNameList);
    }

    protected void doSetStoreName_NotInScope(Collection<String> storeNameList) {
        regINS(CK_NINS, cTL(storeNameList), xgetCValueStoreName(), "store_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)} <br>
     * <pre>e.g. setStoreName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param storeName The value of storeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStoreName_LikeSearch(String storeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStoreName_LikeSearch(storeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)} <br>
     * <pre>e.g. setStoreName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeName The value of storeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStoreName_LikeSearch(String storeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeName), xgetCValueStoreName(), "store_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStoreName_NotLikeSearch(String storeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStoreName_NotLikeSearch(storeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * store_name: {text(2147483647)}
     * @param storeName The value of storeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStoreName_NotLikeSearch(String storeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeName), xgetCValueStoreName(), "store_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     */
    public void setStoreName_IsNull() { regStoreName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     */
    public void setStoreName_IsNullOrEmpty() { regStoreName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * store_name: {text(2147483647)}
     */
    public void setStoreName_IsNotNull() { regStoreName(CK_ISNN, DOBJ); }

    protected void regStoreName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreName(), "store_name"); }
    protected abstract ConditionValue xgetCValueStoreName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
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
     * event_type_id: {int4(10), FK to event_type_m}
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
     * event_type_id: {int4(10), FK to event_type_m}
     * @param eventTypeId The value of eventTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_GreaterThan(Integer eventTypeId) {
        regEventTypeId(CK_GT, eventTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
     * @param eventTypeId The value of eventTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_LessThan(Integer eventTypeId) {
        regEventTypeId(CK_LT, eventTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
     * @param eventTypeId The value of eventTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_GreaterEqual(Integer eventTypeId) {
        regEventTypeId(CK_GE, eventTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
     * @param eventTypeId The value of eventTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventTypeId_LessEqual(Integer eventTypeId) {
        regEventTypeId(CK_LE, eventTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
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
     * event_type_id: {int4(10), FK to event_type_m}
     * @param minNumber The min number of eventTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of eventTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEventTypeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEventTypeId(), "event_type_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
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
     * event_type_id: {int4(10), FK to event_type_m}
     * @param eventTypeIdList The collection of eventTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEventTypeId_NotInScope(Collection<Integer> eventTypeIdList) {
        doSetEventTypeId_NotInScope(eventTypeIdList);
    }

    protected void doSetEventTypeId_NotInScope(Collection<Integer> eventTypeIdList) {
        regINS(CK_NINS, cTL(eventTypeIdList), xgetCValueEventTypeId(), "event_type_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
     */
    public void setEventTypeId_IsNull() { regEventTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_type_id: {int4(10), FK to event_type_m}
     */
    public void setEventTypeId_IsNotNull() { regEventTypeId(CK_ISNN, DOBJ); }

    protected void regEventTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventTypeId(), "event_type_id"); }
    protected abstract ConditionValue xgetCValueEventTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
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
     * user_id: {int4(10), FK to user_t}
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
     * user_id: {int4(10), FK to user_t}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
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
     * user_id: {int4(10), FK to user_t}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {int4(10), FK to user_t}
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
     * user_id: {int4(10), FK to user_t}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {int4(10), FK to user_t}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     */
    public void setRegisterDatetime_IsNull() { regRegisterDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     */
    public void setRegisterDatetime_IsNotNull() { regRegisterDatetime(CK_ISNN, DOBJ); }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNull() { regRegisterUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNullOrEmpty() { regRegisterUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNotNull() { regRegisterUser(CK_ISNN, DOBJ); }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "register_user"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNull() { regUpdateUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNullOrEmpty() { regUpdateUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNotNull() { regUpdateUser(CK_ISNN, DOBJ); }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "update_user"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     */
    public void setDeleteFlag_IsNull() { regDeleteFlag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     */
    public void setDeleteFlag_IsNotNull() { regDeleteFlag(CK_ISNN, DOBJ); }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

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
    public HpSLCFunction<EventTCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EventTCB.class);
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
    public HpSLCFunction<EventTCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EventTCB.class);
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
    public HpSLCFunction<EventTCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EventTCB.class);
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
    public HpSLCFunction<EventTCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EventTCB.class);
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
    public HpSLCFunction<EventTCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EventTCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EventTCB&gt;() {
     *     public void query(EventTCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EventTCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EventTCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EventTCQ sq);

    protected EventTCB xcreateScalarConditionCB() {
        EventTCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EventTCB xcreateScalarConditionPartitionByCB() {
        EventTCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EventTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = new EventTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "event_no";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EventTCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EventTCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EventTCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EventTCB cb = new EventTCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "event_no";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EventTCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EventTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EventTCB cb = new EventTCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EventTCQ sq);

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
    protected EventTCB newMyCB() {
        return new EventTCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EventTCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
