/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.util.ValidateUtil;

/**
 * 全角文字チェック
 * @author kitabayashi_y
 */
public class FullwidthValidator implements ConstraintValidator<Fullwidth, CharSequence> {

	@Override
	public void initialize(Fullwidth annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return ValidateUtil.isFullwidth(charSequence);
	}
}
