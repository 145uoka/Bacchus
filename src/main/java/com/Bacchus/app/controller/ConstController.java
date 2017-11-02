package com.Bacchus.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Bacchus.webbase.appbase.BeforeLogin;

/**
 * @author ishigouoka_k
 *
 */
@BeforeLogin
@Controller
public class ConstController {

    private static final String RESULT_NAME = "java_cnst=";

    @Transactional
    @RequestMapping(value = "/const", method = RequestMethod.GET, produces="text/javascript; charset=utf-8")
    @ResponseBody
    public String home(HttpServletRequest request,HttpSession session) throws Exception {

        return "var HOGE = 'hoge';";
    }

}
