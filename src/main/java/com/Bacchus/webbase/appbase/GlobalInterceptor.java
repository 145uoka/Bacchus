package com.Bacchus.webbase.appbase;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.Bacchus.webbase.common.constants.SystemCodeConstants;
import com.Bacchus.webbase.common.web.util.RequestUtil;
import com.Bacchus.webbase.components.UserInfo;

public class GlobalInterceptor implements HandlerInterceptor {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserInfo userInfo;

	@Autowired
    MessageSource messageSource;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// リクエスト開始タイムスタンプを保持
		long requestStart = System.currentTimeMillis();
		MDC.put("requestStart", String.valueOf(requestStart));
		setupLogs(request);
		logger.info("preHandle: {}", request.getRequestURI());

		if (handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			// BeforeLoginアノテーションがついていないクラス、メソッドはログインチェックをする必要がある
			if (!hasAnnotation(handlerMethod, BeforeLogin.class)) {
				// BeforeLoginアノテーションがついていないコントローラへのリクエストで、
				// ログインしていない場合はログインページヘリダイレクト
				if (!userInfo.isLogined()) {
					doLogoutWithTimeout(request, response);
					return false;
				}
			}

			// Permissionアノテーションが付いているコントローラは、権限を持ったユーザーしか利用できない。
			if (hasAnnotation(handlerMethod, Permission.class)) {
				Permission permission = getAnnotation(handlerMethod, Permission.class);
				if (permission.value().length != 0) {
					boolean pFlag = false;
					for (SystemCodeConstants.Permissions p : permission.value()) {
						if (userInfo.getPermissions().contains(p)) {
							pFlag = true;
							break;
						}
					}
					if (!pFlag) {
						// 権限のない不正なリクエストであるため、強制ログアウトしてログイン画面へ。
						doLogout(request, response);
						return false;
					}
				}
			}
		}
		// dbflute用
		if (AccessContext.isExistAccessContextOnThread()) {
			// 既に設定されていたら何もしないで次へ
			// (二度呼び出しされたときのために念のため)
		} else {
			// [アクセス日時]
			// 例えば、アプリで日時を取得する統一したインターフェースからの日時を利用。
			// [アクセスユーザ]
			// 例えば、セッション上のログインユーザを利用。
			// ログインしていない場合のことも考慮すること。
			String accessUser = "no-login";
			if (userInfo.isLogined()) {
			    accessUser = userInfo.getEmail();
			}

			AccessContext context = new AccessContext();
			context.setAccessLocalDateTime(LocalDateTime.now());
			context.setAccessUser(accessUser);
			// [アクセスプロセス]
			// 例えば、Pageクラスの名前をそのまま利用。
			// アプリケーションでプロセスを判別できる適切な名前を設定すること。
			// DBのカラムサイズに注意(サイズオーバーしないように)
			if (handler instanceof HandlerMethod) {
				HandlerMethod handlerMethod = (HandlerMethod) handler;
				String accessProcess = handlerMethod.getBeanType().getSimpleName();
				context.setAccessProcess(accessProcess);
			}
			AccessContext.setAccessContextOnThread(context);
		}

		return true;
	}

	private void setupLogs(HttpServletRequest request) {
		// SESSION ID
		HttpSession session = request.getSession(false);
		if (session == null) {
			MDC.put("sessionId", "no-session");
		} else {
			MDC.put("sessionId", session.getId());
		}
		// リモートIPアドレス
		MDC.put("remoteAddr", RequestUtil.getRemoteAddr(request));
		MDC.put("loginEmail", userInfo.getEmail());
		MDC.put("loginName", userInfo.getUserName());
	}

	static boolean hasAnnotation(HandlerMethod handlerMethod, Class<? extends Annotation> annotationClass) {
		return handlerMethod.getBean().getClass().isAnnotationPresent(annotationClass)
				|| handlerMethod.getMethod().isAnnotationPresent(annotationClass);
	}

	static <A extends Annotation> A getAnnotation(HandlerMethod handlerMethod, Class<A> annotationClass) {
		if (handlerMethod.getBeanType().isAnnotationPresent(annotationClass)) {
			return handlerMethod.getBeanType().getAnnotation(annotationClass);
		}
		if (handlerMethod.getMethod().isAnnotationPresent(annotationClass)) {
			return handlerMethod.getMethodAnnotation(annotationClass);
		}
		return null;
	}

	void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 不正なリクエストであるため、強制ログアウトしてログイン画面へ。
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect(request.getContextPath() + "/");
	}
	void doLogoutWithTimeout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 不正なリクエストであるため、強制ログアウトしてログイン画面へ。
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect(request.getContextPath() + "/?timeout=y");
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("postHandle");
		if (modelAndView != null) {
			response.setHeader("X-Frame-Options", "DENY");
			response.setHeader("X-XSS-Protection", "1");
			response.setHeader("X-Content-Type-Options", "nosniff");
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			if (!modelAndView.getViewName().startsWith("redirect:")) {
				modelAndView.getModel().put("userInfo", userInfo);
			}
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("afterCompletion");
		AccessContext.clearAccessContextOnThread();
		MDC.clear();
	}


}
