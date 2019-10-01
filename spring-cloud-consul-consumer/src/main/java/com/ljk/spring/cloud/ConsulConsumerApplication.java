package com.ljk.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jiangkui
 * @version 1.0, 2019-09-21 15:45
 */
@SpringBootApplication
@EnableFeignClients
public class ConsulConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class, args);
    }
}
