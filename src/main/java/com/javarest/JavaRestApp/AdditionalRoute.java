package com.javarest.JavaRestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionalRoute {
	@RequestMapping("/2")
	public String index() {
		return "Additonal Route";
	}
}
