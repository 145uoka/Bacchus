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
 * 禁則文字チェック
 * @author kitabayashi_y
 */
public class ProhibitionCheckValidator implements ConstraintValidator<ProhibitionCheck, CharSequence> {

	@Override
	public void initialize(ProhibitionCheck annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		return ValidateUtil.isProhibitionCheck(charSequence);
	}
}
