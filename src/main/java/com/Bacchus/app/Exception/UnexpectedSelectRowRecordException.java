package com.Bacchus.app.Exception;

/**
 * レコード0件もしくは重複例外
 * @author ishigouoka_k
 * $Id: UnexpectedSelectRowRecordException.java 151 2017-06-29 05:12:29Z ishigouoka_k@glue-si.com $
 */
public class UnexpectedSelectRowRecordException extends Exception {

    private static final long serialVersionUID = 1L;

    private Integer expectedValue;

    private Integer realValue;

    /**
     * レコード0件もしくは重複例外
     *
     * @param expectedValue
     * @param realValue
     */
    public UnexpectedSelectRowRecordException(Integer expectedValue, Integer realValue) {
        super("取得件数が想定外のため、検出されませんでした。 期待取得件数 - [" + expectedValue + "], 実際の取得件数 - [" + realValue + "]");
        this.expectedValue = expectedValue;
        this.realValue = realValue;
    }

    /**
     * 期待取得件数を取得。
     * @return key
     */
    public Integer getExpectedValue() {
        return expectedValue;
    }

    /**
     * 実際の取得件数を取得。
     * @return key
     */
    public Integer getRealValue() {
        return realValue;
    }
}
