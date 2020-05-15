package com.cloud.com.controller;

import com.cloud.com.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/hello/{name}")
    public String index(@PathVariable String name) {
        return consumerService.hello2(name);
    }
}
