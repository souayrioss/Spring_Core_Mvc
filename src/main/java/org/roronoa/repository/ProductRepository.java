package org.roronoa.repository;

import lombok.RequiredArgsConstructor;
import org.roronoa.entity.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository @RequiredArgsConstructor
public class ProductRepository {
    private final HibernateTemplate hibernateTemplate;

    @Transactional
    public Product saveProduct(Product product) {
        hibernateTemplate.save(product);
        System.out.println("Product Saved Successfuly");
        return product;
    }

    public List<Product> getProducts() {
        return hibernateTemplate.loadAll(Product.class);
    }

    public Product getProductById(Long id) {
        return hibernateTemplate.get(Product.class, id);
    }

    @Transactional
    void deleteProduct(Long id) {
        Product product = hibernateTemplate.get(Product.class, id);
        if (product != null) {
            hibernateTemplate.delete(product);
            System.out.println("Deleted Successfuly");
        }
    }
}
