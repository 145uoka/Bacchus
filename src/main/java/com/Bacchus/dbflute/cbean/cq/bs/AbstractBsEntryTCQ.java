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
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_Equal(Integer entryId) {
        doSetEntryId_Equal(entryId);
    }

    protected void doSetEntryId_Equal(Integer entryId) {
        regEntryId(CK_EQ, entryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_NotEqual(Integer entryId) {
        doSetEntryId_NotEqual(entryId);
    }

    protected void doSetEntryId_NotEqual(Integer entryId) {
        regEntryId(CK_NES, entryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_GreaterThan(Integer entryId) {
        regEntryId(CK_GT, entryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_LessThan(Integer entryId) {
        regEntryId(CK_LT, entryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_GreaterEqual(Integer entryId) {
        regEntryId(CK_GE, entryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryId The value of entryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEntryId_LessEqual(Integer entryId) {
        regEntryId(CK_LE, entryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of entryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEntryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEntryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of entryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of entryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEntryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEntryId(), "entry_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryIdList The collection of entryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryId_InScope(Collection<Integer> entryIdList) {
        doSetEntryId_InScope(entryIdList);
    }

    protected void doSetEntryId_InScope(Collection<Integer> entryIdList) {
        regINS(CK_INS, cTL(entryIdList), xgetCValueEntryId(), "entry_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @param entryIdList The collection of entryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEntryId_NotInScope(Collection<Integer> entryIdList) {
        doSetEntryId_NotInScope(entryIdList);
    }

    protected void doSetEntryId_NotInScope(Collection<Integer> entryIdList) {
        regINS(CK_NINS, cTL(entryIdList), xgetCValueEntryId(), "entry_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     */
    public void setEntryId_IsNull() { regEntryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     */
    public void setEntryId_IsNotNull() { regEntryId(CK_ISNN, DOBJ); }

    protected void regEntryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEntryId(), "entry_id"); }
    protected abstract ConditionValue xgetCValueEntryId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
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
     * user_id: {int4(10)}
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
     * user_id: {int4(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
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
     * user_id: {int4(10)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_id: {int4(10)}
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
     * user_id: {int4(10)}
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
     * user_id: {int4(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_id: {int4(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

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
