package com.Bacchus.app.service;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * ログ出力サービス。
 *
 * @author ishigouoka_k
 * $Id: LoggerService.java 239 2017-06-01 06:41:46Z ishigouoka_k@glue-si.com $
 */
@Service
public class LoggerService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected MessageSource messageSource;

    /**
     * ログ出力。
     *
     * メッセージIDの先頭文字を基に、ログレベルを設定します。<br>
     * <li>I・・・INFO
     * <li>E・・・ERROR
     * <li>W・・・WARN
     * <li>その他・・・DEBUG
     *
     * @param msgId メッセージID
     * @param args バインドパラメータ
     */
    public void outLog(String msgId, Object[] args) {
        String message = messageSource.getMessage(msgId, args, Locale.getDefault());

        if (msgId.startsWith("I")) {
            logger.info(message);
        } else if (msgId.startsWith("W")) {
            logger.warn(message);
        } else if (msgId.startsWith("E")) {
            logger.error(message);
        } else {
            logger.debug(message);
        }
    }
}
