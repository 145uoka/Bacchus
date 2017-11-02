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
 * The abstract condition-query of subsidy_mng_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSubsidyMngMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSubsidyMngMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "subsidy_mng_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_Equal(Integer moneyId) {
        doSetMoneyId_Equal(moneyId);
    }

    protected void doSetMoneyId_Equal(Integer moneyId) {
        regMoneyId(CK_EQ, moneyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_NotEqual(Integer moneyId) {
        doSetMoneyId_NotEqual(moneyId);
    }

    protected void doSetMoneyId_NotEqual(Integer moneyId) {
        regMoneyId(CK_NES, moneyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_GreaterThan(Integer moneyId) {
        regMoneyId(CK_GT, moneyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_LessThan(Integer moneyId) {
        regMoneyId(CK_LT, moneyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_GreaterEqual(Integer moneyId) {
        regMoneyId(CK_GE, moneyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyId The value of moneyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoneyId_LessEqual(Integer moneyId) {
        regMoneyId(CK_LE, moneyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of moneyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of moneyId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMoneyId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMoneyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of moneyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of moneyId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMoneyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoneyId(), "money_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyIdList The collection of moneyId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMoneyId_InScope(Collection<Integer> moneyIdList) {
        doSetMoneyId_InScope(moneyIdList);
    }

    protected void doSetMoneyId_InScope(Collection<Integer> moneyIdList) {
        regINS(CK_INS, cTL(moneyIdList), xgetCValueMoneyId(), "money_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @param moneyIdList The collection of moneyId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMoneyId_NotInScope(Collection<Integer> moneyIdList) {
        doSetMoneyId_NotInScope(moneyIdList);
    }

    protected void doSetMoneyId_NotInScope(Collection<Integer> moneyIdList) {
        regINS(CK_NINS, cTL(moneyIdList), xgetCValueMoneyId(), "money_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     */
    public void setMoneyId_IsNull() { regMoneyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     */
    public void setMoneyId_IsNotNull() { regMoneyId(CK_ISNN, DOBJ); }

    protected void regMoneyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoneyId(), "money_id"); }
    protected abstract ConditionValue xgetCValueMoneyId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_Equal(Integer userType) {
        doSetUserType_Equal(userType);
    }

    protected void doSetUserType_Equal(Integer userType) {
        regUserType(CK_EQ, userType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_NotEqual(Integer userType) {
        doSetUserType_NotEqual(userType);
    }

    protected void doSetUserType_NotEqual(Integer userType) {
        regUserType(CK_NES, userType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_GreaterThan(Integer userType) {
        regUserType(CK_GT, userType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_LessThan(Integer userType) {
        regUserType(CK_LT, userType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_GreaterEqual(Integer userType) {
        regUserType(CK_GE, userType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param userType The value of userType as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserType_LessEqual(Integer userType) {
        regUserType(CK_LE, userType);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param minNumber The min number of userType. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userType. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserType_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserType_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     * @param minNumber The min number of userType. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userType. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserType_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserType(), "user_type", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_type: {int4(10)}
     * @param userTypeList The collection of userType as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserType_InScope(Collection<Integer> userTypeList) {
        doSetUserType_InScope(userTypeList);
    }

    protected void doSetUserType_InScope(Collection<Integer> userTypeList) {
        regINS(CK_INS, cTL(userTypeList), xgetCValueUserType(), "user_type");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * user_type: {int4(10)}
     * @param userTypeList The collection of userType as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserType_NotInScope(Collection<Integer> userTypeList) {
        doSetUserType_NotInScope(userTypeList);
    }

    protected void doSetUserType_NotInScope(Collection<Integer> userTypeList) {
        regINS(CK_NINS, cTL(userTypeList), xgetCValueUserType(), "user_type");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     */
    public void setUserType_IsNull() { regUserType(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * user_type: {int4(10)}
     */
    public void setUserType_IsNotNull() { regUserType(CK_ISNN, DOBJ); }

    protected void regUserType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserType(), "user_type"); }
    protected abstract ConditionValue xgetCValueUserType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_Equal(Integer money) {
        doSetMoney_Equal(money);
    }

    protected void doSetMoney_Equal(Integer money) {
        regMoney(CK_EQ, money);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_NotEqual(Integer money) {
        doSetMoney_NotEqual(money);
    }

    protected void doSetMoney_NotEqual(Integer money) {
        regMoney(CK_NES, money);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_GreaterThan(Integer money) {
        regMoney(CK_GT, money);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_LessThan(Integer money) {
        regMoney(CK_LT, money);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_GreaterEqual(Integer money) {
        regMoney(CK_GE, money);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param money The value of money as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoney_LessEqual(Integer money) {
        regMoney(CK_LE, money);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param minNumber The min number of money. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of money. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMoney_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMoney_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * money: {int4(10)}
     * @param minNumber The min number of money. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of money. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMoney_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoney(), "money", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * money: {int4(10)}
     * @param moneyList The collection of money as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMoney_InScope(Collection<Integer> moneyList) {
        doSetMoney_InScope(moneyList);
    }

    protected void doSetMoney_InScope(Collection<Integer> moneyList) {
        regINS(CK_INS, cTL(moneyList), xgetCValueMoney(), "money");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * money: {int4(10)}
     * @param moneyList The collection of money as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMoney_NotInScope(Collection<Integer> moneyList) {
        doSetMoney_NotInScope(moneyList);
    }

    protected void doSetMoney_NotInScope(Collection<Integer> moneyList) {
        regINS(CK_NINS, cTL(moneyList), xgetCValueMoney(), "money");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * money: {int4(10)}
     */
    public void setMoney_IsNull() { regMoney(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * money: {int4(10)}
     */
    public void setMoney_IsNotNull() { regMoney(CK_ISNN, DOBJ); }

    protected void regMoney(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoney(), "money"); }
    protected abstract ConditionValue xgetCValueMoney();

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
    public HpSLCFunction<SubsidyMngMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SubsidyMngMCB.class);
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
    public HpSLCFunction<SubsidyMngMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SubsidyMngMCB.class);
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
    public HpSLCFunction<SubsidyMngMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SubsidyMngMCB.class);
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
    public HpSLCFunction<SubsidyMngMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SubsidyMngMCB.class);
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
    public HpSLCFunction<SubsidyMngMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SubsidyMngMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SubsidyMngMCB&gt;() {
     *     public void query(SubsidyMngMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SubsidyMngMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SubsidyMngMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SubsidyMngMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SubsidyMngMCQ sq);

    protected SubsidyMngMCB xcreateScalarConditionCB() {
        SubsidyMngMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SubsidyMngMCB xcreateScalarConditionPartitionByCB() {
        SubsidyMngMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SubsidyMngMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SubsidyMngMCB cb = new SubsidyMngMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "money_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SubsidyMngMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SubsidyMngMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SubsidyMngMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SubsidyMngMCB cb = new SubsidyMngMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "money_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SubsidyMngMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SubsidyMngMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SubsidyMngMCB cb = new SubsidyMngMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SubsidyMngMCQ sq);

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
    protected SubsidyMngMCB newMyCB() {
        return new SubsidyMngMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SubsidyMngMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
