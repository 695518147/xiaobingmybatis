package com.zpy.springbootmybatis.mapper;

import com.zpy.springbootmybatis.entity.Ordertype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*  @author author
*/
@Mapper
public interface OrdertypeMapper{

    List<Ordertype> queryOrdertype(Ordertype object);
}