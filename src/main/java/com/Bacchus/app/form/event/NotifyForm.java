package com.Bacchus.app.form.event;

import java.io.Serializable;

/**
 * イベント通知用Form。
 *
 */
public class NotifyForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント管理番号 */
    private Integer eventNo;

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
}
