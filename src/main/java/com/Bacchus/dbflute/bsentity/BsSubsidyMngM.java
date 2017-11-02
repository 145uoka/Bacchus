package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of subsidy_mng_m as TABLE. <br>
 * 補助金管理_M
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer moneyId = entity.getMoneyId();
 * Integer userType = entity.getUserType();
 * Integer money = entity.getMoney();
 * entity.setMoneyId(moneyId);
 * entity.setUserType(userType);
 * entity.setMoney(money);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSubsidyMngM extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** money_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _moneyId;

    /** user_type: {int4(10)} */
    protected Integer _userType;

    /** money: {int4(10)} */
    protected Integer _money;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "subsidy_mng_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_moneyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSubsidyMngM) {
            BsSubsidyMngM other = (BsSubsidyMngM)obj;
            if (!xSV(_moneyId, other._moneyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _moneyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_moneyId));
        sb.append(dm).append(xfND(_userType));
        sb.append(dm).append(xfND(_money));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SubsidyMngM clone() {
        return (SubsidyMngM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] money_id: {PK, ID, NotNull, serial(10)} <br>
     * 金額ID
     * @return The value of the column 'money_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMoneyId() {
        checkSpecifiedProperty("moneyId");
        return _moneyId;
    }

    /**
     * [set] money_id: {PK, ID, NotNull, serial(10)} <br>
     * 金額ID
     * @param moneyId The value of the column 'money_id'. (basically NotNull if update: for the constraint)
     */
    public void setMoneyId(Integer moneyId) {
        registerModifiedProperty("moneyId");
        _moneyId = moneyId;
    }

    /**
     * [get] user_type: {int4(10)} <br>
     * ユーザー区分
     * @return The value of the column 'user_type'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserType() {
        checkSpecifiedProperty("userType");
        return _userType;
    }

    /**
     * [set] user_type: {int4(10)} <br>
     * ユーザー区分
     * @param userType The value of the column 'user_type'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserType(Integer userType) {
        registerModifiedProperty("userType");
        _userType = userType;
    }

    /**
     * [get] money: {int4(10)} <br>
     * 金額
     * @return The value of the column 'money'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMoney() {
        checkSpecifiedProperty("money");
        return _money;
    }

    /**
     * [set] money: {int4(10)} <br>
     * 金額
     * @param money The value of the column 'money'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoney(Integer money) {
        registerModifiedProperty("money");
        _money = money;
    }
}
