package com.Bacchus.linebot.dto;

import java.util.List;

public class MulticastRequestDto<T> {

    List<String> to;
    List<T> messages;
    public List<String> getTo() {
        return to;
    }
    public void setTo(List<String> to) {
        this.to = to;
    }
    public List<T> getMessages() {
        return messages;
    }
    public void setMessages(List<T> messages) {
        this.messages = messages;
    }


}
