package com.Bacchus.webbase.appbase;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.web.filter.GenericFilterBean;

public class ResetCsrfFilter extends GenericFilterBean {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	Collection<String> resetURLs;
	CsrfTokenRepository csrfTokenRepository;

	public ResetCsrfFilter(CsrfTokenRepository csrfTokenRepository) {
		this.csrfTokenRepository = csrfTokenRepository;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String path = httpRequest.getServletPath();
		if (!CsrfFilter.DEFAULT_CSRF_MATCHER.matches(httpRequest) && resetURLs.contains(path)) {
			logger.debug("CSRFをリセットしました。");
			csrfTokenRepository.saveToken(null, httpRequest, httpResponse);
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

	public void setResetURLs(Collection<String> resetURLs) {
		this.resetURLs = resetURLs;
	}
}
