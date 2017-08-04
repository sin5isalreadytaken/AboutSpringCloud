package com.example.springcloud;

import com.example.springcloud.filters.AccessFilter;
import com.example.springcloud.filters.ErrorFilter;
import com.example.springcloud.filters.ThrowExceptionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication//整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}

	@Bean//实例化过滤器
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	@Bean
	public ThrowExceptionFilter throwExceptionFilter() {
		return new ThrowExceptionFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
}
