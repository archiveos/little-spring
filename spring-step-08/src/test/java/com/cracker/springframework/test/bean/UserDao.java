package com.cracker.springframework.test.bean;

import com.cracker.springframework.beans.BeansException;
import com.cracker.springframework.context.ApplicationContext;
import com.cracker.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

public class UserDao{

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod(){
        System.out.println("执行：init-method");
        hashMap.put("10001", "cracker");
        hashMap.put("10002", "cracker2");
        hashMap.put("10003", "cracker3");
    }

    public void destroyDataMethod(){
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
