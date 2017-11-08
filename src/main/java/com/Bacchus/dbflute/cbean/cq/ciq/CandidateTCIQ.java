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
 * The condition-query for in-line of candidate_t.
 * @author DBFlute(AutoGenerator)
 */
public class CandidateTCIQ extends AbstractBsCandidateTCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCandidateTCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CandidateTCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCandidateTCQ myCQ) {
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
    protected ConditionValue xgetCValueCandidateNo() { return _myCQ.xdfgetCandidateNo(); }
    public String keepCandidateNo_ExistsReferrer_EntryTList(EntryTCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCandidateNo_NotExistsReferrer_EntryTList(EntryTCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCandidateNo_SpecifyDerivedReferrer_EntryTList(EntryTCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCandidateNo_QueryDerivedReferrer_EntryTList(EntryTCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCandidateNo_QueryDerivedReferrer_EntryTListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueEventNo() { return _myCQ.xdfgetEventNo(); }
    protected ConditionValue xgetCValueEventStartDatetime() { return _myCQ.xdfgetEventStartDatetime(); }
    protected ConditionValue xgetCValueEventEndDatetime() { return _myCQ.xdfgetEventEndDatetime(); }
    protected ConditionValue xgetCValueStartDate() { return _myCQ.xdfgetStartDate(); }
    protected ConditionValue xgetCValueStartTime() { return _myCQ.xdfgetStartTime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CandidateTCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CandidateTCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CandidateTCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CandidateTCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CandidateTCB.class.getName(); }
    protected String xinCQ() { return CandidateTCQ.class.getName(); }
}
