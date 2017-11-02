package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The referrer loader of event_t as TABLE. <br>
 * <pre>
 * [primary key]
 *     event_no
 *
 * [column]
 *     event_no, event_name, event_detail, event_place, event_url, tell, event_entry_fee, auxiliary_flg, fix_flg, candidate_no, store_name, entry_people, event_div, user_id
 *
 * [sequence]
 *     event_t_event_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEventT {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EventT> _selectedList;
    protected BehaviorSelector _selector;
    protected EventTBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEventT ready(List<EventT> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EventTBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EventTBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EventT> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
