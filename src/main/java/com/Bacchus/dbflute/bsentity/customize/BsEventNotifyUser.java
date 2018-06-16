package com.Bacchus.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.Bacchus.dbflute.exentity.customize.*;

/**
 * The entity of EventNotifyUser. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     user_id, login_id, line_flg, line_id, line_user_name, user_name, last_name, first_name, email, password, user_type_id, auth_level, user_type_name, subsidy_amount, event_notify_no, event_no, notify_datetime
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
 * String userTypeName = entity.getUserTypeName();
 * Integer subsidyAmount = entity.getSubsidyAmount();
 * Integer eventNotifyNo = entity.getEventNotifyNo();
 * Integer eventNo = entity.getEventNo();
 * java.time.LocalDateTime notifyDatetime = entity.getNotifyDatetime();
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
 * entity.setUserTypeName(userTypeName);
 * entity.setSubsidyAmount(subsidyAmount);
 * entity.setEventNotifyNo(eventNotifyNo);
 * entity.setEventNo(eventNo);
 * entity.setNotifyDatetime(notifyDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEventNotifyUser extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {serial(10), refers to user_t.user_id} */
    protected Integer _userId;

    /** login_id: {text(2147483647), refers to user_t.login_id} */
    protected String _loginId;

    /** line_flg: {int4(10), refers to user_t.line_flg} */
    protected Integer _lineFlg;

    /** line_id: {text(2147483647), refers to user_t.line_id} */
    protected String _lineId;

    /** line_user_name: {text(2147483647), refers to user_t.line_user_name} */
    protected String _lineUserName;

    /** user_name: {text(2147483647), refers to user_t.user_name} */
    protected String _userName;

    /** last_name: {text(2147483647), refers to user_t.last_name} */
    protected String _lastName;

    /** first_name: {text(2147483647), refers to user_t.first_name} */
    protected String _firstName;

    /** email: {text(2147483647), refers to user_t.email} */
    protected String _email;

    /** password: {text(2147483647), refers to user_t.password} */
    protected String _password;

    /** user_type_id: {int4(10), refers to user_t.user_type_id} */
    protected Integer _userTypeId;

    /** auth_level: {int4(10), refers to user_t.auth_level} */
    protected Integer _authLevel;

    /** user_type_name: {text(2147483647), refers to user_type_m.user_type_name} */
    protected String _userTypeName;

    /** subsidy_amount: {int4(10), refers to user_type_m.subsidy_amount} */
    protected Integer _subsidyAmount;

    /** event_notify_no: {serial(10), refers to event_notify.event_notify_no} */
    protected Integer _eventNotifyNo;

    /** event_no: {int4(10), refers to event_notify.event_no} */
    protected Integer _eventNo;

    /** notify_datetime: {timestamp(29, 6), refers to event_notify.notify_datetime} */
    protected java.time.LocalDateTime _notifyDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.Bacchus.dbflute.bsentity.customize.dbmeta.EventNotifyUserDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "EventNotifyUser";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsEventNotifyUser) {
            BsEventNotifyUser other = (BsEventNotifyUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            if (!xSV(_loginId, other._loginId)) { return false; }
            if (!xSV(_lineFlg, other._lineFlg)) { return false; }
            if (!xSV(_lineId, other._lineId)) { return false; }
            if (!xSV(_lineUserName, other._lineUserName)) { return false; }
            if (!xSV(_userName, other._userName)) { return false; }
            if (!xSV(_lastName, other._lastName)) { return false; }
            if (!xSV(_firstName, other._firstName)) { return false; }
            if (!xSV(_email, other._email)) { return false; }
            if (!xSV(_password, other._password)) { return false; }
            if (!xSV(_userTypeId, other._userTypeId)) { return false; }
            if (!xSV(_authLevel, other._authLevel)) { return false; }
            if (!xSV(_userTypeName, other._userTypeName)) { return false; }
            if (!xSV(_subsidyAmount, other._subsidyAmount)) { return false; }
            if (!xSV(_eventNotifyNo, other._eventNotifyNo)) { return false; }
            if (!xSV(_eventNo, other._eventNo)) { return false; }
            if (!xSV(_notifyDatetime, other._notifyDatetime)) { return false; }
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
        hs = xCH(hs, _loginId);
        hs = xCH(hs, _lineFlg);
        hs = xCH(hs, _lineId);
        hs = xCH(hs, _lineUserName);
        hs = xCH(hs, _userName);
        hs = xCH(hs, _lastName);
        hs = xCH(hs, _firstName);
        hs = xCH(hs, _email);
        hs = xCH(hs, _password);
        hs = xCH(hs, _userTypeId);
        hs = xCH(hs, _authLevel);
        hs = xCH(hs, _userTypeName);
        hs = xCH(hs, _subsidyAmount);
        hs = xCH(hs, _eventNotifyNo);
        hs = xCH(hs, _eventNo);
        hs = xCH(hs, _notifyDatetime);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
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
        sb.append(dm).append(xfND(_userTypeName));
        sb.append(dm).append(xfND(_subsidyAmount));
        sb.append(dm).append(xfND(_eventNotifyNo));
        sb.append(dm).append(xfND(_eventNo));
        sb.append(dm).append(xfND(_notifyDatetime));
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
    public EventNotifyUser clone() {
        return (EventNotifyUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {serial(10), refers to user_t.user_id} <br>
     * ユーザーID
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {serial(10), refers to user_t.user_id} <br>
     * ユーザーID
     * @param userId The value of the column 'user_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] login_id: {text(2147483647), refers to user_t.login_id} <br>
     * ログインID
     * @return The value of the column 'login_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getLoginId() {
        checkSpecifiedProperty("loginId");
        return _loginId;
    }

    /**
     * [set] login_id: {text(2147483647), refers to user_t.login_id} <br>
     * ログインID
     * @param loginId The value of the column 'login_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoginId(String loginId) {
        registerModifiedProperty("loginId");
        _loginId = loginId;
    }

    /**
     * [get] line_flg: {int4(10), refers to user_t.line_flg} <br>
     * Lineフラグ
     * @return The value of the column 'line_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLineFlg() {
        checkSpecifiedProperty("lineFlg");
        return _lineFlg;
    }

    /**
     * [set] line_flg: {int4(10), refers to user_t.line_flg} <br>
     * Lineフラグ
     * @param lineFlg The value of the column 'line_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineFlg(Integer lineFlg) {
        registerModifiedProperty("lineFlg");
        _lineFlg = lineFlg;
    }

    /**
     * [get] line_id: {text(2147483647), refers to user_t.line_id} <br>
     * LineID
     * @return The value of the column 'line_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineId() {
        checkSpecifiedProperty("lineId");
        return _lineId;
    }

    /**
     * [set] line_id: {text(2147483647), refers to user_t.line_id} <br>
     * LineID
     * @param lineId The value of the column 'line_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineId(String lineId) {
        registerModifiedProperty("lineId");
        _lineId = lineId;
    }

    /**
     * [get] line_user_name: {text(2147483647), refers to user_t.line_user_name} <br>
     * LINEユーザ名
     * @return The value of the column 'line_user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineUserName() {
        checkSpecifiedProperty("lineUserName");
        return _lineUserName;
    }

    /**
     * [set] line_user_name: {text(2147483647), refers to user_t.line_user_name} <br>
     * LINEユーザ名
     * @param lineUserName The value of the column 'line_user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineUserName(String lineUserName) {
        registerModifiedProperty("lineUserName");
        _lineUserName = lineUserName;
    }

    /**
     * [get] user_name: {text(2147483647), refers to user_t.user_name} <br>
     * ユーザー名
     * @return The value of the column 'user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] user_name: {text(2147483647), refers to user_t.user_name} <br>
     * ユーザー名
     * @param userName The value of the column 'user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] last_name: {text(2147483647), refers to user_t.last_name} <br>
     * 苗字(氏)
     * @return The value of the column 'last_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return _lastName;
    }

    /**
     * [set] last_name: {text(2147483647), refers to user_t.last_name} <br>
     * 苗字(氏)
     * @param lastName The value of the column 'last_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        _lastName = lastName;
    }

    /**
     * [get] first_name: {text(2147483647), refers to user_t.first_name} <br>
     * 名前(名)
     * @return The value of the column 'first_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return _firstName;
    }

    /**
     * [set] first_name: {text(2147483647), refers to user_t.first_name} <br>
     * 名前(名)
     * @param firstName The value of the column 'first_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        _firstName = firstName;
    }

    /**
     * [get] email: {text(2147483647), refers to user_t.email} <br>
     * Eメール
     * @return The value of the column 'email'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return _email;
    }

    /**
     * [set] email: {text(2147483647), refers to user_t.email} <br>
     * Eメール
     * @param email The value of the column 'email'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
    }

    /**
     * [get] password: {text(2147483647), refers to user_t.password} <br>
     * 暗号化PWD
     * @return The value of the column 'password'. (NullAllowed even if selected: for no constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {text(2147483647), refers to user_t.password} <br>
     * 暗号化PWD
     * @param password The value of the column 'password'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] user_type_id: {int4(10), refers to user_t.user_type_id} <br>
     * ユーザー区分ID
     * @return The value of the column 'user_type_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserTypeId() {
        checkSpecifiedProperty("userTypeId");
        return _userTypeId;
    }

    /**
     * [set] user_type_id: {int4(10), refers to user_t.user_type_id} <br>
     * ユーザー区分ID
     * @param userTypeId The value of the column 'user_type_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserTypeId(Integer userTypeId) {
        registerModifiedProperty("userTypeId");
        _userTypeId = userTypeId;
    }

    /**
     * [get] auth_level: {int4(10), refers to user_t.auth_level} <br>
     * 権限レベル
     * @return The value of the column 'auth_level'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAuthLevel() {
        checkSpecifiedProperty("authLevel");
        return _authLevel;
    }

    /**
     * [set] auth_level: {int4(10), refers to user_t.auth_level} <br>
     * 権限レベル
     * @param authLevel The value of the column 'auth_level'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAuthLevel(Integer authLevel) {
        registerModifiedProperty("authLevel");
        _authLevel = authLevel;
    }

    /**
     * [get] user_type_name: {text(2147483647), refers to user_type_m.user_type_name} <br>
     * ユーザー区分名称
     * @return The value of the column 'user_type_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserTypeName() {
        checkSpecifiedProperty("userTypeName");
        return _userTypeName;
    }

    /**
     * [set] user_type_name: {text(2147483647), refers to user_type_m.user_type_name} <br>
     * ユーザー区分名称
     * @param userTypeName The value of the column 'user_type_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserTypeName(String userTypeName) {
        registerModifiedProperty("userTypeName");
        _userTypeName = userTypeName;
    }

    /**
     * [get] subsidy_amount: {int4(10), refers to user_type_m.subsidy_amount} <br>
     * 補助金額
     * @return The value of the column 'subsidy_amount'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSubsidyAmount() {
        checkSpecifiedProperty("subsidyAmount");
        return _subsidyAmount;
    }

    /**
     * [set] subsidy_amount: {int4(10), refers to user_type_m.subsidy_amount} <br>
     * 補助金額
     * @param subsidyAmount The value of the column 'subsidy_amount'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSubsidyAmount(Integer subsidyAmount) {
        registerModifiedProperty("subsidyAmount");
        _subsidyAmount = subsidyAmount;
    }

    /**
     * [get] event_notify_no: {serial(10), refers to event_notify.event_notify_no} <br>
     * イベント通知番号
     * @return The value of the column 'event_notify_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventNotifyNo() {
        checkSpecifiedProperty("eventNotifyNo");
        return _eventNotifyNo;
    }

    /**
     * [set] event_notify_no: {serial(10), refers to event_notify.event_notify_no} <br>
     * イベント通知番号
     * @param eventNotifyNo The value of the column 'event_notify_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventNotifyNo(Integer eventNotifyNo) {
        registerModifiedProperty("eventNotifyNo");
        _eventNotifyNo = eventNotifyNo;
    }

    /**
     * [get] event_no: {int4(10), refers to event_notify.event_no} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {int4(10), refers to event_notify.event_no} <br>
     * イベント管理番号
     * @param eventNo The value of the column 'event_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventNo(Integer eventNo) {
        registerModifiedProperty("eventNo");
        _eventNo = eventNo;
    }

    /**
     * [get] notify_datetime: {timestamp(29, 6), refers to event_notify.notify_datetime} <br>
     * 通知日時
     * @return The value of the column 'notify_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getNotifyDatetime() {
        checkSpecifiedProperty("notifyDatetime");
        return _notifyDatetime;
    }

    /**
     * [set] notify_datetime: {timestamp(29, 6), refers to event_notify.notify_datetime} <br>
     * 通知日時
     * @param notifyDatetime The value of the column 'notify_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotifyDatetime(java.time.LocalDateTime notifyDatetime) {
        registerModifiedProperty("notifyDatetime");
        _notifyDatetime = notifyDatetime;
    }
}
