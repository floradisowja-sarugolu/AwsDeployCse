package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "Task Completed by 24P35A0549";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "Welcome to Aditya university";
	}
}