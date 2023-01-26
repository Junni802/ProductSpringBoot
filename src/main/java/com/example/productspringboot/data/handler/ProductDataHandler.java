package com.example.productspringboot.data.handler;

import com.example.productspringboot.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity save(String productId, String productName, int productPrice, int productStock);

}
