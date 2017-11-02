package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
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

    /** event_no: {int4(10)} */
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
        return "";
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
        return "";
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
     * [get] event_no: {int4(10)} <br>
     * イベント管理番号
     * @return The value of the column 'event_no'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEventNo() {
        checkSpecifiedProperty("eventNo");
        return _eventNo;
    }

    /**
     * [set] event_no: {int4(10)} <br>
     * イベント管理番号
     * @param eventNo The value of the column 'event_no'. (NullAllowed: null update allowed for no constraint)
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
