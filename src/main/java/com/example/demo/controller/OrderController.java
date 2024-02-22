package com.example.demo.controller;

import com.example.demo.dto.OrderDto;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 *
 */

/**
 * 주문서의 CRUD
 *
 * TODO (구현 필요) 주문서 insert
 * TODO (구현 필요) 주문서 update
 * TODO (구현 필요) 주문서 삭제
 * TODO (구현 필요) 주문서 단건 조회
 * TODO (구현 필요) 주문서 페이징 조회
 *
 */

@RestController
class OrderController {

    /**
     * TODO LOMBOK으로 생성자 주입
     */

    // annotation

    // field variable
//    private OrderService orderService = new ORderSErviceImpl();

    // constructor injection
    // service를 만들고 controller를 생성
    private final OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    /**
     * 주문서 단건 조회 API
     *
     * 파라미터: 주문서 id
     * 반환: 주무서 DTO
     *
     *
     * TODO (구현필요) 주문서 서비스 만들기
     * TODO (구현필요) 주문서 DTO 만들기
     * TODO (구현필요) 주문서 MAPPER, SELECT 쿼리 만들기
     */
    @GetMapping("/order/info")
    public OrderDto info(@RequestParam int orderId){

        return orderService.info(orderId);
    }

    /**
     * 주문서 전체 조회 API
     */
    @GetMapping("/order/list")
    public List<OrderDto> list(){
        return orderService.list();
    }

    /**
     * 주문 입력 API
     */
    @PostMapping("/order/create")
    public void create(@RequestBody OrderDto param){
        orderService.create(param);
    }

    /**
     * 주문 수정 API
     */
    @PostMapping("/order/update")
    public void update(@RequestBody OrderDto param){
        orderService.update(param);
    }

    /**
     * 주문 삭제 API
     */
    @PostMapping("/order/delete")
    public void delete(@RequestParam int orderId){
        orderService.delete(orderId);
    }


}
