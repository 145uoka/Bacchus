package com.Bacchus.app.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

@Service
public class LineService {


    public void pushMessage(String lineId) {

        LineMessagingClient lineMessagingClient = new LineMessagingClientBuilder(
                "cEbVssZVjzR01EXKfo/UWv85D5J9Q/TdlhNI77k3SVQ9ynsushSnIEH/PO4kgNFpNJw5uF+Ypf/8mD5RTFwNNLNlaMlWngeEr4P+gh2vR8/Q3ZICuvgDEQPydROZo3ipd1tCrz2DNOV2U8yLc1qOzAdB04t89/1O/w1cDnyilFU=").build();

        try {
            BotApiResponse response = lineMessagingClient.pushMessage(
                    new PushMessage(lineId, new TextMessage("テストメッセージ"))).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
