package com.Bacchus.app.controller.api;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bacchus.dbflute.exbhv.SystemPropertyMBhv;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

/**
 * 呼び覚ましのコントローラー．
 *
 */
@BeforeLogin
@RestController
@RequestMapping(value = "/api/line")
public class LineReplyController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /** システムプロパティ_M Bhv */
    @Autowired
    SystemPropertyMBhv systemPropertyMBhv;

    @Autowired
    LineMessagingClient lineMessagingClient;

    @RequestMapping(value = "/reply", method = RequestMethod.POST)
    @ResponseBody
    public CompletableFuture<BotApiResponse> reply(MessageEvent<TextMessageContent> event) {

        logger.info("[CALL] : reply!!");

        String receivedMessage = event.getMessage().getText();
        String replyToken = event.getReplyToken();

        ReplyMessage replyMessage = new ReplyMessage(replyToken, new TextMessage(receivedMessage));

        return lineMessagingClient.replyMessage(replyMessage);
    }
}
