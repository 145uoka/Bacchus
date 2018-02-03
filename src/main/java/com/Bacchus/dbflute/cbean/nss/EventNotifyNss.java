package com.Bacchus.dbflute.cbean.nss;

import com.Bacchus.dbflute.cbean.cq.EventNotifyCQ;

/**
 * The nest select set-upper of event_notify.
 * @author DBFlute(AutoGenerator)
 */
public class EventNotifyNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final EventNotifyCQ _query;
    public EventNotifyNss(EventNotifyCQ query) { _query = query; }
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
