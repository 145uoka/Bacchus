package com.Bacchus.app.Exception;

/**
 * 不正リクエストパラメータ例外
 * @author ishigouoka_k
 * $Id: IllegalRequestParamException.java 262 2017-06-02 12:31:58Z ishigouoka_k@glue-si.com $
 */
public class IllegalRequestParamException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String name;

    private Object value;

    private Object expected;

    public IllegalRequestParamException(String name, Object value) {
        super("不正なリクエストパラメータを受信しました。 パラメータ名 - [" + name + "], 値  - [" + value + "]");
        this.name = name;
        this.value = value;
    }

    public IllegalRequestParamException(String name, Object expected, Object value) {
        super("不正なリクエストパラメータを受信しました。 パラメータ名 - [" + name + "], 期待値 - [" + expected + "], 実値  - [" + value + "]");
        this.name = name;
        this.value = value;
        this.expected = expected;
    }

    /**
     * nameを取得。
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * valueを取得。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    /**
     * expectedを取得。
     * @return expected
     */
    public Object getExpected() {
        return expected;
    }


}
