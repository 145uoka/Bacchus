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
 * The base condition-query of general_code_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsGeneralCodeMCQ extends AbstractBsGeneralCodeMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GeneralCodeMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGeneralCodeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from general_code_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GeneralCodeMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GeneralCodeMCIQ xcreateCIQ() {
        GeneralCodeMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GeneralCodeMCIQ xnewCIQ() {
        return new GeneralCodeMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join general_code_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GeneralCodeMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GeneralCodeMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _codeId;
    public ConditionValue xdfgetCodeId()
    { if (_codeId == null) { _codeId = nCV(); }
      return _codeId; }
    protected ConditionValue xgetCValueCodeId() { return xdfgetCodeId(); }

    /** 
     * Add order-by as ascend. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_CodeId_Asc() { regOBA("code_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_CodeId_Desc() { regOBD("code_id"); return this; }

    protected ConditionValue _codeDiv;
    public ConditionValue xdfgetCodeDiv()
    { if (_codeDiv == null) { _codeDiv = nCV(); }
      return _codeDiv; }
    protected ConditionValue xgetCValueCodeDiv() { return xdfgetCodeDiv(); }

    /** 
     * Add order-by as ascend. <br>
     * code_div: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_CodeDiv_Asc() { regOBA("code_div"); return this; }

    /**
     * Add order-by as descend. <br>
     * code_div: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_CodeDiv_Desc() { regOBD("code_div"); return this; }

    protected ConditionValue _code;
    public ConditionValue xdfgetCode()
    { if (_code == null) { _code = nCV(); }
      return _code; }
    protected ConditionValue xgetCValueCode() { return xdfgetCode(); }

    /** 
     * Add order-by as ascend. <br>
     * code: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Code_Asc() { regOBA("code"); return this; }

    /**
     * Add order-by as descend. <br>
     * code: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Code_Desc() { regOBD("code"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _orderNumber;
    public ConditionValue xdfgetOrderNumber()
    { if (_orderNumber == null) { _orderNumber = nCV(); }
      return _orderNumber; }
    protected ConditionValue xgetCValueOrderNumber() { return xdfgetOrderNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * order_number: {int2(5)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_OrderNumber_Asc() { regOBA("order_number"); return this; }

    /**
     * Add order-by as descend. <br>
     * order_number: {int2(5)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_OrderNumber_Desc() { regOBD("order_number"); return this; }

    protected ConditionValue _remarks;
    public ConditionValue xdfgetRemarks()
    { if (_remarks == null) { _remarks = nCV(); }
      return _remarks; }
    protected ConditionValue xgetCValueRemarks() { return xdfgetRemarks(); }

    /** 
     * Add order-by as ascend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Remarks_Asc() { regOBA("remarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_Remarks_Desc() { regOBD("remarks"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * del_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_DelFlg_Asc() { regOBA("del_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flg: {int2(5)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_DelFlg_Desc() { regOBD("del_flg"); return this; }

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
    public BsGeneralCodeMCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsGeneralCodeMCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsGeneralCodeMCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsGeneralCodeMCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsGeneralCodeMCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsGeneralCodeMCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsGeneralCodeMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGeneralCodeMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, GeneralCodeMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GeneralCodeMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, GeneralCodeMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(GeneralCodeMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, GeneralCodeMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(GeneralCodeMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, GeneralCodeMCQ> _myselfExistsMap;
    public Map<String, GeneralCodeMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(GeneralCodeMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, GeneralCodeMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(GeneralCodeMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GeneralCodeMCB.class.getName(); }
    protected String xCQ() { return GeneralCodeMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
