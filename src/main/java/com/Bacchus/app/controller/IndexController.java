package com.Bacchus.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.form.LoginNameForm;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;

/**
 * INDEX画面の表示用コントローラ。
 *
 * @author ishigouoka_k
 * $Id$
 */
@BeforeLogin
@Controller
@RequestMapping(value = "/")
public class IndexController extends BaseController {


    @RequestMapping(method = RequestMethod.GET)
    public String index(@ModelAttribute("form") LoginNameForm form, Model model) throws Exception {

        if (userInfo.isLogined()) {
            return redirect("/loginTop");
        }

        model.addAttribute("form", form);
        return "index";
    }

}
