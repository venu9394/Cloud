package com.demo.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControles {
	
	@RequestMapping("welcome/{message}")
	
	public String welcome(@PathVariable String message) {
		
		System.out.println("This is my First Docker images......!!!!");
		return message;
	}

}
