package com.example.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenxiangzhou on 2017/6/14.
 */
@RestController
public class RepeatController {
    private static Logger logger = Logger.getLogger(RepeatController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/repeat", method = RequestMethod.GET)
    public String repeat(@RequestParam String s) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/repeat, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + s);
        return s;
    }
}
