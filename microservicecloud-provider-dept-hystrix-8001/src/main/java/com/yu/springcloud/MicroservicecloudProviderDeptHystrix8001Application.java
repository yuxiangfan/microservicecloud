package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MicroservicecloudProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptHystrix8001Application.class, args);
    }
}
