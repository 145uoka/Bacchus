package com.Bacchus.app.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.LineSourceListDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.LineApiType;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Permissions;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.client.LineMessagingClientBuilder;
import com.linecorp.bot.model.Multicast;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.profile.UserProfileResponse;
import com.linecorp.bot.model.response.BotApiResponse;


/**
 * LineAPIに関するサービスクラス。
 */
@Service
public class LineService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoggerService loggerService;

    @Autowired
    UserService userService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    CommonService commonService;

    @Autowired
    UserTBhv userTBhv;

    /**
     * LineAPI:pushメッセージを実行。
     *
     * @param userId 送信対象のユーザID
     * @param message 送信メッセージ
     * @throws RecordNotFoundException
     */
    public void pushMessage(Integer userId, String message) throws RecordNotFoundException {

        OptionalEntity<UserT> userEntity = userTBhv.selectByPK(userId);

        if (userEntity != null && userEntity.isPresent()) {

            UserT userT = userEntity.get();

            Map<Integer, String> sendUserMap = new TreeMap<Integer, String>();


            if (userT.getLineFlg().intValue() == Flag.ON.getIntegerValue().intValue()
                    && StringUtils.isNotEmpty(userT.getLineId())) {

                // LINEユーザ
                sendUserMap.put(userT.getUserId(),
                        userT.getLastName() + StringUtils.SPACE
                        + userT.getFirstName() + "(" + userT.getLineUserName() + ")");

                try {
                    if(!commonService.isDevelopMode()) {
                        // 非開発モード
                        LineMessagingClient lineMessagingClient = buildLineMessagingClient();

                        // PUSH通信
                        BotApiResponse response = lineMessagingClient.pushMessage(
                                new PushMessage(userT.getLineId(), new TextMessage(message))).get();

                        // ログ出力
                        loggerService.outLog(LogMessageKeyConstants.Info.I_05_0002,
                                new Object[]{LineApiType.PUSH, response.getMessage(), response.getDetails().toString()});
                    }

                    loggerService.outLog(LogMessageKeyConstants.Info.I_05_0001,
                            new Object[]{LineApiType.PUSH, sendUserMap, message});

                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } else {
                // 非LINEユーザ
                sendUserMap.put(userT.getUserId(),
                        userT.getLastName() + StringUtils.SPACE + userT.getFirstName());

                // ログ出力
                loggerService.outLog(LogMessageKeyConstants.Warn.W_05_0001,
                        new Object[]{LineApiType.PUSH, sendUserMap, message});
            }
        }
    }

    /**
     * LineAPI:pushメッセージを複数人分実行。
     *
     * @param userIds 送信対象のユーザIDのリスト
     * @param message 送信メッセージ
     * @throws RecordNotFoundException
     */
    public void pushMessage(LineSourceListDto lineSourceListDto, String message)
            throws RecordNotFoundException {

        if (CollectionUtils.isNotEmpty(lineSourceListDto.getSendUserLineId())) {
            // LINEユーザが存在
            try {
                if(!commonService.isDevelopMode()) {
                    // 非開発モード
                    LineMessagingClient lineMessagingClient = buildLineMessagingClient();

                    // PUSH通信
                    BotApiResponse response = lineMessagingClient.multicast(new Multicast(
                            new HashSet<String>(lineSourceListDto.getSendUserLineId()), new TextMessage(message))).get();

                    loggerService.outLog(LogMessageKeyConstants.Info.I_05_0002,
                            new Object[]{LineApiType.MULTICAST, response.getMessage(), response.getDetails().toString()});
                }
                loggerService.outLog(LogMessageKeyConstants.Info.I_05_0001,
                        new Object[]{LineApiType.MULTICAST, lineSourceListDto.getSendUserMap(), message});

            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public LineSourceListDto createLineSourceListDto(List<Integer> userIds) {

        LineSourceListDto lineSourceListDto = new LineSourceListDto();

        // 送信対象のユーザ取得
        List<UserDto> userList = userService.selectListByIds(userIds);

        Map<Integer, String> sendUserMap = new TreeMap<Integer, String>();
        List<String> sendUserLineId = new ArrayList<String>(sendUserMap.values());
        Map<Integer, String> notSendUserMap = new TreeMap<Integer, String>();

        // 存在しないユーザID
        List<Integer> unknownUserIds = new ArrayList<Integer>(userIds);

        for (UserDto userDto : userList) {

            // 存在しないユーザIDから、存在するユーザIDをremove
            unknownUserIds.remove(userDto.getUserId());

            if (userDto.getLineFlg().intValue() == Flag.ON.getIntegerValue().intValue()
                    && StringUtils.isNotEmpty(userDto.getLineId())) {

                // LINEユーザ
                sendUserLineId.add(userDto.getLineId());
                sendUserMap.put(userDto.getUserId(),
                        userDto.getLastName() + StringUtils.SPACE
                        + userDto.getFirstName() + "(" + userDto.getLineUserName() + ")");
            } else {
                // 非LINEユーザ
                notSendUserMap.put(userDto.getUserId(),
                        userDto.getLastName() + StringUtils.SPACE
                        + userDto.getFirstName());
            }
        }

        lineSourceListDto.setSendUserLineId(sendUserLineId);
        lineSourceListDto.setNotSendUserMap(notSendUserMap);
        lineSourceListDto.setSendUserMap(sendUserMap);
        lineSourceListDto.setUnknownUserIds(unknownUserIds);

        return lineSourceListDto;
    }

    public void pushButtons(LineSourceListDto lineSourceListDto, TemplateMessage templateMessage) throws RecordNotFoundException, InterruptedException, ExecutionException {

        LineMessagingClient lineMessagingClient = buildLineMessagingClient();

        // PUSH通信
        BotApiResponse response = lineMessagingClient.multicast(new Multicast(
                new HashSet<String>(lineSourceListDto.getSendUserLineId()), templateMessage)).get();
    }

    public LineMessagingClient buildLineMessagingClient() throws RecordNotFoundException {

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        return new LineMessagingClientBuilder(token).build();
    }

    public UserT addAccount(String lineId, String type, LineBotClient lineBotClient) throws JsonProcessingException, IOException {

        OptionalEntity<UserT> optUserT = userTBhv.selectEntity(cb->{
           cb.query().setLineId_Equal(lineId);
        });

        UserT userT = new UserT();

        if (optUserT.isPresent()) {
            userT = optUserT.get();
            userT.setDeleteFlag(Flag.OFF.isBoolValue());
        } else {
            userT.setUserTypeId(1);
            userT.setAuthLevel(Permissions.GENERAL.getAuthType());
            userT.setLineFlg(Flag.ON.getIntegerValue().intValue());
            userT.setLineId(lineId);
            userT.setRegisterUser("system");
        }

        UserProfileResponse userProfileResponse =
                lineBotClient.profile(userT.getLineId(), type);

        userT.setLineUserName(userProfileResponse.getDisplayName());

        userTBhv.insertOrUpdate(userT);

        return userT;
    }

    /**
     * LINE_IDから、ユーザー情報を取得。
     *
     * @param lineId LINE_ID
     * @return UserT
     * @throws RecordNotFoundException
     */
    public UserT getUserByLineId(String lineId) {

        OptionalEntity<UserT> optUserT = userTBhv.selectEntity(cb->{
            cb.query().setLineId_Equal(lineId);
         });

         if (!optUserT.isPresent()) {
             return null;
         }

         return optUserT.get();
    }
}
