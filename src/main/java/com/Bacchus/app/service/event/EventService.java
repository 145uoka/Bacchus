package com.Bacchus.app.service.event;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.EventIndexDto;
import com.Bacchus.app.components.EventTypeDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.exbhv.EventNotifyBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.EventTypeMBhv;
import com.Bacchus.dbflute.exbhv.pmbean.EventIndexPmb;
import com.Bacchus.dbflute.exentity.EventNotify;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.EventTypeM;
import com.Bacchus.dbflute.exentity.customize.EventIndex;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.GeneralCodeKbn;

/**
 * イベント関連サービスクラス。
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventService {

    /**
     * イベント_TのDAO
     */
    @Autowired
    EventTBhv eventTBhv;

    /**
     * 共通サービス
     */
    @Autowired
    CommonService commonService;

    @Autowired
    EventNotifyBhv eventNotifyBhv;

    @Autowired
    EventTypeMBhv eventTypeMBhv;

    /**
     * イベント管理番号（PK）をもとにイベントDtoを取得。
     *
     * @param eventNo イベント管理番号
     * @return EventDto イベントDto
     */
    public EventDto findEventByPK(int eventNo) {

        // 経費補助有無の文言取得
        Map<String, String> generalCodeDtoMap = commonService.getGeneralCodeMapByCodeKbn(GeneralCodeKbn.AUXILIARY_DIV);

        EventDto eventDto = null;

        // イベント_Tの検索
        OptionalEntity<EventT> eventT = eventTBhv.selectEntity(cb -> {
            cb.setupSelect_EventTypeM();
            cb.setupSelect_UserT();
            cb.query().setEventNo_Equal(eventNo);
        });

        if (eventT != null && eventT.isPresent()) {
            // EntityからDtoへ変換（event_T）
            eventDto = new EventDto();
            BeanUtils.copyProperties(eventT.get(), eventDto);

            if (eventT.get().getUserT().isPresent()) {

                // EntityからDtoへ変換（user_T）
                UserDto userDto = new UserDto();
                BeanUtils.copyProperties(eventT.get().getUserT().get(), userDto);
                eventDto.setUserDto(userDto);
            }

            if (eventT.get().getEventTypeM().isPresent()) {

                // EntityからDtoへ変換（event_type_m）
                EventTypeDto eventTypeDto = new EventTypeDto();
                BeanUtils.copyProperties(eventT.get().getEventTypeM().get(), eventTypeDto);
                eventDto.setEventTypeDto(eventTypeDto);
            }

            if (eventT.get().getAuxiliaryFlg() != null) {
                // 経費補助有無の別を設定
                eventDto.setAuxiliaryFlgDisplay(generalCodeDtoMap.get(eventT.get().getAuxiliaryFlg().toString()));
            }
        }

        return eventDto;
    }

    public List<EventTypeDto> getEventTypeDtoList() {

        ListResultBean<EventTypeM> eventTypeMList = eventTypeMBhv.selectList(cb -> {
            cb.query().addOrderBy_OrderNum_Asc();
        });

        List<EventTypeDto> resultDtoList = new ArrayList<EventTypeDto>();

        for (EventTypeM eventTypeM : eventTypeMList) {
            EventTypeDto eventTypeDto = new EventTypeDto();
            BeanUtils.copyProperties(eventTypeM, eventTypeDto);
            resultDtoList.add(eventTypeDto);
        }

        return resultDtoList;
    }

    public List<LabelValueDto> creatEventTypeLabelValueList() {

        List<LabelValueDto> resultList = new ArrayList<LabelValueDto>();
        LabelValueDto labelValueDto = new LabelValueDto();
        labelValueDto.setValue("");
        labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
        resultList.add(labelValueDto);

        List<EventTypeDto> eventTypeDtoDtoList = getEventTypeDtoList();

        for (EventTypeDto eventTypeDto :eventTypeDtoDtoList) {
            labelValueDto = new LabelValueDto();
            labelValueDto.setValue(eventTypeDto.getEventTypeId());
            labelValueDto.setLabel(eventTypeDto.getEventTypeName());

            resultList.add(labelValueDto);
        }
        return resultList;
    }

    /**
     * 指定して汎用コードが存在するかを確認。
     *
     * @param codeDiv コード区分
     * @param code コード値
     * @return true:存在, false:存在しない
     */
    public boolean isExistsEventType(Integer eventTypeId) {
        int resultCount = eventTypeMBhv.selectCount(cb -> {
            cb.query().setEventTypeId_Equal(eventTypeId);

        });

        if (resultCount > 0 ) {
            return true;
        }

        return false;
    }

    /**
     * イベント一覧表示用のDtoリストを取得。
     *
     * @return イベント一覧Dtoリスト
     */
    public List<EventIndexDto> findEventIndex() {

        EventIndexPmb pmb = new EventIndexPmb();
        pmb.setEventT_entryDiv(Flag.ON.getIntegerValue());
        pmb.setEventT_fixFlg(Flag.ON.getIntegerValue());

        // DB - SELECT (外だしSQL - EventTBhv_selectEventIndex.sql)
        List<EventIndex> eventIndexEntityList = eventTBhv.outsideSql().selectList(pmb);
        List<EventIndexDto> resultDtoList = new ArrayList<EventIndexDto>();

        for (EventIndex eventIndexEntity : eventIndexEntityList) {
            // EntityからDtoへ変換（EventIndex）
            EventIndexDto eventIndexDto = new EventIndexDto();
            BeanUtils.copyProperties(eventIndexEntity, eventIndexDto);

            String eventStartDatetimeDisplay = DateUtil.localDateTime2String(
                    eventIndexEntity.getEventStartDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);

            eventIndexDto.setEventStartDatetimeDisplay(eventStartDatetimeDisplay);
            resultDtoList.add(eventIndexDto);
        }

        return resultDtoList;
    }

    public void notifyEvent(List<Integer> userIds, Integer eventNo) {

        List<EventNotify> existsEventNotifyList = eventNotifyBhv.selectList(cb ->{
            cb.query().setEventNo_Equal(eventNo);
            cb.query().setUserId_InScope(userIds);
        });

        List<EventNotify> insertEventNotifyList = new ArrayList<EventNotify>();
        List<EventNotify> updateEventNotifyList = new ArrayList<EventNotify>();

        for (Integer userId : userIds) {

            boolean isExists = false;

            for (EventNotify existsEventNotify : existsEventNotifyList) {
                if (existsEventNotify.getUserId().intValue() == userId.intValue()) {
                    existsEventNotify.setNotifyDatetime(LocalDateTime.now());
                    updateEventNotifyList.add(existsEventNotify);
                    isExists = true;
                    break;
                }
            }

            if (!isExists) {
                EventNotify eventNotify = new EventNotify();
                eventNotify.setEventNo(eventNo);
                eventNotify.setUserId(userId);
                eventNotify.setNotifyDatetime(LocalDateTime.now());
                insertEventNotifyList.add(eventNotify);
            }
        }

        if (CollectionUtils.isNotEmpty(insertEventNotifyList)) {
            eventNotifyBhv.batchInsert(insertEventNotifyList);
        }
        if (CollectionUtils.isNotEmpty(updateEventNotifyList)) {
            eventNotifyBhv.batchUpdate(updateEventNotifyList);
        }
    }
}
