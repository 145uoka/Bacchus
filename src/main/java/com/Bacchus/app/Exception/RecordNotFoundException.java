package com.Bacchus.app.Exception;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

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
        super("対象のレコードが検出されませんでした。 テーブル名 - [" + tableName + "], Key - [" + key + "]");
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

    public static String createKeyInfoMessage(Map<String, Object> conditionMap) {
        StringBuffer sb = new StringBuffer();

        for (Map.Entry<String, Object> entry : conditionMap.entrySet()) {
            if (StringUtils.isBlank(sb.toString())) {
                sb.append("{");
            } else {
                sb.append(", ");
            }
            sb.append("[");
            sb.append(entry.getKey());
            sb.append(" = ");
            sb.append(entry.getValue());
            sb.append("]");
        }

        if (StringUtils.isNotBlank(sb.toString())) {
            sb.append("}");
        }

        return sb.toString();
    }
}
