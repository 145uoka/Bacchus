package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;
import com.Bacchus.dbflute.cbean.*;

/**
 * The referrer loader of user_type_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_type_id
 *
 * [column]
 *     user_type_id, user_type_name, subsidy_amount
 *
 * [sequence]
 *     user_type_m_user_type_id_seq
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
public class LoaderOfUserTypeM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserTypeM> _selectedList;
    protected BehaviorSelector _selector;
    protected UserTypeMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserTypeM ready(List<UserTypeM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserTypeMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserTypeMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<UserT> _referrerUserT;

    /**
     * Load referrer of userTList by the set-upper of referrer. <br>
     * user_t by user_type_id, named 'userTList'.
     * <pre>
     * <span style="color: #0000C0">userTypeMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userTypeMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadUserT</span>(<span style="color: #553000">tCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tCB</span>.setupSelect...
     *         <span style="color: #553000">tCB</span>.query().set...
     *         <span style="color: #553000">tCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserTypeM userTypeM : <span style="color: #553000">userTypeMList</span>) {
     *     ... = userTypeM.<span style="color: #CC4747">getUserTList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserTypeId_InScope(pkList);
     * cb.query().addOrderBy_UserTypeId_Asc();
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
    public List<UserTypeM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
