package com.Bacchus.app.controller.event;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.dbflute.cbean.result.ListResultBean;
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

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.EventDto;
import com.Bacchus.app.form.event.EventEditForm;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.util.DateUtil;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.CandidateTBhv;
import com.Bacchus.dbflute.exentity.CandidateT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.beanvalidation.NumRequired;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.DisplayIdConstants.Event;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
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
    EventService eventService;

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
    @RequestMapping(value = ProcConstants.Operation.EDIT + "/{paramEventNo}", method = RequestMethod.GET)
    public String eventEdit(@PathVariable(value = "paramEventNo") @Valid @NumRequired String paramEventNo, Model model)
                    throws RecordNotFoundException, IllegalAccessException, InvocationTargetException, UnsupportedEncodingException {

        // 画面名の設定
        super.setDisplayTitle(model, Event.BACCHUS_0203);

        int eventNo = Integer.parseInt(paramEventNo);

        // イベント情報の取得
        EventDto eventDto = eventService.findEventByPK(eventNo);

        EventEditForm form = new EventEditForm();
        eventService.copyExistsEventForm(form, eventDto);

        // 選択したイベント管理番号から、候補日_Tを取得
        ListResultBean<CandidateT> candidateTList = candidateTBhv.selectList(cb->{
            cb.query().setEventNo_Equal(eventNo);
            cb.query().addOrderBy_EventStartDatetime_Asc();
        });

        // record無し処理
        if (CollectionUtils.isNotEmpty(candidateTList)) {
            // 対象イベントの参加候補日の一覧を取得
            List<String> candidateDtoList = new ArrayList<String>();

            for (int i = 0; i < candidateTList.size(); i++) {
                String candidate = DateUtil.localDateTime2String(candidateTList.get(i).getEventStartDatetime(),
                        DateUtil.DATE_TIME_FORMAT_YYYYMMDD);

                candidateDtoList.add(candidate);

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
        eventService.setPullDownList(model);

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
    public String update(@Validated @ModelAttribute("form") EventEditForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0203);

        // form情報をModelへ格納。
        model.addAttribute("form", form);

        // 共通validation
        eventService.validationCommonRegister(form, bindingResult);

        // validation確認
        if (bindingResult.hasErrors()) {

            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);

            eventService.setPullDownList(model);

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
}
