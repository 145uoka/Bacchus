/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author chinpei
 */
public class AlphaNumericValidator implements ConstraintValidator<AlphaNumeric, CharSequence> {

	static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9]*");

	@Override
	public void initialize(AlphaNumeric annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		return PATTERN.matcher(charSequence).matches();
	}
}
