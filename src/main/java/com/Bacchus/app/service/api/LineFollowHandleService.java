package com.Bacchus.app.service.api;

import java.io.IOException;
import java.util.Arrays;

import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.linebot.dto.ReplyRequestDto;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Permissions;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.profile.UserProfileResponse;

@Service
@Transactional(rollbackFor = Exception.class)
public class LineFollowHandleService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    SystemPropertyService systemPropertyService;

    public void handleFollow(Event event) throws RecordNotFoundException, JsonProcessingException, IOException {

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        LineBotClient lineBotClient = new LineBotClient(token);

        addAccount(event, lineBotClient);

        replyMessage(event, lineBotClient);
    }

    private void addAccount(Event event, LineBotClient lineBotClient) throws JsonProcessingException, IOException {

        OptionalEntity<UserT> optUserT = userTBhv.selectEntity(cb->{
           cb.query().setLineId_Equal(event.getSource().getUserId());
        });

        UserT userT = new UserT();

        if (optUserT.isPresent()) {
            userT = optUserT.get();
            userT.setDeleteFlag(Flag.OFF.isBoolValue());
        } else {
            userT.setUserTypeId(1);
            userT.setAuthLevel(Permissions.GENERAL.getAuthType());
            userT.setLineFlg(Flag.ON.getIntegerValue().intValue());
            userT.setLineId(event.getSource().getUserId());
            userT.setRegisterUser("system");
        }

        UserProfileResponse userProfileResponse =
                lineBotClient.profile(userT.getLineId(), event.getType());

        userT.setLineUserName(userProfileResponse.getDisplayName());

        userTBhv.insertOrUpdate(userT);
    }

    private void replyMessage(Event event, LineBotClient lineBotClient) {

        TextMessage textMessage = new TextMessage("友達追加ありがとうございます！");

        ReplyRequestDto replyRequestDto = new ReplyRequestDto();
        replyRequestDto.setReplyToken(event.getReplyToken());
        replyRequestDto.setMessages(Arrays.asList(textMessage));

        lineBotClient.reply(replyRequestDto);
    }
}
