package com.zpy.springbootmybatis.controller;

import com.zpy.springbootmybatis.entity.Ordertype;
import com.zpy.springbootmybatis.mapper.OrdertypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/xiaobing")
@RestController
public class OrderTypeController {

    @Autowired
    private OrdertypeMapper ordertypeMapper;

    @GetMapping("/orderTypes")
    public List<Ordertype> findAll(){
        Ordertype ordertype = new Ordertype();
        return ordertypeMapper.queryOrdertype(ordertype);
    }
}
