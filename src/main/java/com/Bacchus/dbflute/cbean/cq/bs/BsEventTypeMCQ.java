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
 * The base condition-query of event_type_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsEventTypeMCQ extends AbstractBsEventTypeMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EventTypeMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEventTypeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from event_type_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EventTypeMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EventTypeMCIQ xcreateCIQ() {
        EventTypeMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EventTypeMCIQ xnewCIQ() {
        return new EventTypeMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join event_type_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EventTypeMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EventTypeMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _eventTypeId;
    public ConditionValue xdfgetEventTypeId()
    { if (_eventTypeId == null) { _eventTypeId = nCV(); }
      return _eventTypeId; }
    protected ConditionValue xgetCValueEventTypeId() { return xdfgetEventTypeId(); }

    public Map<String, EventTCQ> xdfgetEventTypeId_ExistsReferrer_EventTList() { return xgetSQueMap("eventTypeId_ExistsReferrer_EventTList"); }
    public String keepEventTypeId_ExistsReferrer_EventTList(EventTCQ sq) { return xkeepSQue("eventTypeId_ExistsReferrer_EventTList", sq); }

    public Map<String, EventTCQ> xdfgetEventTypeId_NotExistsReferrer_EventTList() { return xgetSQueMap("eventTypeId_NotExistsReferrer_EventTList"); }
    public String keepEventTypeId_NotExistsReferrer_EventTList(EventTCQ sq) { return xkeepSQue("eventTypeId_NotExistsReferrer_EventTList", sq); }

    public Map<String, EventTCQ> xdfgetEventTypeId_SpecifyDerivedReferrer_EventTList() { return xgetSQueMap("eventTypeId_SpecifyDerivedReferrer_EventTList"); }
    public String keepEventTypeId_SpecifyDerivedReferrer_EventTList(EventTCQ sq) { return xkeepSQue("eventTypeId_SpecifyDerivedReferrer_EventTList", sq); }

    public Map<String, EventTCQ> xdfgetEventTypeId_QueryDerivedReferrer_EventTList() { return xgetSQueMap("eventTypeId_QueryDerivedReferrer_EventTList"); }
    public String keepEventTypeId_QueryDerivedReferrer_EventTList(EventTCQ sq) { return xkeepSQue("eventTypeId_QueryDerivedReferrer_EventTList", sq); }
    public Map<String, Object> xdfgetEventTypeId_QueryDerivedReferrer_EventTListParameter() { return xgetSQuePmMap("eventTypeId_QueryDerivedReferrer_EventTList"); }
    public String keepEventTypeId_QueryDerivedReferrer_EventTListParameter(Object pm) { return xkeepSQuePm("eventTypeId_QueryDerivedReferrer_EventTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_EventTypeId_Asc() { regOBA("event_type_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_EventTypeId_Desc() { regOBD("event_type_id"); return this; }

    protected ConditionValue _eventTypeName;
    public ConditionValue xdfgetEventTypeName()
    { if (_eventTypeName == null) { _eventTypeName = nCV(); }
      return _eventTypeName; }
    protected ConditionValue xgetCValueEventTypeName() { return xdfgetEventTypeName(); }

    /** 
     * Add order-by as ascend. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_EventTypeName_Asc() { regOBA("event_type_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_type_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_EventTypeName_Desc() { regOBD("event_type_name"); return this; }

    protected ConditionValue _orderNum;
    public ConditionValue xdfgetOrderNum()
    { if (_orderNum == null) { _orderNum = nCV(); }
      return _orderNum; }
    protected ConditionValue xgetCValueOrderNum() { return xdfgetOrderNum(); }

    /** 
     * Add order-by as ascend. <br>
     * order_num: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_OrderNum_Asc() { regOBA("order_num"); return this; }

    /**
     * Add order-by as descend. <br>
     * order_num: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTypeMCQ addOrderBy_OrderNum_Desc() { regOBD("order_num"); return this; }

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
    public BsEventTypeMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEventTypeMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EventTypeMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EventTypeMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EventTypeMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EventTypeMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EventTypeMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EventTypeMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EventTypeMCQ> _myselfExistsMap;
    public Map<String, EventTypeMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EventTypeMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EventTypeMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EventTypeMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EventTypeMCB.class.getName(); }
    protected String xCQ() { return EventTypeMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
