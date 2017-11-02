package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.util.ValidateUtil;

/**
 * E-Mailチェック
 * @author kamimura_k
 */
public class EmailValidator implements ConstraintValidator<Email, CharSequence> {

	@Override
	public void initialize(Email annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		return ValidateUtil.isEmailUnusableChar(charSequence.toString());
	}
}
