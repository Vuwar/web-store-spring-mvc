package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {
    void addProduct(Product product);

    List<Product> getAllProducts();
    Product getProductById(String productID);

    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByManufacturer(String manufacturer);
    List<Product> getProductsByPriceFilter(Map<String, Object> priceMap);

    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Set<Product> getProductsByMultiFilter(String productCategory,Map<String, Object> priceMap,
                                          String manufacturer);

}
