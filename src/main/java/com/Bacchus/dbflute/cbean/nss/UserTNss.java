package com.Bacchus.dbflute.cbean.nss;

import com.Bacchus.dbflute.cbean.cq.UserTCQ;

/**
 * The nest select set-upper of user_t.
 * @author DBFlute(AutoGenerator)
 */
public class UserTNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserTCQ _query;
    public UserTNss(UserTCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * user_type_m by my user_type_id, named 'userTypeM'.
     */
    public void withUserTypeM() {
        _query.xdoNss(() -> _query.queryUserTypeM());
    }
}
