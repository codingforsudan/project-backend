package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/")
	public String mainPage() {
		
		return "Hello from main page";
	}
	
	@GetMapping("/stores")
	public String sayHello() {
		
		return "Hello from Spring Boot";
	}
	
	@GetMapping("/stores/doors")
	public String say() {
		
		return "stores/doors";
	}
	
	

}
