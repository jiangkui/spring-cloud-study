package com.ljk.spring.cloud.service;

import org.springframework.stereotype.Component;

/**
 * Hystrix fallback 支持
 * Demo: https://cloud.spring.io/spring-cloud-openfeign/reference/html/#spring-cloud-feign-hystrix
 *
 * @author jiangkui
 * @version 1.0, 2019-10-01 15:07
 */
@Component
public class HystrixFallback implements FeignService {

    @Override
    public String callShowName(String name) {
        return "call show name fallback!";
    }

    @Override
    public String callHello() {
        return "call hello fallback!";
    }
}
