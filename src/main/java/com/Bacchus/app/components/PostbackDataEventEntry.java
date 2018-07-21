package com.Bacchus.app.components;

public class PostbackDataEventEntry extends AbstractPostBackData {

    public PostbackDataEventEntry() {
        this.setType("eventEntry");
    }

    private Integer eventNo;

    public Integer getEventNo() {
        return eventNo;
    }
    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }
}
