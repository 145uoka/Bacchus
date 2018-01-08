package com.Bacchus.app.controller.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.components.EventIndexDto;
import com.Bacchus.app.service.event.EventIndexService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;

/**
 * イベント一覧用コントローラ。
 *
 * @author sagawa_k
 */
@Controller
@RequestMapping(value = ProcConstants.EVENT)
public class EventIndexController extends BaseController {

    @Autowired
    EventIndexService eventIndexService;

    @Autowired
    EventService eventService;

    /**
     * イベント一覧表示
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = ProcConstants.Operation.INDEX, method = RequestMethod.GET)
    public String index(Model model) throws Exception {

        super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0201);

        List<EventIndexDto> eventIndexDtoList = eventService.findEventIndex();

        //ユーザー一覧項目の取得
        model.addAttribute("eventIndexDtoList", eventIndexDtoList);

        return ProcConstants.EVENT + ProcConstants.Operation.INDEX;
    }

}
