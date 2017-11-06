package com.Bacchus.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.webbase.appbase.BaseController;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k
 */
@Controller
@RequestMapping(value = "/loginTop")
public class LoginTopController extends BaseController {

    @Autowired
    SystemPropertyService systemPropertyService;

    /**
     * ログイン後TOP処理
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) throws Exception {

        model.addAttribute("message", "Wellcome!!!");

        return "loginTop";
    }
}
