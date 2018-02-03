package com.Bacchus.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.form.LoginNameForm;
import com.Bacchus.app.service.CommonService;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.ProcConstants;

/**
 * INDEX画面の表示用コントローラ。
 *
 */
@BeforeLogin
@Controller
public class IndexController extends BaseController {

    @Autowired
    CommonService commonService;

    /**
     * TOP画面の表示
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@ModelAttribute("form") LoginNameForm form, Model model) throws Exception {

        if (userInfo.isLogined()) {
            // ログイン中
            return redirect(ProcConstants.EVENT + ProcConstants.Operation.INDEX);
        }

        if (commonService.isDevelopMode()) {
            // 開発モード時は、ID/PWでログイン
            return "adminLogin";
        }

        // Lineでのログイン画面
        model.addAttribute("form", form);
        return ProcConstants.Operation.INDEX;
    }

    /**
     * TOP画面の表示
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
    public String adminLogin(@ModelAttribute("form") LoginNameForm form, Model model) throws Exception {

            return "adminLogin";
    }

}
