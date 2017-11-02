/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author chinpei
 */
public class PasswordValidator implements ConstraintValidator<Password, CharSequence> {
	Password annotation;

	@Override
	public void initialize(Password annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		if (charSequence.length() < 7 || 20 < charSequence.length()) {
			return false;
		}
		if (!charSequence.toString().matches(".*[A-Za-z].*")) {
			return false;
		}
		if (!charSequence.toString().matches(".*[0-9].*") && !containsSymbol(charSequence)) {
			return false;
		}

		// 許可した記号、英数のみで構成されているかチェック
		String replaceAlphaNumelic = charSequence.toString().replaceAll("[a-zA-Z0-9]*", "");
		if (!containsSymbolOnly(replaceAlphaNumelic)) {
			return false;
		}

		return true;
	}

	/**
	 * 記号チェック
	 * <p>
	 * !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
	 * </p>
	 *
	 * @param src
	 * @return
	 */
	static boolean containsSymbol(CharSequence src) {
		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (33 <= c && c <= 47) {
				return true;
			}
			if (58 <= c && c <= 64) {
				return true;
			}
			if (91 <= c && c <= 96) {
				return true;
			}
			if (123 <= c && c <= 126) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 記号のみチェック
	 * <p>
	 * !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
	 * </p>
	 *
	 * @param src
	 * @return
	 */
	static boolean containsSymbolOnly(CharSequence src) {
		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (33 <= c && c <= 47) {
				continue;
			}
			if (58 <= c && c <= 64) {
				continue;
			}
			if (91 <= c && c <= 96) {
				continue;
			}
			if (123 <= c && c <= 126) {
				continue;
			}
			// 1文字でもここに到達したら記号以外が含まれている
			return false;
		}
		return true;
	}
}
