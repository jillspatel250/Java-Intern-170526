package com.example.product.repository;

import com.example.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query using JPQL
    @Query("SELECT p FROM Product p WHERE p.category = :category")
    List<Product> findByCategory(String category);

    // Using Pageable for pagination
    Page<Product> findAll(Pageable pageable);

    // Using Sort
    List<Product> findAll(Sort sort);
}
