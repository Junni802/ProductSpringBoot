package com.example.productspringboot.data.dto;

import com.example.productspringboot.data.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    private String productId;   // 상품아이디

    private String productName; // 상품이름

    private int productPrice;   // 상품가격

    private int productStock;   // 상품 재고

    public ProductEntity toEntity() {
        return ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }

}
