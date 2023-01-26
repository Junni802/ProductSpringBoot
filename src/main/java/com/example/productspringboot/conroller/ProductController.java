package com.example.productspringboot.conroller;

import com.example.productspringboot.data.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1.상품 등록
 * 2.상품 찾기(아이디)
 * 3.상품 삭제
 */

@RequestMapping(value = "/junni802/product")
public class ProductController {

    @GetMapping("/product/{product}")
    public ProductDto findById(@PathVariable String product){

    }

}
