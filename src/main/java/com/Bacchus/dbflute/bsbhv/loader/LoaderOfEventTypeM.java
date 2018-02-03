package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of event_type_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     event_type_id
 *
 * [column]
 *     event_type_id, event_type_name, order_num
 *
 * [sequence]
 *     event_type_m_event_type_id_seq
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
 *     event_t
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     eventTList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEventTypeM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EventTypeM> _selectedList;
    protected BehaviorSelector _selector;
    protected EventTypeMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEventTypeM ready(List<EventTypeM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EventTypeMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EventTypeMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<EventT> _referrerEventT;

    /**
     * Load referrer of eventTList by the set-upper of referrer. <br>
     * event_t by event_type_id, named 'eventTList'.
     * <pre>
     * <span style="color: #0000C0">eventTypeMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">eventTypeMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadEventT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (EventTypeM eventTypeM : <span style="color: #553000">eventTypeMList</span>) {
     *     ... = eventTypeM.<span style="color: #CC4747">getEventTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEventTypeId_InScope(pkList);
     * cb.query().addOrderBy_EventTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfEventT> loadEventT(ReferrerConditionSetupper<EventTCB> refCBLambda) {
        myBhv().loadEventT(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerEventT = refLs);
        return hd -> hd.handle(new LoaderOfEventT().ready(_referrerEventT, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EventTypeM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
