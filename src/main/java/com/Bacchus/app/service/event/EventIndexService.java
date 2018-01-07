package com.Bacchus.app.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.dbflute.cbean.EventTCB;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
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

    @Autowired
    CandidateTBhv candidateTBhv;

    /**
     * イベント一覧リスト取得。
     *
     * @return 登録ID
     */
    public List<EventDto> selectList() {

        //EventTの一覧取得
        EventTCB eventTcb = new EventTCB();
        eventTcb.query().addOrderBy_EventNo_Asc();
        List<EventT> eventTList = eventTBhv.readList(eventTcb);

        //一覧表示項目をセットする	dtoの準備
        List<EventDto> eventDtoList = new ArrayList<EventDto>();

        //一覧表示項目をセットする
        for(EventT eventT : eventTList){
            EventDto eventDto = new EventDto();
            eventDto.setAuxiliaryFlg(eventT.getAuxiliaryFlg());
            eventDto.setCandidateNo(eventT.getCandidateNo());
            eventDto.setEntryPeople(eventT.getEntryPeople());
            eventDto.setEventDetail(eventT.getEventDetail());
            eventDto.setEventDiv(eventT.getEventDiv());
            eventDto.setEventEntryFee(eventT.getEventEntryFee());
            eventDto.setEventName(eventT.getEventName());
            eventDto.setEventNo(eventT.getEventNo());
            eventDto.setEventPlace(eventT.getEventPlace());
            eventDto.setEventUrl(eventT.getEventUrl());
            eventDto.setFixFlg(eventT.getFixFlg());
            eventDto.setStoreName(eventT.getStoreName());
            eventDto.setTell(eventT.getTell());
            eventDto.setUserId(eventT.getUserId());

            eventDtoList.add(eventDto);
        }
        return eventDtoList;
    }
}
