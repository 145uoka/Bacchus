package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.Bacchus.webbase.common.util.ValidateUtil;

/**
 * 半角カタカナチェック
 * @author majo_k
 */
public class HalfSizeKatakanaValidator implements ConstraintValidator<HalfSizeKatakana, CharSequence> {

	@Override
	public void initialize(HalfSizeKatakana annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		return ValidateUtil.isHalfSizeKatakana(charSequence.toString());
	}
}
