package com.Bacchus.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The referrer loader of general_code_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     code_id
 *
 * [column]
 *     code_id, code_div, code, name, order_number, remarks, del_flg, register_datetime, register_user, update_datetime, update_user
 *
 * [sequence]
 *     general_code_m_code_id_seq
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
public class LoaderOfGeneralCodeM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<GeneralCodeM> _selectedList;
    protected BehaviorSelector _selector;
    protected GeneralCodeMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGeneralCodeM ready(List<GeneralCodeM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GeneralCodeMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GeneralCodeMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<GeneralCodeM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
