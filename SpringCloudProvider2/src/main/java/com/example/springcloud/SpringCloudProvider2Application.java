package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProvider2Application.class, args);
	}
}
