package com.example.springcloud.interfaces;

import com.example.springcloud.interfaces.impl.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wenxiangzhou on 2017/6/14.
 */
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class)//绑定该接口对应compute-service服务,fallback属性指定回调类作为断路器
public interface ComputeClient {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
