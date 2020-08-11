package com.springboot.clgproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basic {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring";
	}
	

}
