package com.Bacchus.dbflute.cbean.nss;

import com.Bacchus.dbflute.cbean.cq.EntryTCQ;

/**
 * The nest select set-upper of entry_t.
 * @author DBFlute(AutoGenerator)
 */
public class EntryTNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final EntryTCQ _query;
    public EntryTNss(EntryTCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * candidate_t by my candidate_no, named 'candidateT'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CandidateTNss withCandidateT() {
        _query.xdoNss(() -> _query.queryCandidateT());
        return new CandidateTNss(_query.queryCandidateT());
    }
    /**
     * With nested relation columns to select clause. <br>
     * user_t by my user_id, named 'userT'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public UserTNss withUserT() {
        _query.xdoNss(() -> _query.queryUserT());
        return new UserTNss(_query.queryUserT());
    }
}
