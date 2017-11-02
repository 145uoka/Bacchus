/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author chinpei
 */
public class SelectFileValidator implements ConstraintValidator<SelectFile, MultipartFile> {

	@Override
	public void initialize(SelectFile annotation) {
	}

	@Override
	public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
		if (multipartFile == null) {
			return false;
		}
		if (multipartFile.getSize() == 0) {
			return false;
		}
		return true;
	}
}
