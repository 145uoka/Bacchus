package com.Bacchus.app.service.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.EventIndexDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.pmbean.EventIndexPmb;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.customize.EventIndex;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.GeneralCodeKbn;

/**
 * イベント関連サービスクラス。
 *
 * @author ishigouoka_k
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

            if (eventT.get().getAuxiliaryFlg() != null) {
                // 経費補助有無の別を設定
                eventDto.setAuxiliaryFlgDisplay(generalCodeDtoMap.get(eventT.get().getAuxiliaryFlg().toString()));
            }
        }

        return eventDto;
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
        pmb.setGeneralCodeM_codeDiv(GeneralCodeKbn.EVENT_DIV);
        pmb.setGeneralCodeM_delFlg(Flag.OFF.getIntegerValue());

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
}
