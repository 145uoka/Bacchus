package com.Bacchus.app.controller.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.form.event.EventCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.event.EventCreateService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * イベント登録用コントローラ。
 *
 * @author sagawa_k
 */
@Controller
@RequestMapping(value = "/event")
public class EventCreateController extends BaseController {

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

	/**
	 * ログイン後TOP処理
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/eventCreate", method = RequestMethod.GET)
	public String create(@ModelAttribute("form") EventCreateForm form,Model model)
			throws Exception {
		model.addAttribute("form", form);
		super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0202);

		model.addAttribute("userNameSelectList",eventCreateService.userNamePullDown());

		return "/event/eventCreate";

	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String store(@Validated @ModelAttribute("form") EventCreateForm form, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, Model model) throws Exception {

		super.setDisplayTitle(model, DisplayIdConstants.Event.BACCHUS_0202);

		 //validation確認
		if (bindingResult.hasErrors()) {
			model.addAttribute(MODEL_KEY_FORM, form);
			model.addAttribute("errors", bindingResult);
			return "/event/eventCreate";
		}

//
//		// userNameのユニークチェック
//		userTcb = new UserTCB();
//		userTcb.query().setUserName_Equal(form.getUserName());
//		List<UserT> userNameList = userTBhv.readList(userTcb);
//
//		if (!CollectionUtils.isEmpty(userNameList)) {
//
//			bindingResult.rejectValue("userName",
//					MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Error.ALREADY_USED),
//					new Object[] { "ユーザー名" }, null);
//
//			// redirectAttributes.addFlashAttribute(MODEL_KEY_FORM, form);
//			// redirectAttributes.addFlashAttribute("errors",bindingResult);
//			// return super.redirect("/user/userCreate");
//			model.addAttribute(MODEL_KEY_FORM, form);
//			model.addAttribute("errors", bindingResult);
//			return "/user/userCreate";
//		}

		// DB登録
		eventCreateService.store(form);

		// 完了メッセージを設定
		String message = messageSource.getMessage(
				MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

		List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
		model.addAttribute(MessageType.SUCCESS, successMessageList);


		return "/event/eventCreate";
	}
}
