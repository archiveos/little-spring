package com.cracker.springframework.test.bean;

import com.cracker.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "cracker，北京，亦庄");
        hashMap.put("10002", "cracker2，上海，尖沙咀");
        hashMap.put("10003", "cracker3，天津，东丽区");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
