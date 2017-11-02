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
 * The condition-query for in-line of event_t.
 * @author DBFlute(AutoGenerator)
 */
public class EventTCIQ extends AbstractBsEventTCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEventTCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EventTCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEventTCQ myCQ) {
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
    protected ConditionValue xgetCValueEventNo() { return _myCQ.xdfgetEventNo(); }
    protected ConditionValue xgetCValueEventName() { return _myCQ.xdfgetEventName(); }
    protected ConditionValue xgetCValueEventDetail() { return _myCQ.xdfgetEventDetail(); }
    protected ConditionValue xgetCValueEventPlace() { return _myCQ.xdfgetEventPlace(); }
    protected ConditionValue xgetCValueEventUrl() { return _myCQ.xdfgetEventUrl(); }
    protected ConditionValue xgetCValueTell() { return _myCQ.xdfgetTell(); }
    protected ConditionValue xgetCValueEventEntryFee() { return _myCQ.xdfgetEventEntryFee(); }
    protected ConditionValue xgetCValueAuxiliaryFlg() { return _myCQ.xdfgetAuxiliaryFlg(); }
    protected ConditionValue xgetCValueFixFlg() { return _myCQ.xdfgetFixFlg(); }
    protected ConditionValue xgetCValueCandidateNo() { return _myCQ.xdfgetCandidateNo(); }
    protected ConditionValue xgetCValueStoreName() { return _myCQ.xdfgetStoreName(); }
    protected ConditionValue xgetCValueEntryPeople() { return _myCQ.xdfgetEntryPeople(); }
    protected ConditionValue xgetCValueEventDiv() { return _myCQ.xdfgetEventDiv(); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(EventTCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EventTCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EventTCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EventTCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EventTCB.class.getName(); }
    protected String xinCQ() { return EventTCQ.class.getName(); }
}
