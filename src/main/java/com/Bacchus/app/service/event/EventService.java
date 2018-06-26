package com.Bacchus.app.service.event;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.Bacchus.app.Exception.IllegalRequestParamException;
import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.CandidateDto;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.EventIndexDto;
import com.Bacchus.app.components.EventTypeDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.components.LineSourceListDto;
import com.Bacchus.app.components.PostbackDataEventNotify;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.event.AbstractEventRegisterForm;
import com.Bacchus.app.form.event.EventCreateForm;
import com.Bacchus.app.form.event.EventEditForm;
import com.Bacchus.app.form.event.ShowForm;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.app.util.CommonUtil;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.app.util.MessageKeyUtil;
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
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.linebot.dto.MulticastRequestDto;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants.GlueNetValidator;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.GeneralCodeKbn;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.LineApiType;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.linecorp.bot.model.action.Action;
import com.linecorp.bot.model.action.PostbackAction;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.message.template.ButtonsTemplate;

/**
 * イベント関連サービスクラス。
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EventService extends AbstractService {

    @Autowired
    SystemPropertyService systemPropertyService;

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

    @Autowired
    LineService lineService;

    /**
     * イベント管理番号（PK）をもとにイベントDtoを取得。
     *
     * @param eventNo イベント管理番号
     * @return EventDto イベントDto
     * @throws UnsupportedEncodingException
     * @throws RecordNotFoundException
     */
    public EventDto findEventByPK(int eventNo) throws UnsupportedEncodingException, RecordNotFoundException {

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
            eventDto.setEventPlaceUrlEncode(CommonUtil.urlEncode(eventDto.getEventPlace()));

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
        } else {
            // record無し処理
            if (eventDto == null) {
                Map<String, Object> conditionMap = new HashMap<String, Object>();
                conditionMap.put("eventNo", eventNo);
                throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
            }
        }

        return eventDto;
    }

    /**
     * イベント新規登録をするメソッド.
     *
     * @param form
     *            EventCreateForm
     * @throws ParseException
     * @throws RecordNotFoundException
     * @throws IllegalRequestParamException
     */
    public void store(EventCreateForm form) throws ParseException, RecordNotFoundException, IllegalRequestParamException {

        // 登録データの生成
        EventT eventT = new EventT();
        convFormToEventEntity(form, eventT);

        // イベント情報登録
        Integer eventNo = eventTBhv.selectNextVal();
        eventT.setEventNo(eventNo);
        eventTBhv.insert(eventT);

        // 候補日の登録
        List<CandidateT> candidateInsertList = new ArrayList<CandidateT>();

        if (form.getStartDate() != null) {
            for (String startDate : form.getStartDate()) {

                if (StringUtils.isEmpty(startDate)) {
                    continue;
                }
                String startDateYYYYMMDD = startDate.replace("/", "");

                CandidateT candidateTInsertEntity = new CandidateT();

                candidateTInsertEntity.setStartDate(startDateYYYYMMDD);
                candidateTInsertEntity.setEventNo(eventNo);
                candidateTInsertEntity.setEventStartDatetime(
                        DateUtil.convertToLocalDateTime(startDate + " 00:00", DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM));
                candidateInsertList.add(candidateTInsertEntity);
            }
        }

        if (CollectionUtils.isNotEmpty(candidateInsertList)) {
            // 登録リストがnullでなければ、複数件登録処理。
            candidateTbhv.batchInsert(candidateInsertList);
        }

        // 確定日の登録
        registerFixDate(form, eventNo);

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_03_0001,
                new Object[] { eventT.getEventNo(), eventT.getEventName() });

    }

    /**
     * イベント更新をするメソッド.
     *
     * @param form EventEditForm
     * @throws ParseException
     * @throws RecordNotFoundException
     * @throws IllegalRequestParamException
     */
    public void update(EventEditForm form) throws ParseException, RecordNotFoundException, IllegalRequestParamException {

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

        convFormToEventEntity(form, eventTEntity);

        // 更新
        eventTBhv.update(eventTEntity);

        if (form.getStartDate() == null || form.getStartDate().length == 0) {
            candidateTbhv.queryDelete(cb->{
               cb.query().setEventNo_Equal(form.getEventNo());
            });

        } else {

            // 選択したイベント管理番号から、候補日_Tを取得
            ListResultBean<CandidateT> candidateTList = candidateTbhv.selectList(cb->{
                cb.query().setEventNo_Equal(form.getEventNo());
                cb.query().addOrderBy_EventStartDatetime_Asc();
            });

            List<CandidateT> candidateInsertList = new ArrayList<CandidateT>();

            for (String startDate : form.getStartDate()) {

                if (StringUtils.isEmpty(startDate)) {
                    continue;
                }
                String startDateYYYYMMDD = startDate.replace("/", "");
                boolean isExists = false;

                for (CandidateT candidateT : candidateTList) {
                    if (StringUtils.equals(startDateYYYYMMDD, candidateT.getStartDate())) {
                        isExists = true;
                        break;
                    }
                }

                if (!isExists) {
                    CandidateT candidateTInsertEntity = new CandidateT();

                    candidateTInsertEntity.setStartDate(startDateYYYYMMDD);
                    candidateTInsertEntity.setEventNo(eventTEntity.getEventNo());
                    candidateTInsertEntity.setEventStartDatetime(
                            DateUtil.convertToLocalDateTime(startDate + " 00:00", DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMM));
                    candidateInsertList.add(candidateTInsertEntity);
                }
            }

            List<CandidateT> candidateDeleteList = new ArrayList<CandidateT>();

            for (CandidateT candidateT : candidateTList) {
                boolean isExists = false;
                for (String startDate : form.getStartDate()) {
                    if (StringUtils.isEmpty(startDate)) {
                        continue;
                    }
                    startDate = startDate.replace("/", "");
                    if (StringUtils.equals(candidateT.getStartDate(), startDate)) {
                        isExists = true;
                        break;
                    }
                }
                if (!isExists) {
                    candidateDeleteList.add(candidateT);
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

        registerFixDate(form, form.getEventNo());

        // ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_03_0002,
                new Object[] { eventTEntity.getEventNo(), eventTEntity.getEventName() });

    }

    public void registerFixDate(AbstractEventRegisterForm form, Integer eventNo)
            throws IllegalRequestParamException, RecordNotFoundException {
        if (StringUtils.isNotEmpty(form.getFixDate())) {
            String fixDate = form.getStartDate()[Integer.parseInt(form.getFixDate())];
            if (StringUtils.isEmpty(fixDate)) {
                throw new IllegalRequestParamException("startDate[" + form.getFixDate() + "]", fixDate);
            } else {
                fixDate = fixDate.replace("/", "");
            }
            // 候補日テーブルから登録したイベントの候補日を取得
            ListResultBean<CandidateT> candidateTList = candidateTbhv.selectList(cb->{
                cb.query().setEventNo_Equal(eventNo);
                cb.query().addOrderBy_EventStartDatetime_Asc();
            });

            // record無し処理
            if (CollectionUtils.isEmpty(candidateTList)) {
                Map<String, Object> conditionMap = new HashMap<String, Object>();
                conditionMap.put("eventNo", eventNo);
                throw new RecordNotFoundException("event_t",
                        RecordNotFoundException.createKeyInfoMessage(conditionMap));
            }

            // 確定ラジオボタンを選択した候補日の候補日番号をセット
            for (CandidateT candidateT : candidateTList) {

                // CandidateTのイベント候補日が確定選択した候補日と一致すればtrue
                if (StringUtils.equals(candidateT.getStartDate(), fixDate)) {

                    // 登録
                    EventT event = new EventT();
                    event.setFixFlg(Flag.ON.getIntegerValue());
                    event.setCandidateNo(candidateT.getCandidateNo());
                    eventTBhv.queryUpdate(event, cb->{
                        cb.query().setEventNo_Equal(eventNo);
                    });
                    break;
                }
            }

        } else {

            // 未確定ボタンが選択された場合、fixFlgに0をセット
            EventT event = new EventT();
            event.setFixFlg(Flag.OFF.getIntegerValue());
            eventTBhv.queryUpdate(event, cb->{
                cb.query().setEventNo_Equal(eventNo);
            });
        }
    }

    public void convFormToEventEntity(AbstractEventRegisterForm form, EventT eventTEntity) {
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
    public boolean isFixCandidate(AbstractEventRegisterForm form) {

        //未確定ボタンが選択されていない場合true
        if (StringUtils.isNotEmpty(form.getFixDate())) {

            //確定ボタンが選択されている日付が空白の時true
            if (StringUtils.isEmpty(form.getStartDate()[Integer.parseInt(form.getFixDate())])) {
                return true;
            }
        }
        return false;
    }

    public void validationCommonRegister(AbstractEventRegisterForm form, BindingResult bindingResult) {

        // 幹事のユーザIDの存在チェック
        if (!bindingResult.hasFieldErrors("userId")) {
            if (StringUtils.isNotEmpty(form.getUserId())) {
                if (!userTBhv.selectByPK(Integer.parseInt(form.getUserId())).isPresent()) {
                    bindingResult.rejectValue("userId",
                            MessageKeyUtil.encloseStringDelete(GlueNetValidator.INVALID), null, "");
                }
            }
        }

        // 経費可否の妥当性チェック
        if (!bindingResult.hasFieldErrors("auxiliaryFlg")) {
            if (StringUtils.isNotEmpty(form.getAuxiliaryFlg())) {
                if (!commonService.isExistsGenCode(SystemCodeConstants.GeneralCodeKbn.AUXILIARY_DIV,
                        form.getAuxiliaryFlg())) {
                    bindingResult.rejectValue("auxiliaryFlg",
                            MessageKeyUtil.encloseStringDelete(GlueNetValidator.INVALID), null, "");
                }
            }
        }

        // イベント種別の妥当性チェック
        if (!bindingResult.hasFieldErrors("eventTypeId")) {
            if (StringUtils.isNotEmpty(form.getEventTypeId())) {
                if (!isExistsEventType(Integer.parseInt(form.getEventTypeId()))) {
                    bindingResult.rejectValue("eventTypeId",
                            MessageKeyUtil.encloseStringDelete(GlueNetValidator.INVALID), null, "");
                }
            }
        }

        // 候補日の形式チェック
        if (form.getStartDate() != null && form.getStartDate().length > 0) {
            for (int i = 0; i < form.getStartDate().length; i++) {
                String fieldName = "startDate[" + i + "]";
                if (!bindingResult.hasFieldErrors(fieldName)) {
                    if (StringUtils.isNotEmpty(form.getStartDate()[i])) {
                        if (!DateUtil.isValidDateFormat(form.getStartDate()[i])) {
                            bindingResult.rejectValue(fieldName,
                                    MessageKeyUtil.encloseStringDelete(GlueNetValidator.DATEFORMAT_MESSAGE),
                                    new String[]{DateUtil.DATE_TIME_FORMAT_YYYYMMDD}, "");
                        }
                    }
                }
            }
        }

        // 確定ボタンを選択した候補日が空白でないかの判定 空白ならtrue
        if (isFixCandidate(form)) {

            // エラー文のセット
            bindingResult.rejectValue("startDate[" + Integer.parseInt(form.getFixDate()) + "]",
                    MessageKeyUtil.encloseStringDelete(GlueNetValidator.NOTBLANK_WITH_FIELD),
                    new Object[] { "確定対象の日付" }, "");
        }
    }

    /**
     * プルダウン項目の設定
     * @param model
     */
    public void setPullDownList(Model model) {
        // 幹事のプルダウン取得.
        List<LabelValueDto> userNameSelectList = userNamePullDown();
        model.addAttribute("userNameSelectList", userNameSelectList);

        // 経費補助のプルダウン
        List<LabelValueDto> auxiliaryFlgSelectList = commonService.creatOptionalLabelValueList(
                SystemCodeConstants.GeneralCodeKbn.AUXILIARY_DIV, true, SystemCodeConstants.PLEASE_SELECT_MSG);
        model.addAttribute("auxiliaryFlgSelectList", auxiliaryFlgSelectList);

        // イベント種別のプルダウン
        List<LabelValueDto> eventTypeList = creatEventTypeLabelValueList();
        model.addAttribute("eventTypeList", eventTypeList);
    }

    /**
    *
    * 幹事の項目名のセット.
    *
    * @return 幹事の項目名
    */
   public List<LabelValueDto> userNamePullDown() {

       ListResultBean<UserT> userTList = userTBhv.selectList(cb->{
           cb.query().setLineFlg_Equal(Flag.ON.getIntegerValue());
           cb.query().setDeleteFlag_Equal(Flag.OFF.isBoolValue());
           cb.query().addOrderBy_LastName_Asc();
           cb.query().addOrderBy_FirstName_Asc();
       });

       List<LabelValueDto> userIdSelectList = new ArrayList<LabelValueDto>();

       LabelValueDto labelValueDto = new LabelValueDto();
       labelValueDto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
       labelValueDto.setValue("");

       userIdSelectList.add(labelValueDto);

       for (UserT userT : userTList) {
           LabelValueDto dto = new LabelValueDto();
           dto.setValue(userT.getUserId());
           StringBuilder sb = new StringBuilder();
           if (StringUtils.isNotEmpty(userT.getLastName())) {
               sb.append(userT.getLastName());
           }
           if (StringUtils.isNotEmpty(userT.getFirstName())) {
               sb.append(userT.getFirstName());
           }
           sb.append("（");
           sb.append(userT.getLineUserName());
           sb.append("）");
           dto.setLabel(sb.toString());
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

    public void notifyEvent(List<Integer> userIds, Integer eventNo) throws RecordNotFoundException {

        // line multicast!!
        multicastNotifyEvent(eventNo, userIds);

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

    private void multicastNotifyEvent(int eventNo, List<Integer> userIds) throws RecordNotFoundException {

        LineSourceListDto lineSourceListDto = lineService.createLineSourceListDto(userIds);

        OptionalEntity<EventT> optEvent = eventTBhv.selectEntity(cb->{
            cb.query().setEventNo_Equal(eventNo);
        });

        if (!optEvent.isPresent()) {
            // TODO notfound!!
        }

        ListResultBean<CandidateT> candidateTList = candidateTbhv.selectList(cb->{
            cb.query().setEventNo_Equal(eventNo);
            cb.query().addOrderBy_EventStartDatetime_Asc();
        });

        EventT eventT = optEvent.get();

        List<Message> messageList = new ArrayList<Message>();

        // イベント内容の設定
        String url = systemPropertyService.getSystemPropertyValue(SystemPropertyKeyConstants.BACCHUS_URL);
        url += ProcConstants.EVENT + ProcConstants.Operation.SHOW + "/" + eventNo;

        String msg = super.getMsg("event.notify", new Object[]{
                eventT.getEventName(),
                url
        });

        messageList.add(new TextMessage(msg));

        // 参加可否ボタンの設定
        List<LabelValueDto> entrySelectList = commonService.creatOptionalLabelValueList(
                        SystemCodeConstants.GeneralCodeKbn.ENTRY_DIV, false, SystemCodeConstants.PLEASE_SELECT_MSG);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String data = null;

        for (CandidateT candidateT : candidateTList) {

            List<Action> actionList = new ArrayList<Action>();

            String eventStartDatetimeDisplay = DateUtil.localDateTime2String(
                    candidateT.getEventStartDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);

            for (LabelValueDto labelValueDto : entrySelectList) {

                PostbackDataEventNotify postbackDataEventNotify = new PostbackDataEventNotify();
                postbackDataEventNotify.setEventNo(eventNo);
                postbackDataEventNotify.setCandidateNo(candidateT.getCandidateNo());
                postbackDataEventNotify.setEntryDiv(labelValueDto.getValue().toString());

                try {
                    data = mapper.writeValueAsString(postbackDataEventNotify);
                    data = data.replace("\r\n", "");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                PostbackAction postbackAction = new PostbackAction(
                        labelValueDto.getLabel().toString(),
                        data,
                        eventStartDatetimeDisplay + ":[" + labelValueDto.getLabel().toString() + "]");
                actionList.add(postbackAction);
            }

            TemplateMessage templateMessage = new TemplateMessage("参加可否入力",
                    new ButtonsTemplate(null, eventT.getEventName(), "候補日" + eventStartDatetimeDisplay, actionList));
            messageList.add(templateMessage);
        }

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        // multicast!!
        LineBotClient lineBotClient = new LineBotClient(token);
        MulticastRequestDto multicastRequestDto = new MulticastRequestDto();
        multicastRequestDto.setTo(lineSourceListDto.getSendUserLineId());
        multicastRequestDto.setMessages(messageList);

        if(!commonService.isDevelopMode()) {
            lineBotClient.multicast(multicastRequestDto);
         }

        if (!lineSourceListDto.getNotSendUserMap().isEmpty()){
            // 非LINEユーザが存在
            // ログ出力
            loggerService.outLog(LogMessageKeyConstants.Warn.W_05_0001,
                    new Object[]{LineApiType.MULTICAST, lineSourceListDto.getNotSendUserMap(), msg});
        }

        if (CollectionUtils.isNotEmpty(lineSourceListDto.getUnknownUserIds())) {
            // 存在しないユーザ
            // ログ出力
            loggerService.outLog(LogMessageKeyConstants.Warn.W_05_0002,
                    new Object[]{LineApiType.MULTICAST, lineSourceListDto.getUnknownUserIds().toString(), msg});
        }
    }

    /**
     * イベント削除。
     *
     */
    public void delete(ShowForm form) {
        OptionalEntity<EventT> optionalEntity = eventTBhv.selectByPK(form.getEventNo());
        EventT eventT = optionalEntity.get();

        eventTBhv.delete(eventT);
    }

    public void copyExistsEventForm(EventEditForm form, EventDto eventDto) {
        BeanUtils.copyProperties(eventDto, form);
        if (eventDto.getEventTypeId() != null) {
            // イベント種別の初期表示
            form.setEventTypeId(String.valueOf(eventDto.getEventTypeId()));
        }
        if (eventDto.getUserId() != null) {
            // 幹事の初期表示
            form.setUserId(String.valueOf(eventDto.getUserId()));
        }
        if (eventDto.getEventEntryFee() != null) {
            // 参加費の初期表示
            form.setEventEntryFee(String.valueOf(eventDto.getEventEntryFee()));
        }
        if (eventDto.getAuxiliaryFlg() != null) {
            // 経費補助有無の初期表示
            form.setAuxiliaryFlg(String.valueOf(eventDto.getAuxiliaryFlg()));
        }
    }
}
