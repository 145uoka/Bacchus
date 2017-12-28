package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of auth_m as TABLE. <br>
 * 権限_M
 * <pre>
 * [primary-key]
 *     auth_level
 *
 * [column]
 *     auth_level, auth_name
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
 * Integer authLevel = entity.getAuthLevel();
 * String authName = entity.getAuthName();
 * entity.setAuthLevel(authLevel);
 * entity.setAuthName(authName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAuthM extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** auth_level: {PK, NotNull, int4(10)} */
    protected Integer _authLevel;

    /** auth_name: {NotNull, text(2147483647)} */
    protected String _authName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "auth_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_authLevel == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** user_t by auth_level, named 'userTList'. */
    protected List<UserT> _userTList;

    /**
     * [get] user_t by auth_level, named 'userTList'.
     * @return The entity list of referrer property 'userTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserT> getUserTList() {
        if (_userTList == null) { _userTList = newReferrerList(); }
        return _userTList;
    }

    /**
     * [set] user_t by auth_level, named 'userTList'.
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
        if (obj instanceof BsAuthM) {
            BsAuthM other = (BsAuthM)obj;
            if (!xSV(_authLevel, other._authLevel)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _authLevel);
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
        sb.append(dm).append(xfND(_authLevel));
        sb.append(dm).append(xfND(_authName));
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
    public AuthM clone() {
        return (AuthM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] auth_level: {PK, NotNull, int4(10)} <br>
     * 権限レベル
     * @return The value of the column 'auth_level'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthLevel() {
        checkSpecifiedProperty("authLevel");
        return _authLevel;
    }

    /**
     * [set] auth_level: {PK, NotNull, int4(10)} <br>
     * 権限レベル
     * @param authLevel The value of the column 'auth_level'. (basically NotNull if update: for the constraint)
     */
    public void setAuthLevel(Integer authLevel) {
        registerModifiedProperty("authLevel");
        _authLevel = authLevel;
    }

    /**
     * [get] auth_name: {NotNull, text(2147483647)} <br>
     * 権限名称
     * @return The value of the column 'auth_name'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthName() {
        checkSpecifiedProperty("authName");
        return _authName;
    }

    /**
     * [set] auth_name: {NotNull, text(2147483647)} <br>
     * 権限名称
     * @param authName The value of the column 'auth_name'. (basically NotNull if update: for the constraint)
     */
    public void setAuthName(String authName) {
        registerModifiedProperty("authName");
        _authName = authName;
    }
}
