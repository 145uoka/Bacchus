package com.Bacchus.app.components;

import java.io.Serializable;

/**
 * ユーザ区分DTO。
 *
 * @author ishigouoka_k
 */
public class UserTypeDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 補助金額 */
    private Integer subsidyAmount;

    /** ユーザー区分ID */
    private Integer userTypeId;

    /** ユーザー区分名称 */
    private String userTypeName;

    /**
     * 補助金額の取得。
     *
     * @return 補助金額
     */
    public Integer getSubsidyAmount() {
        return this.subsidyAmount;
    }

    /**
     * 補助金額を設定。
     *
     * @param subsidyAmount 補助金額
     */
    public void setSubsidyAmount(Integer subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    /**
     * ユーザー区分IDの取得。
     *
     * @return ユーザー区分ID
     */
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    /**
     * ユーザー区分IDを設定。
     *
     * @param userTypeId ユーザー区分ID
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * ユーザー区分名称の取得。
     *
     * @return ユーザー区分名称
     */
    public String getUserTypeName() {
        return this.userTypeName;
    }

    /**
     * ユーザー区分名称を設定。
     *
     * @param userTypeName ユーザー区分名称
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

}
