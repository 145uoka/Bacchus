package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of event_t as TABLE. <br>
 * <pre>
 * [primary key]
 *     event_no
 *
 * [column]
 *     event_no, event_name, event_detail, event_place, event_url, tell, event_entry_fee, auxiliary_flg, fix_flg, candidate_no, store_name, user_id, event_type_id
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
 *     event_type_m, user_t
 *
 * [referrer table]
 *     candidate_t, event_notify
 *
 * [foreign property]
 *     eventTypeM, userT
 *
 * [referrer property]
 *     candidateTList, eventNotifyList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CandidateT> _referrerCandidateT;

    /**
     * Load referrer of candidateTList by the set-upper of referrer. <br>
     * candidate_t by event_no, named 'candidateTList'.
     * <pre>
     * <span style="color: #0000C0">eventTBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">eventTList</span>, <span style="color: #553000">tLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tLoader</span>.<span style="color: #CC4747">loadCandidateT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (EventT eventT : <span style="color: #553000">eventTList</span>) {
     *     ... = eventT.<span style="color: #CC4747">getCandidateTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEventNo_InScope(pkList);
     * cb.query().addOrderBy_EventNo_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCandidateT> loadCandidateT(ReferrerConditionSetupper<CandidateTCB> refCBLambda) {
        myBhv().loadCandidateT(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCandidateT = refLs);
        return hd -> hd.handle(new LoaderOfCandidateT().ready(_referrerCandidateT, _selector));
    }

    protected List<EventNotify> _referrerEventNotify;

    /**
     * Load referrer of eventNotifyList by the set-upper of referrer. <br>
     * event_notify by event_no, named 'eventNotifyList'.
     * <pre>
     * <span style="color: #0000C0">eventTBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">eventTList</span>, <span style="color: #553000">tLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tLoader</span>.<span style="color: #CC4747">loadEventNotify</span>(<span style="color: #553000">notifyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">notifyCB</span>.setupSelect...
     *         <span style="color: #553000">notifyCB</span>.query().set...
     *         <span style="color: #553000">notifyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">notifyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    notifyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (EventT eventT : <span style="color: #553000">eventTList</span>) {
     *     ... = eventT.<span style="color: #CC4747">getEventNotifyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEventNo_InScope(pkList);
     * cb.query().addOrderBy_EventNo_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfEventNotify> loadEventNotify(ReferrerConditionSetupper<EventNotifyCB> refCBLambda) {
        myBhv().loadEventNotify(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerEventNotify = refLs);
        return hd -> hd.handle(new LoaderOfEventNotify().ready(_referrerEventNotify, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfEventTypeM _foreignEventTypeMLoader;
    public LoaderOfEventTypeM pulloutEventTypeM() {
        if (_foreignEventTypeMLoader == null)
        { _foreignEventTypeMLoader = new LoaderOfEventTypeM().ready(myBhv().pulloutEventTypeM(_selectedList), _selector); }
        return _foreignEventTypeMLoader;
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
    public List<EventT> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
