package com.Bacchus.webbase.appbase;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.web.filter.GenericFilterBean;

import com.Bacchus.webbase.components.UserInfo;


public class LogoutFilter extends GenericFilterBean {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String LOGOUT_SUCCESS_URL = BaseConstants.LOGIN_URL;

	@Autowired
	private UserInfo userInfo;

	private CsrfTokenRepository csrfTokenRepository;

	private CookieClearingLogoutHandler cookieClearingLogoutHandler = new CookieClearingLogoutHandler("JSESSIONID");

	public LogoutFilter(CsrfTokenRepository csrfTokenRepository) {
		this.csrfTokenRepository = csrfTokenRepository;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		HttpSession session = httpRequest.getSession(false);
		if (session != null) {
			if (userInfo != null) {
				csrfTokenRepository.saveToken(null, httpRequest, httpResponse);
				cookieClearingLogoutHandler.logout(httpRequest, httpResponse, null);

				// ログ出力
				logger.info("ログアウトしました。名前 - [" + userInfo.getUserName() + "], Email - [" + userInfo.getEmail() + "]");
			}
			session.invalidate();
		}
		httpResponse.sendRedirect(httpRequest.getContextPath() + LOGOUT_SUCCESS_URL);
	}

	@Override
	public void destroy() {
	}

}
