package com.Bacchus.webbase.appbase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.Bacchus.webbase.common.constants.SystemCodeConstants.MessageType;

public class GlobalExceptionResolver implements HandlerExceptionResolver {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception ex) {
		if (ex instanceof MultipartException) {
			ModelAndView mav = new ModelAndView();
			// JSPに表示するメッセージをセットします。
			mav.addObject("message", "アップロードファイルが大きすぎます。");
			// 遷移先のJSPを指定します。(error.jspに遷移します。)
			mav.setViewName("error");
			return mav;
		} else {
			logger.error("例外をキャッチしました。", ex);
			ModelAndView mav = new ModelAndView();

			// JSPに表示するメッセージをセットします。
			mav.addObject(MessageType.ERROR, "予期せぬエラーが発生しました。");

			// 遷移先のJSPを指定します。(error.jspに遷移します。)
			mav.setViewName("error");
			return mav;
		}
	}
}
