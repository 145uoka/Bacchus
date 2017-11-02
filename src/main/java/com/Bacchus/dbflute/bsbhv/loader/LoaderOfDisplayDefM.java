package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The referrer loader of display_def_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     display_id
 *
 * [column]
 *     display_id, display_name, register_datetime, register_user, update_datetime, update_user
 *
 * [sequence]
 *     
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
public class LoaderOfDisplayDefM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DisplayDefM> _selectedList;
    protected BehaviorSelector _selector;
    protected DisplayDefMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDisplayDefM ready(List<DisplayDefM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DisplayDefMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DisplayDefMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DisplayDefM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
