package com.Bacchus.app.controller.user;

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
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.common.constants.DisplayIdConstants;
import com.Bacchus.webbase.common.constants.ProcConstants;

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
    UserService userService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    /**
     * ユーザ一覧表示。
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
        model.addAttribute("userList", userService.findAllJoinUserType());

        return ProcConstants.USER + ProcConstants.Operation.INDEX;
    }
}
