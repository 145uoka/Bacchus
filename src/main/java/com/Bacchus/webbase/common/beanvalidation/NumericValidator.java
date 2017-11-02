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
public class NumericValidator implements ConstraintValidator<Numeric, CharSequence> {
	Numeric annotation;

	@Override
	public void initialize(Numeric annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		if (charSequence.length() > annotation.length()) {
			return false;
		}
		return StringUtils.isNumeric(charSequence);
	}
}
