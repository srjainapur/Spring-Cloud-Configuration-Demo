package com.java.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${msg:Hello world - Config Server is not working..pelase check}")
	private String message;
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getMessage() {
		return message;
	}
}
