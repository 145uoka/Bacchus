package com.Bacchus.app.controller.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.CandidateDto;
import com.Bacchus.app.components.EntryDispListDto;
import com.Bacchus.app.components.EntryDto;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.GeneralCodeDto;
import com.Bacchus.app.form.event.ShowForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.DisplayIdConstants.Event;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * イベント参加可否登録コントローラ。
 *
 * @author ishigouoka_k
 * $Id:$
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

    @Autowired
    EntryTBhv entryTBhv;

    @Autowired
    EventTBhv eventTBhv;

    @Autowired
    UserTBhv userTBhv;

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
     */
    @RequestMapping(value = ProcConstants.Operation.SHOW, method = RequestMethod.GET)
    public String show(@ModelAttribute("form") ShowForm form,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model, HttpSession ses) throws RecordNotFoundException {

        if (!super.userInfo.isLogined()) {
            String nextPage = ProcConstants.EVENT + ProcConstants.Operation.SHOW + "?eventNo="+form.getEventNo();
            ses.setAttribute("nextPage", nextPage);
            return super.redirect("/login/lineLogin");
        } else {
            ses.setAttribute("nextPage", null);
        }

        // 画面名の設定
        super.setDisplayTitle(model, Event.BACCHUS_0204);

        EventDto eventDto = entryService.findEventByPK(form.getEventNo());

        // record無し処理
        if (eventDto == null) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", form.getEventNo());
            throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

        model.addAttribute("eventDto", eventDto);

        form.setUserId(userInfo.getUserId());
        model.addAttribute("form", form);

//        // 選択したイベント管理番号から、候補日_Tを取得
        ListResultBean<CandidateT> candidateTList =
                entryService.findRegisterCandidateTList(form.getEventNo());
//
//        // record無し処理
//        if (CollectionUtils.isEmpty(candidateTList)) {
//            Map<String, Object> conditionMap = new HashMap<String, Object>();
//            conditionMap.put("eventNo", inputForm.getEventNo());
//            throw new RecordNotFoundException("candidate_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
//        }
//
        List<Integer> candidateNoList = new ArrayList<Integer>();
        List<CandidateDto> candidateDtoList = new ArrayList<CandidateDto>();

        for (CandidateT candidateT : candidateTList) {
            candidateNoList.add(candidateT.getCandidateNo());

            CandidateDto candidateDto = new CandidateDto();
            candidateDto.setCandidateNo(candidateT.getCandidateNo());
            candidateDto.setEventEndDatetime(candidateT.getEventEndDatetime());
            candidateDto.setEventNo(candidateT.getEventNo());
            candidateDto.setEventStartDatetime(candidateT.getEventStartDatetime());
            candidateDto.setStartDate(candidateT.getStartDate());
            candidateDto.setStartTime(candidateT.getStartTime());
            candidateDtoList.add(candidateDto);
        }

        model.addAttribute("candidateDtoList", candidateDtoList);

        List<GeneralCodeDto> generalCodeDtoList =
                commonService.getGeneralCodeListByCodeKbn(SystemCodeConstants.GeneralCodeKbn.ENTRY_DIV);

        Map<Integer, EntryDispListDto> entryDispMap = new HashMap<Integer, EntryDispListDto>();
        ListResultBean<EntryT> entryTList = entryService.findEntryByCandidateNoList(candidateNoList);

        for (EntryT entry : entryTList) {
            EntryDispListDto entryDispListDto =  entryDispMap.get(entry.getUserId());
            EntryDto entryDto = new EntryDto();

            if (entryDispListDto == null) {
                entryDispListDto = new EntryDispListDto();
                entryDispListDto.setUserId(entry.getUserT().get().getUserId());
                entryDispListDto.setUserName(entry.getUserT().get().getUserName());
            }


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

            entryDispListDto.getEntryDtoList().add(entryDto);
            entryDispMap.put(entry.getUserId(), entryDispListDto);
        }

        List<EntryDispListDto> entryDispListDtoList = new ArrayList<EntryDispListDto>();
        for(Map.Entry<Integer, EntryDispListDto> e : entryDispMap.entrySet()) {
            EntryDispListDto entryDispListDto = e.getValue();
            entryDispListDtoList.add(entryDispListDto);
        }

        model.addAttribute("entryDispListDtoList", entryDispListDtoList);

        return ProcConstants.EVENT + ProcConstants.Operation.SHOW;
    }
}
