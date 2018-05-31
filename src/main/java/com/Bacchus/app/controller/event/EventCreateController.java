package com.Bacchus.app.controller.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.form.event.EventCreateForm;
import com.Bacchus.app.form.event.EventEditForm;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.beanvalidation.NumRequired;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.ProcConstants.Operation;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * イベント登録用コントローラ。
 *
 * @author sagawa_k
 */
@Controller
@RequestMapping(value = ProcConstants.EVENT)
public class EventCreateController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    EventService eventService;

    /**
     * イベント登録画面初期表示.
     *
     * @param model
     * @return "/event/eventCreate"
     * @throws Exception
     */
    @RequestMapping(value = Operation.CREATE, method = RequestMethod.GET)
    public String create(@ModelAttribute("form") EventCreateForm form, Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0202);

        model.addAttribute("form", form);
        eventService.setPullDownList(model);

        return ProcConstants.EVENT + ProcConstants.Operation.CREATE;
    }

    /**
     * イベント登録画面初期表示.
     *
     * @param model
     * @return "/event/eventCreate"
     * @throws Exception
     */
    @RequestMapping(value = Operation.COPY + "/{paramEventNo}", method = RequestMethod.GET)
    public String copy(@PathVariable(value = "paramEventNo") @Valid @NumRequired String paramEventNo, Model model)
            throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0202);

        int eventNo = Integer.parseInt(paramEventNo);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(eventNo);

        EventEditForm form = new EventEditForm();
        eventService.copyExistsEventForm(form, eventDto);
        model.addAttribute("form", form);

        eventService.setPullDownList(model);

        model.addAttribute("backUrl", ProcConstants.EVENT + Operation.SHOW + "/" + paramEventNo);

        return ProcConstants.EVENT + ProcConstants.Operation.CREATE;
    }

    /**
     * イベント登録処理のコントローラー.
     *
     * @param form
     * @param bindingResult BindingResult
     * @param redirectAttributes RedirectAttributes
     * @param model Model
     * @return "/event/eventCreate"
     * @throws Exception
     */
    @RequestMapping(value = Operation.STORE, method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") EventCreateForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0202);

        // 共通validation
        eventService.validationCommonRegister(form, bindingResult);

        // validation確認
        if (bindingResult.hasErrors()) {

            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            eventService.setPullDownList(model);

            return ProcConstants.EVENT + ProcConstants.Operation.CREATE;
        }

        // DB登録
        eventService.store(form);

        // 完了メッセージを設定
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        return redirect(ProcConstants.EVENT + ProcConstants.Operation.INDEX);
    }
}
