package com.Bacchus.app.controller.userMng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.form.userMng.UserAddForm;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.webbase.appbase.BaseController;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k $Id: LoginController.java 591 2017-08-08 07:48:14Z
 *         kanai_y@glue-si.com $
 */
@Controller
@RequestMapping(value = "/userMng")
public class UserAddController extends BaseController {

	@Autowired
	SystemPropertyService systemPropertyService;

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
		model.addAttribute("message", "Wellcome!!!");

		return "/userMng/addView";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("form") UserAddForm form,Model model) throws Exception {

		System.out.println("◆◆◆◆◆◆◆◆◆◆◆" + form.getUserName());
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆" + form.getUserCode());
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆" + form.getEmail());
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆" + form.getPassword());

		return "/userMng/addView";
	}
}
