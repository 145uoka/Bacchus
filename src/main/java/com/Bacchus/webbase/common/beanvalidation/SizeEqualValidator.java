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
 * 半角数値三桁チェック
 * @author goto_t
 */
public class SizeEqualValidator implements ConstraintValidator<SizeEqual, CharSequence> {
	SizeEqual annotation;

	@Override
	public void initialize(SizeEqual annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		int num = new Integer(charSequence.length());

		return num == annotation.length();
	}
}
