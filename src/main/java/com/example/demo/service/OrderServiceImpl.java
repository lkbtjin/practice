package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.example.demo.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper){
        this.orderMapper = orderMapper;
    }
    @Override
    public OrderDto info(int orderId) {
        //TODO MAPPER 만들고 연동

        OrderDto result = orderMapper.info(orderId);
        return result;
    }

    @Override
    public void create(OrderDto param) {
        OrderDto order = new OrderDto(param.getId(), param.getOrderer(), param.getItemName(), param.getTotalAmount(), param.getDeliveryFee());
        orderMapper.create(order);

    }

    @Override
    public List<OrderDto> list() {
        return orderMapper.list();
    }

    @Override
    public void delete(int orderId) {
        OrderDto order = new OrderDto(orderId);
        orderMapper.delete(order);
    }

    @Override
    public void update(OrderDto param) {
        OrderDto order = new OrderDto(param.getId(), param.getTotalAmount(), param.getDeliveryFee());
        orderMapper.update(order);
    }
}
