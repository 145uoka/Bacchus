package com.Bacchus.dbflute.cbean.nss;

import com.Bacchus.dbflute.cbean.cq.EventTCQ;

/**
 * The nest select set-upper of event_t.
 * @author DBFlute(AutoGenerator)
 */
public class EventTNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final EventTCQ _query;
    public EventTNss(EventTCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
