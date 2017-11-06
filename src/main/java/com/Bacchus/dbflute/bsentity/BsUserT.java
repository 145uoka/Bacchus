package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of user_t as TABLE. <br>
 * ユーザー_T
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, user_name, email, password, auth_level, user_type_id
 *
 * [sequence]
 *     user_t_user_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     user_type_m
 *
 * [referrer table]
 *     entry_t, event_t
 *
 * [foreign property]
 *     userTypeM
 *
 * [referrer property]
 *     entryTList, eventTList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String userName = entity.getUserName();
 * String email = entity.getEmail();
 * String password = entity.getPassword();
 * Integer authLevel = entity.getAuthLevel();
 * Integer userTypeId = entity.getUserTypeId();
 * entity.setUserId(userId);
 * entity.setUserName(userName);
 * entity.setEmail(email);
 * entity.setPassword(password);
 * entity.setAuthLevel(authLevel);
 * entity.setUserTypeId(userTypeId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserT extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _userId;

    /** user_name: {NotNull, text(2147483647)} */
    protected String _userName;

    /** email: {text(2147483647)} */
    protected String _email;

    /** password: {NotNull, text(2147483647)} */
    protected String _password;

    /** auth_level: {NotNull, int4(10), default=[0]} */
    protected Integer _authLevel;

    /** user_type_id: {NotNull, int4(10), FK to user_type_m} */
    protected Integer _userTypeId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user_t";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** user_type_m by my user_type_id, named 'userTypeM'. */
    protected OptionalEntity<UserTypeM> _userTypeM;

    /**
     * [get] user_type_m by my user_type_id, named 'userTypeM'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userTypeM'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<UserTypeM> getUserTypeM() {
        if (_userTypeM == null) { _userTypeM = OptionalEntity.relationEmpty(this, "userTypeM"); }
        return _userTypeM;
    }

    /**
     * [set] user_type_m by my user_type_id, named 'userTypeM'.
     * @param userTypeM The entity of foreign property 'userTypeM'. (NullAllowed)
     */
    public void setUserTypeM(OptionalEntity<UserTypeM> userTypeM) {
        _userTypeM = userTypeM;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** entry_t by user_id, named 'entryTList'. */
    protected List<EntryT> _entryTList;

    /**
     * [get] entry_t by user_id, named 'entryTList'.
     * @return The entity list of referrer property 'entryTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EntryT> getEntryTList() {
        if (_entryTList == null) { _entryTList = newReferrerList(); }
        return _entryTList;
    }

    /**
     * [set] entry_t by user_id, named 'entryTList'.
     * @param entryTList The entity list of referrer property 'entryTList'. (NullAllowed)
     */
    public void setEntryTList(List<EntryT> entryTList) {
        _entryTList = entryTList;
    }

    /** event_t by user_id, named 'eventTList'. */
    protected List<EventT> _eventTList;

    /**
     * [get] event_t by user_id, named 'eventTList'.
     * @return The entity list of referrer property 'eventTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EventT> getEventTList() {
        if (_eventTList == null) { _eventTList = newReferrerList(); }
        return _eventTList;
    }

    /**
     * [set] event_t by user_id, named 'eventTList'.
     * @param eventTList The entity list of referrer property 'eventTList'. (NullAllowed)
     */
    public void setEventTList(List<EventT> eventTList) {
        _eventTList = eventTList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserT) {
            BsUserT other = (BsUserT)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userTypeM != null && _userTypeM.isPresent())
        { sb.append(li).append(xbRDS(_userTypeM, "userTypeM")); }
        if (_entryTList != null) { for (EntryT et : _entryTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "entryTList")); } } }
        if (_eventTList != null) { for (EventT et : _eventTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "eventTList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_authLevel));
        sb.append(dm).append(xfND(_userTypeId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userTypeM != null && _userTypeM.isPresent())
        { sb.append(dm).append("userTypeM"); }
        if (_entryTList != null && !_entryTList.isEmpty())
        { sb.append(dm).append("entryTList"); }
        if (_eventTList != null && !_eventTList.isEmpty())
        { sb.append(dm).append("eventTList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserT clone() {
        return (UserT)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, ID, NotNull, serial(10)} <br>
     * user_id
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, serial(10)} <br>
     * user_id
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] user_name: {NotNull, text(2147483647)} <br>
     * ユーザ名
     * @return The value of the column 'user_name'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] user_name: {NotNull, text(2147483647)} <br>
     * ユーザ名
     * @param userName The value of the column 'user_name'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] email: {text(2147483647)} <br>
     * Eメール
     * @return The value of the column 'email'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return _email;
    }

    /**
     * [set] email: {text(2147483647)} <br>
     * Eメール
     * @param email The value of the column 'email'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] password: {NotNull, text(2147483647)} <br>
     * 暗号化PWD
     * @return The value of the column 'password'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {NotNull, text(2147483647)} <br>
     * 暗号化PWD
     * @param password The value of the column 'password'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] auth_level: {NotNull, int4(10), default=[0]} <br>
     * 権限レベル
     * @return The value of the column 'auth_level'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthLevel() {
        checkSpecifiedProperty("authLevel");
        return _authLevel;
    }

    /**
     * [set] auth_level: {NotNull, int4(10), default=[0]} <br>
     * 権限レベル
     * @param authLevel The value of the column 'auth_level'. (basically NotNull if update: for the constraint)
     */
    public void setAuthLevel(Integer authLevel) {
        registerModifiedProperty("authLevel");
        _authLevel = authLevel;
    }

    /**
     * [get] user_type_id: {NotNull, int4(10), FK to user_type_m} <br>
     * ユーザー区分ID
     * @return The value of the column 'user_type_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserTypeId() {
        checkSpecifiedProperty("userTypeId");
        return _userTypeId;
    }

    /**
     * [set] user_type_id: {NotNull, int4(10), FK to user_type_m} <br>
     * ユーザー区分ID
     * @param userTypeId The value of the column 'user_type_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserTypeId(Integer userTypeId) {
        registerModifiedProperty("userTypeId");
        _userTypeId = userTypeId;
    }
}
