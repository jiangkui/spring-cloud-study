package com.ljk.spring.cloud.service;

import com.google.common.collect.Maps;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author jiangkui
 * @version 1.0, 2019-10-01 16:34
 */
@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(Map<String, Object> parameters) {
        //do stuff that might fail
        return Maps.newHashMap();
    }

    public Object defaultStores(Map<String, Object> parameters) {
        return new Object();
    }
}
