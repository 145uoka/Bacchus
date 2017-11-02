package com.Bacchus.webbase.common.beanvalidation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
*
* @author kamimura_y
*
*/
@Documented
@Constraint(validatedBy={PeriodValidator.class})
@Target({METHOD, TYPE, ANNOTATION_TYPE,CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface Period {
    String message() default "{glue-net.validator.Period}";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String fieldFrom() default "from";
    String fieldTo() default "to";
    String format() default "yyyy/MM/dd";

    @Target({METHOD, TYPE, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    public static @interface List
    {
        Period[] value();
    }

}
