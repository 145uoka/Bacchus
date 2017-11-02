package com.Bacchus.app.Exception;

/**
 * システムプロパティ不正な型例外.
 * @author ishigouoka_k
 * $Id: SystemPropertyIllegalParamTypeException.java 154 2017-05-26 11:28:58Z kanai_y@glue-si.com $
 */
public class SystemPropertyIllegalParamTypeException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String propKey;

    /**
     * keyを取得。
     * @return key
     */
    public String getPropKey() {
        return propKey;
    }

    public SystemPropertyIllegalParamTypeException(String propKey) {
        super("指定したプロパティ値の型が不正です。キー値 - [" + propKey + "]");
    }
}



