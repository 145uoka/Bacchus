package com.Bacchus.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.app.components.AccessToken;
import com.Bacchus.app.components.IdToken;
import com.Bacchus.app.form.LoginNameForm;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.OAuthService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.app.util.EncryptUtil;
import com.Bacchus.app.util.MessageKeyUtil;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.webbase.appbase.BaseController;
import com.Bacchus.webbase.appbase.BeforeLogin;
import com.Bacchus.webbase.common.constants.LogMessageKeyConstants;
import com.Bacchus.webbase.common.constants.MessageKeyConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Permissions;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k
 */
@BeforeLogin
@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OAuthService oAuthService;

    @Autowired
    LoggerService loggerService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserService userService;

    @Autowired
    LineService lineService;

    @RequestMapping(value = "/lineLogin", method = RequestMethod.GET)
    public String lineLogin() throws Exception {

        String redirectUrl = oAuthService.creatAauthorizeUrl();

        return redirect(redirectUrl);
    }

    @RequestMapping(value = "/callback", method = RequestMethod.GET)
    public String callback(@RequestParam("code") String code,
            @RequestParam("state") String state, HttpSession ses) throws Exception {

        HttpPost httpPost = new HttpPost("https://api.line.me/oauth2/v2.1/token");

        List<NameValuePair> params = oAuthService.getAccessTokenParam(code);

        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, SystemCodeConstants.CHARACTER_ENCODING);
        httpPost.setEntity(formEntity);

        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = httpClient.execute(httpPost);

        String json = EntityUtils.toString(httpResponse.getEntity(), SystemCodeConstants.CHARACTER_ENCODING);

        logger.debug("json>>>" + json);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(json);


        AccessToken accessToken = new AccessToken(
                node.get("scope").asText(),
                node.get("access_token").asText(),
                node.get("token_type").asText(),
                Integer.valueOf(node.get("expires_in").asText()),
                node.get("refresh_token").asText(),
                node.get("id_token").asText()
                );

        IdToken idToken = idToken(accessToken.id_token);

        UserT userT = oAuthService.loginByLine(idToken);

        userService.initUserInfo(userT.getUserId());
        initLoginInfo();

        String nextPage = (String)ses.getAttribute("nextPage");
        if (!StringUtils.isEmpty(nextPage)) {
            return redirect(nextPage);
        }

        return redirect("/");
    }

    private IdToken idToken(String id_token) {
        try {
            DecodedJWT jwt = JWT.decode(id_token);
            return new IdToken(
                    jwt.getClaim("iss").asString(),
                    jwt.getClaim("sub").asString(),
                    jwt.getClaim("aud").asString(),
                    jwt.getClaim("ext").asLong(),
                    jwt.getClaim("iat").asLong(),
                    jwt.getClaim("nonce").asString(),
                    jwt.getClaim("name").asString(),
                    jwt.getClaim("picture").asString());
        } catch (JWTDecodeException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public String loginName(@Validated @ModelAttribute("form") LoginNameForm form, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) throws Exception {

        // validation確認
        if (bindingResult.hasErrors()) {
            model.addAttribute(MODEL_KEY_FORM, form);
            model.addAttribute("errors", bindingResult);
            return "/index";
        }
        String loginId = form.getLoginId();
        String encPassword = EncryptUtil.saltHash(form.getPassword(), EncryptUtil.EncryptType.MD5);

        userTBhv.selectEntity(cb -> {
            cb.query().setLoginId_Equal(loginId);
            cb.query().setPassword_Equal(encPassword);
            cb.query().setDeleteFlag_Equal(Flag.OFF.isBoolValue());
        }).ifPresent(userT -> {
            // called if present
            userService.initUserInfo(userT.getUserId());
            initLoginInfo();

            loggerService.outLog(LogMessageKeyConstants.Info.I_00_0001, new Object[] {
                    userInfo.getUserId(),
                    userInfo.getUserName(),
                    userInfo.getEmail()
                    });

        }).orElse(() -> {
            // called if not present
            userInfo.setLogined(false);

            String message = messageSource.getMessage(
                    MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Error.LOGIN),
                    null,
                    Locale.getDefault());
            List<String> errorMessageList = new ArrayList<String>(Arrays.asList(message));
            redirectAttributes.addFlashAttribute(MessageType.ERROR, errorMessageList);

        });

        return redirect("/");
    }

    /**
     *
     */
    private void initLoginInfo() {

        userInfo.setLogined(true);
        boolean lineUserFlg = Flag.getFlagByIntegerValue(userInfo.getLineFlg()).isBoolValue();
        userInfo.setLineUserFlg(lineUserFlg);

        Permissions permissions = Permissions.getPermissions(userInfo.getAuthLevel());

        if (permissions == SystemCodeConstants.Permissions.ADMIN){
            userInfo.setAdminFlg(true);
        } else {
            userInfo.setGeneralFlg(true);
        }

        Set<SystemCodeConstants.Permissions> permissionsSet = new HashSet<SystemCodeConstants.Permissions>();
        permissionsSet.add(permissions);
        userInfo.setPermissions(permissionsSet);
    }
}
