package com.Bacchus.app.service.event;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.GeneralCodeDto;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.UserT;
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
     * ユーザー_TのDAO
     */
    @Autowired
    UserTBhv userTBhv;

    /**
     * イベント管理番号（PK）をもとにイベント_Tを取得。
     *
     * @param eventNo イベント管理番号
     * @return EventDto
     */
    public EventDto findEventByPK(int eventNo) {

        List<GeneralCodeDto> generalCodeDtoList = commonService.getGeneralCodeListByCodeKbn(GeneralCodeKbn.AUXILIARY_DIV);

        EventDto result = null;

        OptionalEntity<EventT> eventT = eventTBhv.selectByPK(eventNo);

        if (eventT != null && eventT.isPresent()) {
            result = new EventDto();
            result.setAuxiliaryFlg(eventT.get().getAuxiliaryFlg());
            result.setCandidateNo(eventT.get().getCandidateNo());
            result.setEntryPeople(eventT.get().getEntryPeople());
            result.setEventDetail(eventT.get().getEventDetail());
            result.setEventDiv(eventT.get().getEventDiv());
            result.setEventEntryFee(eventT.get().getEventEntryFee());
            result.setEventName(eventT.get().getEventName());
            result.setEventNo(eventT.get().getEventNo());
            result.setEventPlace(eventT.get().getEventPlace());
            result.setEventUrl(eventT.get().getEventUrl());
            result.setFixFlg(eventT.get().getFixFlg());
            result.setStoreName(eventT.get().getStoreName());
            result.setTell(eventT.get().getTell());
            result.setUserId(eventT.get().getUserId());

            if (eventT.get().getAuxiliaryFlg() != null) {
                for (GeneralCodeDto generalCodeDto : generalCodeDtoList) {
                    if (StringUtils.equals(eventT.get().getAuxiliaryFlg().toString(), generalCodeDto.getCode())) {
                        result.setAuxiliaryFlgDisplay(generalCodeDto.getName());
                        break;
                    }
                }
            }

            if (result.getUserId() != null) {
                OptionalEntity<UserT> userT = userTBhv.selectByPK(result.getUserId());
                if (userT != null && userT.isPresent()) {
                    result.setPlannerLastName(userT.get().getLastName());
                    result.setPlannerFirstName(userT.get().getFirstName());
                }
            }
        }

        return result;
    }
}
