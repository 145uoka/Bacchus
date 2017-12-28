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
 * The base condition-query of auth_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsAuthMCQ extends AbstractBsAuthMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AuthMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAuthMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from auth_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AuthMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AuthMCIQ xcreateCIQ() {
        AuthMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AuthMCIQ xnewCIQ() {
        return new AuthMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join auth_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AuthMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AuthMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _authLevel;
    public ConditionValue xdfgetAuthLevel()
    { if (_authLevel == null) { _authLevel = nCV(); }
      return _authLevel; }
    protected ConditionValue xgetCValueAuthLevel() { return xdfgetAuthLevel(); }

    public Map<String, UserTCQ> xdfgetAuthLevel_ExistsReferrer_UserTList() { return xgetSQueMap("authLevel_ExistsReferrer_UserTList"); }
    public String keepAuthLevel_ExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("authLevel_ExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetAuthLevel_NotExistsReferrer_UserTList() { return xgetSQueMap("authLevel_NotExistsReferrer_UserTList"); }
    public String keepAuthLevel_NotExistsReferrer_UserTList(UserTCQ sq) { return xkeepSQue("authLevel_NotExistsReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetAuthLevel_SpecifyDerivedReferrer_UserTList() { return xgetSQueMap("authLevel_SpecifyDerivedReferrer_UserTList"); }
    public String keepAuthLevel_SpecifyDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("authLevel_SpecifyDerivedReferrer_UserTList", sq); }

    public Map<String, UserTCQ> xdfgetAuthLevel_QueryDerivedReferrer_UserTList() { return xgetSQueMap("authLevel_QueryDerivedReferrer_UserTList"); }
    public String keepAuthLevel_QueryDerivedReferrer_UserTList(UserTCQ sq) { return xkeepSQue("authLevel_QueryDerivedReferrer_UserTList", sq); }
    public Map<String, Object> xdfgetAuthLevel_QueryDerivedReferrer_UserTListParameter() { return xgetSQuePmMap("authLevel_QueryDerivedReferrer_UserTList"); }
    public String keepAuthLevel_QueryDerivedReferrer_UserTListParameter(Object pm) { return xkeepSQuePm("authLevel_QueryDerivedReferrer_UserTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsAuthMCQ addOrderBy_AuthLevel_Asc() { regOBA("auth_level"); return this; }

    /**
     * Add order-by as descend. <br>
     * auth_level: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsAuthMCQ addOrderBy_AuthLevel_Desc() { regOBD("auth_level"); return this; }

    protected ConditionValue _authName;
    public ConditionValue xdfgetAuthName()
    { if (_authName == null) { _authName = nCV(); }
      return _authName; }
    protected ConditionValue xgetCValueAuthName() { return xdfgetAuthName(); }

    /** 
     * Add order-by as ascend. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsAuthMCQ addOrderBy_AuthName_Asc() { regOBA("auth_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * auth_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsAuthMCQ addOrderBy_AuthName_Desc() { regOBD("auth_name"); return this; }

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
    public BsAuthMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAuthMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, AuthMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AuthMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AuthMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AuthMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AuthMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AuthMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AuthMCQ> _myselfExistsMap;
    public Map<String, AuthMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AuthMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AuthMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AuthMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AuthMCB.class.getName(); }
    protected String xCQ() { return AuthMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
