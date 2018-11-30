package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroservicecloudProviderDeptHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptHystrixDashboardApplication.class, args);
    }
}
