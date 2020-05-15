package com.cloud.com.service.impl;

import com.cloud.com.service.ConsumerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ConsumerHystrixServiceImpl implements ConsumerService {

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello," + name + ",this message send failed";
    }
}
