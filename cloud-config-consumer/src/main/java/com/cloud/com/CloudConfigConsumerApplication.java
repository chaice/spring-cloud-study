package com.cloud.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigConsumerApplication.class, args);
    }
}
