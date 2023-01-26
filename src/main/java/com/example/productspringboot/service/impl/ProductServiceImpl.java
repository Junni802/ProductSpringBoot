package com.example.productspringboot.service.impl;

import com.example.productspringboot.data.dao.ProductDAO;
import com.example.productspringboot.data.dto.ProductDto;
import com.example.productspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){ this.productDAO = productDAO; }

    @Override
    public ProductDto save(String productId, String productName, int productPrice, int productStock) {
        return null;
    }
}
