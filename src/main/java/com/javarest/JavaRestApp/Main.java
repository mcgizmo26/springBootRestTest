package com.javarest.JavaRestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	
	@RequestMapping("/")
	public String index() {
		return "Test";
	}
}
