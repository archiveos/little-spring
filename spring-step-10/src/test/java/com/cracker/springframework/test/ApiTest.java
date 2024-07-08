package com.cracker.springframework.test;

import com.cracker.springframework.context.support.ClassPathXmlApplicationContext;
import com.cracker.springframework.test.event.CustomEvent;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
