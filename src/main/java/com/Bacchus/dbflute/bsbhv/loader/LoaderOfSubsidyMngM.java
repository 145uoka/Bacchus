package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of subsidy_mng_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     money_id
 *
 * [column]
 *     money_id, user_type, money
 *
 * [sequence]
 *     subsidy_mng_m_money_id_seq
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
 *     user_t
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userTList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSubsidyMngM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SubsidyMngM> _selectedList;
    protected BehaviorSelector _selector;
    protected SubsidyMngMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSubsidyMngM ready(List<SubsidyMngM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SubsidyMngMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SubsidyMngMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<UserT> _referrerUserT;

    /**
     * Load referrer of userTList by the set-upper of referrer. <br>
     * user_t by money_id, named 'userTList'.
     * <pre>
     * <span style="color: #0000C0">subsidyMngMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">subsidyMngMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadUserT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SubsidyMngM subsidyMngM : <span style="color: #553000">subsidyMngMList</span>) {
     *     ... = subsidyMngM.<span style="color: #CC4747">getUserTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoneyId_InScope(pkList);
     * cb.query().addOrderBy_MoneyId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserT> loadUserT(ReferrerConditionSetupper<UserTCB> refCBLambda) {
        myBhv().loadUserT(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserT = refLs);
        return hd -> hd.handle(new LoaderOfUserT().ready(_referrerUserT, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SubsidyMngM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
