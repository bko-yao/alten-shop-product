package com.alten.shopproduct.repository;

import com.alten.shopproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository de Product.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
