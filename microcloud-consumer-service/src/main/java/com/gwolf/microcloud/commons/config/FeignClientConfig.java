package com.gwolf.microcloud.commons.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    @Bean
    public Logger.Level getFeignLoggerLevel() {
     return Logger.Level.FULL;   
    }
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return  new BasicAuthRequestInterceptor("zuul","zuul");
    }
}
