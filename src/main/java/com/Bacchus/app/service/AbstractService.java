/**
 *
 */
package com.Bacchus.app.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import com.Bacchus.webbase.components.UserInfo;

/**
 * サービスクラスの抽象クラス。
 *
 * @author ishigouoka_k
 * $Id: AbstractService.java 239 2017-06-01 06:41:46Z ishigouoka_k@glue-si.com $
 */
@Service
public abstract class AbstractService {

    @Autowired
    protected UserInfo userInfo;

    private MessageSourceAccessor msgAcsr;

    /**
     * DIされたメッセージソースをAccessorにラップする.
     *
     * @param messageSource messages_ja.propertiesの定義内容
     */
    @Autowired
    public void setMessageSourceAccessor(MessageSource messageSource) {
        this.msgAcsr = new MessageSourceAccessor(messageSource, Locale.getDefault());
    }

    /**
     * IDからメッセージを取得（埋め込み文字付）.
     *
     * @param msgId メッセージID
     * @param parameters 埋め込み文字（複数）
     */
    protected String getMsg(String msgId, Object... parameters) {
        // メッセージ変換
        return msgAcsr.getMessage(msgId, parameters);
    }
}
