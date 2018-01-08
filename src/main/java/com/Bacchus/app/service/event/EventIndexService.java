package com.Bacchus.app.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.dbflute.cbean.EventTCB;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exentity.EventT;

/**
 * ユーザー一覧のサービスクラス。
 *
 * @author sagawa_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventIndexService {

    @Autowired
    EventTBhv eventTBhv;

    /**
     * イベント一覧リスト取得。
     *
     * @return 登録ID
     */
    public List<EventDto> selectList() {

        // EventTの一覧取得
        EventTCB eventTcb = new EventTCB();
        eventTcb.query().addOrderBy_EventNo_Asc();
        List<EventT> eventTList = eventTBhv.readList(eventTcb);

        List<EventDto> eventDtoList = new ArrayList<EventDto>();

        // EntityをDtoへ変換
        for(EventT eventT : eventTList){
            EventDto eventDto = new EventDto();
            BeanUtils.copyProperties(eventT, eventDto);

            eventDtoList.add(eventDto);
        }

        return eventDtoList;
    }
}
