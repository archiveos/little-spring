package com.cracker.springframework.test;

import com.cracker.springframework.beans.BeansException;
import com.cracker.springframework.beans.factory.config.BeanPostProcessor;
import com.cracker.springframework.context.support.ClassPathXmlApplicationContext;
import com.cracker.springframework.test.bean.IUserService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }


}
