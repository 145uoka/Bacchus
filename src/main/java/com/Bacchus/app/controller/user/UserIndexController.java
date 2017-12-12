package com.Bacchus.app.controller.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.form.user.UserIndexForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.user.UserIndexService;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
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
public class UserIndexController extends BaseController {

	/** ロガーロジック */
    @Autowired
    LoggerService loggerService;

	@Autowired
	SystemPropertyService systemPropertyService;

	@Autowired
	UserIndexService userIndexService;

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
	public String index(@ModelAttribute("form") UserIndexForm form, Model model) throws Exception {
		model.addAttribute("form", form);
		super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0101);

		//ユーザー一覧項目の取得
		model.addAttribute("UserTUserTypeMDtoList", userIndexService.selectList());

		return ProcConstants.USER + ProcConstants.Operation.INDEX;
	}

	/**
	 * 削除ボタン押下時の処理。
	 *
	 * @param form
	 * @param model
	 * @return /user/userIndex
	 * @throws Exception
	 */
	@RequestMapping(value = ProcConstants.Operation.DELETE, method = RequestMethod.GET)
	public String delete(@ModelAttribute("form") UserIndexForm form, Model model) throws Exception {

		model.addAttribute("form", form);
		super.setDisplayTitle(model, DisplayIdConstants.User.BACCHUS_0101);

		// 削除
		userIndexService.delete(form);

		// 完了メッセージを設定
		String message = messageSource.getMessage(
				MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.DELETE), null, Locale.getDefault());

		List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
		model.addAttribute(MessageType.SUCCESS, successMessageList);

		// ユーザー一覧項目の取得
		model.addAttribute("UserTUserTypeMDtoList", userIndexService.selectList());

		return ProcConstants.USER + ProcConstants.Operation.INDEX;

	}
}
