package com.gwolf.microcloud.config;

import com.gwolf.microcloud.filter.AuthorizedRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {
    @Bean
    public AuthorizedRequestFilter getAuthorizedRequestFilter_() {
        return new AuthorizedRequestFilter();
    }
}
