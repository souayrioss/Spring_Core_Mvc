package org.roronoa.service;


import org.roronoa.entity.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
