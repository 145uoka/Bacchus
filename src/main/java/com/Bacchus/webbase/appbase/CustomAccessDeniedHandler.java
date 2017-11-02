package com.Bacchus.webbase.appbase;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.csrf.MissingCsrfTokenException;

/**
 * SpringのAccessDeniedHandler拡張クラス、CsrfFilterで発生する特定の例外時のみの制御を追加する。
 * @author kitabayashi_y
 */
public class CustomAccessDeniedHandler extends AccessDeniedHandlerImpl {

	/** ログ */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		// MissingCsrfTokenException is SessionTimeout
		if (accessDeniedException instanceof MissingCsrfTokenException) {
			logger.debug("catch MissingCsrfTokenException:session timeout redirect errorPage");
			// redirect timeout error
			response.sendRedirect(request.getContextPath() + "/login?timeout=y");
		}

		super.handle(request, response, accessDeniedException);
	}
}