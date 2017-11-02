package com.Bacchus.webbase.common.beanvalidation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import com.Bacchus.webbase.common.constants.MessageKeyConstants;

/**
 * 全角スペース、半角スペース、null
 * @author kanai_y
 */
@Documented
@Constraint(validatedBy = { DoubleByteSpaceValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface DoubleByteSpace {

    /** 必須入力です。（ブランクも不可) */
    String message() default MessageKeyConstants.GlueNetValidator.NOTEMPTY_AND_NOTBLANK;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    public @interface List {

        DoubleByteSpace[] value();
    }
}
