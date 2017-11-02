package com.Bacchus.app.Exception;

/**
 *  レコード0件例外。
 * @author ishigouoka_k
 * $Id: NotFoudRecordException.java 151 2017-06-29 05:12:29Z ishigouoka_k@glue-si.com $
 */
public class NotFoudRecordException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * レコード0件例外。
     *
     */
    public NotFoudRecordException() {
        super("レコード取得件数が0件です。");
    }

}
