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
 *     candidate_t, user_t
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     candidateT, userT
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long entryId = entity.getEntryId();
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
    /** entry_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _entryId;

    /** candidate_no: {NotNull, int4(10), FK to candidate_t} */
    protected Integer _candidateNo;

    /** user_id: {NotNull, int4(10), FK to user_t} */
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
    /** candidate_t by my candidate_no, named 'candidateT'. */
    protected OptionalEntity<CandidateT> _candidateT;

    /**
     * [get] candidate_t by my candidate_no, named 'candidateT'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'candidateT'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<CandidateT> getCandidateT() {
        if (_candidateT == null) { _candidateT = OptionalEntity.relationEmpty(this, "candidateT"); }
        return _candidateT;
    }

    /**
     * [set] candidate_t by my candidate_no, named 'candidateT'.
     * @param candidateT The entity of foreign property 'candidateT'. (NullAllowed)
     */
    public void setCandidateT(OptionalEntity<CandidateT> candidateT) {
        _candidateT = candidateT;
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
        StringBuilder sb = new StringBuilder();
        if (_candidateT != null && _candidateT.isPresent())
        { sb.append(li).append(xbRDS(_candidateT, "candidateT")); }
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
        StringBuilder sb = new StringBuilder();
        if (_candidateT != null && _candidateT.isPresent())
        { sb.append(dm).append("candidateT"); }
        if (_userT != null && _userT.isPresent())
        { sb.append(dm).append("userT"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public EntryT clone() {
        return (EntryT)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] entry_id: {PK, ID, NotNull, bigserial(19)} <br>
     * 参加ID
     * @return The value of the column 'entry_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getEntryId() {
        checkSpecifiedProperty("entryId");
        return _entryId;
    }

    /**
     * [set] entry_id: {PK, ID, NotNull, bigserial(19)} <br>
     * 参加ID
     * @param entryId The value of the column 'entry_id'. (basically NotNull if update: for the constraint)
     */
    public void setEntryId(Long entryId) {
        registerModifiedProperty("entryId");
        _entryId = entryId;
    }

    /**
     * [get] candidate_no: {NotNull, int4(10), FK to candidate_t} <br>
     * 候補日管理番号
     * @return The value of the column 'candidate_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCandidateNo() {
        checkSpecifiedProperty("candidateNo");
        return _candidateNo;
    }

    /**
     * [set] candidate_no: {NotNull, int4(10), FK to candidate_t} <br>
     * 候補日管理番号
     * @param candidateNo The value of the column 'candidate_no'. (basically NotNull if update: for the constraint)
     */
    public void setCandidateNo(Integer candidateNo) {
        registerModifiedProperty("candidateNo");
        _candidateNo = candidateNo;
    }

    /**
     * [get] user_id: {NotNull, int4(10), FK to user_t} <br>
     * user_id
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {NotNull, int4(10), FK to user_t} <br>
     * user_id
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
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
