package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of entry_t as TABLE. <br>
 * 参加_T
 * <pre>
 * [primary-key]
 *     entry_id
 *
 * [column]
 *     entry_id, candidate_no, user_id, entry_div
 *
 * [sequence]
 *     entry_t_entry_id_seq
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
 * Integer entryId = entity.getEntryId();
 * Integer candidateNo = entity.getCandidateNo();
 * Integer userId = entity.getUserId();
 * Integer entryDiv = entity.getEntryDiv();
 * entity.setEntryId(entryId);
 * entity.setCandidateNo(candidateNo);
 * entity.setUserId(userId);
 * entity.setEntryDiv(entryDiv);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEntryT extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** entry_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _entryId;

    /** candidate_no: {int4(10)} */
    protected Integer _candidateNo;

    /** user_id: {int4(10)} */
    protected Integer _userId;

    /** entry_div: {int4(10)} */
    protected Integer _entryDiv;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "entry_t";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_entryId == null) { return false; }
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
        if (obj instanceof BsEntryT) {
            BsEntryT other = (BsEntryT)obj;
            if (!xSV(_entryId, other._entryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _entryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_entryId));
        sb.append(dm).append(xfND(_candidateNo));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_entryDiv));
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
    public EntryT clone() {
        return (EntryT)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] entry_id: {PK, ID, NotNull, serial(10)} <br>
     * 参加ID
     * @return The value of the column 'entry_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEntryId() {
        checkSpecifiedProperty("entryId");
        return _entryId;
    }

    /**
     * [set] entry_id: {PK, ID, NotNull, serial(10)} <br>
     * 参加ID
     * @param entryId The value of the column 'entry_id'. (basically NotNull if update: for the constraint)
     */
    public void setEntryId(Integer entryId) {
        registerModifiedProperty("entryId");
        _entryId = entryId;
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
     * [get] user_id: {int4(10)} <br>
     * user_id
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {int4(10)} <br>
     * user_id
     * @param userId The value of the column 'user_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] entry_div: {int4(10)} <br>
     * 参加区分
     * @return The value of the column 'entry_div'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getEntryDiv() {
        checkSpecifiedProperty("entryDiv");
        return _entryDiv;
    }

    /**
     * [set] entry_div: {int4(10)} <br>
     * 参加区分
     * @param entryDiv The value of the column 'entry_div'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEntryDiv(Integer entryDiv) {
        registerModifiedProperty("entryDiv");
        _entryDiv = entryDiv;
    }
}
