package com.zpy.xiaobingmybatis.controller;

import com.zpy.xiaobingmybatis.entity.Tip;
import com.zpy.xiaobingmybatis.mapper.TipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/xiaobing")
@RestController
public class TipController {

    @Resource
    private TipMapper tipMapper;

    @GetMapping("/tips")
    @Cacheable(value = "tips" ,key = "targetClass + methodName +#p0")
    public List<Tip> findAll(){
        return tipMapper.queryTips();
    }
}
