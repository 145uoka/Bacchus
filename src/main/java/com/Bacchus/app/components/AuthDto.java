package com.Bacchus.app.components;

import java.io.Serializable;

/**
 * 権限管理DTO。
 *
 * @author ishigouoka_k
 */
public class AuthDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 権限レベル */
    private Integer authLevel;

    /** 権限名称 */
    private String authName;

    /**
     * 権限レベルの取得。
     *
     * @return 権限レベル
     */
    public Integer getAuthLevel() {
        return this.authLevel;
    }

    /**
     * 権限レベルを設定。
     *
     * @param authLevel 権限レベル
     */
    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }

    /**
     * 権限名称の取得。
     *
     * @return 権限名称
     */
    public String getAuthName() {
        return this.authName;
    }

    /**
     * 権限名称を設定。
     *
     * @param authName 権限名称
     */
    public void setAuthName(String authName) {
        this.authName = authName;
    }

}
