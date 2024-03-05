package com.example.mysqlshardingsphere;

import com.example.mysqlshardingsphere.domain.entity.OrderDO;
import com.example.mysqlshardingsphere.domain.mapper.OrderMapper;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class MysqlShardingSphereApplicationTests {
    @Autowired
	private OrderMapper orderMapper;

	@Test
	void contextLoads() throws Exception{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("11","11");
		System.out.println(jsonObject);

	}

	@Test
	void checkReginStr(){
		String str = "a b";
		String reg = "\\b[a-zA-Z]\\b";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		System.out.println(m.find());

		if (m.find()){
			System.out.println("regin find:"+m.group());
		}

	}

}
