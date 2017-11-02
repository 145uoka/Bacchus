package com.Bacchus.app.Exception;

/**
 * レコード0件もしくは重複例外
 * @author kanai_y
 * $Id:$
 */
public class AbnormalRecordsDetection extends Exception {

    private static final long serialVersionUID = 1L;

    private Integer expectedValue;

    private Integer realValue;

    /**
     * レコード0件もしくは重複例外
     *
     * @param expectedValue
     * @param realValue
     */
    public AbnormalRecordsDetection(Integer expectedValue, Integer realValue) {
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
