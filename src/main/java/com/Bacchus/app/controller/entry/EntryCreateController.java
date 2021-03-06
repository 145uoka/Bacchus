package com.Bacchus.app.controller.entry;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.IllegalRequestParamException;
import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.form.entry.EntryForm;
import com.Bacchus.app.form.entry.EntryInputForm;
import com.Bacchus.app.form.entry.EntryRegisterForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.EntryTBhv;
import com.Bacchus.dbflute.exbhv.EventTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.dbflute.exentity.EntryT;
import com.Bacchus.dbflute.exentity.EventT;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.Permission;
import com.Bacchus.webbase.common.constants.Entry;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * イベント参加可否登録コントローラ。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Controller
@Permission({ SystemCodeConstants.Permissions.ADMIN, SystemCodeConstants.Permissions.GENERAL })
@RequestMapping(value = ProcConstants.ENTRY)
public class EntryCreateController extends BaseController {

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

    @Autowired
    EventService eventService;

    /**
     * 参加可否入力。
     *
     * @param form Form
     * @param bindingResult バリデーション結果
     * @param redirectAttributes リダイレクト属性
     * @param model モデル
     * @return /event/entry/input
     * @throws RecordNotFoundException
     * @throws IllegalRequestParamException
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = ProcConstants.Operation.CREATE, method = RequestMethod.GET)
    public String create(@ModelAttribute("form") EntryInputForm inputForm,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) throws RecordNotFoundException, IllegalRequestParamException, UnsupportedEncodingException {

        if(!userInfo.isAdminFlg()) {
//            if (inputForm.getUserId() == null ||
//                    inputForm.getUserId().intValue() != userInfo.getUserId()) {
//                throw new IllegalRequestParamException("userId", inputForm.getUserId());
//            }
        }

        // 画面名の設定
        super.setDisplayTitle(model, Entry.BACCHUS_0205);

        // 選択したイベント管理番号から、候補日_Tを取得
        ListResultBean<CandidateT> candidateTList =
                entryService.findRegisterCandidateTList(inputForm.getEventNo());

        // record無し処理
        if (CollectionUtils.isEmpty(candidateTList)) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", inputForm.getEventNo());
            throw new RecordNotFoundException("candidate_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

        List<Integer> candidateNoList = new ArrayList<Integer>();
        for (CandidateT candidateT : candidateTList) {
            candidateNoList.add(candidateT.getCandidateNo());
        }

        ListResultBean<EntryT> entryTList = entryService.findRegisterEntryTList(this.userInfo.getUserId(), candidateNoList);

        List<EntryForm> entryFormList = new ArrayList<EntryForm>();

        for(CandidateT candidateT : candidateTList) {

            EntryForm entryForm = new EntryForm();
            entryForm.setCandidateNo(candidateT.getCandidateNo());

            entryForm.setStartDate(DateUtil.formatStrToYmd(candidateT.getStartDate()));
            entryForm.setStartTime(DateUtil.formatStrToMmdd(candidateT.getStartTime()));

            String entryDiv = null;
            for(EntryT entryT : entryTList) {
                if (candidateT.getCandidateNo().intValue() == entryT.getCandidateNo().intValue()) {
                    entryDiv = entryT.getEntryDiv().toString();
                }
            }

            entryForm.setEntryDiv(entryDiv);
            entryFormList.add(entryForm);
        }

        EntryRegisterForm form = new EntryRegisterForm();

        form.setEntryFormList(entryFormList);
        form.setEventNo(inputForm.getEventNo());
//        form.setUserId(inputForm.getUserId());

        model.addAttribute("form", form);

        List<LabelValueDto> entrySelectList = commonService.creatOptionalLabelValueList(
                SystemCodeConstants.GeneralCodeKbn.ENTRY_DIV, true, SystemCodeConstants.PLEASE_SELECT_MSG);

        model.addAttribute("entrySelectList", entrySelectList);

        EventDto eventDto = eventService.findEventByPK(inputForm.getEventNo());

        // record無し処理
        if (eventDto == null) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", inputForm.getEventNo());
            throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

        model.addAttribute("eventDto", eventDto);

        return ProcConstants.ENTRY + ProcConstants.Operation.CREATE;
    }

    /**
     * 参加可否登録。
     *
     * @param form
     * @param bindingResult
     * @param redirectAttributes
     * @param model
     * @return
     * @throws RecordNotFoundException
     */
    @RequestMapping(value = ProcConstants.Operation.STORE, method = RequestMethod.POST)
    public String register(@ModelAttribute("form") EntryRegisterForm form,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        Integer eventNo = form.getEventNo();
//        Integer userId = form.getUserId();

        entryService.registerEntry(form, eventNo, this.userInfo.getUserId());

        // ログ出力
        OptionalEntity<EventT> eventTEntity =eventTBhv.selectByPK(eventNo);
        OptionalEntity<UserT> userTEntity = userTBhv.selectByPK(this.userInfo.getUserId());

        loggerService.outLog(LogMessageKeyConstants.Info.I_03_0101,
                new String[] {
                        eventTEntity.get().getEventNo().toString(),
                        eventTEntity.get().getEventName(),
                        userTEntity.get().getUserId().toString(),
                        userTEntity.get().getUserName()
        });

        // 完了メッセージを設定
        String message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());
        List<String> successMessageList = new ArrayList<>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return redirect(ProcConstants.EVENT + ProcConstants.Operation.SHOW + "/" + eventNo);
    }
}
