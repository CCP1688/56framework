package com.gwolf.commons.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class MyLoadBalance {
    @Bean
    public IRule ribbonRule() {//其中IRule是所有规则的标准
        return new RandomRule();
    }
}
