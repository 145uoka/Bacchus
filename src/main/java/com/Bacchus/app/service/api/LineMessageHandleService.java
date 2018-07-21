package com.Bacchus.app.service.api;

import java.io.UnsupportedEncodingException;
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
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.dbflute.exbhv.EventNotifyBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.EventNotify;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;

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
    LineService lineService;


    @Autowired
    EventService eventService;

    public void handleMessage(Event event) throws RecordNotFoundException, UnsupportedEncodingException {

        switch (event.getMessage().getType()) {
        case "text":
            handleText(event);
            break;
        }
    }

    private void handleText(Event event) throws RecordNotFoundException, UnsupportedEncodingException {

        switch (event.getMessage().getText()) {
        case "直近のイベント通知":
            notifyEvent(event);
            break;
        }
    }

    private void notifyEvent(Event event) throws RecordNotFoundException, UnsupportedEncodingException {

        UserT userT = lineService.getUserByLineId(event.getSource().getUserId());

        OptionalEntity<EventNotify> optEventT = eventNotifyBhv.selectEntity(cb->{
            cb.query().setUserId_Equal(userT.getUserId());
            cb.query().addOrderBy_NotifyDatetime_Desc();
            cb.fetchFirst(1);
        });

        if (!optEventT.isPresent()) {
            logger.info(getMsg(LogMessageKeyConstants.Info.I_02_0501,
                     new Object[]{userT.getUserId(), userT.getUserName()}));

            return;
        }

        eventService.notifyEvent(Arrays.asList(userT.getUserId()),
                optEventT.get().getEventNo(),
                false);
    }
}
