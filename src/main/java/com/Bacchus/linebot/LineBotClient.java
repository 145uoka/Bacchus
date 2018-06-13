package com.Bacchus.linebot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.Bacchus.linebot.dto.MulticastRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class LineBotClient {

    private static final String CONTENT_TYPE = "application/json";
    private String authorization;

    public LineBotClient(String channnelAccessToken) {
        this.authorization = "Bearer " + channnelAccessToken;
    }

    public <T> void multicast(MulticastRequestDto multicastRequestDto) {
        HttpPost httpPost = new HttpPost("https://api.line.me/v2/bot/message/multicast");
        httpPost.setHeader("Content-Type", CONTENT_TYPE);
        httpPost.setHeader("Authorization", this.authorization);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String body = null;
        try {
            body = mapper.writeValueAsString(multicastRequestDto);
            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringEntity params = new StringEntity(body, StandardCharsets.UTF_8);
        httpPost.setEntity(params);
        try (CloseableHttpClient client = HttpClients.createDefault();
                CloseableHttpResponse resp = client.execute(httpPost);
                BufferedReader br = new BufferedReader(new InputStreamReader(resp.getEntity().getContent(), StandardCharsets.UTF_8)))
        {
            int statusCode = resp.getStatusLine().getStatusCode();
            switch (statusCode) {
            case 200:
                // ↓これは空のJSON({})が返るはず
                br.readLine();
                break;
            default:
            }
        } catch (final ClientProtocolException e) {
        } catch (final IOException e) {
        }

    }
}
