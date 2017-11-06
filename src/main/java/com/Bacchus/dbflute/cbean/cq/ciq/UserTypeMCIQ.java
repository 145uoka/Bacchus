package com.Bacchus.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.Bacchus.dbflute.cbean.*;
import com.Bacchus.dbflute.cbean.cq.bs.*;
import com.Bacchus.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of user_type_m.
 * @author DBFlute(AutoGenerator)
 */
public class UserTypeMCIQ extends AbstractBsUserTypeMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsUserTypeMCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserTypeMCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsUserTypeMCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueUserTypeId() { return _myCQ.xdfgetUserTypeId(); }
    public String keepUserTypeId_ExistsReferrer_UserTList(UserTCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserTypeId_NotExistsReferrer_UserTList(UserTCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserTypeId_SpecifyDerivedReferrer_UserTList(UserTCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserTypeId_QueryDerivedReferrer_UserTList(UserTCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserTypeId_QueryDerivedReferrer_UserTListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserTypeName() { return _myCQ.xdfgetUserTypeName(); }
    protected ConditionValue xgetCValueSubsidyAmount() { return _myCQ.xdfgetSubsidyAmount(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(UserTypeMCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(UserTypeMCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(UserTypeMCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(UserTypeMCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return UserTypeMCB.class.getName(); }
    protected String xinCQ() { return UserTypeMCQ.class.getName(); }
}
