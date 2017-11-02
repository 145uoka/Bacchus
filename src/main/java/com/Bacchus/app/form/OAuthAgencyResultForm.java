package com.Bacchus.app.form;

import java.io.Serializable;

/**
 * GoogleOAuth代理認証返却Form。
 *
 * @author ishigouoka_k
 * $Id: OAuthAgencyResultForm.java 69 2017-06-13 09:29:15Z ishigouoka_k@glue-si.com $
 */
public class OAuthAgencyResultForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 認証結果 */
    private Integer resultCode;

    /** GoogleEmail */
    private String email;

    /** 社員番号 */
    private String empNo;

    /** 社員名 */
    private String empName;

    /** 権限レベル */
    private Integer authLevel;

    /** 権限名称 */
    private String authName;

    /** 権限略称 */
    private String authAbbreviation;

    /** エラーコード */
    private String errorCode;

    /** 認証トークン */
    private String authToken;

    /**
     * 認証結果の取得。
     *
     * @return 認証結果
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * 認証結果を設定。
     *
     * @param resultCode 認証結果
     */
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * GoogleEmailの取得。
     *
     * @return GoogleEmail
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * GoogleEmailを設定。
     *
     * @param email GoogleEmail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 社員番号の取得。
     *
     * @return 社員番号
     */
    public String getEmpNo() {
        return this.empNo;
    }

    /**
     * 社員番号を設定。
     *
     * @param empNo 社員番号
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    /**
     * 社員名の取得。
     *
     * @return 社員名
     */
    public String getEmpName() {
        return this.empName;
    }

    /**
     * 社員名を設定。
     *
     * @param empName 社員名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

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

    /**
     * 権限略称の取得。
     *
     * @return 権限略称
     */
    public String getAuthAbbreviation() {
        return this.authAbbreviation;
    }

    /**
     * 権限略称を設定。
     *
     * @param authAbbreviation 権限略称
     */
    public void setAuthAbbreviation(String authAbbreviation) {
        this.authAbbreviation = authAbbreviation;
    }

    /**
     * エラーコードの取得。
     *
     * @return エラーコード
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * エラーコードを設定。
     *
     * @param errorCode エラーコード
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 認証トークンの取得。
     *
     * @return 認証トークン
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * 認証トークンを設定。
     *
     * @param authToken 認証トークン
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

}
