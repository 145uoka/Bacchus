package com.Bacchus.app.service.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.linebot.dto.MulticastRequestDto;
import com.Bacchus.linebot.dto.ReplyRequestDto;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Permissions;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.linecorp.bot.model.message.TextMessage;

@Service
@Transactional(rollbackFor = Exception.class)
public class LineFollowHandleService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    LineService lineService;

    public void handleFollow(Event event) throws RecordNotFoundException, JsonProcessingException, IOException {

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        LineBotClient lineBotClient = new LineBotClient(token);

        UserT userT = lineService.addAccount(event.getSource().getUserId(),
                event.getType(), lineBotClient);

        replyMessage(event, lineBotClient);
        notifyFollow(userT, lineBotClient);
    }

    private void replyMessage(Event event, LineBotClient lineBotClient) {

        String msg = super.getMsg("follow", null);
        TextMessage textMessage = new TextMessage(msg);

        ReplyRequestDto replyRequestDto = new ReplyRequestDto();
        replyRequestDto.setReplyToken(event.getReplyToken());
        replyRequestDto.setMessages(Arrays.asList(textMessage));

        lineBotClient.reply(replyRequestDto);
    }

    private void notifyFollow(UserT userT, LineBotClient lineBotClient) {

        ListResultBean<UserT> userTList = userTBhv.selectList(cb->{
            cb.query().setDeleteFlag_Equal(Flag.OFF.isBoolValue());
            cb.query().setAuthLevel_Equal(Permissions.ADMIN.getAuthType());
            cb.query().setLineFlg_Equal(Flag.ON.getIntegerValue());
            cb.query().setLineId_IsNotNull();
        });

        List<String> lineIdList = new ArrayList<String>();

        for (UserT notifyUserT : userTList) {
            lineIdList.add(notifyUserT.getLineId());
        }

        if (CollectionUtils.isEmpty(lineIdList)) {
            return;
        }

        String msg = super.getMsg("follow.notify", new Object[]{userT.getLineUserName()});
        TextMessage textMessage = new TextMessage(msg);
        List<TextMessage> textMessageList = new ArrayList<TextMessage>();
        textMessageList.add(textMessage);

        MulticastRequestDto multicastRequestDto = new MulticastRequestDto();
        multicastRequestDto.setTo(lineIdList);
        multicastRequestDto.setMessages(textMessageList);

        lineBotClient.multicast(multicastRequestDto);
    }
}
