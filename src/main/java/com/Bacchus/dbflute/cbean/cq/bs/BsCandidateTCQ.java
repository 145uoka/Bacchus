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
 * The base condition-query of candidate_t.
 * @author DBFlute(AutoGenerator)
 */
public class BsCandidateTCQ extends AbstractBsCandidateTCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CandidateTCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCandidateTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from candidate_t) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CandidateTCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CandidateTCIQ xcreateCIQ() {
        CandidateTCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CandidateTCIQ xnewCIQ() {
        return new CandidateTCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join candidate_t on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CandidateTCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CandidateTCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _candidateNo;
    public ConditionValue xdfgetCandidateNo()
    { if (_candidateNo == null) { _candidateNo = nCV(); }
      return _candidateNo; }
    protected ConditionValue xgetCValueCandidateNo() { return xdfgetCandidateNo(); }

    public Map<String, EntryTCQ> xdfgetCandidateNo_ExistsReferrer_EntryTList() { return xgetSQueMap("candidateNo_ExistsReferrer_EntryTList"); }
    public String keepCandidateNo_ExistsReferrer_EntryTList(EntryTCQ sq) { return xkeepSQue("candidateNo_ExistsReferrer_EntryTList", sq); }

    public Map<String, EntryTCQ> xdfgetCandidateNo_NotExistsReferrer_EntryTList() { return xgetSQueMap("candidateNo_NotExistsReferrer_EntryTList"); }
    public String keepCandidateNo_NotExistsReferrer_EntryTList(EntryTCQ sq) { return xkeepSQue("candidateNo_NotExistsReferrer_EntryTList", sq); }

    public Map<String, EntryTCQ> xdfgetCandidateNo_SpecifyDerivedReferrer_EntryTList() { return xgetSQueMap("candidateNo_SpecifyDerivedReferrer_EntryTList"); }
    public String keepCandidateNo_SpecifyDerivedReferrer_EntryTList(EntryTCQ sq) { return xkeepSQue("candidateNo_SpecifyDerivedReferrer_EntryTList", sq); }

    public Map<String, EntryTCQ> xdfgetCandidateNo_QueryDerivedReferrer_EntryTList() { return xgetSQueMap("candidateNo_QueryDerivedReferrer_EntryTList"); }
    public String keepCandidateNo_QueryDerivedReferrer_EntryTList(EntryTCQ sq) { return xkeepSQue("candidateNo_QueryDerivedReferrer_EntryTList", sq); }
    public Map<String, Object> xdfgetCandidateNo_QueryDerivedReferrer_EntryTListParameter() { return xgetSQuePmMap("candidateNo_QueryDerivedReferrer_EntryTList"); }
    public String keepCandidateNo_QueryDerivedReferrer_EntryTListParameter(Object pm) { return xkeepSQuePm("candidateNo_QueryDerivedReferrer_EntryTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_CandidateNo_Asc() { regOBA("candidate_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_CandidateNo_Desc() { regOBD("candidate_no"); return this; }

    protected ConditionValue _eventNo;
    public ConditionValue xdfgetEventNo()
    { if (_eventNo == null) { _eventNo = nCV(); }
      return _eventNo; }
    protected ConditionValue xgetCValueEventNo() { return xdfgetEventNo(); }

    /** 
     * Add order-by as ascend. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventNo_Asc() { regOBA("event_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventNo_Desc() { regOBD("event_no"); return this; }

    protected ConditionValue _eventStartDatetime;
    public ConditionValue xdfgetEventStartDatetime()
    { if (_eventStartDatetime == null) { _eventStartDatetime = nCV(); }
      return _eventStartDatetime; }
    protected ConditionValue xgetCValueEventStartDatetime() { return xdfgetEventStartDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventStartDatetime_Asc() { regOBA("event_start_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_start_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventStartDatetime_Desc() { regOBD("event_start_datetime"); return this; }

    protected ConditionValue _eventEndDatetime;
    public ConditionValue xdfgetEventEndDatetime()
    { if (_eventEndDatetime == null) { _eventEndDatetime = nCV(); }
      return _eventEndDatetime; }
    protected ConditionValue xgetCValueEventEndDatetime() { return xdfgetEventEndDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventEndDatetime_Asc() { regOBA("event_end_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_end_datetime: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_EventEndDatetime_Desc() { regOBD("event_end_datetime"); return this; }

    protected ConditionValue _startDate;
    public ConditionValue xdfgetStartDate()
    { if (_startDate == null) { _startDate = nCV(); }
      return _startDate; }
    protected ConditionValue xgetCValueStartDate() { return xdfgetStartDate(); }

    /** 
     * Add order-by as ascend. <br>
     * start_date: {+UQ, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_StartDate_Asc() { regOBA("start_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_date: {+UQ, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_StartDate_Desc() { regOBD("start_date"); return this; }

    protected ConditionValue _startTime;
    public ConditionValue xdfgetStartTime()
    { if (_startTime == null) { _startTime = nCV(); }
      return _startTime; }
    protected ConditionValue xgetCValueStartTime() { return xdfgetStartTime(); }

    /** 
     * Add order-by as ascend. <br>
     * start_time: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_StartTime_Asc() { regOBA("start_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * start_time: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_StartTime_Desc() { regOBD("start_time"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsCandidateTCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsCandidateTCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsCandidateTCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsCandidateTCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsCandidateTCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCandidateTCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CandidateTCQ bq = (CandidateTCQ)bqs;
        CandidateTCQ uq = (CandidateTCQ)uqs;
        if (bq.hasConditionQueryEventT()) {
            uq.queryEventT().reflectRelationOnUnionQuery(bq.queryEventT(), uq.queryEventT());
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
        String nrp = xresolveNRP("candidate_t", "eventT"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new EventTCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "eventT", nrp);
    }
    protected void xsetupOuterJoinEventT() { xregOutJo("eventT"); }
    public boolean hasConditionQueryEventT() { return xhasQueRlMap("eventT"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CandidateTCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CandidateTCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CandidateTCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CandidateTCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CandidateTCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CandidateTCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CandidateTCQ> _myselfExistsMap;
    public Map<String, CandidateTCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CandidateTCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CandidateTCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CandidateTCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CandidateTCB.class.getName(); }
    protected String xCQ() { return CandidateTCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
