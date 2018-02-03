package com.Bacchus.app.components;

import java.io.Serializable;

/**
 * イベント区分DTO。
 *
 */
public class EventTypeDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** イベント区分ID */
    private Integer eventTypeId;

    /** イベント区分名称 */
    private String eventTypeName;

    /** 表示順 */
    private Integer orderNum;

    /**
     * イベント区分IDの取得。
     *
     * @return イベント区分ID
     */
    public Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * イベント区分IDを設定。
     *
     * @param eventTypeId イベント区分ID
     */
    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * イベント区分名称の取得。
     *
     * @return イベント区分名称
     */
    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * イベント区分名称を設定。
     *
     * @param eventTypeName イベント区分名称
     */
    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * 表示順の取得。
     *
     * @return 表示順
     */
    public Integer getOrderNum() {
        return this.orderNum;
    }

    /**
     * 表示順を設定。
     *
     * @param orderNum 表示順
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

}
