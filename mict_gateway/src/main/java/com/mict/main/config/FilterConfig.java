package com.mict.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mict.main.filter.ErrorFilter;
import com.mict.main.filter.PostFilter;
import com.mict.main.filter.PreFilter;
import com.mict.main.filter.RouteFilter;

@Configuration
public class FilterConfig {

	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
	
}
