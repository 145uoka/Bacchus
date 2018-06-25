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
 * The entity of entry_t as TABLE. <br>
 * 参加_T
 * <pre>
 * [primary-key]
 *     entry_id
 *
 * [column]
 *     entry_id, candidate_no, entry_div, user_id, register_datetime, register_user, update_datetime, update_user, delete_flag
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
 * Integer entryDiv = entity.getEntryDiv();
 * Integer userId = entity.getUserId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * entity.setEntryId(entryId);
 * entity.setCandidateNo(candidateNo);
 * entity.setEntryDiv(entryDiv);
 * entity.setUserId(userId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setDeleteFlag(deleteFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEntryT extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** entry_div: {int4(10)} */
    protected Integer _entryDiv;

    /** user_id: {NotNull, int4(10), FK to user_t} */
    protected Integer _userId;

    /** register_datetime: {timestamp(29, 6), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_user: {text(2147483647)} */
    protected String _registerUser;

    /** update_datetime: {timestamp(29, 6), default=[now()]} */
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
        sb.append(dm).append(xfND(_entryDiv));
        sb.append(dm).append(xfND(_userId));
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

    /**
     * [get] user_id: {NotNull, int4(10), FK to user_t} <br>
     * ユーザーID
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {NotNull, int4(10), FK to user_t} <br>
     * ユーザーID
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] register_datetime: {timestamp(29, 6), default=[now()]} <br>
     * 作成日時
     * @return The value of the column 'register_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {timestamp(29, 6), default=[now()]} <br>
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
     * [get] update_datetime: {timestamp(29, 6), default=[now()]} <br>
     * 更新日時
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(29, 6), default=[now()]} <br>
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
