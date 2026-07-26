package com.keifadev.mercora.repository;

import com.keifadev.mercora.enums.Category;
import com.keifadev.mercora.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findBySku(String sku);

    Optional<Product> findByName(String name);

    Optional<Product> findByCategory(Category category);
}
