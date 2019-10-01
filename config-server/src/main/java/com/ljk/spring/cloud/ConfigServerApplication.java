package com.ljk.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring config server Demo：
 * - http://www.ityouknow.com/springcloud/2017/05/22/springcloud-config-git.html
 * - https://spring.io/projects/spring-cloud-config
 * - git 账号密码加密：https://cloud.tencent.com/developer/article/1081843
 *
 * @author jiangkui
 * @version 1.0, 2019-10-02 06:51
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
