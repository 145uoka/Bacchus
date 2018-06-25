package com.Bacchus.linebot.constants;

public class LineApiConstants {

    public static class EventType {
        public final static String USER = "user";
        public final static String GROUP = "group";
        public final static String ROOM = "room";
        public final static String POSTBACK = "postback";
        public final static String MESSAGE = "message";
        public final static String FOLLOW = "follow";
        public final static String UNFOLLOW = "unfollow";
        public final static String JOIN = "join";
        public final static String LEAVE = "leave";
        public final static String BEACON = "beacon";
        public final static String ACCOUNTLINK = "accountLink";
        public final static String PROFILE = "profile";

    }
    public static class MessageType {
        public final static String TEXT = "text";
        public final static String IMAGE = "image";
        public final static String VIDEO = "video";
        public final static String AUDIO = "audio";
        public final static String FILE = "file";
        public final static String STICKER = "sticker";
        public final static String LOCATION = "location";
        public final static String IMAGEMAP = "imagemap";
        public final static String URI = "uri";
        public final static String TEMPLATE = "template";
        public final static String BUTTONS = "buttons";
        public final static String CONFIRM = "confirm";
        public final static String CAROUSEL = "carousel";
    }
}
