package com.Bacchus.linebot.dto;

import java.util.List;

import com.linecorp.bot.model.message.Message;

public class ReplyRequestDto {

    private String replyToken;
    private List<? extends Message> messages;
    public String getReplyToken() {
        return replyToken;
    }
    public void setReplyToken(String replyToken) {
        this.replyToken = replyToken;
    }
    public List<? extends Message> getMessages() {
        return messages;
    }
    public void setMessages(List<? extends Message> messages) {
        this.messages = messages;
    }

}
