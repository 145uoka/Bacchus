package com.Bacchus.app.form.entry;

import java.io.Serializable;
import java.util.List;

/**
 * 参加可否登録用Form。
 *
 * @author ishigouoka_k
 * $Id:$
 */
public class EntryRegisterForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント管理番号 */
    private Integer eventNo;

    /** ユーザーID */
    private Integer userId;

    /** 参加可否Form
 */
    private List<EntryForm> entryFormList;

    /**
     * イベント管理番号の取得。
     *
     * @return イベント管理番号
     */
    public Integer getEventNo() {
        return this.eventNo;
    }

    /**
     * イベント管理番号を設定。
     *
     * @param eventNo イベント管理番号
     */
    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    /**
     * ユーザーIDの取得。
     *
     * @return ユーザーID
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * ユーザーIDを設定。
     *
     * @param userId ユーザーID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 参加可否Form
の取得。
     *
     * @return 参加可否Form

     */
    public List<EntryForm> getEntryFormList() {
        return this.entryFormList;
    }

    /**
     * 参加可否Form
を設定。
     *
     * @param entryFormList 参加可否Form

     */
    public void setEntryFormList(List<EntryForm> entryFormList) {
        this.entryFormList = entryFormList;
    }

}
