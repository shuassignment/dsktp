package com.mm.eureka.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloWorldController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		String message=restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
		model.addAttribute("message",message);
		return "hello";
	}
}
