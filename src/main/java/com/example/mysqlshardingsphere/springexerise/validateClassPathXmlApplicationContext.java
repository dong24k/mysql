package com.example.mysqlshardingsphere.springexerise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wei.dong
 * @Date 2023/12/16 15:49
 * @Version 1.0.0
 */
public class validateClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public validateClassPathXmlApplicationContext(String... configuration){
        super(configuration);
    }

    @Override
    protected void initPropertySources() {
        getEnvironment().setRequiredProperties("VAR");
    }

    public static void main(String[] args) {
        ApplicationContext bf = new validateClassPathXmlApplicationContext("");
        bf.getBean("testBean");
    }
}
