package com.Bacchus.app.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.event.EventIndexService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
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

	/** ロガーロジック */
    @Autowired
    LoggerService loggerService;

	@Autowired
	SystemPropertyService systemPropertyService;

	@Autowired
	EventIndexService eventIndexService;

	@Autowired
	UserTBhv userTBhv;

	@Autowired
	UserTypeMBhv userTypeMBhv;

	 @Autowired
	 CommonService commonService;

	/**
	 * ログイン後TOP処理
	 *
	 * @param form
	 * @param model Model
	 * @return /user/userIndex
	 * @throws Exception
	 */
	@RequestMapping(value = ProcConstants.Operation.INDEX, method = RequestMethod.GET)
	public String index(Model model) throws Exception {
		super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0201);

		//ユーザー一覧項目の取得
		model.addAttribute("eventDtoList", eventIndexService.selectList());

		return ProcConstants.EVENT + ProcConstants.Operation.INDEX;
	}

	/**
	 * 削除ボタン押下時の処理。
	 *
	 * @param form
	 * @param model
	 * @return /user/userIndex
	 * @throws Exception
	 *
	 *
	 *
	 */
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String delete(@ModelAttribute("form") UserIndexForm form, Model model) throws Exception {
//
//		model.addAttribute("form", form);
//		super.setDisplayTitle(model, DisplayIdConstants.EventIndex.BACCHUS_0201);
//
//		// 削除
//		userIndexService.delete(form);
//
//		// 完了メッセージを設定
//		String message = messageSource.getMessage(
//				MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.DELETE), null, Locale.getDefault());
//
//		List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
//		model.addAttribute(MessageType.SUCCESS, successMessageList);
//
//		// ユーザー一覧項目の取得
//		model.addAttribute("UserTUserTypeMDtoList", userIndexService.selectList());
//
//		return "/user/userIndex";
//
//	}
}
