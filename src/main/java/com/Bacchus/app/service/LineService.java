package com.Bacchus.app.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.template.ConfirmTemplate;
import com.linecorp.bot.model.response.BotApiResponse;

@Service
public class LineService {


    public void pushMessage() {

        LineMessagingClient lineMessagingClient = new LineMessagingClientBuilder(
                "0e994f18b1e437b590bc5d25addcf1f5").build();

        try {
            BotApiResponse response = lineMessagingClient
                    .pushMessage(
                            new PushMessage(
                                    "Ub0b37e268b2143fb40b997ca6a5b0820",
                                    new TemplateMessage(
                                            "Tomorrow is the garbage day for burnables！",
                                            new ConfirmTemplate("Did you take out the garbage?",
                                                    new MessageAction("yes", "yes"),
                                                    new MessageAction("no", "no")
                                                    )
                                            )
                                    )
                            )
                    .get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
