package com.Bacchus.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.Bacchus.dbflute.cbean.cq.ciq.*;
import com.Bacchus.dbflute.cbean.*;
import com.Bacchus.dbflute.cbean.cq.*;

/**
 * The base condition-query of subsidy_mng_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsSubsidyMngMCQ extends AbstractBsSubsidyMngMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SubsidyMngMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSubsidyMngMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from subsidy_mng_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SubsidyMngMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SubsidyMngMCIQ xcreateCIQ() {
        SubsidyMngMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SubsidyMngMCIQ xnewCIQ() {
        return new SubsidyMngMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join subsidy_mng_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SubsidyMngMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SubsidyMngMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _moneyId;
    public ConditionValue xdfgetMoneyId()
    { if (_moneyId == null) { _moneyId = nCV(); }
      return _moneyId; }
    protected ConditionValue xgetCValueMoneyId() { return xdfgetMoneyId(); }

    public Map<String, UserTCQ> xdfgetMoneyId_ExistsReferrer_UserTList() { return xgetSQueMap("moneyId_ExistsReferrer_UserTList"); }
    public String keepMoneyId_ExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("moneyId_ExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetMoneyId_NotExistsReferrer_UserTList() { return xgetSQueMap("moneyId_NotExistsReferrer_UserTList"); }
    public String keepMoneyId_NotExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("moneyId_NotExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetMoneyId_SpecifyDerivedReferrer_UserTList() { return xgetSQueMap("moneyId_SpecifyDerivedReferrer_UserTList"); }
    public String keepMoneyId_SpecifyDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("moneyId_SpecifyDerivedReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetMoneyId_QueryDerivedReferrer_UserTList() { return xgetSQueMap("moneyId_QueryDerivedReferrer_UserTList"); }
    public String keepMoneyId_QueryDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("moneyId_QueryDerivedReferrer_UserTList", sq); }
    public Map<String, Object> xdfgetMoneyId_QueryDerivedReferrer_UserTListParameter() { return xgetSQuePmMap("moneyId_QueryDerivedReferrer_UserTList"); }
    public String keepMoneyId_QueryDerivedReferrer_UserTListParameter(Object pm) { return xkeepSQuePm("moneyId_QueryDerivedReferrer_UserTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_MoneyId_Asc() { regOBA("money_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * money_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_MoneyId_Desc() { regOBD("money_id"); return this; }

    protected ConditionValue _userType;
    public ConditionValue xdfgetUserType()
    { if (_userType == null) { _userType = nCV(); }
      return _userType; }
    protected ConditionValue xgetCValueUserType() { return xdfgetUserType(); }

    /** 
     * Add order-by as ascend. <br>
     * user_type: {int4(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_UserType_Asc() { regOBA("user_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_type: {int4(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_UserType_Desc() { regOBD("user_type"); return this; }

    protected ConditionValue _money;
    public ConditionValue xdfgetMoney()
    { if (_money == null) { _money = nCV(); }
      return _money; }
    protected ConditionValue xgetCValueMoney() { return xdfgetMoney(); }

    /** 
     * Add order-by as ascend. <br>
     * money: {int4(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_Money_Asc() { regOBA("money"); return this; }

    /**
     * Add order-by as descend. <br>
     * money: {int4(10)}
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addOrderBy_Money_Desc() { regOBD("money"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsSubsidyMngMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SubsidyMngMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SubsidyMngMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SubsidyMngMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SubsidyMngMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SubsidyMngMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SubsidyMngMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SubsidyMngMCQ> _myselfExistsMap;
    public Map<String, SubsidyMngMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SubsidyMngMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SubsidyMngMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SubsidyMngMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SubsidyMngMCB.class.getName(); }
    protected String xCQ() { return SubsidyMngMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
