package com.Bacchus.app.controller.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
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
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;

/**
 * イベント通知用コントローラ。
 *
 */
@BeforeLogin
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

    /**
     * 通知対象ユーザ一覧表示。
     *
     * @param form
     * @param model Model
     * @return /user/userIndex
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.NOTIFY, method = RequestMethod.GET)
    public String index(@ModelAttribute("form") NotifyForm form, Model model) throws Exception {

        model.addAttribute("form", form);
        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0205);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(form.getEventNo());

        // record無し処理
        if (eventDto == null) {
            Map<String, Object> conditionMap = new HashMap<String, Object>();
            conditionMap.put("eventNo", form.getEventNo());
            throw new RecordNotFoundException("event_t", RecordNotFoundException.createKeyInfoMessage(conditionMap));
        }

        model.addAttribute("eventDto", eventDto);

        // ユーザー一覧項目の取得
        model.addAttribute("userList", userService.findAllJoinEventNotify(form.getEventNo()));

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
    @RequestMapping(value = ProcConstants.Operation.NOTIFY + ProcConstants.Operation.EXEC,
            method = RequestMethod.POST)
    public String exec(@ModelAttribute("form") NotifyExecForm form, RedirectAttributes redirectAttributes) throws Exception {

        List<Integer> userIds = Arrays.asList(form.getUserIds());
        String url = systemPropertyService.getSystemPropertyValue(SystemPropertyKeyConstants.BACCHUS_URL);
        String msg = url + ProcConstants.EVENT + ProcConstants.Operation.SHOW + "?eventNo="+form.getEventNo();

        lineService.pushMessage(userIds, msg);

        eventService.notifyEvent(userIds, form.getEventNo());

        redirectAttributes.addAttribute("eventNo", form.getEventNo());

        // 完了メッセージの設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return super.redirect(ProcConstants.EVENT + ProcConstants.Operation.NOTIFY);
    }


    @RequestMapping(value = "/push", method = RequestMethod.GET)
    public String test(@RequestParam("userId") String userId, Model model) throws Exception {
    	System.out.println(userId);
    	lineService.pushMessage(Integer.parseInt(userId), "あいうえお");


        return "/index";
    }

}
