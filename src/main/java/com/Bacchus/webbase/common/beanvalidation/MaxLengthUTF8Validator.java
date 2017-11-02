/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Charsets;

/**
 *
 * @author chinpei
 */
public class MaxLengthUTF8Validator implements ConstraintValidator<MaxLengthUTF8, CharSequence> {
	MaxLengthUTF8 annotation;

	@Override
	public void initialize(MaxLengthUTF8 annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		int lenB = charSequence.toString().getBytes(Charsets.UTF_8).length;
		return lenB <= annotation.length();
	}
}
