/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author chinpei
 */
public class MustSelectValidator implements ConstraintValidator<MustSelect, CharSequence> {

	@Override
	public void initialize(MustSelect annotation) {
	}

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext constraintValidatorContext) {
		if (value == null || value.length() == 0) {
			return false;
		}
		return true;
	}
}
