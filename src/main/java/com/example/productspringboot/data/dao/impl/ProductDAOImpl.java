package com.example.productspringboot.data.dao.impl;

import com.example.productspringboot.data.dao.ProductDAO;
import com.example.productspringboot.data.entity.ProductEntity;
import com.example.productspringboot.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) { this.productRepository = productRepository; }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getById(String productId) {
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }
}
