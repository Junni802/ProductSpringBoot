package com.example.productspringboot.data.repository;

import com.example.productspringboot.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<ProductEntity, String> {
}
