package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@GetMapping("/welcome")
	public String getSecondService() {
		return "Second Service";
	}
}
