package com.Bacchus.app.form.event;

import java.io.Serializable;

/**
 * イベント通知用Form。
 *
 */
public class NotifyExecForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント管理番号 */
    private Integer eventNo;

    /** 選択チェックボックス */
    private Integer[] userIds;

    public Integer getEventNo() {
        return eventNo;
    }

    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }

    public Integer[] getUserIds() {
        return userIds;
    }

    public void setUserIds(Integer[] userIds) {
        this.userIds = userIds;
    }

}
