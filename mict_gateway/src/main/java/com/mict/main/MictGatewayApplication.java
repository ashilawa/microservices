package com.mict.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MictGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MictGatewayApplication.class, args);
	}
}
