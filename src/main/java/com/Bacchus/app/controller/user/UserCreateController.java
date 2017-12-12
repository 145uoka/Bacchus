package com.Bacchus.app.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.form.user.UserCreateForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserCreateService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.cbean.UserTCB;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

/**
 * ログイン用コントローラ。
 *
 * @author sagawa_k
 */
@Controller
@RequestMapping(value = ProcConstants.USER)
public class UserCreateController extends BaseController {

	/** ロガーロジック */
	@Autowired
	LoggerService loggerService;

	@Autowired
	SystemPropertyService systemPropertyService;

	@Autowired
	UserCreateService userCreateService;

	@Autowired
	UserCreateService userService;

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
	@RequestMapping(value = ProcConstants.Operation.CREATE, method = RequestMethod.GET)
	public String index(@ModelAttribute("form") UserCreateForm form, BindingResult bindingResult, Model model)
			throws Exception {
		model.addAttribute("form", form);
		super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0102);

		// 権限のレベルプルダウン項目の取得
		model.addAttribute("entrySelectList", userCreateService.authLevelPullDown());

		// ユーザー区分のプルダウン項目の取得
		model.addAttribute("userTypeSelectList", userCreateService.userTypePullDown());

		return ProcConstants.USER + ProcConstants.Operation.CREATE;

	}

	@RequestMapping(value = ProcConstants.Operation.STORE, method = RequestMethod.POST)
	public String store(@Validated @ModelAttribute("form") UserCreateForm form, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, Model model) throws Exception {

		super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0102);

		// validation確認
		if (bindingResult.hasErrors()) {
			model.addAttribute(MODEL_KEY_FORM, form);
			model.addAttribute("errors", bindingResult);
			return ProcConstants.USER + ProcConstants.Operation.CREATE;
		}

		// password確認
		if (!StringUtils.equals(form.getPassword(), form.getConfirmPassword())) {
			model.addAttribute(MODEL_KEY_FORM, form);
			model.addAttribute("errors", bindingResult);
			return ProcConstants.USER + ProcConstants.Operation.CREATE;
		}

		// emailのユニークチェック
		UserTCB userTcb = new UserTCB();
		userTcb.query().setEmail_Equal(form.getEmail());
		List<UserT> emailList = userTBhv.readList(userTcb);

		if (!CollectionUtils.isEmpty(emailList)) {
			model.addAttribute(MODEL_KEY_FORM, form);
			model.addAttribute("errors", bindingResult);
			return ProcConstants.USER + ProcConstants.Operation.CREATE;
		}

		// userNameのユニークチェック
		userTcb = new UserTCB();
		userTcb.query().setUserName_Equal(form.getUserName());
		List<UserT> userNameList = userTBhv.readList(userTcb);

		if (!CollectionUtils.isEmpty(userNameList)) {

			bindingResult.rejectValue("userName",
					MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Error.ALREADY_USED),
					new Object[] { "ユーザー名" }, null);

			// redirectAttributes.addFlashAttribute(MODEL_KEY_FORM, form);
			// redirectAttributes.addFlashAttribute("errors",bindingResult);
			// return super.redirect("/user/userCreate");
			model.addAttribute(MODEL_KEY_FORM, form);
			model.addAttribute("errors", bindingResult);
			return ProcConstants.USER + ProcConstants.Operation.CREATE;
		}

		// DB登録
		userService.register(form);

		// 完了メッセージを設定
		String message = messageSource.getMessage(
				MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

		List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
		model.addAttribute(MessageType.SUCCESS, successMessageList);

		// ログ出力
		UserTCB cb = new UserTCB();
		cb.query().setUserName_Equal(form.getUserName());
		List<UserT> userTList = userTBhv.readList(cb);
		if (CollectionUtils.isEmpty(userTList)) {
			throw new RecordNotFoundException("USER_T", form.getUserName());
		} else {
			loggerService.outLog(LogMessageKeyConstants.Info.I_01_0001, new Object[] { userTList.get(0).getUserId(),
					userTList.get(0).getUserName(), userTList.get(0).getEmail() });
		}

		return ProcConstants.USER + ProcConstants.Operation.CREATE;
	}
}
