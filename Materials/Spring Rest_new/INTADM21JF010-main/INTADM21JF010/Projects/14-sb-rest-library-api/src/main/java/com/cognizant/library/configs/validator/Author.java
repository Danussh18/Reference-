package com.cognizant.library.configs.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {AuthorValidator.class})
@Documented
public @interface Author {
 String message() default "Author Name is Not Allowed"; 
 Class<?>[] groups() default {};
 Class<? extends Payload>[] payload() default {};
}
