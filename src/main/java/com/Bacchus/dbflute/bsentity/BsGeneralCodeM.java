package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.EntityDefinedCommonColumn;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of general_code_m as TABLE. <br>
 * 汎用コード_M
 * <pre>
 * [primary-key]
 *     code_id
 *
 * [column]
 *     code_id, code_div, code, name, order_number, remarks, del_flg, register_datetime, register_user, update_datetime, update_user, delete_flag
 *
 * [sequence]
 *     general_code_m_code_id_seq
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
 * Integer codeId = entity.getCodeId();
 * String codeDiv = entity.getCodeDiv();
 * String code = entity.getCode();
 * String name = entity.getName();
 * Integer orderNumber = entity.getOrderNumber();
 * String remarks = entity.getRemarks();
 * Integer delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * entity.setCodeId(codeId);
 * entity.setCodeDiv(codeDiv);
 * entity.setCode(code);
 * entity.setName(name);
 * entity.setOrderNumber(orderNumber);
 * entity.setRemarks(remarks);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setDeleteFlag(deleteFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGeneralCodeM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** code_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _codeId;

    /** code_div: {NotNull, text(2147483647)} */
    protected String _codeDiv;

    /** code: {text(2147483647)} */
    protected String _code;

    /** name: {text(2147483647)} */
    protected String _name;

    /** order_number: {int2(5)} */
    protected Integer _orderNumber;

    /** remarks: {text(2147483647)} */
    protected String _remarks;

    /** del_flg: {int2(5)} */
    protected Integer _delFlg;

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
        return "general_code_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_codeId == null) { return false; }
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
        if (obj instanceof BsGeneralCodeM) {
            BsGeneralCodeM other = (BsGeneralCodeM)obj;
            if (!xSV(_codeId, other._codeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _codeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_codeId));
        sb.append(dm).append(xfND(_codeDiv));
        sb.append(dm).append(xfND(_code));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_orderNumber));
        sb.append(dm).append(xfND(_remarks));
        sb.append(dm).append(xfND(_delFlg));
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
        return "";
    }

    @Override
    public GeneralCodeM clone() {
        return (GeneralCodeM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] code_id: {PK, ID, NotNull, serial(10)} <br>
     * コードID
     * @return The value of the column 'code_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCodeId() {
        checkSpecifiedProperty("codeId");
        return _codeId;
    }

    /**
     * [set] code_id: {PK, ID, NotNull, serial(10)} <br>
     * コードID
     * @param codeId The value of the column 'code_id'. (basically NotNull if update: for the constraint)
     */
    public void setCodeId(Integer codeId) {
        registerModifiedProperty("codeId");
        _codeId = codeId;
    }

    /**
     * [get] code_div: {NotNull, text(2147483647)} <br>
     * コード区分
     * @return The value of the column 'code_div'. (basically NotNull if selected: for the constraint)
     */
    public String getCodeDiv() {
        checkSpecifiedProperty("codeDiv");
        return _codeDiv;
    }

    /**
     * [set] code_div: {NotNull, text(2147483647)} <br>
     * コード区分
     * @param codeDiv The value of the column 'code_div'. (basically NotNull if update: for the constraint)
     */
    public void setCodeDiv(String codeDiv) {
        registerModifiedProperty("codeDiv");
        _codeDiv = codeDiv;
    }

    /**
     * [get] code: {text(2147483647)} <br>
     * コード
     * @return The value of the column 'code'. (NullAllowed even if selected: for no constraint)
     */
    public String getCode() {
        checkSpecifiedProperty("code");
        return _code;
    }

    /**
     * [set] code: {text(2147483647)} <br>
     * コード
     * @param code The value of the column 'code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCode(String code) {
        registerModifiedProperty("code");
        _code = code;
    }

    /**
     * [get] name: {text(2147483647)} <br>
     * 名称
     * @return The value of the column 'name'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {text(2147483647)} <br>
     * 名称
     * @param name The value of the column 'name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] order_number: {int2(5)} <br>
     * 表示順
     * @return The value of the column 'order_number'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrderNumber() {
        checkSpecifiedProperty("orderNumber");
        return _orderNumber;
    }

    /**
     * [set] order_number: {int2(5)} <br>
     * 表示順
     * @param orderNumber The value of the column 'order_number'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNumber(Integer orderNumber) {
        registerModifiedProperty("orderNumber");
        _orderNumber = orderNumber;
    }

    /**
     * [get] remarks: {text(2147483647)} <br>
     * 備考
     * @return The value of the column 'remarks'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemarks() {
        checkSpecifiedProperty("remarks");
        return _remarks;
    }

    /**
     * [set] remarks: {text(2147483647)} <br>
     * 備考
     * @param remarks The value of the column 'remarks'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemarks(String remarks) {
        registerModifiedProperty("remarks");
        _remarks = remarks;
    }

    /**
     * [get] del_flg: {int2(5)} <br>
     * 削除フラグ
     * @return The value of the column 'del_flg'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] del_flg: {int2(5)} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'del_flg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(Integer delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
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
