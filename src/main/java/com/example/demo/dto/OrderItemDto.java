package com.example.demo.dto;

import java.time.LocalDateTime;

/**
 * 주문서에 담길 상품 항목
 *
 * [정의]
 * 고유번호
 * 상품명
 * 수량
 * 가격
 */
public class OrderItemDto extends BaseDto {
    /**
     * 상품명
     */
    private String name;

    /**
     * 수량
     */
    private int quantity;

    /**
     * 가격
     */
    private int amount;


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }
}
