package com.ljk.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiangkui
 * @version 1.0, 2019-09-21 15:45
 */
@SpringBootApplication
@EnableDiscoveryClient // 启用服务注册与发现
public class ConsulProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication.class, args);
    }
}
