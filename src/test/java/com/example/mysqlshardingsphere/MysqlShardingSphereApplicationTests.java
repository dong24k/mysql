package com.example.mysqlshardingsphere;

import com.example.mysqlshardingsphere.domain.entity.OrderDO;
import com.example.mysqlshardingsphere.domain.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MysqlShardingSphereApplicationTests {
    @Autowired
	private OrderMapper orderMapper;

	@Test
	void contextLoads() {
		for (int i = 0; i < 100; i++) {
			OrderDO orderDO = new OrderDO();
			orderDO.setOrderId(i);
			orderDO.setOrderName("订单序号"+i);
			orderMapper.insert(orderDO);
		}
	}

}
