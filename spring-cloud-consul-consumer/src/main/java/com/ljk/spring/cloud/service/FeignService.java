package com.ljk.spring.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign client demo
 *
 * @author jiangkui
 * @version 1.0, 2019-10-01 11:47
 */
@FeignClient(name = "consul-server")
public interface FeignService{

    @RequestMapping(value = "/showName")
    String callShowName(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello")
    String callHello();
}
