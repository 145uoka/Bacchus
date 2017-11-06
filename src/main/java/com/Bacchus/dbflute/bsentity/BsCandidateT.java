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
 * The entity of candidate_t as TABLE. <br>
 * 候補日_T
 * <pre>
 * [primary-key]
 *     candidate_no
 *
 * [column]
 *     candidate_no, event_no, event_start_datetime, event_end_datetime
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
 * entity.setCandidateNo(candidateNo);
 * entity.setEventNo(eventNo);
 * entity.setEventStartDatetime(eventStartDatetime);
 * entity.setEventEndDatetime(eventEndDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCandidateT extends AbstractEntity implements DomainEntity {

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

    /** event_no: {NotNull, int4(10), FK to event_t} */
    protected Integer _eventNo;

    /** event_start_datetime: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _eventStartDatetime;

    /** event_end_datetime: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _eventEndDatetime;

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
     * [get] event_no: {NotNull, int4(10), FK to event_t} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {NotNull, int4(10), FK to event_t} <br>
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
}
