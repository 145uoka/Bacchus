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
 * 数値必須チェック
 * @author kitabayashi_y
 */
public class NumRequiredValidator implements ConstraintValidator<NumRequired, CharSequence> {

	@Override
	public void initialize(NumRequired annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {

		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		if (!ValidateUtil.isNumber(charSequence)) {
			return true;
		}

		int num = new Integer(charSequence.toString());

		return num >= 1;
	}
}
