package com.Bacchus.app.controller.event;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.form.event.ShowForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.DisplayIdConstants.Event;
import com.Bacchus.webbase.common.constants.ProcConstants;

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
//        ListResultBean<CandidateT> candidateTList =
//                entryService.findRegisterCandidateTList(inputForm.getEventNo());
//
//        // record無し処理
//        if (CollectionUtils.isEmpty(candidateTList)) {
//            Map<String, Object> conditionMap = new HashMap<String, Object>();
//            conditionMap.put("eventNo", inputForm.getEventNo());
//            throw new RecordNotFoundException("candidate_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
//        }
//
//        List<Integer> candidateNoList = new ArrayList<Integer>();
//        for (CandidateT candidateT : candidateTList) {
//            candidateNoList.add(candidateT.getCandidateNo());
//        }
//
//        ListResultBean<EntryT> entryTList = entryService.findRegisterEntryTList(inputForm.getUserId(), candidateNoList);
//
//        List<EntryForm> entryFormList = new ArrayList<EntryForm>();
//
//        for(CandidateT candidateT : candidateTList) {
//
//            EntryForm entryForm = new EntryForm();
//            entryForm.setCandidateNo(candidateT.getCandidateNo());
//
//            entryForm.setStartDate(DateUtil.formatStrToYmd(candidateT.getStartDate()));
//            entryForm.setStartTime(DateUtil.formatStrToMmdd(candidateT.getStartTime()));
//
//            String entryDiv = null;
//            for(EntryT entryT : entryTList) {
//                if (candidateT.getCandidateNo().intValue() == entryT.getCandidateNo().intValue()) {
//                    entryDiv = entryT.getEntryDiv().toString();
//                }
//            }
//
//            entryForm.setEntryDiv(entryDiv);
//            entryFormList.add(entryForm);
//        }
//
//        EntryRegisterForm form = new EntryRegisterForm();
//
//        form.setEntryFormList(entryFormList);
//        form.setEventNo(inputForm.getEventNo());
//        form.setUserId(inputForm.getUserId());
//
//        model.addAttribute("form", form);
//
//        List<LabelValueDto> entrySelectList =
//                commonService.creatOptionalLabelValueList(
//                        SystemCodeConstants.GeneralCodeKbn.ENTRY_DIV,
//                        SystemCodeConstants.PLEASE_SELECT_MSG);
//
//        model.addAttribute("entrySelectList", entrySelectList);



        return ProcConstants.EVENT + ProcConstants.Operation.SHOW;
    }
}
