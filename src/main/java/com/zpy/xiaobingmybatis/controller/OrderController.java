package com.zpy.xiaobingmybatis.controller;


import com.zpy.xiaobingmybatis.entity.Order;
import com.zpy.xiaobingmybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/xiaobing")
public class OrderController {

    @Resource
    private OrderMapper orderMapper;

    @GetMapping("/orders")
    @Cacheable(value = "orderTypes" ,key = "targetClass + methodName +#p0")
    public List<Order> findAll(){
        Order order = new Order();
        return orderMapper.queryOrder(order);
    }

    @GetMapping("/clear/orders")
    @CacheEvict(value = "orders",allEntries = true)
    public void clear(){

    }
}
