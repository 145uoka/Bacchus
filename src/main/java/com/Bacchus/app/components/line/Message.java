package com.Bacchus.app.components.line;

import java.io.Serializable;

/**
 * メッセージイベント。
 *
 * @author 
 */
public class Message implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** メッセージID */
    private String id;

    /** メッセージタイプ */
    private String type;

    /** メッセージのテキスト */
    private String text;

    /**
     * メッセージIDの取得。
     *
     * @return メッセージID
     */
    public String getId() {
        return this.id;
    }

    /**
     * メッセージIDを設定。
     *
     * @param id メッセージID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * メッセージタイプの取得。
     *
     * @return メッセージタイプ
     */
    public String getType() {
        return this.type;
    }

    /**
     * メッセージタイプを設定。
     *
     * @param type メッセージタイプ
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * メッセージのテキストの取得。
     *
     * @return メッセージのテキスト
     */
    public String getText() {
        return this.text;
    }

    /**
     * メッセージのテキストを設定。
     *
     * @param text メッセージのテキスト
     */
    public void setText(String text) {
        this.text = text;
    }

}
