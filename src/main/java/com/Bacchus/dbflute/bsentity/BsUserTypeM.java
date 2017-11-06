package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of user_type_m as TABLE. <br>
 * ユーザー区分_M
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userTypeId = entity.getUserTypeId();
 * String userTypeName = entity.getUserTypeName();
 * Integer subsidyAmount = entity.getSubsidyAmount();
 * entity.setUserTypeId(userTypeId);
 * entity.setUserTypeName(userTypeName);
 * entity.setSubsidyAmount(subsidyAmount);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserTypeM extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_type_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _userTypeId;

    /** user_type_name: {NotNull, text(2147483647)} */
    protected String _userTypeName;

    /** subsidy_amount: {NotNull, int4(10), default=[0]} */
    protected Integer _subsidyAmount;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user_type_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userTypeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** user_t by user_type_id, named 'userTList'. */
    protected List<UserT> _userTList;

    /**
     * [get] user_t by user_type_id, named 'userTList'.
     * @return The entity list of referrer property 'userTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserT> getUserTList() {
        if (_userTList == null) { _userTList = newReferrerList(); }
        return _userTList;
    }

    /**
     * [set] user_t by user_type_id, named 'userTList'.
     * @param userTList The entity list of referrer property 'userTList'. (NullAllowed)
     */
    public void setUserTList(List<UserT> userTList) {
        _userTList = userTList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserTypeM) {
            BsUserTypeM other = (BsUserTypeM)obj;
            if (!xSV(_userTypeId, other._userTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userTList != null) { for (UserT et : _userTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userTList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userTypeId));
        sb.append(dm).append(xfND(_userTypeName));
        sb.append(dm).append(xfND(_subsidyAmount));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userTList != null && !_userTList.isEmpty())
        { sb.append(dm).append("userTList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserTypeM clone() {
        return (UserTypeM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_type_id: {PK, ID, NotNull, serial(10)} <br>
     * ユーザー区分ID
     * @return The value of the column 'user_type_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserTypeId() {
        checkSpecifiedProperty("userTypeId");
        return _userTypeId;
    }

    /**
     * [set] user_type_id: {PK, ID, NotNull, serial(10)} <br>
     * ユーザー区分ID
     * @param userTypeId The value of the column 'user_type_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserTypeId(Integer userTypeId) {
        registerModifiedProperty("userTypeId");
        _userTypeId = userTypeId;
    }

    /**
     * [get] user_type_name: {NotNull, text(2147483647)} <br>
     * ユーザー区分名称
     * @return The value of the column 'user_type_name'. (basically NotNull if selected: for the constraint)
     */
    public String getUserTypeName() {
        checkSpecifiedProperty("userTypeName");
        return _userTypeName;
    }

    /**
     * [set] user_type_name: {NotNull, text(2147483647)} <br>
     * ユーザー区分名称
     * @param userTypeName The value of the column 'user_type_name'. (basically NotNull if update: for the constraint)
     */
    public void setUserTypeName(String userTypeName) {
        registerModifiedProperty("userTypeName");
        _userTypeName = userTypeName;
    }

    /**
     * [get] subsidy_amount: {NotNull, int4(10), default=[0]} <br>
     * 補助金額
     * @return The value of the column 'subsidy_amount'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSubsidyAmount() {
        checkSpecifiedProperty("subsidyAmount");
        return _subsidyAmount;
    }

    /**
     * [set] subsidy_amount: {NotNull, int4(10), default=[0]} <br>
     * 補助金額
     * @param subsidyAmount The value of the column 'subsidy_amount'. (basically NotNull if update: for the constraint)
     */
    public void setSubsidyAmount(Integer subsidyAmount) {
        registerModifiedProperty("subsidyAmount");
        _subsidyAmount = subsidyAmount;
    }
}
