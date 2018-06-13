package com.Bacchus.app.controller.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.form.event.NotifyExecForm;
import com.Bacchus.app.form.event.NotifyForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.beanvalidation.NumRequired;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;

/**
 * イベント通知用コントローラ。
 *
 */
@Controller
@RequestMapping(value = ProcConstants.EVENT)
public class EventNotifyController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    UserService userService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    @Autowired
    LineService lineService;

    @Autowired
    EventService eventService;

    @Autowired
    CandidateTBhv candidateTbhv;

    /**
     * 通知対象ユーザ一覧表示。
     *
     * @param form
     * @param model Model
     * @return /user/userIndex
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.NOTIFY + "/{paramEventNo}", method = RequestMethod.GET)
    public String index(@PathVariable(value = "paramEventNo") @Valid @NumRequired String paramEventNo, Model model) throws Exception {

        int eventNo = Integer.parseInt(paramEventNo);

        NotifyForm form = new NotifyForm();
        form.setEventNo(eventNo);

        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0205);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(eventNo);

        model.addAttribute("eventDto", eventDto);

        // ユーザー一覧項目の取得
        model.addAttribute("userList", userService.findAllJoinEventNotify(eventNo));

        boolean isExistsCandidate = !candidateTbhv.selectList(cb->{
            cb.query().setEventNo_Equal(eventNo);
        }).isEmpty();

        model.addAttribute("isExistsCandidate", isExistsCandidate);

        return ProcConstants.EVENT + ProcConstants.Operation.NOTIFY;
    }

    /**
     * 通知対象ユーザ一覧表示。
     *
     * @param form
     * @param model Model
     * @return /user/userIndex
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.NOTIFY + "/{paramEventNo}/" + ProcConstants.Operation.EXEC,
            method = RequestMethod.POST)
    public String exec(@PathVariable(value = "paramEventNo") @Valid @NumRequired String paramEventNo,
            @ModelAttribute("form") NotifyExecForm form, BindingResult bindingResult, Model model,
            RedirectAttributes redirectAttributes) throws Exception {

        int eventNo = Integer.parseInt(paramEventNo);

        List<Integer> userIds = Arrays.asList(form.getUserIds());

        if (CollectionUtils.isEmpty(userIds)) {
            bindingResult.reject(MessageKeyUtil.encloseStringDelete(
                    MessageKeyConstants.Error.UNCHECKED), new String[] { "通知対象者" }, null);
        }

        // validation確認
        if (bindingResult.hasErrors()) {

            model.addAttribute("form", form);
            super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0205);

            // イベント情報の取得
            EventDto eventDto = eventService.findEventByPK(eventNo);

            model.addAttribute("eventDto", eventDto);

            // ユーザー一覧項目の取得
            model.addAttribute("userList", userService.findAllJoinEventNotify(eventNo));

            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);

            return ProcConstants.EVENT + ProcConstants.Operation.NOTIFY + "/" + eventNo;
        }

        String url = systemPropertyService.getSystemPropertyValue(SystemPropertyKeyConstants.BACCHUS_URL);
        String msg = url + ProcConstants.EVENT + ProcConstants.Operation.SHOW + "?eventNo="+form.getEventNo();

        lineService.pushMessage(userIds, msg);

        lineService.pushButtons(userIds);

        eventService.notifyEvent(userIds, form.getEventNo());

        redirectAttributes.addAttribute("eventNo", form.getEventNo());

        // 完了メッセージの設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return super.redirect(ProcConstants.EVENT + ProcConstants.Operation.NOTIFY);
    }
}
