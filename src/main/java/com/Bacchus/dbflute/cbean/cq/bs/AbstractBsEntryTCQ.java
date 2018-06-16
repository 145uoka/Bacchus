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
 * The abstract condition-query of entry_t.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEntryTCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEntryTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "entry_t";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_Equal(Long entryId) {
        doSetEntryId_Equal(entryId);
    }

    protected void doSetEntryId_Equal(Long entryId) {
        regEntryId(CK_EQ, entryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_NotEqual(Long entryId) {
        doSetEntryId_NotEqual(entryId);
    }

    protected void doSetEntryId_NotEqual(Long entryId) {
        regEntryId(CK_NES, entryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_GreaterThan(Long entryId) {
        regEntryId(CK_GT, entryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_LessThan(Long entryId) {
        regEntryId(CK_LT, entryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_GreaterEqual(Long entryId) {
        regEntryId(CK_GE, entryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryId The value of entryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_LessEqual(Long entryId) {
        regEntryId(CK_LE, entryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of entryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEntryId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEntryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of entryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEntryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEntryId(), "entry_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryIdList The collection of entryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryId_InScope(Collection<Long> entryIdList) {
        doSetEntryId_InScope(entryIdList);
    }

    protected void doSetEntryId_InScope(Collection<Long> entryIdList) {
        regINS(CK_INS, cTL(entryIdList), xgetCValueEntryId(), "entry_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @param entryIdList The collection of entryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryId_NotInScope(Collection<Long> entryIdList) {
        doSetEntryId_NotInScope(entryIdList);
    }

    protected void doSetEntryId_NotInScope(Collection<Long> entryIdList) {
        regINS(CK_NINS, cTL(entryIdList), xgetCValueEntryId(), "entry_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setEntryId_IsNull() { regEntryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setEntryId_IsNotNull() { regEntryId(CK_ISNN, DOBJ); }

    protected void regEntryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryId(), "entry_id"); }
    protected abstract ConditionValue xgetCValueEntryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
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
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
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
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param candidateNo The value of candidateNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterThan(Integer candidateNo) {
        regCandidateNo(CK_GT, candidateNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param candidateNo The value of candidateNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessThan(Integer candidateNo) {
        regCandidateNo(CK_LT, candidateNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param candidateNo The value of candidateNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_GreaterEqual(Integer candidateNo) {
        regCandidateNo(CK_GE, candidateNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param candidateNo The value of candidateNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCandidateNo_LessEqual(Integer candidateNo) {
        regCandidateNo(CK_LE, candidateNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
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
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param minNumber The min number of candidateNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of candidateNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCandidateNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCandidateNo(), "candidate_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
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
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @param candidateNoList The collection of candidateNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        doSetCandidateNo_NotInScope(candidateNoList);
    }

    protected void doSetCandidateNo_NotInScope(Collection<Integer> candidateNoList) {
        regINS(CK_NINS, cTL(candidateNoList), xgetCValueCandidateNo(), "candidate_no");
    }

    protected void regCandidateNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCandidateNo(), "candidate_no"); }
    protected abstract ConditionValue xgetCValueCandidateNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_Equal(Integer entryDiv) {
        doSetEntryDiv_Equal(entryDiv);
    }

    protected void doSetEntryDiv_Equal(Integer entryDiv) {
        regEntryDiv(CK_EQ, entryDiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_NotEqual(Integer entryDiv) {
        doSetEntryDiv_NotEqual(entryDiv);
    }

    protected void doSetEntryDiv_NotEqual(Integer entryDiv) {
        regEntryDiv(CK_NES, entryDiv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_GreaterThan(Integer entryDiv) {
        regEntryDiv(CK_GT, entryDiv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_LessThan(Integer entryDiv) {
        regEntryDiv(CK_LT, entryDiv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_GreaterEqual(Integer entryDiv) {
        regEntryDiv(CK_GE, entryDiv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDiv The value of entryDiv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryDiv_LessEqual(Integer entryDiv) {
        regEntryDiv(CK_LE, entryDiv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param minNumber The min number of entryDiv. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryDiv. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEntryDiv_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEntryDiv_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     * @param minNumber The min number of entryDiv. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryDiv. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEntryDiv_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEntryDiv(), "entry_div", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDivList The collection of entryDiv as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryDiv_InScope(Collection<Integer> entryDivList) {
        doSetEntryDiv_InScope(entryDivList);
    }

    protected void doSetEntryDiv_InScope(Collection<Integer> entryDivList) {
        regINS(CK_INS, cTL(entryDivList), xgetCValueEntryDiv(), "entry_div");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_div: {int4(10)}
     * @param entryDivList The collection of entryDiv as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryDiv_NotInScope(Collection<Integer> entryDivList) {
        doSetEntryDiv_NotInScope(entryDivList);
    }

    protected void doSetEntryDiv_NotInScope(Collection<Integer> entryDivList) {
        regINS(CK_NINS, cTL(entryDivList), xgetCValueEntryDiv(), "entry_div");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     */
    public void setEntryDiv_IsNull() { regEntryDiv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * entry_div: {int4(10)}
     */
    public void setEntryDiv_IsNotNull() { regEntryDiv(CK_ISNN, DOBJ); }

    protected void regEntryDiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryDiv(), "entry_div"); }
    protected abstract ConditionValue xgetCValueEntryDiv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
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
     * user_id: {NotNull, int4(10), FK to user_t}
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
     * user_id: {NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
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
     * user_id: {NotNull, int4(10), FK to user_t}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
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
     * user_id: {NotNull, int4(10), FK to user_t}
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
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
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
     * register_datetime: {timestamp(29, 6), default=[now()]}
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
     * register_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setRegisterDatetime_IsNull() { regRegisterDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
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
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
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
     * update_datetime: {timestamp(29, 6), default=[now()]}
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
     * update_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
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
    public HpSLCFunction<EntryTCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EntryTCB.class);
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
    public HpSLCFunction<EntryTCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EntryTCB.class);
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
    public HpSLCFunction<EntryTCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EntryTCB.class);
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
    public HpSLCFunction<EntryTCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EntryTCB.class);
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
    public HpSLCFunction<EntryTCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EntryTCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EntryTCB&gt;() {
     *     public void query(EntryTCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EntryTCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EntryTCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EntryTCQ sq);

    protected EntryTCB xcreateScalarConditionCB() {
        EntryTCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EntryTCB xcreateScalarConditionPartitionByCB() {
        EntryTCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EntryTCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = new EntryTCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "entry_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EntryTCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EntryTCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EntryTCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EntryTCB cb = new EntryTCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "entry_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EntryTCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EntryTCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EntryTCB cb = new EntryTCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EntryTCQ sq);

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
    protected EntryTCB newMyCB() {
        return new EntryTCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EntryTCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
