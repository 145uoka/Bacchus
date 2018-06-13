package com.Bacchus.app.components.line;

import java.io.Serializable;

/**
 * Webhookイベントオブジェクト。
 *
 * @author 
 */
public class Event implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベントのタイプを表す識別子 */
    private String type;

    /** イベントの発生時刻（ミリ秒） */
    private Long timestamp;

    /** イベントの送信元情報を含むユーザー、グループ、またはトークルームオブジェクト */
    private Source source;

    /** メッセージイベント */
    private Message message;

    /** イベントへの応答に使用するトークン */
    private String replyToken;

    /** ポストバックイベント */
    private Postback postback;

    /**
     * イベントのタイプを表す識別子の取得。
     *
     * @return イベントのタイプを表す識別子
     */
    public String getType() {
        return this.type;
    }

    /**
     * イベントのタイプを表す識別子を設定。
     *
     * @param type イベントのタイプを表す識別子
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * イベントの発生時刻（ミリ秒）の取得。
     *
     * @return イベントの発生時刻（ミリ秒）
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * イベントの発生時刻（ミリ秒）を設定。
     *
     * @param timestamp イベントの発生時刻（ミリ秒）
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * イベントの送信元情報を含むユーザー、グループ、またはトークルームオブジェクトの取得。
     *
     * @return イベントの送信元情報を含むユーザー、グループ、またはトークルームオブジェクト
     */
    public Source getSource() {
        return this.source;
    }

    /**
     * イベントの送信元情報を含むユーザー、グループ、またはトークルームオブジェクトを設定。
     *
     * @param source イベントの送信元情報を含むユーザー、グループ、またはトークルームオブジェクト
     */
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * メッセージイベントの取得。
     *
     * @return メッセージイベント
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * メッセージイベントを設定。
     *
     * @param message メッセージイベント
     */
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * イベントへの応答に使用するトークンの取得。
     *
     * @return イベントへの応答に使用するトークン
     */
    public String getReplyToken() {
        return this.replyToken;
    }

    /**
     * イベントへの応答に使用するトークンを設定。
     *
     * @param replyToken イベントへの応答に使用するトークン
     */
    public void setReplyToken(String replyToken) {
        this.replyToken = replyToken;
    }

    /**
     * ポストバックイベントの取得。
     *
     * @return ポストバックイベント
     */
    public Postback getPostback() {
        return this.postback;
    }

    /**
     * ポストバックイベントを設定。
     *
     * @param postback ポストバックイベント
     */
    public void setPostback(Postback postback) {
        this.postback = postback;
    }

}
