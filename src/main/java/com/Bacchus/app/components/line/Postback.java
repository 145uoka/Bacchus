package com.Bacchus.app.components.line;

import java.io.Serializable;

/**
 * ポストバックイベント。
 *
 * @author 
 */
public class Postback implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ポストバックデータ */
    private String data;

    /**
     * ポストバックデータの取得。
     *
     * @return ポストバックデータ
     */
    public String getData() {
        return this.data;
    }

    /**
     * ポストバックデータを設定。
     *
     * @param data ポストバックデータ
     */
    public void setData(String data) {
        this.data = data;
    }

}
