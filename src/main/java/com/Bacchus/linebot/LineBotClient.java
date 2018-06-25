package com.Bacchus.linebot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Bacchus.linebot.constants.LineApiConstants;
import com.Bacchus.linebot.dto.MulticastRequestDto;
import com.Bacchus.linebot.dto.ReplyRequestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.linecorp.bot.model.profile.UserProfileResponse;

public class LineBotClient {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String CONTENT_TYPE = "application/json";
    private String channnelAccessToken;
    private String authorization;

    public LineBotClient(String channnelAccessToken) {
        this.channnelAccessToken = channnelAccessToken;
        this.authorization = "Bearer " + this.channnelAccessToken;
    }

    public UserProfileResponse profile(String userId, String type) throws JsonProcessingException, IOException {

        UserProfileResponse userProfileResponse =
                (UserProfileResponse)getRequest("https://api.line.me/v2/bot/profile/" + userId, type);

        return userProfileResponse;
    }

    public <T> void multicast(MulticastRequestDto multicastRequestDto) {
        String body = encodeBody(multicastRequestDto);
        postRequest("https://api.line.me/v2/bot/message/multicast", body);
    }

    public <T> void reply(ReplyRequestDto replyRequestDto) {
        String body = encodeBody(replyRequestDto);
        postRequest("https://api.line.me/v2/bot/message/reply", body);
    }

    private String encodeBody(Object requestDtof) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String body = null;
        try {
            body = mapper.writeValueAsString(requestDtof);
            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return body;
    }

    private void postRequest(String url, String body) {

        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", CONTENT_TYPE);
        httpPost.setHeader("Authorization", this.authorization);

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

    private Object getRequest(String url, String type) throws JsonProcessingException, IOException {

        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Authorization", this.authorization);

        StringBuilder builder = new StringBuilder();

        try (CloseableHttpClient client = HttpClients.createDefault();
                CloseableHttpResponse resp = client.execute(httpGet);
                BufferedReader br = new BufferedReader(new InputStreamReader(resp.getEntity().getContent(), StandardCharsets.UTF_8)))
        {
            int statusCode = resp.getStatusLine().getStatusCode();
            switch (statusCode) {
            case 200:
                String line;
                while ((line = br.readLine()) != null) {
                    builder.append(line);
                }
                break;
            default:
            }
        } catch (final ClientProtocolException e) {
        } catch (final IOException e) {
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(builder.toString());

        logger.debug(builder.toString());

        switch (type) {

        case LineApiConstants.EventType.FOLLOW:
            String displayName = null;
            String userId = null;
            String pictureUrl = null;
            String statusMessage = null;

            if (node.get("displayName") != null) {
                displayName = node.get("displayName").asText();
            }
            if (node.get("userId") != null) {
                userId = node.get("userId").asText();
            }
            if (node.get("pictureUrl") != null) {
                pictureUrl = node.get("pictureUrl").asText();
            }
            if (node.get("statusMessage") != null) {
                statusMessage = node.get("statusMessage").asText();
            }

            UserProfileResponse userProfileResponse = new UserProfileResponse(
                    displayName, userId, pictureUrl, statusMessage);

            return userProfileResponse;
        }

        return null;

    }
}
