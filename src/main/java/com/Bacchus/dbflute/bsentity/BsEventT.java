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
 * The entity of event_t as TABLE. <br>
 * イベント_T
 * <pre>
 * [primary-key]
 *     event_no
 *
 * [column]
 *     event_no, event_name, event_detail, event_place, event_url, tell, event_entry_fee, auxiliary_flg, fix_flg, candidate_no, store_name, event_div, user_id
 *
 * [sequence]
 *     event_t_event_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     user_t
 *
 * [referrer table]
 *     candidate_t, event_notify
 *
 * [foreign property]
 *     userT
 *
 * [referrer property]
 *     candidateTList, eventNotifyList
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
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEventT extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** event_no: {PK, ID, NotNull, serial(10)} */
    protected Integer _eventNo;

    /** event_name: {text(2147483647)} */
    protected String _eventName;

    /** event_detail: {text(2147483647)} */
    protected String _eventDetail;

    /** event_place: {text(2147483647)} */
    protected String _eventPlace;

    /** event_url: {text(2147483647)} */
    protected String _eventUrl;

    /** tell: {text(2147483647)} */
    protected String _tell;

    /** event_entry_fee: {int4(10)} */
    protected Integer _eventEntryFee;

    /** auxiliary_flg: {int2(5)} */
    protected Integer _auxiliaryFlg;

    /** fix_flg: {int2(5)} */
    protected Integer _fixFlg;

    /** candidate_no: {int4(10)} */
    protected Integer _candidateNo;

    /** store_name: {text(2147483647)} */
    protected String _storeName;

    /** event_div: {text(2147483647)} */
    protected String _eventDiv;

    /** user_id: {int4(10), FK to user_t} */
    protected Integer _userId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "event_t";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_eventNo == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** user_t by my user_id, named 'userT'. */
    protected OptionalEntity<UserT> _userT;

    /**
     * [get] user_t by my user_id, named 'userT'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userT'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<UserT> getUserT() {
        if (_userT == null) { _userT = OptionalEntity.relationEmpty(this, "userT"); }
        return _userT;
    }

    /**
     * [set] user_t by my user_id, named 'userT'.
     * @param userT The entity of foreign property 'userT'. (NullAllowed)
     */
    public void setUserT(OptionalEntity<UserT> userT) {
        _userT = userT;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** candidate_t by event_no, named 'candidateTList'. */
    protected List<CandidateT> _candidateTList;

    /**
     * [get] candidate_t by event_no, named 'candidateTList'.
     * @return The entity list of referrer property 'candidateTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CandidateT> getCandidateTList() {
        if (_candidateTList == null) { _candidateTList = newReferrerList(); }
        return _candidateTList;
    }

    /**
     * [set] candidate_t by event_no, named 'candidateTList'.
     * @param candidateTList The entity list of referrer property 'candidateTList'. (NullAllowed)
     */
    public void setCandidateTList(List<CandidateT> candidateTList) {
        _candidateTList = candidateTList;
    }

    /** event_notify by event_no, named 'eventNotifyList'. */
    protected List<EventNotify> _eventNotifyList;

    /**
     * [get] event_notify by event_no, named 'eventNotifyList'.
     * @return The entity list of referrer property 'eventNotifyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EventNotify> getEventNotifyList() {
        if (_eventNotifyList == null) { _eventNotifyList = newReferrerList(); }
        return _eventNotifyList;
    }

    /**
     * [set] event_notify by event_no, named 'eventNotifyList'.
     * @param eventNotifyList The entity list of referrer property 'eventNotifyList'. (NullAllowed)
     */
    public void setEventNotifyList(List<EventNotify> eventNotifyList) {
        _eventNotifyList = eventNotifyList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEventT) {
            BsEventT other = (BsEventT)obj;
            if (!xSV(_eventNo, other._eventNo)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userT != null && _userT.isPresent())
        { sb.append(li).append(xbRDS(_userT, "userT")); }
        if (_candidateTList != null) { for (CandidateT et : _candidateTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "candidateTList")); } } }
        if (_eventNotifyList != null) { for (EventNotify et : _eventNotifyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "eventNotifyList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userT != null && _userT.isPresent())
        { sb.append(dm).append("userT"); }
        if (_candidateTList != null && !_candidateTList.isEmpty())
        { sb.append(dm).append("candidateTList"); }
        if (_eventNotifyList != null && !_eventNotifyList.isEmpty())
        { sb.append(dm).append("eventNotifyList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public EventT clone() {
        return (EventT)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] event_no: {PK, ID, NotNull, serial(10)} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {PK, ID, NotNull, serial(10)} <br>
     * イベント管理番号
     * @param eventNo The value of the column 'event_no'. (basically NotNull if update: for the constraint)
     */
    public void setEventNo(Integer eventNo) {
        registerModifiedProperty("eventNo");
        _eventNo = eventNo;
    }

    /**
     * [get] event_name: {text(2147483647)} <br>
     * イベント名
     * @return The value of the column 'event_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventName() {
        checkSpecifiedProperty("eventName");
        return _eventName;
    }

    /**
     * [set] event_name: {text(2147483647)} <br>
     * イベント名
     * @param eventName The value of the column 'event_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventName(String eventName) {
        registerModifiedProperty("eventName");
        _eventName = eventName;
    }

    /**
     * [get] event_detail: {text(2147483647)} <br>
     * イベント詳細
     * @return The value of the column 'event_detail'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventDetail() {
        checkSpecifiedProperty("eventDetail");
        return _eventDetail;
    }

    /**
     * [set] event_detail: {text(2147483647)} <br>
     * イベント詳細
     * @param eventDetail The value of the column 'event_detail'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventDetail(String eventDetail) {
        registerModifiedProperty("eventDetail");
        _eventDetail = eventDetail;
    }

    /**
     * [get] event_place: {text(2147483647)} <br>
     * 場所
     * @return The value of the column 'event_place'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventPlace() {
        checkSpecifiedProperty("eventPlace");
        return _eventPlace;
    }

    /**
     * [set] event_place: {text(2147483647)} <br>
     * 場所
     * @param eventPlace The value of the column 'event_place'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventPlace(String eventPlace) {
        registerModifiedProperty("eventPlace");
        _eventPlace = eventPlace;
    }

    /**
     * [get] event_url: {text(2147483647)} <br>
     * URL
     * @return The value of the column 'event_url'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventUrl() {
        checkSpecifiedProperty("eventUrl");
        return _eventUrl;
    }

    /**
     * [set] event_url: {text(2147483647)} <br>
     * URL
     * @param eventUrl The value of the column 'event_url'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventUrl(String eventUrl) {
        registerModifiedProperty("eventUrl");
        _eventUrl = eventUrl;
    }

    /**
     * [get] tell: {text(2147483647)} <br>
     * 電話番号
     * @return The value of the column 'tell'. (NullAllowed even if selected: for no constraint)
     */
    public String getTell() {
        checkSpecifiedProperty("tell");
        return _tell;
    }

    /**
     * [set] tell: {text(2147483647)} <br>
     * 電話番号
     * @param tell The value of the column 'tell'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTell(String tell) {
        registerModifiedProperty("tell");
        _tell = tell;
    }

    /**
     * [get] event_entry_fee: {int4(10)} <br>
     * イベント参加費
     * @return The value of the column 'event_entry_fee'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventEntryFee() {
        checkSpecifiedProperty("eventEntryFee");
        return _eventEntryFee;
    }

    /**
     * [set] event_entry_fee: {int4(10)} <br>
     * イベント参加費
     * @param eventEntryFee The value of the column 'event_entry_fee'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventEntryFee(Integer eventEntryFee) {
        registerModifiedProperty("eventEntryFee");
        _eventEntryFee = eventEntryFee;
    }

    /**
     * [get] auxiliary_flg: {int2(5)} <br>
     * 補助フラグ
     * @return The value of the column 'auxiliary_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAuxiliaryFlg() {
        checkSpecifiedProperty("auxiliaryFlg");
        return _auxiliaryFlg;
    }

    /**
     * [set] auxiliary_flg: {int2(5)} <br>
     * 補助フラグ
     * @param auxiliaryFlg The value of the column 'auxiliary_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAuxiliaryFlg(Integer auxiliaryFlg) {
        registerModifiedProperty("auxiliaryFlg");
        _auxiliaryFlg = auxiliaryFlg;
    }

    /**
     * [get] fix_flg: {int2(5)} <br>
     * 確定フラグ
     * @return The value of the column 'fix_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFixFlg() {
        checkSpecifiedProperty("fixFlg");
        return _fixFlg;
    }

    /**
     * [set] fix_flg: {int2(5)} <br>
     * 確定フラグ
     * @param fixFlg The value of the column 'fix_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFixFlg(Integer fixFlg) {
        registerModifiedProperty("fixFlg");
        _fixFlg = fixFlg;
    }

    /**
     * [get] candidate_no: {int4(10)} <br>
     * 候補日管理番号
     * @return The value of the column 'candidate_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCandidateNo() {
        checkSpecifiedProperty("candidateNo");
        return _candidateNo;
    }

    /**
     * [set] candidate_no: {int4(10)} <br>
     * 候補日管理番号
     * @param candidateNo The value of the column 'candidate_no'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCandidateNo(Integer candidateNo) {
        registerModifiedProperty("candidateNo");
        _candidateNo = candidateNo;
    }

    /**
     * [get] store_name: {text(2147483647)} <br>
     * 店舗名
     * @return The value of the column 'store_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreName() {
        checkSpecifiedProperty("storeName");
        return _storeName;
    }

    /**
     * [set] store_name: {text(2147483647)} <br>
     * 店舗名
     * @param storeName The value of the column 'store_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreName(String storeName) {
        registerModifiedProperty("storeName");
        _storeName = storeName;
    }

    /**
     * [get] event_div: {text(2147483647)} <br>
     * イベント区分
     * @return The value of the column 'event_div'. (NullAllowed even if selected: for no constraint)
     */
    public String getEventDiv() {
        checkSpecifiedProperty("eventDiv");
        return _eventDiv;
    }

    /**
     * [set] event_div: {text(2147483647)} <br>
     * イベント区分
     * @param eventDiv The value of the column 'event_div'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventDiv(String eventDiv) {
        registerModifiedProperty("eventDiv");
        _eventDiv = eventDiv;
    }

    /**
     * [get] user_id: {int4(10), FK to user_t} <br>
     * 幹事ユーザID
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {int4(10), FK to user_t} <br>
     * 幹事ユーザID
     * @param userId The value of the column 'user_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }
}
