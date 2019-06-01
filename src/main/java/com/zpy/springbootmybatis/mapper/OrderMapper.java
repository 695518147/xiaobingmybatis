package com.zpy.springbootmybatis.mapper;

import com.zpy.springbootmybatis.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*  @author author
*/
@Mapper
public interface OrderMapper{

    int insertOrder(Order object);

    int updateOrder(Order object);

    List<Order> queryOrder(Order object);

    Order queryOrderLimit1(Order object);
}