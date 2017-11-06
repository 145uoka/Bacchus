package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of candidate_t as TABLE. <br>
 * <pre>
 * [primary key]
 *     candidate_no
 *
 * [column]
 *     candidate_no, event_no, event_start_datetime, event_end_datetime
 *
 * [sequence]
 *     candidate_t_candidate_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     event_t
 *
 * [referrer table]
 *     entry_t
 *
 * [foreign property]
 *     eventT
 *
 * [referrer property]
 *     entryTList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCandidateT {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CandidateT> _selectedList;
    protected BehaviorSelector _selector;
    protected CandidateTBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCandidateT ready(List<CandidateT> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CandidateTBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CandidateTBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<EntryT> _referrerEntryT;

    /**
     * Load referrer of entryTList by the set-upper of referrer. <br>
     * entry_t by candidate_no, named 'entryTList'.
     * <pre>
     * <span style="color: #0000C0">candidateTBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">candidateTList</span>, <span style="color: #553000">tLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tLoader</span>.<span style="color: #CC4747">loadEntryT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CandidateT candidateT : <span style="color: #553000">candidateTList</span>) {
     *     ... = candidateT.<span style="color: #CC4747">getEntryTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCandidateNo_InScope(pkList);
     * cb.query().addOrderBy_CandidateNo_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfEntryT> loadEntryT(ReferrerConditionSetupper<EntryTCB> refCBLambda) {
        myBhv().loadEntryT(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerEntryT = refLs);
        return hd -> hd.handle(new LoaderOfEntryT().ready(_referrerEntryT, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfEventT _foreignEventTLoader;
    public LoaderOfEventT pulloutEventT() {
        if (_foreignEventTLoader == null)
        { _foreignEventTLoader = new LoaderOfEventT().ready(myBhv().pulloutEventT(_selectedList), _selector); }
        return _foreignEventTLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CandidateT> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
