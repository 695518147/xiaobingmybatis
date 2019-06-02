package com.zpy.xiaobingmybatis.controller;

import com.zpy.xiaobingmybatis.entity.Ordertype;
import com.zpy.xiaobingmybatis.mapper.OrdertypeMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/xiaobing")
@RestController
public class OrderTypeController {

    @Resource
    private OrdertypeMapper ordertypeMapper;

    @GetMapping("/orderTypes")
    @Cacheable(value = "orderTypes" ,key = "targetClass + methodName +#p0")
    public List<Ordertype> findAll(){
        Ordertype ordertype = new Ordertype();
        return ordertypeMapper.queryOrdertype(ordertype);
    }
}
