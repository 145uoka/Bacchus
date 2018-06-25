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
 * The base condition-query of event_notify.
 * @author DBFlute(AutoGenerator)
 */
public class BsEventNotifyCQ extends AbstractBsEventNotifyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EventNotifyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEventNotifyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from event_notify) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EventNotifyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EventNotifyCIQ xcreateCIQ() {
        EventNotifyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EventNotifyCIQ xnewCIQ() {
        return new EventNotifyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join event_notify on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EventNotifyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EventNotifyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _eventNotifyNo;
    public ConditionValue xdfgetEventNotifyNo()
    { if (_eventNotifyNo == null) { _eventNotifyNo = nCV(); }
      return _eventNotifyNo; }
    protected ConditionValue xgetCValueEventNotifyNo() { return xdfgetEventNotifyNo(); }

    /** 
     * Add order-by as ascend. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_EventNotifyNo_Asc() { regOBA("event_notify_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_EventNotifyNo_Desc() { regOBD("event_notify_no"); return this; }

    protected ConditionValue _eventNo;
    public ConditionValue xdfgetEventNo()
    { if (_eventNo == null) { _eventNo = nCV(); }
      return _eventNo; }
    protected ConditionValue xgetCValueEventNo() { return xdfgetEventNo(); }

    /** 
     * Add order-by as ascend. <br>
     * event_no: {UQ, NotNull, int4(10), FK to event_t}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_EventNo_Asc() { regOBA("event_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_no: {UQ, NotNull, int4(10), FK to event_t}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_EventNo_Desc() { regOBD("event_no"); return this; }

    protected ConditionValue _notifyDatetime;
    public ConditionValue xdfgetNotifyDatetime()
    { if (_notifyDatetime == null) { _notifyDatetime = nCV(); }
      return _notifyDatetime; }
    protected ConditionValue xgetCValueNotifyDatetime() { return xdfgetNotifyDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_NotifyDatetime_Asc() { regOBA("notify_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * notify_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_NotifyDatetime_Desc() { regOBD("notify_datetime"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * register_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * update_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /** 
     * Add order-by as ascend. <br>
     * delete_flag: {bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsEventNotifyCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsEventNotifyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEventNotifyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        EventNotifyCQ bq = (EventNotifyCQ)bqs;
        EventNotifyCQ uq = (EventNotifyCQ)uqs;
        if (bq.hasConditionQueryEventT()) {
            uq.queryEventT().reflectRelationOnUnionQuery(bq.queryEventT(), uq.queryEventT());
        }
        if (bq.hasConditionQueryUserT()) {
            uq.queryUserT().reflectRelationOnUnionQuery(bq.queryUserT(), uq.queryUserT());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * event_t by my event_no, named 'eventT'.
     * @return The instance of condition-query. (NotNull)
     */
    public EventTCQ queryEventT() {
        return xdfgetConditionQueryEventT();
    }
    public EventTCQ xdfgetConditionQueryEventT() {
        String prop = "eventT";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryEventT()); xsetupOuterJoinEventT(); }
        return xgetQueRlMap(prop);
    }
    protected EventTCQ xcreateQueryEventT() {
        String nrp = xresolveNRP("event_notify", "eventT"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new EventTCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "eventT", nrp);
    }
    protected void xsetupOuterJoinEventT() { xregOutJo("eventT"); }
    public boolean hasConditionQueryEventT() { return xhasQueRlMap("eventT"); }

    /**
     * Get the condition-query for relation table. <br>
     * user_t by my user_id, named 'userT'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserTCQ queryUserT() {
        return xdfgetConditionQueryUserT();
    }
    public UserTCQ xdfgetConditionQueryUserT() {
        String prop = "userT";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserT()); xsetupOuterJoinUserT(); }
        return xgetQueRlMap(prop);
    }
    protected UserTCQ xcreateQueryUserT() {
        String nrp = xresolveNRP("event_notify", "userT"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserTCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userT", nrp);
    }
    protected void xsetupOuterJoinUserT() { xregOutJo("userT"); }
    public boolean hasConditionQueryUserT() { return xhasQueRlMap("userT"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, EventNotifyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EventNotifyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EventNotifyCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EventNotifyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EventNotifyCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EventNotifyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EventNotifyCQ> _myselfExistsMap;
    public Map<String, EventNotifyCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EventNotifyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EventNotifyCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EventNotifyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EventNotifyCB.class.getName(); }
    protected String xCQ() { return EventNotifyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
