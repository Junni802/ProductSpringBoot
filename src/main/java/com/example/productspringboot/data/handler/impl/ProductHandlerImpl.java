package com.example.productspringboot.data.handler.impl;

import com.example.productspringboot.data.dao.ProductDAO;
import com.example.productspringboot.data.entity.ProductEntity;
import com.example.productspringboot.data.handler.ProductDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;

    @Autowired
    public ProductHandlerImpl(ProductDAO productDAO) { this.productDAO = productDAO; }

    @Override
    public ProductEntity save(String productId, String productName, int productPrice, int productStock) {
        ProductEntity productEntity = new ProductEntity(productId, productName, productPrice, productStock);
        return productDAO.save(productEntity);
    }

    @Override
    public ProductEntity getById(String productId) {
        return productDAO.getById(productId);
    }
}
