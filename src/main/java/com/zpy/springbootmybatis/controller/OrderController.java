package com.zpy.springbootmybatis.controller;


import com.zpy.springbootmybatis.entity.Order;
import com.zpy.springbootmybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/xiaobing")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/orders")
    @Cacheable(value = "orderTypes" ,key = "targetClass + methodName +#p0")
    public List<Order> findAll(){
        Order order = new Order();
        return orderMapper.queryOrder(order);
    }

}
