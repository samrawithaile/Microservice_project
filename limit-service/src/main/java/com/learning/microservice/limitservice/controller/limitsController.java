package com.learning.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.limitservice.bean.Limits;
import com.learning.microservice.limitservice.configuration.Configuration;

@RestController
public class limitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinmum(), configuration.getMaxmum());
	}


}
