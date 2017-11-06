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
 * The base condition-query of entry_t.
 * @author DBFlute(AutoGenerator)
 */
public class BsEntryTCQ extends AbstractBsEntryTCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EntryTCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEntryTCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from entry_t) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EntryTCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EntryTCIQ xcreateCIQ() {
        EntryTCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EntryTCIQ xnewCIQ() {
        return new EntryTCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join entry_t on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EntryTCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EntryTCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _entryId;
    public ConditionValue xdfgetEntryId()
    { if (_entryId == null) { _entryId = nCV(); }
      return _entryId; }
    protected ConditionValue xgetCValueEntryId() { return xdfgetEntryId(); }

    /** 
     * Add order-by as ascend. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_EntryId_Asc() { regOBA("entry_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_EntryId_Desc() { regOBD("entry_id"); return this; }

    protected ConditionValue _candidateNo;
    public ConditionValue xdfgetCandidateNo()
    { if (_candidateNo == null) { _candidateNo = nCV(); }
      return _candidateNo; }
    protected ConditionValue xgetCValueCandidateNo() { return xdfgetCandidateNo(); }

    /** 
     * Add order-by as ascend. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_CandidateNo_Asc() { regOBA("candidate_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_CandidateNo_Desc() { regOBD("candidate_no"); return this; }

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
    public BsEntryTCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {NotNull, int4(10), FK to user_t}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _entryDiv;
    public ConditionValue xdfgetEntryDiv()
    { if (_entryDiv == null) { _entryDiv = nCV(); }
      return _entryDiv; }
    protected ConditionValue xgetCValueEntryDiv() { return xdfgetEntryDiv(); }

    /** 
     * Add order-by as ascend. <br>
     * entry_div: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_EntryDiv_Asc() { regOBA("entry_div"); return this; }

    /**
     * Add order-by as descend. <br>
     * entry_div: {int4(10)}
     * @return this. (NotNull)
     */
    public BsEntryTCQ addOrderBy_EntryDiv_Desc() { regOBD("entry_div"); return this; }

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
    public BsEntryTCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEntryTCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        EntryTCQ bq = (EntryTCQ)bqs;
        EntryTCQ uq = (EntryTCQ)uqs;
        if (bq.hasConditionQueryCandidateT()) {
            uq.queryCandidateT().reflectRelationOnUnionQuery(bq.queryCandidateT(), uq.queryCandidateT());
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
     * candidate_t by my candidate_no, named 'candidateT'.
     * @return The instance of condition-query. (NotNull)
     */
    public CandidateTCQ queryCandidateT() {
        return xdfgetConditionQueryCandidateT();
    }
    public CandidateTCQ xdfgetConditionQueryCandidateT() {
        String prop = "candidateT";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCandidateT()); xsetupOuterJoinCandidateT(); }
        return xgetQueRlMap(prop);
    }
    protected CandidateTCQ xcreateQueryCandidateT() {
        String nrp = xresolveNRP("entry_t", "candidateT"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CandidateTCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "candidateT", nrp);
    }
    protected void xsetupOuterJoinCandidateT() { xregOutJo("candidateT"); }
    public boolean hasConditionQueryCandidateT() { return xhasQueRlMap("candidateT"); }

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
        String nrp = xresolveNRP("entry_t", "userT"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, EntryTCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EntryTCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EntryTCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EntryTCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EntryTCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EntryTCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EntryTCQ> _myselfExistsMap;
    public Map<String, EntryTCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EntryTCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EntryTCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EntryTCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EntryTCB.class.getName(); }
    protected String xCQ() { return EntryTCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
