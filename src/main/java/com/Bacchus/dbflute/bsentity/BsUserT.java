package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.Bacchus.dbflute.allcommon.EntityDefinedCommonColumn;
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
 *     user_id, login_id, line_flg, line_id, line_user_name, user_name, last_name, first_name, email, password, user_type_id, auth_level, register_datetime, register_user, update_datetime, update_user, delete_flag
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
 *     auth_m, user_type_m
 *
 * [referrer table]
 *     entry_t, event_notify, event_t
 *
 * [foreign property]
 *     authM, userTypeM
 *
 * [referrer property]
 *     entryTList, eventNotifyList, eventTList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String loginId = entity.getLoginId();
 * Integer lineFlg = entity.getLineFlg();
 * String lineId = entity.getLineId();
 * String lineUserName = entity.getLineUserName();
 * String userName = entity.getUserName();
 * String lastName = entity.getLastName();
 * String firstName = entity.getFirstName();
 * String email = entity.getEmail();
 * String password = entity.getPassword();
 * Integer userTypeId = entity.getUserTypeId();
 * Integer authLevel = entity.getAuthLevel();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * entity.setUserId(userId);
 * entity.setLoginId(loginId);
 * entity.setLineFlg(lineFlg);
 * entity.setLineId(lineId);
 * entity.setLineUserName(lineUserName);
 * entity.setUserName(userName);
 * entity.setLastName(lastName);
 * entity.setFirstName(firstName);
 * entity.setEmail(email);
 * entity.setPassword(password);
 * entity.setUserTypeId(userTypeId);
 * entity.setAuthLevel(authLevel);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setDeleteFlag(deleteFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserT extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** login_id: {UQ, text(2147483647)} */
    protected String _loginId;

    /** line_flg: {NotNull, int4(10), default=[0]} */
    protected Integer _lineFlg;

    /** line_id: {text(2147483647)} */
    protected String _lineId;

    /** line_user_name: {text(2147483647)} */
    protected String _lineUserName;

    /** user_name: {text(2147483647)} */
    protected String _userName;

    /** last_name: {text(2147483647)} */
    protected String _lastName;

    /** first_name: {text(2147483647)} */
    protected String _firstName;

    /** email: {text(2147483647)} */
    protected String _email;

    /** password: {text(2147483647)} */
    protected String _password;

    /** user_type_id: {NotNull, int4(10), FK to user_type_m} */
    protected Integer _userTypeId;

    /** auth_level: {NotNull, int4(10), FK to auth_m} */
    protected Integer _authLevel;

    /** register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_user: {text(2147483647)} */
    protected String _registerUser;

    /** update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_user: {text(2147483647)} */
    protected String _updateUser;

    /** delete_flag: {bool(1), default=[false]} */
    protected Boolean _deleteFlag;

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

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param loginId : UQ, text(2147483647). (NotNull)
     */
    public void uniqueBy(String loginId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("loginId");
        setLoginId(loginId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** auth_m by my auth_level, named 'authM'. */
    protected OptionalEntity<AuthM> _authM;

    /**
     * [get] auth_m by my auth_level, named 'authM'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'authM'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<AuthM> getAuthM() {
        if (_authM == null) { _authM = OptionalEntity.relationEmpty(this, "authM"); }
        return _authM;
    }

    /**
     * [set] auth_m by my auth_level, named 'authM'.
     * @param authM The entity of foreign property 'authM'. (NullAllowed)
     */
    public void setAuthM(OptionalEntity<AuthM> authM) {
        _authM = authM;
    }

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

    /** event_notify by user_id, named 'eventNotifyList'. */
    protected List<EventNotify> _eventNotifyList;

    /**
     * [get] event_notify by user_id, named 'eventNotifyList'.
     * @return The entity list of referrer property 'eventNotifyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EventNotify> getEventNotifyList() {
        if (_eventNotifyList == null) { _eventNotifyList = newReferrerList(); }
        return _eventNotifyList;
    }

    /**
     * [set] event_notify by user_id, named 'eventNotifyList'.
     * @param eventNotifyList The entity list of referrer property 'eventNotifyList'. (NullAllowed)
     */
    public void setEventNotifyList(List<EventNotify> eventNotifyList) {
        _eventNotifyList = eventNotifyList;
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
        if (_authM != null && _authM.isPresent())
        { sb.append(li).append(xbRDS(_authM, "authM")); }
        if (_userTypeM != null && _userTypeM.isPresent())
        { sb.append(li).append(xbRDS(_userTypeM, "userTypeM")); }
        if (_entryTList != null) { for (EntryT et : _entryTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "entryTList")); } } }
        if (_eventNotifyList != null) { for (EventNotify et : _eventNotifyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "eventNotifyList")); } } }
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
        sb.append(dm).append(xfND(_loginId));
        sb.append(dm).append(xfND(_lineFlg));
        sb.append(dm).append(xfND(_lineId));
        sb.append(dm).append(xfND(_lineUserName));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_lastName));
        sb.append(dm).append(xfND(_firstName));
        sb.append(dm).append(xfND(_email));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_userTypeId));
        sb.append(dm).append(xfND(_authLevel));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_deleteFlag));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_authM != null && _authM.isPresent())
        { sb.append(dm).append("authM"); }
        if (_userTypeM != null && _userTypeM.isPresent())
        { sb.append(dm).append("userTypeM"); }
        if (_entryTList != null && !_entryTList.isEmpty())
        { sb.append(dm).append("entryTList"); }
        if (_eventNotifyList != null && !_eventNotifyList.isEmpty())
        { sb.append(dm).append("eventNotifyList"); }
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
     * ユーザーID
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, serial(10)} <br>
     * ユーザーID
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] login_id: {UQ, text(2147483647)} <br>
     * ログインID
     * @return The value of the column 'login_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoginId() {
        checkSpecifiedProperty("loginId");
        return _loginId;
    }

    /**
     * [set] login_id: {UQ, text(2147483647)} <br>
     * ログインID
     * @param loginId The value of the column 'login_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoginId(String loginId) {
        registerModifiedProperty("loginId");
        _loginId = loginId;
    }

    /**
     * [get] line_flg: {NotNull, int4(10), default=[0]} <br>
     * Lineフラグ
     * @return The value of the column 'line_flg'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLineFlg() {
        checkSpecifiedProperty("lineFlg");
        return _lineFlg;
    }

    /**
     * [set] line_flg: {NotNull, int4(10), default=[0]} <br>
     * Lineフラグ
     * @param lineFlg The value of the column 'line_flg'. (basically NotNull if update: for the constraint)
     */
    public void setLineFlg(Integer lineFlg) {
        registerModifiedProperty("lineFlg");
        _lineFlg = lineFlg;
    }

    /**
     * [get] line_id: {text(2147483647)} <br>
     * LineID
     * @return The value of the column 'line_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineId() {
        checkSpecifiedProperty("lineId");
        return _lineId;
    }

    /**
     * [set] line_id: {text(2147483647)} <br>
     * LineID
     * @param lineId The value of the column 'line_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineId(String lineId) {
        registerModifiedProperty("lineId");
        _lineId = lineId;
    }

    /**
     * [get] line_user_name: {text(2147483647)} <br>
     * LINEユーザ名
     * @return The value of the column 'line_user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineUserName() {
        checkSpecifiedProperty("lineUserName");
        return _lineUserName;
    }

    /**
     * [set] line_user_name: {text(2147483647)} <br>
     * LINEユーザ名
     * @param lineUserName The value of the column 'line_user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineUserName(String lineUserName) {
        registerModifiedProperty("lineUserName");
        _lineUserName = lineUserName;
    }

    /**
     * [get] user_name: {text(2147483647)} <br>
     * ユーザー名
     * @return The value of the column 'user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] user_name: {text(2147483647)} <br>
     * ユーザー名
     * @param userName The value of the column 'user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] last_name: {text(2147483647)} <br>
     * 苗字(氏)
     * @return The value of the column 'last_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return _lastName;
    }

    /**
     * [set] last_name: {text(2147483647)} <br>
     * 苗字(氏)
     * @param lastName The value of the column 'last_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        _lastName = lastName;
    }

    /**
     * [get] first_name: {text(2147483647)} <br>
     * 名前(名)
     * @return The value of the column 'first_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return _firstName;
    }

    /**
     * [set] first_name: {text(2147483647)} <br>
     * 名前(名)
     * @param firstName The value of the column 'first_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        _firstName = firstName;
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
     * [get] password: {text(2147483647)} <br>
     * 暗号化PWD
     * @return The value of the column 'password'. (NullAllowed even if selected: for no constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {text(2147483647)} <br>
     * 暗号化PWD
     * @param password The value of the column 'password'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
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

    /**
     * [get] auth_level: {NotNull, int4(10), FK to auth_m} <br>
     * 権限レベル
     * @return The value of the column 'auth_level'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthLevel() {
        checkSpecifiedProperty("authLevel");
        return _authLevel;
    }

    /**
     * [set] auth_level: {NotNull, int4(10), FK to auth_m} <br>
     * 権限レベル
     * @param authLevel The value of the column 'auth_level'. (basically NotNull if update: for the constraint)
     */
    public void setAuthLevel(Integer authLevel) {
        registerModifiedProperty("authLevel");
        _authLevel = authLevel;
    }

    /**
     * [get] register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @return The value of the column 'register_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @param registerDatetime The value of the column 'register_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_user: {text(2147483647)} <br>
     * 作成者
     * @return The value of the column 'register_user'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {text(2147483647)} <br>
     * 作成者
     * @param registerUser The value of the column 'register_user'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_user: {text(2147483647)} <br>
     * 更新者
     * @return The value of the column 'update_user'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {text(2147483647)} <br>
     * 更新者
     * @param updateUser The value of the column 'update_user'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] delete_flag: {bool(1), default=[false]} <br>
     * 削除フラグ
     * @return The value of the column 'delete_flag'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {bool(1), default=[false]} <br>
     * 削除フラグ
     * @param deleteFlag The value of the column 'delete_flag'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }
}
