package com.example.product.component;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class AppStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    public AppStartupRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Laptop", "Electronics", new BigDecimal("90000"), null));
        productRepository.save(new Product(null, "Shirt", "Clothing", new BigDecimal("1500"), null));
        productRepository.save(new Product(null, "Book", "Education", new BigDecimal("500"), null));
    }
}
