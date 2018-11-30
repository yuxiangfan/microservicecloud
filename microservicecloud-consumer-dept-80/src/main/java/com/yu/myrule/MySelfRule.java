package com.yu.myrule;
/*
 * @program: microservicecloud
 * @description:
 * @author: yu.God
 * @create: 2018-11-27 15:26
 **/

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //return new RandomRule();
        return new RandomRule_yxf();
    }
}
