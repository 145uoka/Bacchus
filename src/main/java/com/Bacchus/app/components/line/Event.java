package com.Bacchus.app.components.line;

import java.time.Instant;

import javax.xml.transform.stream.StreamSource;


public class Event {
    private String type;
    private String replyToken;
    private Instant timestamp;

    private StreamSource source;
    private Message message;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getReplyToken() {
        return replyToken;
    }
    public void setReplyToken(String replyToken) {
        this.replyToken = replyToken;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    public StreamSource getSource() {
        return source;
    }
    public void setSource(StreamSource source) {
        this.source = source;
    }
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        this.message = message;
    }



}
