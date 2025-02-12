package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public List<Product> getProductsByByManufacturer(String manufacturer) {
        return productRepository.getProductsByManufacturer(manufacturer);
    }

    @Override
    public List<Product> getProductsByPriceFilter(Map<String, Object> priceMap) {
        return productRepository.getProductsByPriceFilter(priceMap);
    }

    @Override
    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public Set<Product> getProductsByMultiFilter(String productCategory, Map<String, Object> priceMap, String manufacturer) {
        return productRepository.getProductsByMultiFilter(productCategory, priceMap, manufacturer);
    }

}
