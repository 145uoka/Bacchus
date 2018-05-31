package com.Bacchus.app.controller.event;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.CandidateDto;
import com.Bacchus.app.components.EntryDispListDto;
import com.Bacchus.app.components.EntryDto;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.GeneralCodeDto;
import com.Bacchus.app.components.UserDto;
import com.Bacchus.app.form.event.ShowForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.beanvalidation.NumRequired;
import com.Bacchus.webbase.common.constants.DisplayIdConstants.Event;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * イベント詳細紹介コントローラ。
 *
 * @author ishigouoka_k
 */
@Controller
@BeforeLogin
@RequestMapping(value = ProcConstants.EVENT)
public class EventShowController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    /** 共通サービスクラス */
    @Autowired
    CommonService commonService;

    /**
     * イベント関連サービス
     */
    @Autowired
    EventService eventService;

    /**
     * ユーザ関連サービス
     */
    @Autowired
    UserService userService;

    /**
     * 参加可否関連サービス
     */
    @Autowired
    EntryService entryService;

    /**
     * イベント詳細。
     *
     * @param form Form
     * @param bindingResult バリデーション結果
     * @param redirectAttributes リダイレクト属性
     * @param model モデル
     * @return /event/entry/input
     * @throws RecordNotFoundException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws UnsupportedEncodingException
     */

    @RequestMapping(value = ProcConstants.Operation.SHOW + "/{paramEventNo}", method = RequestMethod.GET)
    public String show(@PathVariable(value = "paramEventNo") @Valid @NumRequired String paramEventNo, Model model,
            HttpSession ses) throws RecordNotFoundException, IllegalAccessException, InvocationTargetException, UnsupportedEncodingException {

        int eventNo = Integer.parseInt(paramEventNo);

        if (!super.userInfo.isLogined()) {
            // 未ログインの場合、ログインさせる
            String nextPage = ProcConstants.EVENT + ProcConstants.Operation.SHOW + "/"+eventNo;
            ses.setAttribute("nextPage", nextPage);
            return super.redirect("/login/lineLogin");
        } else {
            ses.setAttribute("nextPage", null);
        }

        // 画面名の設定
        super.setDisplayTitle(model, Event.BACCHUS_0204);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(eventNo);

        model.addAttribute("eventDto", eventDto);

        ShowForm form = new ShowForm();
        form.setEventNo(eventNo);
        model.addAttribute("form", form);

        // 選択したイベント管理番号から、候補日_Tを取得
        ListResultBean<CandidateT> candidateTList = entryService.findRegisterCandidateTList(eventNo);

        // record無し処理
        if (CollectionUtils.isEmpty(candidateTList)) {
            return ProcConstants.EVENT + ProcConstants.Operation.SHOW;
        }

        // 対象イベントの参加候補日の一覧を取得
        List<Integer> candidateNoList = new ArrayList<Integer>();
        List<Integer> entrySummaryList = new ArrayList<Integer>();
        List<CandidateDto> candidateDtoList = new ArrayList<CandidateDto>();

        for (CandidateT candidateT : candidateTList) {
            candidateNoList.add(candidateT.getCandidateNo());
            entrySummaryList.add(entryService.selectCountByEntryDiv(
                    candidateT.getCandidateNo(), SystemCodeConstants.EntryDiv.ENTRY));
            CandidateDto candidateDto = convCandidateEntityToDto(candidateT);
            candidateDtoList.add(candidateDto);
        }

        model.addAttribute("candidateDtoList", candidateDtoList);
        model.addAttribute("entrySummaryList", entrySummaryList);

        List<GeneralCodeDto> generalCodeDtoList =
                commonService.getGeneralCodeListByCodeKbn(SystemCodeConstants.GeneralCodeKbn.ENTRY_DIV);
        String unAnswered = null;
        for (GeneralCodeDto generalCodeDto : generalCodeDtoList) {
            if (StringUtils.equals(generalCodeDto.getCode(), "0")) {
                unAnswered = generalCodeDto.getName();
                break;
            }
        }

        // 参加可否情報の取得

        Map<Integer, Map<Integer, EntryDto>> tempEntryDispMap = new TreeMap<Integer, Map<Integer, EntryDto>>();
        ListResultBean<EntryT> entryTList = entryService.findEntryByCandidateNoList(candidateNoList);

        for (EntryT entry : entryTList) {
            Map<Integer, EntryDto> entryDtoMap = tempEntryDispMap.get(entry.getUserId());
            if (entryDtoMap == null) {
                entryDtoMap = new TreeMap<Integer, EntryDto>();
            }
            EntryDto entryDto = new EntryDto();

            entryDto.setEntryId(entry.getEntryId());
            entryDto.setCandidateNo(entry.getCandidateNo());
            entryDto.setEntryDiv(entry.getEntryDiv());
            entryDto.setUserId(entry.getUserId());

            for (GeneralCodeDto generalCodeDto : generalCodeDtoList) {
                if (StringUtils.equals(generalCodeDto.getCode(), entryDto.getEntryDiv().toString())) {
                    entryDto.setEntryDivDisp(generalCodeDto.getName());
                    break;
                }
            }

            entryDtoMap.put(entry.getCandidateNo(), entryDto);
            tempEntryDispMap.put(entry.getUserId(), entryDtoMap);
        }

        for(Map.Entry<Integer,Map<Integer,EntryDto>> tempEntryDispMapEntry : tempEntryDispMap.entrySet()) {
            Map<Integer, EntryDto> entryDtoMap = tempEntryDispMapEntry.getValue();

            for (Integer candidateNo : candidateNoList) {
                EntryDto entryDto = entryDtoMap.get(candidateNo);
                if (entryDto == null) {
                    entryDto = new EntryDto();
                    entryDto.setCandidateNo(candidateNo);
                    entryDto.setEntryDiv(null);
                    entryDto.setUserId(tempEntryDispMapEntry.getKey());
                    entryDto.setEntryDivDisp(unAnswered);
                    entryDtoMap.put(candidateNo, entryDto);
                }
            }
        }

        List<Integer> userIdList = new ArrayList<Integer>(tempEntryDispMap.keySet());
        if (CollectionUtils.isEmpty(userIdList)) {
            return ProcConstants.EVENT + ProcConstants.Operation.SHOW;
        }

        List<UserDto> userDtoList = userService.selectListByIds(userIdList);

        List<EntryDispListDto> entryDispListDtoList = new ArrayList<EntryDispListDto>();

        for(Map.Entry<Integer,Map<Integer,EntryDto>> tempEntryDispMapEntry : tempEntryDispMap.entrySet()) {

            Map<Integer, EntryDto> entryDtoMap = tempEntryDispMapEntry.getValue();

            EntryDispListDto entryDispListDto = new EntryDispListDto();
            entryDispListDto.setUserId(tempEntryDispMapEntry.getKey());

            for(Entry<Integer, EntryDto> entryDto : entryDtoMap.entrySet()) {
                entryDispListDto.getEntryDtoList().add(entryDto.getValue());
            }

            for (UserDto userDto : userDtoList) {
                if (entryDispListDto.getUserId().intValue() == userDto.getUserId().intValue()) {
                    BeanUtils.copyProperties(entryDispListDto, userDto);
                    break;
                }
            }

            entryDispListDtoList.add(entryDispListDto);
        }

        model.addAttribute("entryDispListDtoList", entryDispListDtoList);

        return ProcConstants.EVENT + ProcConstants.Operation.SHOW;
    }

    /**
     * 候補日の情報を画面表示用に変換。
     *
     * @param candidateT 候補日情報
     * @return CandidateDto
     */
    private CandidateDto convCandidateEntityToDto(CandidateT candidateT) {
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setCandidateNo(candidateT.getCandidateNo());
        candidateDto.setEventNo(candidateT.getEventNo());
        candidateDto.setEventStartDatetime(candidateT.getEventStartDatetime());
        candidateDto.setEventEndDatetime(candidateT.getEventEndDatetime());


        candidateDto.setStartDate(candidateT.getStartDate());
        candidateDto.setStartTime(candidateT.getStartTime());

        String eventStartDatetimeDisplay = DateUtil.localDateTime2String(
                candidateT.getEventStartDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);
        candidateDto.setEventStartDatetimeDisplay(eventStartDatetimeDisplay);

        String eventEndDatetimeDisplay = DateUtil.localDateTime2String(
                candidateT.getEventEndDatetime(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDE);
        candidateDto.setEventEndDatetimeDisplay(eventEndDatetimeDisplay);

        return candidateDto;
    }

    @RequestMapping(value = ProcConstants.Operation.DELETE, method = RequestMethod.GET)
    public String delete(@ModelAttribute("form") ShowForm form){

        //削除
        eventService.delete(form);

        return redirect(ProcConstants.EVENT + ProcConstants.Operation.INDEX);
    }

}
