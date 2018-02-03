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
 * The condition-query for in-line of event_type_m.
 * @author DBFlute(AutoGenerator)
 */
public class EventTypeMCIQ extends AbstractBsEventTypeMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEventTypeMCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EventTypeMCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEventTypeMCQ myCQ) {
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
    protected ConditionValue xgetCValueEventTypeId() { return _myCQ.xdfgetEventTypeId(); }
    public String keepEventTypeId_ExistsReferrer_EventTList(EventTCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEventTypeId_NotExistsReferrer_EventTList(EventTCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEventTypeId_SpecifyDerivedReferrer_EventTList(EventTCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEventTypeId_QueryDerivedReferrer_EventTList(EventTCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEventTypeId_QueryDerivedReferrer_EventTListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueEventTypeName() { return _myCQ.xdfgetEventTypeName(); }
    protected ConditionValue xgetCValueOrderNum() { return _myCQ.xdfgetOrderNum(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(EventTypeMCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EventTypeMCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EventTypeMCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EventTypeMCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EventTypeMCB.class.getName(); }
    protected String xinCQ() { return EventTypeMCQ.class.getName(); }
}
