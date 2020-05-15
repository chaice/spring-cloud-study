package com.cloud.com.service;

import com.cloud.com.service.impl.ConsumerHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloud-producer2", fallback = ConsumerHystrixServiceImpl.class)
public interface ConsumerService {

    @RequestMapping(value = "/hello")
    String hello2(@RequestParam(value = "name") String name);
}
