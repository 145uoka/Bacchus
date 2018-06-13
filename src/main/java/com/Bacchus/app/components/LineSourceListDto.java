package com.Bacchus.app.components;

import java.util.List;
import java.util.Map;

public class LineSourceListDto {

    List<String> sendUserLineId;
    Map<Integer, String> sendUserMap;
    Map<Integer, String> notSendUserMap;
    List<Integer> unknownUserIds;

    public List<String> getSendUserLineId() {
        return sendUserLineId;
    }
    public void setSendUserLineId(List<String> sendUserLineId) {
        this.sendUserLineId = sendUserLineId;
    }
    public Map<Integer, String> getSendUserMap() {
        return sendUserMap;
    }
    public void setSendUserMap(Map<Integer, String> sendUserMap) {
        this.sendUserMap = sendUserMap;
    }
    public Map<Integer, String> getNotSendUserMap() {
        return notSendUserMap;
    }
    public void setNotSendUserMap(Map<Integer, String> notSendUserMap) {
        this.notSendUserMap = notSendUserMap;
    }
    public List<Integer> getUnknownUserIds() {
        return unknownUserIds;
    }
    public void setUnknownUserIds(List<Integer> unknownUserIds) {
        this.unknownUserIds = unknownUserIds;
    }

}
