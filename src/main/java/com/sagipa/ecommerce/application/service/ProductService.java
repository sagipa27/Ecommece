package com.sagipa.ecommerce.application.service;

import com.sagipa.ecommerce.application.repository.ProductRepository;
import com.sagipa.ecommerce.domain.Product;
import com.sagipa.ecommerce.domain.User;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Iterable<Product> getProductsByUser(User user) {
        return productRepository.getProductsByUser(user);
    }

    public Product getProductById(Integer id) {
        return productRepository.getProductById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public void deleteProduct(Product product) {
        productRepository.deleteProduct(product);
    }
}
