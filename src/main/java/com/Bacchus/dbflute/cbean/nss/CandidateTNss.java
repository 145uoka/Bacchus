package com.Bacchus.dbflute.cbean.nss;

import com.Bacchus.dbflute.cbean.cq.CandidateTCQ;

/**
 * The nest select set-upper of candidate_t.
 * @author DBFlute(AutoGenerator)
 */
public class CandidateTNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CandidateTCQ _query;
    public CandidateTNss(CandidateTCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * event_t by my event_no, named 'eventT'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public EventTNss withEventT() {
        _query.xdoNss(() -> _query.queryEventT());
        return new EventTNss(_query.queryEventT());
    }
}
