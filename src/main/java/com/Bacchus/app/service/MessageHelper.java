package com.Bacchus.app.service;

import java.util.Locale;

import org.springframework.context.MessageSource;

import com.Bacchus.webbase.common.result.Message;

public class MessageHelper {

    public static String getErrorMessage(MessageSource messageSource, String key, Object[] params) {
        return getMessage(messageSource, Message.Level.ERROR, key, params);
    }

    public static String getWarnMessage(MessageSource messageSource, String key, Object[] params) {
        return getMessage(messageSource, Message.Level.WARN, key, params);
    }

    public static String getInfoMessage(MessageSource messageSource, String key, Object[] params) {
        return getMessage(messageSource, Message.Level.INFO, key, params);
    }

    private static String getMessage(MessageSource messageSource, Message.Level level, String key, Object[] params) {
        Message message = new Message(level, key, params);
        return messageSource.getMessage(message.getKey(), message.getParameters(), Locale.getDefault());
    }

}
