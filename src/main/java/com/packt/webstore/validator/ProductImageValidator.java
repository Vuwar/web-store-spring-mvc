package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.math.BigDecimal;

@Component
public class ProductImageValidator implements Validator {

    private long allowedSize;

    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        long imageSize = product.getProductImage().getSize();
        if (imageSize > allowedSize) {
            errors.rejectValue("productImage", "com.packt.webstore.validator.ProductImageValidator.message");
        }
    }

    public void setAllowedSize(long allowedSize) {
        this.allowedSize = allowedSize;
    }
}
