package com.Bacchus.app.controller.userMng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.form.userMng.UserAddForm;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.userMng.UserService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k $Id: LoginController.java 591 2017-08-08 07:48:14Z
 *         kanai_y@glue-si.com $
 */
@Controller
@RequestMapping(value = "/userMng")
public class UserAddController extends BaseController {

	/** ロガーロジック */
    @Autowired
    LoggerService loggerService;

	@Autowired
	SystemPropertyService systemPropertyService;

	@Autowired
	UserService userService;

	@Autowired
	UserTBhv userTBhv;

	/**
	 * ログイン後TOP処理
	 *
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/addView", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") UserAddForm form,Model model) throws Exception {

		model.addAttribute("form", form);
		super.setDisplayTitle(model, DisplayIdConstants.UserMng.BACCHUS_0201);

		return "/userMng/addView";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Validated @ModelAttribute("form") UserAddForm form, BindingResult bindingResult, Model model) throws Exception {

		super.setDisplayTitle(model, DisplayIdConstants.UserMng.BACCHUS_0201);

		// validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
//            model.addAttribute(MessageType.ERROR, messageList);
            return "/userMng/addView";
        }

		// DB登録
		userService.register(form);

		// 完了メッセージを設定
		String message = messageSource.getMessage(MessageKeyUtil.encloseStringDelete(
				MessageKeyConstants.Success.CREATE),
				null,
				Locale.getDefault());

		List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
		model.addAttribute(MessageType.SUCCESS, successMessageList);

		// ログ出力
		UserTCB cb = new UserTCB();
		cb.query().setUserName_Equal(form.getUserName());

		List<UserT> userTList = userTBhv.readList(cb);

		if (CollectionUtils.isEmpty(userTList)) {
			throw new RecordNotFoundException("USER_T", form.getUserName());
		} else {
			;
			loggerService.outLog(LogMessageKeyConstants.Info.I_02_0001, new Object[] {
					userTList.get(0).getUserId(),
					userTList.get(0).getUserName(),
					userTList.get(0).getEmail()
			});
		}

		return "/userMng/addView";
	}
}
