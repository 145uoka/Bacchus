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
 * The entity of event_notify as TABLE. <br>
 * イベント通知_T
 * <pre>
 * [primary-key]
 *     event_notify_no
 *
 * [column]
 *     event_notify_no, event_no, user_id, notify_datetime
 *
 * [sequence]
 *     event_notify_event_notify_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     event_t, user_t
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     eventT, userT
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer eventNotifyNo = entity.getEventNotifyNo();
 * Integer eventNo = entity.getEventNo();
 * Integer userId = entity.getUserId();
 * java.time.LocalDateTime notifyDatetime = entity.getNotifyDatetime();
 * entity.setEventNotifyNo(eventNotifyNo);
 * entity.setEventNo(eventNo);
 * entity.setUserId(userId);
 * entity.setNotifyDatetime(notifyDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEventNotify extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** event_notify_no: {PK, ID, NotNull, serial(10)} */
    protected Integer _eventNotifyNo;

    /** event_no: {UQ+, NotNull, int4(10), FK to event_t} */
    protected Integer _eventNo;

    /** user_id: {+UQ, NotNull, int4(10), FK to user_t} */
    protected Integer _userId;

    /** notify_datetime: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _notifyDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "event_notify";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_eventNotifyNo == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param eventNo : UQ+, NotNull, int4(10), FK to event_t. (NotNull)
     * @param userId : +UQ, NotNull, int4(10), FK to user_t. (NotNull)
     */
    public void uniqueBy(Integer eventNo, Integer userId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("eventNo");
        __uniqueDrivenProperties.addPropertyName("userId");
        setEventNo(eventNo);setUserId(userId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** event_t by my event_no, named 'eventT'. */
    protected OptionalEntity<EventT> _eventT;

    /**
     * [get] event_t by my event_no, named 'eventT'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'eventT'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<EventT> getEventT() {
        if (_eventT == null) { _eventT = OptionalEntity.relationEmpty(this, "eventT"); }
        return _eventT;
    }

    /**
     * [set] event_t by my event_no, named 'eventT'.
     * @param eventT The entity of foreign property 'eventT'. (NullAllowed)
     */
    public void setEventT(OptionalEntity<EventT> eventT) {
        _eventT = eventT;
    }

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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEventNotify) {
            BsEventNotify other = (BsEventNotify)obj;
            if (!xSV(_eventNotifyNo, other._eventNotifyNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eventNotifyNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_eventT != null && _eventT.isPresent())
        { sb.append(li).append(xbRDS(_eventT, "eventT")); }
        if (_userT != null && _userT.isPresent())
        { sb.append(li).append(xbRDS(_userT, "userT")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_eventNotifyNo));
        sb.append(dm).append(xfND(_eventNo));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_notifyDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_eventT != null && _eventT.isPresent())
        { sb.append(dm).append("eventT"); }
        if (_userT != null && _userT.isPresent())
        { sb.append(dm).append("userT"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public EventNotify clone() {
        return (EventNotify)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] event_notify_no: {PK, ID, NotNull, serial(10)} <br>
     * イベント通知番号
     * @return The value of the column 'event_notify_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEventNotifyNo() {
        checkSpecifiedProperty("eventNotifyNo");
        return _eventNotifyNo;
    }

    /**
     * [set] event_notify_no: {PK, ID, NotNull, serial(10)} <br>
     * イベント通知番号
     * @param eventNotifyNo The value of the column 'event_notify_no'. (basically NotNull if update: for the constraint)
     */
    public void setEventNotifyNo(Integer eventNotifyNo) {
        registerModifiedProperty("eventNotifyNo");
        _eventNotifyNo = eventNotifyNo;
    }

    /**
     * [get] event_no: {UQ+, NotNull, int4(10), FK to event_t} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {UQ+, NotNull, int4(10), FK to event_t} <br>
     * イベント管理番号
     * @param eventNo The value of the column 'event_no'. (basically NotNull if update: for the constraint)
     */
    public void setEventNo(Integer eventNo) {
        registerModifiedProperty("eventNo");
        _eventNo = eventNo;
    }

    /**
     * [get] user_id: {+UQ, NotNull, int4(10), FK to user_t} <br>
     * user_id
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {+UQ, NotNull, int4(10), FK to user_t} <br>
     * user_id
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] notify_datetime: {timestamp(29, 6)} <br>
     * 通知日時
     * @return The value of the column 'notify_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getNotifyDatetime() {
        checkSpecifiedProperty("notifyDatetime");
        return _notifyDatetime;
    }

    /**
     * [set] notify_datetime: {timestamp(29, 6)} <br>
     * 通知日時
     * @param notifyDatetime The value of the column 'notify_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotifyDatetime(java.time.LocalDateTime notifyDatetime) {
        registerModifiedProperty("notifyDatetime");
        _notifyDatetime = notifyDatetime;
    }
}
