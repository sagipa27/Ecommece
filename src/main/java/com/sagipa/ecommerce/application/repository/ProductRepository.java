package com.sagipa.ecommerce.application.repository;

import com.sagipa.ecommerce.domain.Product;
import com.sagipa.ecommerce.domain.User;
public interface ProductRepository {
    Iterable<Product> getProducts();
    Iterable<Product> getProductsByUser(User user);
    Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProduct(Product product);
}
