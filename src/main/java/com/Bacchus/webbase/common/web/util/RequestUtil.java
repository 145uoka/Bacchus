/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.web.util;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PCOMS016195
 */
public final class RequestUtil {
	/** apache、またはLBにてIPを置き換えた際に使用する項目 */
	private static final String X_FORWARDED_FOR = "X-Forwarded-For";
	/** WAF(Scutum)を使用してにIPが書き換わる際に使用する項目 */
	private static final String X_FORWARDED_FOR2 = "X-Forwarded-For2";

	/**
	 * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
	 */
	private RequestUtil() {
	};

	/**
	 * IPアドレス取得
	 * @param request HttpServletRequest
	 * @return IPアドレス
	 */
	public static final String getRemoteAddr(HttpServletRequest request) {
		// 優先順位 For2 ＞ For ＞ デフォルトIP
		String xForwardedFor2 = request.getHeader(X_FORWARDED_FOR2);
		String xForwardedFor = request.getHeader(X_FORWARDED_FOR);

		// ServletAPI仕様のgetHeaderより、リクエストが指定された名前を持つヘッダを持たない場合は null を返します
		if (xForwardedFor2 != null) {
			return xForwardedFor2;
		}
		if (xForwardedFor != null) {
			return xForwardedFor;
		}

		return request.getRemoteAddr();
	}
}
