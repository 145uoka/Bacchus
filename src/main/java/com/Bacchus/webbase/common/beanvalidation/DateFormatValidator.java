/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import java.text.ParseException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author chinpei
 */
public class DateFormatValidator implements ConstraintValidator<DateFormat, CharSequence> {

	private DateFormat dateFormat;

	@Override
	public void initialize(DateFormat annotation) {
		this.dateFormat = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		try {
			DateUtils.parseDateStrictly(charSequence.toString(), this.dateFormat.format());
		} catch (ParseException e) {
			return false;
		}

		if (charSequence.toString().length() != this.dateFormat.format().length()) {
			return false;
		}

		return true;
	}
}
