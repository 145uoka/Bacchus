package com.Bacchus.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.Bacchus.dbflute.exentity.customize.*;

/**
 * The entity of EventIndex. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     event_no, event_name, event_detail, event_place, event_url, tell, event_entry_fee, auxiliary_flg, fix_flg, candidate_no, store_name, event_div, user_id, login_id, line_flg, line_id, line_user_name, user_name, last_name, first_name, email, password, user_type_id, auth_level, event_start_datetime, event_end_datetime, start_date, start_time, entry_count, code_id, code_div, code, name, order_number, remarks
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
 * Integer eventNo = entity.getEventNo();
 * String eventName = entity.getEventName();
 * String eventDetail = entity.getEventDetail();
 * String eventPlace = entity.getEventPlace();
 * String eventUrl = entity.getEventUrl();
 * String tell = entity.getTell();
 * Integer eventEntryFee = entity.getEventEntryFee();
 * Integer auxiliaryFlg = entity.getAuxiliaryFlg();
 * Integer fixFlg = entity.getFixFlg();
 * Integer candidateNo = entity.getCandidateNo();
 * String storeName = entity.getStoreName();
 * String eventDiv = entity.getEventDiv();
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
 * java.time.LocalDateTime eventStartDatetime = entity.getEventStartDatetime();
 * java.time.LocalDateTime eventEndDatetime = entity.getEventEndDatetime();
 * String startDate = entity.getStartDate();
 * String startTime = entity.getStartTime();
 * Long entryCount = entity.getEntryCount();
 * Integer codeId = entity.getCodeId();
 * String codeDiv = entity.getCodeDiv();
 * String code = entity.getCode();
 * String name = entity.getName();
 * Integer orderNumber = entity.getOrderNumber();
 * String remarks = entity.getRemarks();
 * entity.setEventNo(eventNo);
 * entity.setEventName(eventName);
 * entity.setEventDetail(eventDetail);
 * entity.setEventPlace(eventPlace);
 * entity.setEventUrl(eventUrl);
 * entity.setTell(tell);
 * entity.setEventEntryFee(eventEntryFee);
 * entity.setAuxiliaryFlg(auxiliaryFlg);
 * entity.setFixFlg(fixFlg);
 * entity.setCandidateNo(candidateNo);
 * entity.setStoreName(storeName);
 * entity.setEventDiv(eventDiv);
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
 * entity.setEventStartDatetime(eventStartDatetime);
 * entity.setEventEndDatetime(eventEndDatetime);
 * entity.setStartDate(startDate);
 * entity.setStartTime(startTime);
 * entity.setEntryCount(entryCount);
 * entity.setCodeId(codeId);
 * entity.setCodeDiv(codeDiv);
 * entity.setCode(code);
 * entity.setName(name);
 * entity.setOrderNumber(orderNumber);
 * entity.setRemarks(remarks);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEventIndex extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** event_no: {serial(10), refers to event_t.event_no} */
    protected Integer _eventNo;

    /** event_name: {text(2147483647), refers to event_t.event_name} */
    protected String _eventName;

    /** event_detail: {text(2147483647), refers to event_t.event_detail} */
    protected String _eventDetail;

    /** event_place: {text(2147483647), refers to event_t.event_place} */
    protected String _eventPlace;

    /** event_url: {text(2147483647), refers to event_t.event_url} */
    protected String _eventUrl;

    /** tell: {text(2147483647), refers to event_t.tell} */
    protected String _tell;

    /** event_entry_fee: {int4(10), refers to event_t.event_entry_fee} */
    protected Integer _eventEntryFee;

    /** auxiliary_flg: {int2(5), refers to event_t.auxiliary_flg} */
    protected Integer _auxiliaryFlg;

    /** fix_flg: {int2(5), refers to event_t.fix_flg} */
    protected Integer _fixFlg;

    /** candidate_no: {int4(10), refers to event_t.candidate_no} */
    protected Integer _candidateNo;

    /** store_name: {text(2147483647), refers to event_t.store_name} */
    protected String _storeName;

    /** event_div: {text(2147483647), refers to event_t.event_div} */
    protected String _eventDiv;

    /** user_id: {int4(10), refers to event_t.user_id} */
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

    /** event_start_datetime: {timestamp(29, 6), refers to candidate_t.event_start_datetime} */
    protected java.time.LocalDateTime _eventStartDatetime;

    /** event_end_datetime: {timestamp(29, 6), refers to candidate_t.event_end_datetime} */
    protected java.time.LocalDateTime _eventEndDatetime;

    /** start_date: {text(2147483647), refers to candidate_t.start_date} */
    protected String _startDate;

    /** start_time: {text(2147483647), refers to candidate_t.start_time} */
    protected String _startTime;

    /** entry_count: {int8(19)} */
    protected Long _entryCount;

    /** code_id: {serial(10), refers to general_code_m.code_id} */
    protected Integer _codeId;

    /** code_div: {text(2147483647), refers to general_code_m.code_div} */
    protected String _codeDiv;

    /** code: {text(2147483647), refers to general_code_m.code} */
    protected String _code;

    /** name: {text(2147483647), refers to general_code_m.name} */
    protected String _name;

    /** order_number: {int2(5), refers to general_code_m.order_number} */
    protected Integer _orderNumber;

    /** remarks: {text(2147483647), refers to general_code_m.remarks} */
    protected String _remarks;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.Bacchus.dbflute.bsentity.customize.dbmeta.EventIndexDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "EventIndex";
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
        if (obj instanceof BsEventIndex) {
            BsEventIndex other = (BsEventIndex)obj;
            if (!xSV(_eventNo, other._eventNo)) { return false; }
            if (!xSV(_eventName, other._eventName)) { return false; }
            if (!xSV(_eventDetail, other._eventDetail)) { return false; }
            if (!xSV(_eventPlace, other._eventPlace)) { return false; }
            if (!xSV(_eventUrl, other._eventUrl)) { return false; }
            if (!xSV(_tell, other._tell)) { return false; }
            if (!xSV(_eventEntryFee, other._eventEntryFee)) { return false; }
            if (!xSV(_auxiliaryFlg, other._auxiliaryFlg)) { return false; }
            if (!xSV(_fixFlg, other._fixFlg)) { return false; }
            if (!xSV(_candidateNo, other._candidateNo)) { return false; }
            if (!xSV(_storeName, other._storeName)) { return false; }
            if (!xSV(_eventDiv, other._eventDiv)) { return false; }
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
            if (!xSV(_eventStartDatetime, other._eventStartDatetime)) { return false; }
            if (!xSV(_eventEndDatetime, other._eventEndDatetime)) { return false; }
            if (!xSV(_startDate, other._startDate)) { return false; }
            if (!xSV(_startTime, other._startTime)) { return false; }
            if (!xSV(_entryCount, other._entryCount)) { return false; }
            if (!xSV(_codeId, other._codeId)) { return false; }
            if (!xSV(_codeDiv, other._codeDiv)) { return false; }
            if (!xSV(_code, other._code)) { return false; }
            if (!xSV(_name, other._name)) { return false; }
            if (!xSV(_orderNumber, other._orderNumber)) { return false; }
            if (!xSV(_remarks, other._remarks)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eventNo);
        hs = xCH(hs, _eventName);
        hs = xCH(hs, _eventDetail);
        hs = xCH(hs, _eventPlace);
        hs = xCH(hs, _eventUrl);
        hs = xCH(hs, _tell);
        hs = xCH(hs, _eventEntryFee);
        hs = xCH(hs, _auxiliaryFlg);
        hs = xCH(hs, _fixFlg);
        hs = xCH(hs, _candidateNo);
        hs = xCH(hs, _storeName);
        hs = xCH(hs, _eventDiv);
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
        hs = xCH(hs, _eventStartDatetime);
        hs = xCH(hs, _eventEndDatetime);
        hs = xCH(hs, _startDate);
        hs = xCH(hs, _startTime);
        hs = xCH(hs, _entryCount);
        hs = xCH(hs, _codeId);
        hs = xCH(hs, _codeDiv);
        hs = xCH(hs, _code);
        hs = xCH(hs, _name);
        hs = xCH(hs, _orderNumber);
        hs = xCH(hs, _remarks);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_eventNo));
        sb.append(dm).append(xfND(_eventName));
        sb.append(dm).append(xfND(_eventDetail));
        sb.append(dm).append(xfND(_eventPlace));
        sb.append(dm).append(xfND(_eventUrl));
        sb.append(dm).append(xfND(_tell));
        sb.append(dm).append(xfND(_eventEntryFee));
        sb.append(dm).append(xfND(_auxiliaryFlg));
        sb.append(dm).append(xfND(_fixFlg));
        sb.append(dm).append(xfND(_candidateNo));
        sb.append(dm).append(xfND(_storeName));
        sb.append(dm).append(xfND(_eventDiv));
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
        sb.append(dm).append(xfND(_eventStartDatetime));
        sb.append(dm).append(xfND(_eventEndDatetime));
        sb.append(dm).append(xfND(_startDate));
        sb.append(dm).append(xfND(_startTime));
        sb.append(dm).append(xfND(_entryCount));
        sb.append(dm).append(xfND(_codeId));
        sb.append(dm).append(xfND(_codeDiv));
        sb.append(dm).append(xfND(_code));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_orderNumber));
        sb.append(dm).append(xfND(_remarks));
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
    public EventIndex clone() {
        return (EventIndex)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] event_no: {serial(10), refers to event_t.event_no} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {serial(10), refers to event_t.event_no} <br>
     * イベント管理番号
     * @param eventNo The value of the column 'event_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventNo(Integer eventNo) {
        registerModifiedProperty("eventNo");
        _eventNo = eventNo;
    }

    /**
     * [get] event_name: {text(2147483647), refers to event_t.event_name} <br>
     * イベント名
     * @return The value of the column 'event_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventName() {
        checkSpecifiedProperty("eventName");
        return _eventName;
    }

    /**
     * [set] event_name: {text(2147483647), refers to event_t.event_name} <br>
     * イベント名
     * @param eventName The value of the column 'event_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventName(String eventName) {
        registerModifiedProperty("eventName");
        _eventName = eventName;
    }

    /**
     * [get] event_detail: {text(2147483647), refers to event_t.event_detail} <br>
     * イベント詳細
     * @return The value of the column 'event_detail'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventDetail() {
        checkSpecifiedProperty("eventDetail");
        return _eventDetail;
    }

    /**
     * [set] event_detail: {text(2147483647), refers to event_t.event_detail} <br>
     * イベント詳細
     * @param eventDetail The value of the column 'event_detail'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventDetail(String eventDetail) {
        registerModifiedProperty("eventDetail");
        _eventDetail = eventDetail;
    }

    /**
     * [get] event_place: {text(2147483647), refers to event_t.event_place} <br>
     * 場所
     * @return The value of the column 'event_place'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventPlace() {
        checkSpecifiedProperty("eventPlace");
        return _eventPlace;
    }

    /**
     * [set] event_place: {text(2147483647), refers to event_t.event_place} <br>
     * 場所
     * @param eventPlace The value of the column 'event_place'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventPlace(String eventPlace) {
        registerModifiedProperty("eventPlace");
        _eventPlace = eventPlace;
    }

    /**
     * [get] event_url: {text(2147483647), refers to event_t.event_url} <br>
     * URL
     * @return The value of the column 'event_url'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventUrl() {
        checkSpecifiedProperty("eventUrl");
        return _eventUrl;
    }

    /**
     * [set] event_url: {text(2147483647), refers to event_t.event_url} <br>
     * URL
     * @param eventUrl The value of the column 'event_url'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventUrl(String eventUrl) {
        registerModifiedProperty("eventUrl");
        _eventUrl = eventUrl;
    }

    /**
     * [get] tell: {text(2147483647), refers to event_t.tell} <br>
     * 電話番号
     * @return The value of the column 'tell'. (NullAllowed even if selected: for no constraint)
     */
    public String getTell() {
        checkSpecifiedProperty("tell");
        return _tell;
    }

    /**
     * [set] tell: {text(2147483647), refers to event_t.tell} <br>
     * 電話番号
     * @param tell The value of the column 'tell'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTell(String tell) {
        registerModifiedProperty("tell");
        _tell = tell;
    }

    /**
     * [get] event_entry_fee: {int4(10), refers to event_t.event_entry_fee} <br>
     * イベント参加費
     * @return The value of the column 'event_entry_fee'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventEntryFee() {
        checkSpecifiedProperty("eventEntryFee");
        return _eventEntryFee;
    }

    /**
     * [set] event_entry_fee: {int4(10), refers to event_t.event_entry_fee} <br>
     * イベント参加費
     * @param eventEntryFee The value of the column 'event_entry_fee'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventEntryFee(Integer eventEntryFee) {
        registerModifiedProperty("eventEntryFee");
        _eventEntryFee = eventEntryFee;
    }

    /**
     * [get] auxiliary_flg: {int2(5), refers to event_t.auxiliary_flg} <br>
     * 補助フラグ
     * @return The value of the column 'auxiliary_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAuxiliaryFlg() {
        checkSpecifiedProperty("auxiliaryFlg");
        return _auxiliaryFlg;
    }

    /**
     * [set] auxiliary_flg: {int2(5), refers to event_t.auxiliary_flg} <br>
     * 補助フラグ
     * @param auxiliaryFlg The value of the column 'auxiliary_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAuxiliaryFlg(Integer auxiliaryFlg) {
        registerModifiedProperty("auxiliaryFlg");
        _auxiliaryFlg = auxiliaryFlg;
    }

    /**
     * [get] fix_flg: {int2(5), refers to event_t.fix_flg} <br>
     * 確定フラグ
     * @return The value of the column 'fix_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFixFlg() {
        checkSpecifiedProperty("fixFlg");
        return _fixFlg;
    }

    /**
     * [set] fix_flg: {int2(5), refers to event_t.fix_flg} <br>
     * 確定フラグ
     * @param fixFlg The value of the column 'fix_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixFlg(Integer fixFlg) {
        registerModifiedProperty("fixFlg");
        _fixFlg = fixFlg;
    }

    /**
     * [get] candidate_no: {int4(10), refers to event_t.candidate_no} <br>
     * 候補日管理番号
     * @return The value of the column 'candidate_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCandidateNo() {
        checkSpecifiedProperty("candidateNo");
        return _candidateNo;
    }

    /**
     * [set] candidate_no: {int4(10), refers to event_t.candidate_no} <br>
     * 候補日管理番号
     * @param candidateNo The value of the column 'candidate_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCandidateNo(Integer candidateNo) {
        registerModifiedProperty("candidateNo");
        _candidateNo = candidateNo;
    }

    /**
     * [get] store_name: {text(2147483647), refers to event_t.store_name} <br>
     * 店舗名
     * @return The value of the column 'store_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreName() {
        checkSpecifiedProperty("storeName");
        return _storeName;
    }

    /**
     * [set] store_name: {text(2147483647), refers to event_t.store_name} <br>
     * 店舗名
     * @param storeName The value of the column 'store_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreName(String storeName) {
        registerModifiedProperty("storeName");
        _storeName = storeName;
    }

    /**
     * [get] event_div: {text(2147483647), refers to event_t.event_div} <br>
     * イベント区分
     * @return The value of the column 'event_div'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventDiv() {
        checkSpecifiedProperty("eventDiv");
        return _eventDiv;
    }

    /**
     * [set] event_div: {text(2147483647), refers to event_t.event_div} <br>
     * イベント区分
     * @param eventDiv The value of the column 'event_div'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventDiv(String eventDiv) {
        registerModifiedProperty("eventDiv");
        _eventDiv = eventDiv;
    }

    /**
     * [get] user_id: {int4(10), refers to event_t.user_id} <br>
     * 幹事ユーザID
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {int4(10), refers to event_t.user_id} <br>
     * 幹事ユーザID
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
     * [get] event_start_datetime: {timestamp(29, 6), refers to candidate_t.event_start_datetime} <br>
     * 開始日時
     * @return The value of the column 'event_start_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEventStartDatetime() {
        checkSpecifiedProperty("eventStartDatetime");
        return _eventStartDatetime;
    }

    /**
     * [set] event_start_datetime: {timestamp(29, 6), refers to candidate_t.event_start_datetime} <br>
     * 開始日時
     * @param eventStartDatetime The value of the column 'event_start_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventStartDatetime(java.time.LocalDateTime eventStartDatetime) {
        registerModifiedProperty("eventStartDatetime");
        _eventStartDatetime = eventStartDatetime;
    }

    /**
     * [get] event_end_datetime: {timestamp(29, 6), refers to candidate_t.event_end_datetime} <br>
     * 終了日時
     * @return The value of the column 'event_end_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEventEndDatetime() {
        checkSpecifiedProperty("eventEndDatetime");
        return _eventEndDatetime;
    }

    /**
     * [set] event_end_datetime: {timestamp(29, 6), refers to candidate_t.event_end_datetime} <br>
     * 終了日時
     * @param eventEndDatetime The value of the column 'event_end_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventEndDatetime(java.time.LocalDateTime eventEndDatetime) {
        registerModifiedProperty("eventEndDatetime");
        _eventEndDatetime = eventEndDatetime;
    }

    /**
     * [get] start_date: {text(2147483647), refers to candidate_t.start_date} <br>
     * 開始年月日
     * @return The value of the column 'start_date'. (NullAllowed even if selected: for no constraint)
     */
    public String getStartDate() {
        checkSpecifiedProperty("startDate");
        return _startDate;
    }

    /**
     * [set] start_date: {text(2147483647), refers to candidate_t.start_date} <br>
     * 開始年月日
     * @param startDate The value of the column 'start_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartDate(String startDate) {
        registerModifiedProperty("startDate");
        _startDate = startDate;
    }

    /**
     * [get] start_time: {text(2147483647), refers to candidate_t.start_time} <br>
     * 開始時分
     * @return The value of the column 'start_time'. (NullAllowed even if selected: for no constraint)
     */
    public String getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] start_time: {text(2147483647), refers to candidate_t.start_time} <br>
     * 開始時分
     * @param startTime The value of the column 'start_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartTime(String startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
    }

    /**
     * [get] entry_count: {int8(19)} <br>
     * @return The value of the column 'entry_count'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEntryCount() {
        checkSpecifiedProperty("entryCount");
        return _entryCount;
    }

    /**
     * [set] entry_count: {int8(19)} <br>
     * @param entryCount The value of the column 'entry_count'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryCount(Long entryCount) {
        registerModifiedProperty("entryCount");
        _entryCount = entryCount;
    }

    /**
     * [get] code_id: {serial(10), refers to general_code_m.code_id} <br>
     * コードID
     * @return The value of the column 'code_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCodeId() {
        checkSpecifiedProperty("codeId");
        return _codeId;
    }

    /**
     * [set] code_id: {serial(10), refers to general_code_m.code_id} <br>
     * コードID
     * @param codeId The value of the column 'code_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodeId(Integer codeId) {
        registerModifiedProperty("codeId");
        _codeId = codeId;
    }

    /**
     * [get] code_div: {text(2147483647), refers to general_code_m.code_div} <br>
     * コード区分
     * @return The value of the column 'code_div'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodeDiv() {
        checkSpecifiedProperty("codeDiv");
        return _codeDiv;
    }

    /**
     * [set] code_div: {text(2147483647), refers to general_code_m.code_div} <br>
     * コード区分
     * @param codeDiv The value of the column 'code_div'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodeDiv(String codeDiv) {
        registerModifiedProperty("codeDiv");
        _codeDiv = codeDiv;
    }

    /**
     * [get] code: {text(2147483647), refers to general_code_m.code} <br>
     * コード
     * @return The value of the column 'code'. (NullAllowed even if selected: for no constraint)
     */
    public String getCode() {
        checkSpecifiedProperty("code");
        return _code;
    }

    /**
     * [set] code: {text(2147483647), refers to general_code_m.code} <br>
     * コード
     * @param code The value of the column 'code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCode(String code) {
        registerModifiedProperty("code");
        _code = code;
    }

    /**
     * [get] name: {text(2147483647), refers to general_code_m.name} <br>
     * 名称
     * @return The value of the column 'name'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {text(2147483647), refers to general_code_m.name} <br>
     * 名称
     * @param name The value of the column 'name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] order_number: {int2(5), refers to general_code_m.order_number} <br>
     * 表示順
     * @return The value of the column 'order_number'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrderNumber() {
        checkSpecifiedProperty("orderNumber");
        return _orderNumber;
    }

    /**
     * [set] order_number: {int2(5), refers to general_code_m.order_number} <br>
     * 表示順
     * @param orderNumber The value of the column 'order_number'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNumber(Integer orderNumber) {
        registerModifiedProperty("orderNumber");
        _orderNumber = orderNumber;
    }

    /**
     * [get] remarks: {text(2147483647), refers to general_code_m.remarks} <br>
     * 備考
     * @return The value of the column 'remarks'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemarks() {
        checkSpecifiedProperty("remarks");
        return _remarks;
    }

    /**
     * [set] remarks: {text(2147483647), refers to general_code_m.remarks} <br>
     * 備考
     * @param remarks The value of the column 'remarks'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemarks(String remarks) {
        registerModifiedProperty("remarks");
        _remarks = remarks;
    }
}
