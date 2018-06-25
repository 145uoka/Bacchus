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
 * The abstract condition-query of candidate_t.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCandidateTCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCandidateTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "candidate_t";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
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
     * candidate_no: {PK, ID, NotNull, serial(10)}
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
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param candidateNo The value of candidateNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterThan(Integer candidateNo) {
        regCandidateNo(CK_GT, candidateNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param candidateNo The value of candidateNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessThan(Integer candidateNo) {
        regCandidateNo(CK_LT, candidateNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param candidateNo The value of candidateNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterEqual(Integer candidateNo) {
        regCandidateNo(CK_GE, candidateNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param candidateNo The value of candidateNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessEqual(Integer candidateNo) {
        regCandidateNo(CK_LE, candidateNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
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
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of candidateNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of candidateNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCandidateNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCandidateNo(), "candidate_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
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
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @param candidateNoList The collection of candidateNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        doSetCandidateNo_NotInScope(candidateNoList);
    }

    protected void doSetCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        regINS(CK_NINS, cTL(candidateNoList), xgetCValueCandidateNo(), "candidate_no");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select candidate_no from entry_t where ...)} <br>
     * entry_t by candidate_no, named 'entryTAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCandidateNo_ExistsReferrer_EntryTList(cb.query());
        registerExistsReferrer(cb.query(), "candidate_no", "candidate_no", pp, "entryTList");
    }
    public abstract String keepCandidateNo_ExistsReferrer_EntryTList(EntryTCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select candidate_no from entry_t where ...)} <br>
     * entry_t by candidate_no, named 'entryTAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsEntryT</span>(tCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CandidateNo_NotExistsReferrer_EntryTList for 'not exists'. (NotNull)
     */
    public void notExistsEntryT(SubQuery<EntryTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EntryTCB cb = new EntryTCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCandidateNo_NotExistsReferrer_EntryTList(cb.query());
        registerNotExistsReferrer(cb.query(), "candidate_no", "candidate_no", pp, "entryTList");
    }
    public abstract String keepCandidateNo_NotExistsReferrer_EntryTList(EntryTCQ sq);

    public void xsderiveEntryTList(String fn, SubQuery<EntryTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = new EntryTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCandidateNo_SpecifyDerivedReferrer_EntryTList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "candidate_no", "candidate_no", pp, "entryTList", al, op);
    }
    public abstract String keepCandidateNo_SpecifyDerivedReferrer_EntryTList(EntryTCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from entry_t where ...)} <br>
     * entry_t by candidate_no, named 'entryTAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCandidateNo_QueryDerivedReferrer_EntryTList(cb.query()); String prpp = keepCandidateNo_QueryDerivedReferrer_EntryTListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "candidate_no", "candidate_no", sqpp, "entryTList", rd, vl, prpp, op);
    }
    public abstract String keepCandidateNo_QueryDerivedReferrer_EntryTList(EntryTCQ sq);
    public abstract String keepCandidateNo_QueryDerivedReferrer_EntryTListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     */
    public void setCandidateNo_IsNull() { regCandidateNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     */
    public void setCandidateNo_IsNotNull() { regCandidateNo(CK_ISNN, DOBJ); }

    protected void regCandidateNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCandidateNo(), "candidate_no"); }
    protected abstract ConditionValue xgetCValueCandidateNo();

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
     * event_start_datetime: {timestamp(29, 6)}
     * @param eventStartDatetime The value of eventStartDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventStartDatetime_Equal(java.time.LocalDateTime eventStartDatetime) {
        regEventStartDatetime(CK_EQ,  eventStartDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @param eventStartDatetime The value of eventStartDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventStartDatetime_GreaterThan(java.time.LocalDateTime eventStartDatetime) {
        regEventStartDatetime(CK_GT,  eventStartDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @param eventStartDatetime The value of eventStartDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventStartDatetime_LessThan(java.time.LocalDateTime eventStartDatetime) {
        regEventStartDatetime(CK_LT,  eventStartDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @param eventStartDatetime The value of eventStartDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventStartDatetime_GreaterEqual(java.time.LocalDateTime eventStartDatetime) {
        regEventStartDatetime(CK_GE,  eventStartDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @param eventStartDatetime The value of eventStartDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventStartDatetime_LessEqual(java.time.LocalDateTime eventStartDatetime) {
        regEventStartDatetime(CK_LE, eventStartDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * <pre>e.g. setEventStartDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEventStartDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEventStartDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * <pre>e.g. setEventStartDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventStartDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEventStartDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "event_start_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEventStartDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     */
    public void setEventStartDatetime_IsNull() { regEventStartDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_start_datetime: {timestamp(29, 6)}
     */
    public void setEventStartDatetime_IsNotNull() { regEventStartDatetime(CK_ISNN, DOBJ); }

    protected void regEventStartDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventStartDatetime(), "event_start_datetime"); }
    protected abstract ConditionValue xgetCValueEventStartDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @param eventEndDatetime The value of eventEndDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEndDatetime_Equal(java.time.LocalDateTime eventEndDatetime) {
        regEventEndDatetime(CK_EQ,  eventEndDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @param eventEndDatetime The value of eventEndDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEndDatetime_GreaterThan(java.time.LocalDateTime eventEndDatetime) {
        regEventEndDatetime(CK_GT,  eventEndDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @param eventEndDatetime The value of eventEndDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEndDatetime_LessThan(java.time.LocalDateTime eventEndDatetime) {
        regEventEndDatetime(CK_LT,  eventEndDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @param eventEndDatetime The value of eventEndDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEndDatetime_GreaterEqual(java.time.LocalDateTime eventEndDatetime) {
        regEventEndDatetime(CK_GE,  eventEndDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @param eventEndDatetime The value of eventEndDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEventEndDatetime_LessEqual(java.time.LocalDateTime eventEndDatetime) {
        regEventEndDatetime(CK_LE, eventEndDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * <pre>e.g. setEventEndDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEventEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEventEndDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * <pre>e.g. setEventEndDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of eventEndDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEventEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "event_end_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEventEndDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     */
    public void setEventEndDatetime_IsNull() { regEventEndDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * event_end_datetime: {timestamp(29, 6)}
     */
    public void setEventEndDatetime_IsNotNull() { regEventEndDatetime(CK_ISNN, DOBJ); }

    protected void regEventEndDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEventEndDatetime(), "event_end_datetime"); }
    protected abstract ConditionValue xgetCValueEventEndDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_Equal(String startDate) {
        doSetStartDate_Equal(fRES(startDate));
    }

    protected void doSetStartDate_Equal(String startDate) {
        regStartDate(CK_EQ, startDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_NotEqual(String startDate) {
        doSetStartDate_NotEqual(fRES(startDate));
    }

    protected void doSetStartDate_NotEqual(String startDate) {
        regStartDate(CK_NES, startDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_GreaterThan(String startDate) {
        regStartDate(CK_GT, fRES(startDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_LessThan(String startDate) {
        regStartDate(CK_LT, fRES(startDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_GreaterEqual(String startDate) {
        regStartDate(CK_GE, fRES(startDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_LessEqual(String startDate) {
        regStartDate(CK_LE, fRES(startDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDateList The collection of startDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_InScope(Collection<String> startDateList) {
        doSetStartDate_InScope(startDateList);
    }

    protected void doSetStartDate_InScope(Collection<String> startDateList) {
        regINS(CK_INS, cTL(startDateList), xgetCValueStartDate(), "start_date");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDateList The collection of startDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartDate_NotInScope(Collection<String> startDateList) {
        doSetStartDate_NotInScope(startDateList);
    }

    protected void doSetStartDate_NotInScope(Collection<String> startDateList) {
        regINS(CK_NINS, cTL(startDateList), xgetCValueStartDate(), "start_date");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)} <br>
     * <pre>e.g. setStartDate_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param startDate The value of startDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStartDate_LikeSearch(String startDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStartDate_LikeSearch(startDate, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)} <br>
     * <pre>e.g. setStartDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param startDate The value of startDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStartDate_LikeSearch(String startDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(startDate), xgetCValueStartDate(), "start_date", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStartDate_NotLikeSearch(String startDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStartDate_NotLikeSearch(startDate, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     * @param startDate The value of startDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStartDate_NotLikeSearch(String startDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(startDate), xgetCValueStartDate(), "start_date", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     */
    public void setStartDate_IsNull() { regStartDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     */
    public void setStartDate_IsNullOrEmpty() { regStartDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * start_date: {+UQ, text(2147483647)}
     */
    public void setStartDate_IsNotNull() { regStartDate(CK_ISNN, DOBJ); }

    protected void regStartDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartDate(), "start_date"); }
    protected abstract ConditionValue xgetCValueStartDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_Equal(String startTime) {
        doSetStartTime_Equal(fRES(startTime));
    }

    protected void doSetStartTime_Equal(String startTime) {
        regStartTime(CK_EQ, startTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_NotEqual(String startTime) {
        doSetStartTime_NotEqual(fRES(startTime));
    }

    protected void doSetStartTime_NotEqual(String startTime) {
        regStartTime(CK_NES, startTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_GreaterThan(String startTime) {
        regStartTime(CK_GT, fRES(startTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_LessThan(String startTime) {
        regStartTime(CK_LT, fRES(startTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_GreaterEqual(String startTime) {
        regStartTime(CK_GE, fRES(startTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_LessEqual(String startTime) {
        regStartTime(CK_LE, fRES(startTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTimeList The collection of startTime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_InScope(Collection<String> startTimeList) {
        doSetStartTime_InScope(startTimeList);
    }

    protected void doSetStartTime_InScope(Collection<String> startTimeList) {
        regINS(CK_INS, cTL(startTimeList), xgetCValueStartTime(), "start_time");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTimeList The collection of startTime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStartTime_NotInScope(Collection<String> startTimeList) {
        doSetStartTime_NotInScope(startTimeList);
    }

    protected void doSetStartTime_NotInScope(Collection<String> startTimeList) {
        regINS(CK_NINS, cTL(startTimeList), xgetCValueStartTime(), "start_time");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)} <br>
     * <pre>e.g. setStartTime_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param startTime The value of startTime as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStartTime_LikeSearch(String startTime, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStartTime_LikeSearch(startTime, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)} <br>
     * <pre>e.g. setStartTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param startTime The value of startTime as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStartTime_LikeSearch(String startTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(startTime), xgetCValueStartTime(), "start_time", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStartTime_NotLikeSearch(String startTime, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStartTime_NotLikeSearch(startTime, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * start_time: {text(2147483647)}
     * @param startTime The value of startTime as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStartTime_NotLikeSearch(String startTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(startTime), xgetCValueStartTime(), "start_time", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     */
    public void setStartTime_IsNull() { regStartTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     */
    public void setStartTime_IsNullOrEmpty() { regStartTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * start_time: {text(2147483647)}
     */
    public void setStartTime_IsNotNull() { regStartTime(CK_ISNN, DOBJ); }

    protected void regStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTime(), "start_time"); }
    protected abstract ConditionValue xgetCValueStartTime();

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
    public HpSLCFunction<CandidateTCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CandidateTCB.class);
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
    public HpSLCFunction<CandidateTCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CandidateTCB.class);
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
    public HpSLCFunction<CandidateTCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CandidateTCB.class);
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
    public HpSLCFunction<CandidateTCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CandidateTCB.class);
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
    public HpSLCFunction<CandidateTCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CandidateTCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CandidateTCB&gt;() {
     *     public void query(CandidateTCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CandidateTCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CandidateTCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CandidateTCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CandidateTCQ sq);

    protected CandidateTCB xcreateScalarConditionCB() {
        CandidateTCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CandidateTCB xcreateScalarConditionPartitionByCB() {
        CandidateTCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CandidateTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "candidate_no";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CandidateTCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CandidateTCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CandidateTCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "candidate_no";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CandidateTCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CandidateTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CandidateTCB cb = new CandidateTCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CandidateTCQ sq);

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
    protected CandidateTCB newMyCB() {
        return new CandidateTCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CandidateTCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
