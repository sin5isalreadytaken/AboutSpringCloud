package com.example.springcloud.interfaces.impl;

import com.example.springcloud.interfaces.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wenxiangzhou on 2017/6/14.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return -9999;
    }
}
