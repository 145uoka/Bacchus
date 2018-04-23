package com.Bacchus.app.service.event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.CandidateDto;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.EventIndexDto;
import com.Bacchus.app.components.EventTypeDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.event.EventEditForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.EventNotifyBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.EventTypeMBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.pmbean.EventIndexPmb;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EventNotify;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.EventTypeM;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.dbflute.exentity.customize.EventIndex;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
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

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    CandidateTBhv candidateTbhv;

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
    EntryService entryService;

    @Autowired
    EventNotifyBhv eventNotifyBhv;

    @Autowired
    EventTypeMBhv eventTypeMBhv;

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

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

    /**
     * イベント更新をするメソッド.
     *
     * @param form EventEditForm
     * @throws ParseException
     * @throws RecordNotFoundException
     */
    public void update(EventEditForm form) throws ParseException, RecordNotFoundException {

        // 編集するイベントIDを取得し、レコードをSELECT。
        OptionalEntity<EventT> eventTOptionalEntity = eventTBhv.selectByPK(form.getEventNo());

        // レコードの有無を確認。
        if (!eventTOptionalEntity.isPresent()) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", form.getEventNo());
            throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

        // entityを取得。
        EventT eventTEntity = eventTOptionalEntity.get();

        // 更新データの生成
        BeanUtils.copyProperties(form, eventTEntity);

        // イベント区分の項目が選択されている場合true
        if (StringUtils.isNotEmpty(form.getEventTypeId())) {
            eventTEntity.setEventTypeId(Integer.parseInt(form.getEventTypeId()));
        }

        // 経費補助の項目が選択されている場合true
        if (StringUtils.isNotEmpty(form.getAuxiliaryFlg())) {
            eventTEntity.setAuxiliaryFlg(Integer.parseInt(form.getAuxiliaryFlg()));
        }

        // 幹事項目が選択されている場合true
        if (StringUtils.isNotEmpty(form.getUserId())) {
            eventTEntity.setUserId(Integer.parseInt(form.getUserId()));
        }

        // 参加費
        if (StringUtils.isNotEmpty(form.getEventEntryFee())) {
            eventTEntity.setEventEntryFee(Integer.parseInt(form.getEventEntryFee()));
        }

        // 更新
        eventTBhv.update(eventTEntity);

        // 入力された候補日をリストにセットする。
        List<String> formCandidateList = new ArrayList<String>();

        if (form.getStartDate() != null && form.getStartDate().length > 0) {
            // 候補日が空白でなければ、画面入力日と候補日テーブル登録日の比較を行う。
            for (int i = 0; i < form.getStartDate().length; i++) {
                if (StringUtils.isNotEmpty(form.getStartDate()[i])) {
                    formCandidateList.add(form.getStartDate()[i]);
                }
            }

            // 選択したイベント管理番号から、候補日_Tを取得
            ListResultBean<CandidateT> candidateTEntityList = entryService.findRegisterCandidateTList(form.getEventNo());

            // record無し処理
            if (CollectionUtils.isEmpty(candidateTEntityList)) {
                Map<String, Object> conditionMap = new HashMap<String, Object>();
                conditionMap.put("eventNo", form.getEventNo());
                throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
            }

            List<String> entityCandidateList = new ArrayList<String>();
            List<Integer> candidateNoList = new ArrayList<Integer>();
            List<Integer> entrySummaryList = new ArrayList<Integer>();
            Map<String, Integer> candidateMap = new HashMap<String, Integer>();

            for (CandidateT candidateT : candidateTEntityList) {
                candidateNoList.add(candidateT.getCandidateNo());
                entrySummaryList.add(entryService.selectCountByEntryDiv(candidateT.getCandidateNo(),
                        SystemCodeConstants.EntryDiv.ENTRY));
                CandidateDto candidateDto = convCandidateEntityToDto(candidateT);
                entityCandidateList.add(candidateDto.getStartDate());

                candidateMap.put(candidateDto.getStartDate(), candidateDto.getCandidateNo());
            }

            List<CandidateT> candidateInsertList = new ArrayList<CandidateT>();
            List<CandidateT> candidateDeleteList = new ArrayList<CandidateT>();

            if (CollectionUtils.isNotEmpty(entityCandidateList)) {
                //候補日リストがnullでなければ、以下の3パターンの処理を行う。
                for (int j = 0; j < form.getStartDate().length; j++) {

                    if (entityCandidateList.contains(form.getStartDate()[j])) {
                        // 画面入力日がcandidate_tにすでに登録されている場合、何もしない。
                        continue;

                    } else if (!entityCandidateList.contains(form.getStartDate()[j])) {
                        // 画面入力日がcandidate_tに登録されていない場合、登録リストにセットする。

                        if(StringUtils.isEmpty(form.getStartDate()[j])){
                            //入力候補日のうちnullがあれば、スキップ。
                            continue;
                        }

                        CandidateT candidateTInsertEntity = new CandidateT();
                        String startDateYYYYMMDD = form.getStartDate()[j].replace("/", "");
                        candidateTInsertEntity.setStartDate(startDateYYYYMMDD);

                        SimpleDateFormat df = new SimpleDateFormat(DateUtil.DATE_TIME_FORMAT_YYYYMMDD);
                        Date startDate = df.parse(form.getStartDate()[j]);
                        String str = new SimpleDateFormat(DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM).format(startDate);
                        candidateTInsertEntity.setEventStartDatetime(
                                DateUtil.convertToLocalDateTime(str, DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM));

                        candidateTInsertEntity.setCandidateNo(candidateTbhv.selectNextVal());
                        candidateTInsertEntity.setEventNo(eventTEntity.getEventNo());
                        candidateInsertList.add(candidateTInsertEntity);
                    }
                }

                for (String date : entityCandidateList) {
                    if (!formCandidateList.contains(date)) {
                        // candidate_tに登録されている日が画面入力日から削除された場合、削除リストにセットする。
                        OptionalEntity<CandidateT> optionalEntity = candidateTbhv.selectByPK(candidateMap.get(date));
                        CandidateT candidateTDeleteEntity = optionalEntity.get();

                        candidateDeleteList.add(candidateTDeleteEntity);
                    }
                }
            }

            if (CollectionUtils.isNotEmpty(candidateInsertList)) {
                // 登録リストがnullでなければ、複数件登録処理。
                candidateTbhv.batchInsert(candidateInsertList);
            }
            if (CollectionUtils.isNotEmpty(candidateDeleteList)) {
                // 削除リストがnullでなければ、複数件削除処理。
                candidateTbhv.batchDelete(candidateDeleteList);
            }
        }

        if (StringUtils.isNotEmpty(form.getFixDate())) {
            // 日付確定ボタンが選択された場合、true。
            EventT event = new EventT();

            event.setEventNo(eventTEntity.getEventNo());
            event.setFixFlg(Flag.ON.getIntegerValue());

            // 候補日テーブルから登録したイベントの候補日を取得
            ListResultBean<CandidateT> candidateTList = entryService.findRegisterCandidateTList(form.getEventNo());

            // record無し処理
            if (CollectionUtils.isEmpty(candidateTList)) {
                Map<String, Object> conditionMap = new HashMap<String, Object>();
                conditionMap.put("eventNo", form.getEventNo());
                throw new RecordNotFoundException("event_t",
                        RecordNotFoundException.createKeyInfoMessage(conditionMap));
            }

            List<CandidateDto> candidateDtoList = new ArrayList<CandidateDto>();

            for (CandidateT candidateT : candidateTList) {
                CandidateDto candidateDto = convCandidateEntityToDto(candidateT);
                candidateDtoList.add(candidateDto);
            }

            // 確定ラジオボタンを選択した候補日の候補日番号をセット
            String fixDate = form.getStartDate()[Integer.parseInt(form.getFixDate())];
            for (CandidateDto candidate : candidateDtoList) {

                // CandidateTのイベント候補日が確定選択した候補日と一致すればtrue
                if (StringUtils.isNotEmpty(form.getFixDate())) {
                    if (StringUtils.equals(candidate.getStartDate(), fixDate)) {

                        // 確定候補日の候補日番号をセット
                        event.setCandidateNo(candidate.getCandidateNo());
                    }
                    // 登録
                    eventTBhv.update(event);
                }
            }

        } else {

            // 未確定ボタンが選択された場合、fixFlgに0をセット
            EventT event = new EventT();
            event.setEventNo(eventTEntity.getEventNo());
            event.setCandidateNo(null);
            event.setFixFlg(Flag.OFF.getIntegerValue());

            // 登録
            eventTBhv.update(event);
        }

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_03_0002,
                new Object[] { eventTEntity.getEventNo(), eventTEntity.getEventName() });

    }


    /**
     * 候補日の情報を画面表示用に変換。
     *
     * @param candidateT 候補日情報
     * @return CandidateDto
     */
    public CandidateDto convCandidateEntityToDto(CandidateT candidateT) {
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setCandidateNo(candidateT.getCandidateNo());
        candidateDto.setEventNo(candidateT.getEventNo());
        candidateDto.setEventStartDatetime(candidateT.getEventStartDatetime());
        candidateDto.setEventEndDatetime(candidateT.getEventEndDatetime());


        candidateDto.setStartDate(DateUtil.formatStrToYmd(candidateT.getStartDate()));
        candidateDto.setStartTime(DateUtil.formatStrToYmd(candidateT.getStartTime()));

        String eventStartDatetimeDisplay = DateUtil.localDateTime2String(
                candidateT.getEventStartDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);
        candidateDto.setEventStartDatetimeDisplay(eventStartDatetimeDisplay);

        String eventEndDatetimeDisplay = DateUtil.localDateTime2String(
                candidateT.getEventEndDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);
        candidateDto.setEventEndDatetimeDisplay(eventEndDatetimeDisplay);

        return candidateDto;
    }

    /**
     *
     * 確定ボタンが選択された候補日の未入力判定.
     *
     * @param form form
     *
     * @return 未入力ならtrue 入力されていたらfalse
     */
    public boolean isFixCandidate(EventEditForm form) {

        //未確定ボタンが選択されていない場合true
        if (StringUtils.isNotEmpty(form.getFixDate())) {

            //確定ボタンが選択されている日付が空白の時true
            if (StringUtils.isEmpty(form.getStartDate()[Integer.parseInt(form.getFixDate())])) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * 幹事の項目名のセット.
     *
     * @return 幹事の項目名
     */
    public List<LabelValueDto> userNamePullDown() {
        UserTCB cb = new UserTCB();
        cb.query().addOrderBy_UserId_Asc();
        List<UserT> userTList = userTBhv.readList(cb);

        List<LabelValueDto> userIdSelectList = new ArrayList<LabelValueDto>();

        LabelValueDto labelValueDto = new LabelValueDto();
        labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
        labelValueDto.setValue("");

        userIdSelectList.add(labelValueDto);

        for (UserT userT : userTList) {

            LabelValueDto dto = new LabelValueDto();
            dto.setValue(userT.getUserId());
            dto.setLabel(userT.getLastName() + userT.getFirstName());
            userIdSelectList.add(dto);

        }
        return userIdSelectList;

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
