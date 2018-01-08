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
 * The base condition-query of event_t.
 * @author DBFlute(AutoGenerator)
 */
public class BsEventTCQ extends AbstractBsEventTCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EventTCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEventTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from event_t) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EventTCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EventTCIQ xcreateCIQ() {
        EventTCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EventTCIQ xnewCIQ() {
        return new EventTCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join event_t on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EventTCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EventTCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _eventNo;
    public ConditionValue xdfgetEventNo()
    { if (_eventNo == null) { _eventNo = nCV(); }
      return _eventNo; }
    protected ConditionValue xgetCValueEventNo() { return xdfgetEventNo(); }

    public Map<String, CandidateTCQ> xdfgetEventNo_ExistsReferrer_CandidateTList() { return xgetSQueMap("eventNo_ExistsReferrer_CandidateTList"); }
    public String keepEventNo_ExistsReferrer_CandidateTList(CandidateTCQ sq) { return xkeepSQue("eventNo_ExistsReferrer_CandidateTList", sq); }

    public Map<String, CandidateTCQ> xdfgetEventNo_NotExistsReferrer_CandidateTList() { return xgetSQueMap("eventNo_NotExistsReferrer_CandidateTList"); }
    public String keepEventNo_NotExistsReferrer_CandidateTList(CandidateTCQ sq) { return xkeepSQue("eventNo_NotExistsReferrer_CandidateTList", sq); }

    public Map<String, CandidateTCQ> xdfgetEventNo_SpecifyDerivedReferrer_CandidateTList() { return xgetSQueMap("eventNo_SpecifyDerivedReferrer_CandidateTList"); }
    public String keepEventNo_SpecifyDerivedReferrer_CandidateTList(CandidateTCQ sq) { return xkeepSQue("eventNo_SpecifyDerivedReferrer_CandidateTList", sq); }

    public Map<String, CandidateTCQ> xdfgetEventNo_QueryDerivedReferrer_CandidateTList() { return xgetSQueMap("eventNo_QueryDerivedReferrer_CandidateTList"); }
    public String keepEventNo_QueryDerivedReferrer_CandidateTList(CandidateTCQ sq) { return xkeepSQue("eventNo_QueryDerivedReferrer_CandidateTList", sq); }
    public Map<String, Object> xdfgetEventNo_QueryDerivedReferrer_CandidateTListParameter() { return xgetSQuePmMap("eventNo_QueryDerivedReferrer_CandidateTList"); }
    public String keepEventNo_QueryDerivedReferrer_CandidateTListParameter(Object pm) { return xkeepSQuePm("eventNo_QueryDerivedReferrer_CandidateTList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventNo_Asc() { regOBA("event_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_no: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventNo_Desc() { regOBD("event_no"); return this; }

    protected ConditionValue _eventName;
    public ConditionValue xdfgetEventName()
    { if (_eventName == null) { _eventName = nCV(); }
      return _eventName; }
    protected ConditionValue xgetCValueEventName() { return xdfgetEventName(); }

    /** 
     * Add order-by as ascend. <br>
     * event_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventName_Asc() { regOBA("event_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventName_Desc() { regOBD("event_name"); return this; }

    protected ConditionValue _eventDetail;
    public ConditionValue xdfgetEventDetail()
    { if (_eventDetail == null) { _eventDetail = nCV(); }
      return _eventDetail; }
    protected ConditionValue xgetCValueEventDetail() { return xdfgetEventDetail(); }

    /** 
     * Add order-by as ascend. <br>
     * event_detail: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventDetail_Asc() { regOBA("event_detail"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_detail: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventDetail_Desc() { regOBD("event_detail"); return this; }

    protected ConditionValue _eventPlace;
    public ConditionValue xdfgetEventPlace()
    { if (_eventPlace == null) { _eventPlace = nCV(); }
      return _eventPlace; }
    protected ConditionValue xgetCValueEventPlace() { return xdfgetEventPlace(); }

    /** 
     * Add order-by as ascend. <br>
     * event_place: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventPlace_Asc() { regOBA("event_place"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_place: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventPlace_Desc() { regOBD("event_place"); return this; }

    protected ConditionValue _eventUrl;
    public ConditionValue xdfgetEventUrl()
    { if (_eventUrl == null) { _eventUrl = nCV(); }
      return _eventUrl; }
    protected ConditionValue xgetCValueEventUrl() { return xdfgetEventUrl(); }

    /** 
     * Add order-by as ascend. <br>
     * event_url: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventUrl_Asc() { regOBA("event_url"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_url: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventUrl_Desc() { regOBD("event_url"); return this; }

    protected ConditionValue _tell;
    public ConditionValue xdfgetTell()
    { if (_tell == null) { _tell = nCV(); }
      return _tell; }
    protected ConditionValue xgetCValueTell() { return xdfgetTell(); }

    /** 
     * Add order-by as ascend. <br>
     * tell: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_Tell_Asc() { regOBA("tell"); return this; }

    /**
     * Add order-by as descend. <br>
     * tell: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_Tell_Desc() { regOBD("tell"); return this; }

    protected ConditionValue _eventEntryFee;
    public ConditionValue xdfgetEventEntryFee()
    { if (_eventEntryFee == null) { _eventEntryFee = nCV(); }
      return _eventEntryFee; }
    protected ConditionValue xgetCValueEventEntryFee() { return xdfgetEventEntryFee(); }

    /** 
     * Add order-by as ascend. <br>
     * event_entry_fee: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventEntryFee_Asc() { regOBA("event_entry_fee"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_entry_fee: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventEntryFee_Desc() { regOBD("event_entry_fee"); return this; }

    protected ConditionValue _auxiliaryFlg;
    public ConditionValue xdfgetAuxiliaryFlg()
    { if (_auxiliaryFlg == null) { _auxiliaryFlg = nCV(); }
      return _auxiliaryFlg; }
    protected ConditionValue xgetCValueAuxiliaryFlg() { return xdfgetAuxiliaryFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * auxiliary_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_AuxiliaryFlg_Asc() { regOBA("auxiliary_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * auxiliary_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_AuxiliaryFlg_Desc() { regOBD("auxiliary_flg"); return this; }

    protected ConditionValue _fixFlg;
    public ConditionValue xdfgetFixFlg()
    { if (_fixFlg == null) { _fixFlg = nCV(); }
      return _fixFlg; }
    protected ConditionValue xgetCValueFixFlg() { return xdfgetFixFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * fix_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_FixFlg_Asc() { regOBA("fix_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * fix_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_FixFlg_Desc() { regOBD("fix_flg"); return this; }

    protected ConditionValue _candidateNo;
    public ConditionValue xdfgetCandidateNo()
    { if (_candidateNo == null) { _candidateNo = nCV(); }
      return _candidateNo; }
    protected ConditionValue xgetCValueCandidateNo() { return xdfgetCandidateNo(); }

    /** 
     * Add order-by as ascend. <br>
     * candidate_no: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_CandidateNo_Asc() { regOBA("candidate_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * candidate_no: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_CandidateNo_Desc() { regOBD("candidate_no"); return this; }

    protected ConditionValue _storeName;
    public ConditionValue xdfgetStoreName()
    { if (_storeName == null) { _storeName = nCV(); }
      return _storeName; }
    protected ConditionValue xgetCValueStoreName() { return xdfgetStoreName(); }

    /** 
     * Add order-by as ascend. <br>
     * store_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_StoreName_Asc() { regOBA("store_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * store_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_StoreName_Desc() { regOBD("store_name"); return this; }

    protected ConditionValue _eventDiv;
    public ConditionValue xdfgetEventDiv()
    { if (_eventDiv == null) { _eventDiv = nCV(); }
      return _eventDiv; }
    protected ConditionValue xgetCValueEventDiv() { return xdfgetEventDiv(); }

    /** 
     * Add order-by as ascend. <br>
     * event_div: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventDiv_Asc() { regOBA("event_div"); return this; }

    /**
     * Add order-by as descend. <br>
     * event_div: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_EventDiv_Desc() { regOBD("event_div"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * user_id: {int4(10), FK to user_t}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {int4(10), FK to user_t}
     * @return this. (NotNull)
     */
    public BsEventTCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

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
    public BsEventTCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEventTCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        EventTCQ bq = (EventTCQ)bqs;
        EventTCQ uq = (EventTCQ)uqs;
        if (bq.hasConditionQueryUserT()) {
            uq.queryUserT().reflectRelationOnUnionQuery(bq.queryUserT(), uq.queryUserT());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("event_t", "userT"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, EventTCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EventTCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EventTCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EventTCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EventTCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EventTCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EventTCQ> _myselfExistsMap;
    public Map<String, EventTCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EventTCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EventTCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EventTCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EventTCB.class.getName(); }
    protected String xCQ() { return EventTCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
