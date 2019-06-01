package com.zpy.springbootmybatis.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1556295147482L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private String orderName;

    /**
    * 
    * isNullAble:0
    */
    private boolean isShow;

    /**
    * 
    * isNullAble:0
    */
    private boolean isSplit;

    /**
    * 
    * isNullAble:0
    */
    private String orderDescription;

    /**
    * 
    * isNullAble:0
    */
    private String orderTypeDescription;

    /**
    * 
    * isNullAble:0
    */
    private Integer number;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 
    * isNullAble:0
    */
    private Integer orderTypeId;



}
