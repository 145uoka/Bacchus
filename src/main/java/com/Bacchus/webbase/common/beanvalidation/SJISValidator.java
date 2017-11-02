/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.Bacchus.webbase.common.util.ValidateUtil;

/**
 * SJISチェックの簡易実装。
 * @author chinpei
 */
public class SJISValidator implements ConstraintValidator<SJIS, CharSequence> {

	@Override
	public void initialize(SJIS annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		return ValidateUtil.isSJIS(charSequence);
	}
}
