package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

/**
 * 全角スペース、半角スペース、null
 * @author kanai_y
 */
public class DoubleByteSpaceValidator implements ConstraintValidator<DoubleByteSpace, CharSequence> {

    @Override
    public void initialize(DoubleByteSpace annotation) {
    }

    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isBlank(charSequence)) {
            return false;
        }
        return true;
    }
}
