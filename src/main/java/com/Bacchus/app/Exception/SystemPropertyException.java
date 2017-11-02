package com.Bacchus.app.Exception;

/**
 * システムプロパティ取得例外.
 * @author ishigouoka_k
 * $Id: SystemPropertyException.java 207 2017-05-31 02:48:00Z kamimura_k@glue-si.com $
 */
public class SystemPropertyException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String propKey;

    public SystemPropertyException(String propKey) {
        super("指定したプロパティ値が取得できませんでした。キー値 - [" + propKey + "]");
    }

    /**
     * keyを取得。
     * @return key
     */
    public String getPropKey() {
        return propKey;
    }

}
