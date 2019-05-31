package com.java.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	@Value("${datosservidor.minimum}")
	private Integer minimum; 
	
	@Value("${datosservidor.maximum}")
	private Integer maximum;
	
	@Value("${valores.valor_fijo}")
	private String valor_fijo; 
	
	@RequestMapping(value="/getProperty", method=RequestMethod.GET)
	public String getProperties() {
		return minimum + " " + maximum + " " + valor_fijo;
	}
}
