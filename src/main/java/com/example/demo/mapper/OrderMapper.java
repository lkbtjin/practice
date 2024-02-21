package com.example.demo.mapper;

import com.example.demo.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;

import java.awt.*;
import java.util.List;

/**
 * Order CRUD MAPPER
 *
 * Mapper 사용시 왜 Interface를 사용해야 하는가?
 */
@Mapper
public interface OrderMapper {
    OrderDto info(int id);

    void create(OrderDto param);

    List<OrderDto> list();

    void delete(OrderDto order);

    void update(OrderDto order);
}
