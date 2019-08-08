package com.example.springmvcboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello(){
		System.out.println("hello");
		return "/hello";
	}
	
	
}
