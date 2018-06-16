package com.Bacchus.app.components;

public class PostbackDataEventNotify extends AbstractPostBackData {

    public PostbackDataEventNotify() {
        this.setType("eventNotify");
    }

    private Integer eventNo;
    private Integer candidateNo;
    private String entryDiv;

    public Integer getEventNo() {
        return eventNo;
    }
    public void setEventNo(Integer eventNo) {
        this.eventNo = eventNo;
    }
    public Integer getCandidateNo() {
        return candidateNo;
    }
    public void setCandidateNo(Integer candidateNo) {
        this.candidateNo = candidateNo;
    }
    public String getEntryDiv() {
        return entryDiv;
    }
    public void setEntryDiv(String entryDiv) {
        this.entryDiv = entryDiv;
    }


}
