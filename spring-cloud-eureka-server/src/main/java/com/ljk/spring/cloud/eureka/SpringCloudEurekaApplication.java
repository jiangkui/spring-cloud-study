package com.ljk.spring.cloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka：http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html
 *
 * @author jiangkui
 * @version 1.0, 2019-10-01 07:15
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
