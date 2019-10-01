package com.ljk.spring.cloud.controller;

import com.ljk.spring.cloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangkui
 * @version 1.0, 2019-09-21 15:46
 */
@RestController
public class ServiceController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private FeignService feignService;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("consul-server");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancerClient.choose("consul-server").getUri().toString();
    }

    @RequestMapping("/callShowName")
    public Object callShowName(String name) {
        return feignService.callShowName(name);
    }

    @RequestMapping("/callHello")
    public Object callHello() {
        return feignService.callHello();
    }
}
