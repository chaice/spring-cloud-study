package com.cloud.com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${test.url}")
    private String testUrl;

    @RequestMapping(value = "/test")
    public String test() {
        return testUrl;
    }
}
