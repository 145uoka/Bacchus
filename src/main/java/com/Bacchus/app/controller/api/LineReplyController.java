package com.Bacchus.app.controller.api;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.linecorp.bot.model.ReplyMessage;
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
    SystemPropertyService systemPropertyService;

    @RequestMapping(value = "/reply", method = RequestMethod.POST)
    @ResponseBody
    public CompletableFuture<BotApiResponse> reply(String event) throws RecordNotFoundException {

        logger.info("[CALL] : reply!!");
        logger.info("event : " + event);

        String accessToken =
                systemPropertyService.getSystemPropertyValue(SystemPropertyKeyConstants.MESSAGING_API_ACCESS_TOKEN);

        LineMessagingClient lineMessagingClient = new LineMessagingClientBuilder(accessToken).build();

        String receivedMessage = event;
        String replyToken = event;

        ReplyMessage replyMessage = new ReplyMessage(replyToken, new TextMessage(receivedMessage));

        return lineMessagingClient.replyMessage(replyMessage);
    }
}
