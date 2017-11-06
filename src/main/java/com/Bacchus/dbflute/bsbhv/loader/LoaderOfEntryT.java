package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The referrer loader of entry_t as TABLE. <br>
 * <pre>
 * [primary key]
 *     entry_id
 *
 * [column]
 *     entry_id, candidate_no, user_id, entry_div
 *
 * [sequence]
 *     entry_t_entry_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     candidate_t, user_t
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     candidateT, userT
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEntryT {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EntryT> _selectedList;
    protected BehaviorSelector _selector;
    protected EntryTBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEntryT ready(List<EntryT> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EntryTBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EntryTBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCandidateT _foreignCandidateTLoader;
    public LoaderOfCandidateT pulloutCandidateT() {
        if (_foreignCandidateTLoader == null)
        { _foreignCandidateTLoader = new LoaderOfCandidateT().ready(myBhv().pulloutCandidateT(_selectedList), _selector); }
        return _foreignCandidateTLoader;
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
    public List<EntryT> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
