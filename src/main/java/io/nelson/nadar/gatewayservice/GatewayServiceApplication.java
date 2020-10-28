package io.nelson.nadar.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.zuul.ZuulFilter;

import io.nelson.nadar.filter.AddRequestHeaderFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@Configuration
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	
	@Bean
	public AddRequestHeaderFilter getMyFilter() {
		return new AddRequestHeaderFilter();
	}

}
