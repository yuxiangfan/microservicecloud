package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yu.springcloud"})
@ComponentScan("com.yu.springcloud")
public class MicroservicecloudConsumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDeptFeignApplication.class, args);
    }
}
