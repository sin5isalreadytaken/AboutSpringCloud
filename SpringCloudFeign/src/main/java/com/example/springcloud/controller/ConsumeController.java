package com.example.springcloud.controller;

import com.example.springcloud.interfaces.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenxiangzhou on 2017/6/14.
 */
@RestController
public class ConsumeController {
    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int add() {
        return computeClient.add(10,21);
    }
}
