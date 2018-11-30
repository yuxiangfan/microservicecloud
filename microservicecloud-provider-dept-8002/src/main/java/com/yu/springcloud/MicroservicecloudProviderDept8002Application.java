package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8002Application.class, args);
    }
}
