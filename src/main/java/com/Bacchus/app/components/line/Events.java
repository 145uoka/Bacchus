package com.Bacchus.app.components.line;

import java.io.Serializable;
import java.util.List;

/**
 * Webhookイベントオブジェクト。
 *
 * @author
 */
public class Events implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** Webhookイベントオブジェクト
 */
    private  List<Event> events;

    /**
     * Webhookイベントオブジェクトの取得。
     *
     * @return Webhookイベントオブジェクト

     */
    public  List<Event> getEvents() {
        return this.events;
    }

    /**
     * Webhookイベントオブジェクトを設定。
     *
     * @param events Webhookイベントオブジェクト

     */
    public void setEvents( List<Event> events) {
        this.events = events;
    }

}
