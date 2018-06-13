package com.Bacchus.app.controller.api;

import java.io.IOException;

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
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.message.TextMessage;

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
    public void reply(@RequestBody String events) throws RecordNotFoundException {

        logger.info("[CALL] : reply!!");
        logger.info("[events] : " + events);

        ObjectMapper mapper = new ObjectMapper();
        Events eventList = null;
        try {
            eventList = mapper.readValue(events, Events.class);
            System.out.println("eventList_size : " + eventList.getEvents().size());
            System.out.println("reply_token : " + eventList.getEvents().get(0).getReplyToken());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String accessToken =
                systemPropertyService.getSystemPropertyValue(SystemPropertyKeyConstants.MESSAGING_API_ACCESS_TOKEN);

        LineMessagingClient lineMessagingClient = new LineMessagingClientBuilder(accessToken).build();

        if (eventList != null && CollectionUtils.isEmpty(eventList.getEvents())) {
            for (Event event : eventList.getEvents()) {
                String receivedMessage = event.getMessage().getText();
                String replyToken = event.getReplyToken();

                ReplyMessage replyMessage = new ReplyMessage(replyToken, new TextMessage(receivedMessage));
                lineMessagingClient.replyMessage(replyMessage);
            }
        }

        return;
    }
}
