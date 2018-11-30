package com.yu.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 * @program: microservicecloud
 * @description:
 * @author: yu.God
 * @create: 2018-11-26 14:17
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //表现负载均衡  软负载均衡客户端组件
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
