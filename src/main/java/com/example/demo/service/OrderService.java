package com.example.demo.service;

import com.example.demo.dto.OrderDto;

import java.awt.*;
import java.util.List;

/**
 * Order CRUD 서비스
 */
public interface OrderService {

    /**
     * 주문서 조회 서비스
     *
     * 1. 배민 주문서는 개인정보를 포함하지 않고 내려준다.
     * 2. 요기요 주문서는 개인정보를 포함하여 내려준다
     * @param orderId
     * @return
     */
    OrderDto info(int orderId);

    /**
     * 주문 서비스
     */
    void create(OrderDto param);

    /**
     * 주문 목록 서비스
     */
    List<OrderDto> list();

    /**
     *  주문 삭제 서비스
     * @param orderId
     */
    void delete(int orderId);

    void update(OrderDto param);
}
