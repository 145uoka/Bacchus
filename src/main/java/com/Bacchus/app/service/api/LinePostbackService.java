package com.Bacchus.app.service.api;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bacchus.app.components.PostbackDataEventNotify;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.dbflute.exentity.UserT;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LinePostbackService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    CandidateTBhv candidateTBhv;

    @Autowired
    EntryTBhv entryTBhv;

    public void postback(Event event) {
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

    private void eventEntry(Event event) {

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

        if (!candidateTBhv.selectByPK(candidateNo).isPresent()) {
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
    }
}
