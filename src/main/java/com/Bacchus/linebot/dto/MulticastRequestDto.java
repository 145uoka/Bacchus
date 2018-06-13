package com.Bacchus.linebot.dto;

import java.util.List;

import com.linecorp.bot.model.message.Message;

public class MulticastRequestDto {

    List<String> to;
    List<? extends Message> messages;
    public List<String> getTo() {
        return to;
    }
    public void setTo(List<String> to) {
        this.to = to;
    }
    public List<? extends Message> getMessages() {
        return messages;
    }
    public void setMessages(List<? extends Message> messages) {
        this.messages = messages;
    }


}
