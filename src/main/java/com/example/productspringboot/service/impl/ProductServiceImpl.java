package com.example.productspringboot.service.impl;

import com.example.productspringboot.data.dao.ProductDAO;
import com.example.productspringboot.data.dto.ProductDto;
import com.example.productspringboot.data.entity.ProductEntity;
import com.example.productspringboot.data.handler.ProductDataHandler;
import com.example.productspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler){ this.productDataHandler = productDataHandler; }

    @Override
    public ProductDto save(String productId, String productName, int productPrice, int productStock) {

        ProductEntity productEntity = productDataHandler.save(productId, productName, productPrice, productStock);

        ProductDto productDto = new ProductDto(productEntity.getProductId(),
                productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());

        return productDto;
    }

    @Override
    public ProductDto getById(String productId) {
        ProductEntity productEntity = productDataHandler.getById(productId);
        ProductDto productDto =new ProductDto(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());
        return productDto;
    }
}
