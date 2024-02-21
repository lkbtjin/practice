package com.example.demo.dto;
import com.example.demo.dto.BaseDto;
import com.example.demo.dto.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 주문 정보 엔티티
 */
@NoArgsConstructor
@Getter
public class OrderDto extends BaseDto {

    /**
     * 고객정보
     */
    private Customer customer;

    /**
     * 주문자명
     */
    private String orderer;

    /**
     * 상품명
     */
    private String itemName;

    /**
     * 총 가격
     */
    private int totalAmount;

    /**
     * 배달비
     */
    private int deliveryFee;

    /**
     * 등록 용도 생성자
     */
    public OrderDto(int id, String orderer, String itemName, int totalAmount, int deliveryFee) {
        super(id, LocalDateTime.now());
        this.orderer = orderer;
        this.itemName = itemName;
        this.totalAmount = totalAmount;
        this.deliveryFee = deliveryFee;
    }

    /**
     * 삭제 용도 생성자
     */
    public OrderDto(int id){
        super(id, LocalDateTime.now(), 'Y');
    }

    /**
     * 수정 용도 생성자
     */
    public OrderDto(int id, int totalAmount, int deliveryFee){
        super(id, LocalDateTime.now());
        this.totalAmount = totalAmount;
        this.deliveryFee = deliveryFee;
    }
}
