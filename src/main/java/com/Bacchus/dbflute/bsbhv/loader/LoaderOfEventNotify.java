package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The referrer loader of event_notify as TABLE. <br>
 * <pre>
 * [primary key]
 *     event_notify_no
 *
 * [column]
 *     event_notify_no, event_no, user_id, notify_datetime
 *
 * [sequence]
 *     event_notify_event_notify_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     event_t, user_t
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     eventT, userT
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEventNotify {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EventNotify> _selectedList;
    protected BehaviorSelector _selector;
    protected EventNotifyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEventNotify ready(List<EventNotify> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EventNotifyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EventNotifyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfEventT _foreignEventTLoader;
    public LoaderOfEventT pulloutEventT() {
        if (_foreignEventTLoader == null)
        { _foreignEventTLoader = new LoaderOfEventT().ready(myBhv().pulloutEventT(_selectedList), _selector); }
        return _foreignEventTLoader;
    }

    protected LoaderOfUserT _foreignUserTLoader;
    public LoaderOfUserT pulloutUserT() {
        if (_foreignUserTLoader == null)
        { _foreignUserTLoader = new LoaderOfUserT().ready(myBhv().pulloutUserT(_selectedList), _selector); }
        return _foreignUserTLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EventNotify> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
