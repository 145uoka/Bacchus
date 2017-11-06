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
 * The base condition-query of user_type_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserTypeMCQ extends AbstractBsUserTypeMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserTypeMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserTypeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_type_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserTypeMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserTypeMCIQ xcreateCIQ() {
        UserTypeMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserTypeMCIQ xnewCIQ() {
        return new UserTypeMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_type_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserTypeMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserTypeMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userTypeId;
    public ConditionValue xdfgetUserTypeId()
    { if (_userTypeId == null) { _userTypeId = nCV(); }
      return _userTypeId; }
    protected ConditionValue xgetCValueUserTypeId() { return xdfgetUserTypeId(); }

    public Map<String, UserTCQ> xdfgetUserTypeId_ExistsReferrer_UserTList() { return xgetSQueMap("userTypeId_ExistsReferrer_UserTList"); }
    public String keepUserTypeId_ExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("userTypeId_ExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetUserTypeId_NotExistsReferrer_UserTList() { return xgetSQueMap("userTypeId_NotExistsReferrer_UserTList"); }
    public String keepUserTypeId_NotExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("userTypeId_NotExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetUserTypeId_SpecifyDerivedReferrer_UserTList() { return xgetSQueMap("userTypeId_SpecifyDerivedReferrer_UserTList"); }
    public String keepUserTypeId_SpecifyDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("userTypeId_SpecifyDerivedReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetUserTypeId_QueryDerivedReferrer_UserTList() { return xgetSQueMap("userTypeId_QueryDerivedReferrer_UserTList"); }
    public String keepUserTypeId_QueryDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("userTypeId_QueryDerivedReferrer_UserTList", sq); }
    public Map<String, Object> xdfgetUserTypeId_QueryDerivedReferrer_UserTListParameter() { return xgetSQuePmMap("userTypeId_QueryDerivedReferrer_UserTList"); }
    public String keepUserTypeId_QueryDerivedReferrer_UserTListParameter(Object pm) { return xkeepSQuePm("userTypeId_QueryDerivedReferrer_UserTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_UserTypeId_Asc() { regOBA("user_type_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_UserTypeId_Desc() { regOBD("user_type_id"); return this; }

    protected ConditionValue _userTypeName;
    public ConditionValue xdfgetUserTypeName()
    { if (_userTypeName == null) { _userTypeName = nCV(); }
      return _userTypeName; }
    protected ConditionValue xgetCValueUserTypeName() { return xdfgetUserTypeName(); }

    /** 
     * Add order-by as ascend. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_UserTypeName_Asc() { regOBA("user_type_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_type_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_UserTypeName_Desc() { regOBD("user_type_name"); return this; }

    protected ConditionValue _subsidyAmount;
    public ConditionValue xdfgetSubsidyAmount()
    { if (_subsidyAmount == null) { _subsidyAmount = nCV(); }
      return _subsidyAmount; }
    protected ConditionValue xgetCValueSubsidyAmount() { return xdfgetSubsidyAmount(); }

    /** 
     * Add order-by as ascend. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_SubsidyAmount_Asc() { regOBA("subsidy_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserTypeMCQ addOrderBy_SubsidyAmount_Desc() { regOBD("subsidy_amount"); return this; }

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
    public BsUserTypeMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserTypeMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, UserTypeMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserTypeMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserTypeMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserTypeMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserTypeMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserTypeMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserTypeMCQ> _myselfExistsMap;
    public Map<String, UserTypeMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserTypeMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserTypeMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserTypeMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserTypeMCB.class.getName(); }
    protected String xCQ() { return UserTypeMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
