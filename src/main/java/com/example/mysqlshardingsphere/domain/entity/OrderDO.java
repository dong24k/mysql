package com.example.mysqlshardingsphere.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author wei.dong
 * @Date 2024/1/14 15:29
 * @Version 1.0.0
 */
@Data
@TableName("t_order")
public class OrderDO {

    /**
     * ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 订单名称
     */
    @TableField("order_name")
    private String orderName;

    /**
     * 订单Id
     */
    @TableField("order_id")
    private Integer orderId;


}
