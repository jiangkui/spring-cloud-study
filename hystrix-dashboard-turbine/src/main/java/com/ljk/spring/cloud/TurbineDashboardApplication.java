package com.ljk.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Spring Consul & Turbine：
 * - https://cloud.spring.io/spring-cloud-consul/reference/html/#spring-cloud-consul-turbine
 * - https://cloud.tencent.com/developer/article/1147201
 *
 * @author jiangkui
 * @version 1.0, 2019-10-01 22:06
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine // Turbine 支持（Hystrix Dashboard 集群形式）
public class TurbineDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineDashboardApplication.class, args);
    }
}
