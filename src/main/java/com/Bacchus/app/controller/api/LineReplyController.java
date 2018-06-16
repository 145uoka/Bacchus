package com.Bacchus.app.controller.api;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.app.components.line.Events;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.api.LinePostbackService;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linecorp.bot.client.LineMessagingClient;

/**
 * 呼び覚ましのコントローラー．
 *
 */
@BeforeLogin
@RestController
@RequestMapping(value = "/api/line")
public class LineReplyController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LineService lineService;

    /** システムプロパティ_M Bhv */
    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    LinePostbackService linePostbackService;

    @RequestMapping(value = "/reply", method = RequestMethod.POST)
    @ResponseBody
    public void reply(@RequestBody String events) throws RecordNotFoundException, InterruptedException, ExecutionException {

        logger.info("[CALL] : reply!!");
        logger.info("[events] : " + events);

        ObjectMapper mapper = new ObjectMapper();
        Events eventList = null;
        try {
            eventList = mapper.readValue(events, Events.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LineMessagingClient lineMessagingClient = lineService.buildLineMessagingClient();

        if (eventList != null && !CollectionUtils.isEmpty(eventList.getEvents())) {
            for (Event event : eventList.getEvents()) {
                String type = event.getType();

                switch (type) {
                case "postback":
                    linePostbackService.postback(event);
                    break;

                case "message":
//                    String receivedMessage = event.getMessage().getText();
//                    String replyToken = event.getReplyToken();
//
//                    logger.debug("reply_token : " + replyToken);
//                    logger.debug("receivedMessage : " + receivedMessage);
//
//                    ReplyMessage replyMessage = new ReplyMessage(replyToken, new TextMessage(receivedMessage));
//                    BotApiResponse response = lineMessagingClient.replyMessage(replyMessage).get();
//                    logger.info("Sent messages: {}", response);
                    break;
                }
            }
        }

        return;
    }
}
