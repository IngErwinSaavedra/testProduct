package com.codingjava.productscrud.repositories;

import com.codingjava.productscrud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
