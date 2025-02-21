package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import com.packt.webstore.exception.ProductNotFoundException;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CategoryValidator implements ConstraintValidator<Category, String> {
    @Autowired
    private ProductService productService;
    private List<String> allowedCategories;

    public void initialize(Category constraintAnnotation) {
        this.allowedCategories = Arrays.asList(constraintAnnotation.allowedCategories());
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && allowedCategories.contains(value);
    }
}
