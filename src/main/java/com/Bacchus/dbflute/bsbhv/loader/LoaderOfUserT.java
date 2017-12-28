package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of user_t as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, login_id, line_flg, line_id, line_user_name, user_name, last_name, first_name, email, password, user_type_id, auth_level
 *
 * [sequence]
 *     user_t_user_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     auth_m, user_type_m
 *
 * [referrer table]
 *     entry_t, event_t
 *
 * [foreign property]
 *     authM, userTypeM
 *
 * [referrer property]
 *     entryTList, eventTList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserT {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserT> _selectedList;
    protected BehaviorSelector _selector;
    protected UserTBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserT ready(List<UserT> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserTBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserTBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<EntryT> _referrerEntryT;

    /**
     * Load referrer of entryTList by the set-upper of referrer. <br>
     * entry_t by user_id, named 'entryTList'.
     * <pre>
     * <span style="color: #0000C0">userTBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userTList</span>, <span style="color: #553000">tLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tLoader</span>.<span style="color: #CC4747">loadEntryT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserT userT : <span style="color: #553000">userTList</span>) {
     *     ... = userT.<span style="color: #CC4747">getEntryTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfEntryT> loadEntryT(ReferrerConditionSetupper<EntryTCB> refCBLambda) {
        myBhv().loadEntryT(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerEntryT = refLs);
        return hd -> hd.handle(new LoaderOfEntryT().ready(_referrerEntryT, _selector));
    }

    protected List<EventT> _referrerEventT;

    /**
     * Load referrer of eventTList by the set-upper of referrer. <br>
     * event_t by user_id, named 'eventTList'.
     * <pre>
     * <span style="color: #0000C0">userTBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userTList</span>, <span style="color: #553000">tLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tLoader</span>.<span style="color: #CC4747">loadEventT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserT userT : <span style="color: #553000">userTList</span>) {
     *     ... = userT.<span style="color: #CC4747">getEventTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
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
    protected LoaderOfAuthM _foreignAuthMLoader;
    public LoaderOfAuthM pulloutAuthM() {
        if (_foreignAuthMLoader == null)
        { _foreignAuthMLoader = new LoaderOfAuthM().ready(myBhv().pulloutAuthM(_selectedList), _selector); }
        return _foreignAuthMLoader;
    }

    protected LoaderOfUserTypeM _foreignUserTypeMLoader;
    public LoaderOfUserTypeM pulloutUserTypeM() {
        if (_foreignUserTypeMLoader == null)
        { _foreignUserTypeMLoader = new LoaderOfUserTypeM().ready(myBhv().pulloutUserTypeM(_selectedList), _selector); }
        return _foreignUserTypeMLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserT> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
