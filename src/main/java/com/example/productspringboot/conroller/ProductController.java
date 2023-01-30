package com.example.productspringboot.conroller;

import com.example.productspringboot.data.dto.ProductDto;
import com.example.productspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * 1.상품 등록
 * 2.상품 찾기(아이디)
 * 3.상품 삭제
 */

@RestController
@RequestMapping(value = "/api/v1/product-api")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ProductDto save(@RequestBody ProductDto productDto){
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.save(productId, productName, productPrice, productStock);
    }

    @GetMapping("/product/{productId}")
    public ProductDto getById(@PathVariable String productId){
        return productService.getById(productId);
    }

}
