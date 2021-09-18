package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class holaMundo {
	
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo java....";
	}
}
