package com.example.productspringboot.service;

import com.example.productspringboot.data.dto.ProductDto;

/**
 * 1.상품등록
 * 2.상품찾기
 * 3.상품삭제
 */
public interface ProductService {

    ProductDto save(String productId, String productName, int productPrice, int productStock);

    ProductDto getById(String productId);

}
