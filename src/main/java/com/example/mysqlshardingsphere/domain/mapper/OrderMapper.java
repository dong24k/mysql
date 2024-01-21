package com.example.mysqlshardingsphere.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqlshardingsphere.domain.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wei.dong
 * @Date 2024/1/21 12:27
 * @Version 1.0.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> {
}
