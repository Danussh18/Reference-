package com.cognizant.library.configs.validator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AuthorValidator implements ConstraintValidator<Author, String> {
    List<String> authors = Arrays.asList("Sunil Joseph","Mike Sheridan", "James Ghosling", "Patrick Naughtan", "Chris Warth");
    
    @Override
    public void initialize(Author author) {   }
    
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {	
		return authors.contains(value);		
	}
}
