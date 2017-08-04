package com.example.springcloud.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenxiangzhou on 2017/6/15.
 */
public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String result = HttpClientUtil.doPost("http://localhost:7003/bus/refresh", map, "UTF-8");
        System.out.println(result);
    }
}
