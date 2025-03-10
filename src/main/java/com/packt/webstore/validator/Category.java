package com.packt.webstore.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CategoryValidator.class)
@Documented
public @interface Category {
    String[] allowedCategories() default {"Tablet", "Laptop", "Smart Phone"};

    String message() default "{com.packt.webstore.validator.Category.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
