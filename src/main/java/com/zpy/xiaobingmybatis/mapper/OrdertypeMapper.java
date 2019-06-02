package com.zpy.xiaobingmybatis.mapper;

import com.zpy.xiaobingmybatis.entity.Ordertype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*  @author author
*/
@Mapper
public interface OrdertypeMapper{

    List<Ordertype> queryOrdertype(Ordertype object);
}