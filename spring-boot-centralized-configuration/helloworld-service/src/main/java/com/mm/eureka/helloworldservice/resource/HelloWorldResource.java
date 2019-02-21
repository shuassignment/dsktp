package com.mm.eureka.helloworldservice.resource;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
public class HelloWorldResource {

	
	@GetMapping
	public String hello() {
		return "Hello !!!!";
	}
}
