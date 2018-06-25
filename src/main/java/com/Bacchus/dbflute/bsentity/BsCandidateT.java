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
 * The entity of candidate_t as TABLE. <br>
 * 候補日_T
 * <pre>
 * [primary-key]
 *     candidate_no
 *
 * [column]
 *     candidate_no, event_no, event_start_datetime, event_end_datetime, start_date, start_time, register_datetime, register_user, update_datetime, update_user, delete_flag
 *
 * [sequence]
 *     candidate_t_candidate_no_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     event_t
 *
 * [referrer table]
 *     entry_t
 *
 * [foreign property]
 *     eventT
 *
 * [referrer property]
 *     entryTList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer candidateNo = entity.getCandidateNo();
 * Integer eventNo = entity.getEventNo();
 * java.time.LocalDateTime eventStartDatetime = entity.getEventStartDatetime();
 * java.time.LocalDateTime eventEndDatetime = entity.getEventEndDatetime();
 * String startDate = entity.getStartDate();
 * String startTime = entity.getStartTime();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * entity.setCandidateNo(candidateNo);
 * entity.setEventNo(eventNo);
 * entity.setEventStartDatetime(eventStartDatetime);
 * entity.setEventEndDatetime(eventEndDatetime);
 * entity.setStartDate(startDate);
 * entity.setStartTime(startTime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setDeleteFlag(deleteFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCandidateT extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** candidate_no: {PK, ID, NotNull, serial(10)} */
    protected Integer _candidateNo;

    /** event_no: {UQ+, NotNull, int4(10), FK to event_t} */
    protected Integer _eventNo;

    /** event_start_datetime: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _eventStartDatetime;

    /** event_end_datetime: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _eventEndDatetime;

    /** start_date: {+UQ, text(2147483647)} */
    protected String _startDate;

    /** start_time: {text(2147483647)} */
    protected String _startTime;

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
        return "candidate_t";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_candidateNo == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param eventNo : UQ+, NotNull, int4(10), FK to event_t. (NotNull)
     * @param startDate : +UQ, text(2147483647). (NotNull)
     */
    public void uniqueBy(Integer eventNo, String startDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("eventNo");
        __uniqueDrivenProperties.addPropertyName("startDate");
        setEventNo(eventNo);setStartDate(startDate);
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** entry_t by candidate_no, named 'entryTList'. */
    protected List<EntryT> _entryTList;

    /**
     * [get] entry_t by candidate_no, named 'entryTList'.
     * @return The entity list of referrer property 'entryTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EntryT> getEntryTList() {
        if (_entryTList == null) { _entryTList = newReferrerList(); }
        return _entryTList;
    }

    /**
     * [set] entry_t by candidate_no, named 'entryTList'.
     * @param entryTList The entity list of referrer property 'entryTList'. (NullAllowed)
     */
    public void setEntryTList(List<EntryT> entryTList) {
        _entryTList = entryTList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCandidateT) {
            BsCandidateT other = (BsCandidateT)obj;
            if (!xSV(_candidateNo, other._candidateNo)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _candidateNo);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_eventT != null && _eventT.isPresent())
        { sb.append(li).append(xbRDS(_eventT, "eventT")); }
        if (_entryTList != null) { for (EntryT et : _entryTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "entryTList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_candidateNo));
        sb.append(dm).append(xfND(_eventNo));
        sb.append(dm).append(xfND(_eventStartDatetime));
        sb.append(dm).append(xfND(_eventEndDatetime));
        sb.append(dm).append(xfND(_startDate));
        sb.append(dm).append(xfND(_startTime));
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
        if (_eventT != null && _eventT.isPresent())
        { sb.append(dm).append("eventT"); }
        if (_entryTList != null && !_entryTList.isEmpty())
        { sb.append(dm).append("entryTList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public CandidateT clone() {
        return (CandidateT)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] candidate_no: {PK, ID, NotNull, serial(10)} <br>
     * 候補日管理番号
     * @return The value of the column 'candidate_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCandidateNo() {
        checkSpecifiedProperty("candidateNo");
        return _candidateNo;
    }

    /**
     * [set] candidate_no: {PK, ID, NotNull, serial(10)} <br>
     * 候補日管理番号
     * @param candidateNo The value of the column 'candidate_no'. (basically NotNull if update: for the constraint)
     */
    public void setCandidateNo(Integer candidateNo) {
        registerModifiedProperty("candidateNo");
        _candidateNo = candidateNo;
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
     * [get] event_start_datetime: {timestamp(29, 6)} <br>
     * 開始日時
     * @return The value of the column 'event_start_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEventStartDatetime() {
        checkSpecifiedProperty("eventStartDatetime");
        return _eventStartDatetime;
    }

    /**
     * [set] event_start_datetime: {timestamp(29, 6)} <br>
     * 開始日時
     * @param eventStartDatetime The value of the column 'event_start_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventStartDatetime(java.time.LocalDateTime eventStartDatetime) {
        registerModifiedProperty("eventStartDatetime");
        _eventStartDatetime = eventStartDatetime;
    }

    /**
     * [get] event_end_datetime: {timestamp(29, 6)} <br>
     * 終了日時
     * @return The value of the column 'event_end_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEventEndDatetime() {
        checkSpecifiedProperty("eventEndDatetime");
        return _eventEndDatetime;
    }

    /**
     * [set] event_end_datetime: {timestamp(29, 6)} <br>
     * 終了日時
     * @param eventEndDatetime The value of the column 'event_end_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEventEndDatetime(java.time.LocalDateTime eventEndDatetime) {
        registerModifiedProperty("eventEndDatetime");
        _eventEndDatetime = eventEndDatetime;
    }

    /**
     * [get] start_date: {+UQ, text(2147483647)} <br>
     * 開始年月日
     * @return The value of the column 'start_date'. (NullAllowed even if selected: for no constraint)
     */
    public String getStartDate() {
        checkSpecifiedProperty("startDate");
        return _startDate;
    }

    /**
     * [set] start_date: {+UQ, text(2147483647)} <br>
     * 開始年月日
     * @param startDate The value of the column 'start_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartDate(String startDate) {
        registerModifiedProperty("startDate");
        _startDate = startDate;
    }

    /**
     * [get] start_time: {text(2147483647)} <br>
     * 開始時分
     * @return The value of the column 'start_time'. (NullAllowed even if selected: for no constraint)
     */
    public String getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] start_time: {text(2147483647)} <br>
     * 開始時分
     * @param startTime The value of the column 'start_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStartTime(String startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
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
