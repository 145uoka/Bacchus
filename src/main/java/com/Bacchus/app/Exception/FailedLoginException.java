package com.Bacchus.app.Exception;

/**
 * 不正リクエストパラメータ例外
 * @author ishigouoka_k
 * $Id: FailedLoginException.java 130 2017-06-27 09:22:10Z ishigouoka_k@glue-si.com $
 */
public class FailedLoginException extends Exception {

    private static final long serialVersionUID = 1L;

    public FailedLoginException(String expectAuthToken, String actualAuthToken) {
        super("不正な認証トークンのログイン認証結果が返却されました。期待値 - [" + expectAuthToken + "], 返却値 - [" + actualAuthToken + "]");
    }

    public FailedLoginException(String errorCode) {
        super("ログイン認証に失敗しました。エラーコード [" + errorCode + "]");
    }

}
