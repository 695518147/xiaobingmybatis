package com.zpy.xiaobingmybatis.mapper;

import com.zpy.xiaobingmybatis.entity.Ordertype;
import com.zpy.xiaobingmybatis.entity.Tip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*  @author author
*/
@Mapper
public interface TipMapper {

    List<Tip> queryTips();
}