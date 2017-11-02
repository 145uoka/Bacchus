package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

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
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SubsidyMngM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
