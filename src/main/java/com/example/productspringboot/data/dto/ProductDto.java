package com.example.productspringboot.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
public class ProductDto {

    private String productId;   // 상품아이디

    private String productName; // 상품이름

    private int productPrice;   // 상품가격

    private int productStock;   // 상품 재고

}
