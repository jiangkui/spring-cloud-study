package com.ljk.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangkui
 * @version 1.0, 2019-10-02 07:27
 */
@RestController
public class ConfigController {

    @Value("${configFile}")
    private String name;

    @RequestMapping("/configName")
    public String from() {
        return this.name;
    }
}
