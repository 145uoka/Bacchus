package com.Bacchus.webbase.common.beanvalidation;

import java.text.ParseException;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.Bacchus.app.util.DateUtil;
/**
 *
 * @author kamimura_y
 *
 */
public class PeriodValidator implements ConstraintValidator<Period, Object> {
    private String fieldFrom;
    private String fieldTo;
    private String message;
    private String dateFormat;

    @Override
    public void initialize(Period annotation) {
        this.fieldFrom = annotation.fieldFrom();
        this.fieldTo = annotation.fieldTo();
        this.message = annotation.message();
        this.dateFormat = annotation.format();
    }

    @Override
    public boolean isValid(Object value,ConstraintValidatorContext context) {

        BeanWrapper beanWrapper = new BeanWrapperImpl(value);

        String from = (String)beanWrapper.getPropertyValue(fieldFrom);
        String to = (String)beanWrapper.getPropertyValue(fieldTo);

        if (StringUtils.isEmpty(from)||StringUtils.isEmpty(to)) {
            return true;
        }
        try {
            DateUtils.parseDateStrictly(from, DateUtil.DATE_TIME_FORMAT_YYYYMMDD);
            DateUtils.parseDateStrictly(to, DateUtil.DATE_TIME_FORMAT_YYYYMMDD);
        } catch (ParseException e) {
            return true;
        }

		if (from.length() != this.dateFormat.length()) {
			return false;
		}

		if (to.length() != this.dateFormat.length()) {
			return false;
		}

        LocalDate fromDate =  DateUtil.convertToLocalDate(from);
        LocalDate toDate =  DateUtil.convertToLocalDate(to);

        if(fromDate.compareTo(toDate) > 0) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("")
            .addPropertyNode(fieldFrom)
            .addConstraintViolation();
            context.buildConstraintViolationWithTemplate(message)
            .addPropertyNode(fieldTo)
            .addConstraintViolation();
            return false;
        }
        return true;
    }

}
