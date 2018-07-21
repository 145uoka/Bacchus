package com.Bacchus.app.service.api;

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
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.dbflute.exbhv.EventNotifyBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.EventNotify;
import com.Bacchus.dbflute.exentity.UserT;

@Service
@Transactional(rollbackFor = Exception.class)
public class LineMessageHandleService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    EventTBhv eventTBhv;

    @Autowired
    EventNotifyBhv eventNotifyBhv;


    @Autowired
    EventService eventService;

    public void handleMessage(Event event) throws RecordNotFoundException {

        switch (event.getMessage().getType()) {
        case "text":
            handleText(event);
            break;
        }
    }

    private void handleText(Event event) throws RecordNotFoundException {

        switch (event.getMessage().getText()) {
        case "直近のイベント通知":
            notifyEvent(event);
            break;
        }
    }

    private void notifyEvent(Event event) throws RecordNotFoundException {

        OptionalEntity<UserT> optUserT = userTBhv.selectEntity(cb->{
           cb.query().setLineId_Equal(event.getSource().getUserId());
        });

        if (!optUserT.isPresent()) {
            logger.error("Unknown user!!!");
            return;
        }

        OptionalEntity<EventNotify> optEventT = eventNotifyBhv.selectEntity(cb->{
            cb.query().setUserId_Equal(optUserT.get().getUserId());
            cb.query().addOrderBy_NotifyDatetime_Desc();
            cb.fetchFirst(1);
        });

        if (!optEventT.isPresent()) {
            // TODO まだないよ
            return;
        }

        eventService.notifyEvent(Arrays.asList(optUserT.get().getUserId()),
                optEventT.get().getEventNo(),
                false);
    }
}
