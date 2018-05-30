package com.Bacchus.app.controller.event;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.components.LabelValueDto;
import com.Bacchus.app.form.event.EventEditForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.entry.EntryService;
import com.Bacchus.app.service.event.EventCreateService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.DisplayIdConstants.Event;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants.GlueNetValidator;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * イベント編集用コントローラ。
 *
 * @author hasegawa_m
 *
 */
@Controller
@RequestMapping(value = ProcConstants.EVENT)
public class EventEditController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    EventCreateService eventCreateService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    @Autowired
    EventService eventService;

    @Autowired
    EntryService entryService;

    @Autowired
    CandidateTBhv candidateTBhv;

    /**
     * イベント編集画面初期表示.
     *
     * @param model
     * @return "/event/eventEdit"
     * @throws UnsupportedEncodingException
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.EDIT, method = RequestMethod.GET)
    public String eventEdit(@ModelAttribute("form") EventEditForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model, HttpSession ses)
                    throws RecordNotFoundException, IllegalAccessException, InvocationTargetException, UnsupportedEncodingException {

        // 画面名の設定
        super.setDisplayTitle(model, Event.BACCHUS_0203);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(form.getEventNo());

        // record無し処理
        if (eventDto == null) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", form.getEventNo());
            throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

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

        // 選択したイベント管理番号から、候補日_Tを取得
        ListResultBean<CandidateT> candidateTList = candidateTBhv.selectList(cb->{
            cb.query().setEventNo_Equal(form.getEventNo());
            cb.query().addOrderBy_EventStartDatetime_Asc();
        });

        // record無し処理
        if (CollectionUtils.isNotEmpty(candidateTList)) {
            // 対象イベントの参加候補日の一覧を取得
            List<String> candidateDtoList = new ArrayList<String>();

            for (int i = 0; i < candidateTList.size(); i++) {
                candidateDtoList.add(candidateTList.get(i).getStartDate());

                // ラジオボタンの初期表示
                if (candidateTList.get(i).getCandidateNo().equals(eventDto.getCandidateNo())) {
                    // 候補日_Tの候補日管理番号とイベント＿Tの候補日管理番号が一致すれば、通し番号をラジオボタンにセット。
                    form.setFixDate(String.valueOf(i));
                }
            }

            if (eventDto.getCandidateNo() == null || eventDto.getCandidateNo() <= 0) {
                // 候補日管理番号がnullであれば、ラジオボタンに""をセット。
                form.setFixDate("");
            }

            form.setStartDate(candidateDtoList.toArray(new String[candidateDtoList.size()]));
        }

        model.addAttribute("form", form);
        setPullDownList(model);

        return ProcConstants.EVENT + ProcConstants.Operation.EDIT;
    }

    /**
     * イベント更新処理のコントローラー.
     *
     * @param form EventEditForm
     * @param bindingResult BindingResult
     * @param redirectAttributes RedirectAttributes
     * @param model Model
     * @return "/event/index"
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.UPDATE, method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") EventEditForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0203);

        // form情報をModelへ格納。
        model.addAttribute("form", form);

        // 幹事のユーザIDの存在チェック
        if (!bindingResult.hasFieldErrors("userId")) {
            if (StringUtils.isNotEmpty(form.getUserId())) {
                if (!isExistsUser(Integer.parseInt(form.getUserId()))) {
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
                if (!eventService.isExistsEventType(Integer.parseInt(form.getEventTypeId()))) {
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
        if (eventService.isFixCandidate(form)) {

            // エラー文のセット
            bindingResult.rejectValue("startDate[" + Integer.parseInt(form.getFixDate()) + "]",
                    MessageKeyUtil.encloseStringDelete(GlueNetValidator.NOTBLANK_WITH_FIELD),
                    new Object[] { "確定対象の日付" }, "");
        }

        // validation確認
        if (bindingResult.hasErrors()) {

            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);

            setPullDownList(model);

            return ProcConstants.EVENT + ProcConstants.Operation.EDIT;
        }

        // DB更新
        eventService.update(form);

        // 完了メッセージを設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.UPDATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return redirect(ProcConstants.EVENT + ProcConstants.Operation.INDEX);
    }

    /**
     * プルダウン項目の設定
     * @param model
     */
    private void setPullDownList(Model model) {
        // ユーザー名のプルダウン取得.
        List<LabelValueDto> userNameSelectList = eventService.userNamePullDown();
        model.addAttribute("userNameSelectList", userNameSelectList);

        // 経費補助のプルダウン
        List<LabelValueDto> auxiliaryFlgSelectList = commonService.creatOptionalLabelValueList(
                SystemCodeConstants.GeneralCodeKbn.AUXILIARY_DIV,
                SystemCodeConstants.PLEASE_SELECT_MSG);
        model.addAttribute("auxiliaryFlgSelectList", auxiliaryFlgSelectList);

        // イベント種別のプルダウン
        List<LabelValueDto> eventTypeList = eventService.creatEventTypeLabelValueList();
        model.addAttribute("eventTypeList", eventTypeList);
    }

    /**
     * ユーザIDを確認する。
     * @param userId ユーザID
     * @return
     */
    private boolean isExistsUser(Integer userId) {
        int resultCount = userTBhv.selectCount(cb -> {
            cb.query().setUserId_Equal(userId);
        });

        if (resultCount > 0) {
            return true;
        }
        return false;
    }


}
