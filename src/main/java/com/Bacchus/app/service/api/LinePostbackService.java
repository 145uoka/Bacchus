package com.Bacchus.app.service.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.AbnormalRecordsDetection;
import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.PostbackDataEventNotify;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.linebot.dto.ReplyRequestDto;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.GeneralCodeKbn;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linecorp.bot.model.message.TextMessage;

@Service
@Transactional(rollbackFor = Exception.class)
public class LinePostbackService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    CandidateTBhv candidateTBhv;

    @Autowired
    EntryTBhv entryTBhv;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    CommonService commonService;

    public void postback(Event event) throws RecordNotFoundException, AbnormalRecordsDetection {
        String data = event.getPostback().getData();
        logger.debug("[postback-data] :" + data);

        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> dataMap = new LinkedHashMap<>();
        try {
            dataMap = mapper.readValue(data, new TypeReference<LinkedHashMap<String,Object>>(){});
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        switch ((String)dataMap.get("type")) {
        case "eventNotify":
            eventEntry(event);
            break;
        }

    }

    private void eventEntry(Event event) throws RecordNotFoundException, AbnormalRecordsDetection {

        String data = event.getPostback().getData();

        ObjectMapper mapper = new ObjectMapper();
        PostbackDataEventNotify postbackDataEventNotify = null;

        try {
            postbackDataEventNotify = mapper.readValue(data, PostbackDataEventNotify.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer candidateNo = postbackDataEventNotify.getCandidateNo();

        String lineId = event.getSource().getUserId();

        OptionalEntity<UserT> optUser = userTBhv.selectEntity(cb->{
           cb.query().setLineId_Equal(lineId);
        });
        if (!optUser.isPresent()) {
            // TODO
            logger.error("Unkown user!!!!");
        }

        Integer userId = optUser.get().getUserId();

        OptionalEntity<CandidateT> optCandidateT = candidateTBhv.selectByPK(candidateNo);
        if (!optCandidateT.isPresent()){
            // TODO
            logger.error("Unkown Candidate!!!!");
        }

        OptionalEntity<EntryT> optEntryT = entryTBhv.selectEntity(cb->{
           cb.query().setCandidateNo_Equal(candidateNo);
           cb.query().setUserId_Equal(userId);
        });

        EntryT entryT = null;

        if (optEntryT.isPresent()) {
            entryT = optEntryT.get();
        } else {
            entryT = new EntryT();
            entryT.setCandidateNo(candidateNo);
            entryT.setUserId(userId);
        }

        entryT.setEntryDiv(Integer.parseInt(postbackDataEventNotify.getEntryDiv()));

        entryTBhv.insertOrUpdate(entryT);
        logger.info("Entry !!!");

        // reply処理
        String entryName =
                commonService.getGeneralName(GeneralCodeKbn.ENTRY_DIV, postbackDataEventNotify.getEntryDiv());

        String eventStartDatetimeDisplay = DateUtil.localDateTime2String(
                optCandidateT.get().getEventStartDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);

        String replyMessage = super.getMsg("event.entry", new Object[]{
                eventStartDatetimeDisplay,
                entryName
        });

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        TextMessage textMessage = new TextMessage(replyMessage);

        LineBotClient lineBotClient = new LineBotClient(token);

        ReplyRequestDto replyRequestDto = new ReplyRequestDto();
        replyRequestDto.setReplyToken(event.getReplyToken());
        replyRequestDto.setMessages(Arrays.asList(textMessage));

        lineBotClient.reply(replyRequestDto);

    }
}
