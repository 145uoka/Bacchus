package com.Bacchus.app.Exception;

/**
 * レコード未検出例外
 * @author ishigouoka_k
 * $Id: RecordNotFoundException.java 43 2017-06-08 07:17:03Z ishigouoka_k@glue-si.com $
 */
public class RecordNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    private String tableName;

    private Object key;

    public RecordNotFoundException(String tableName, Object key) {
        super("対象のレコードが検出されませんでした。 テーブル名 - [" + tableName + "], PK - [" + key + "]");
        this.tableName = tableName;
        this.key = key;
    }

    /**
     * tableNameを取得。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * keyを取得。
     * @return key
     */
    public Object getKey() {
        return key;
    }
}
