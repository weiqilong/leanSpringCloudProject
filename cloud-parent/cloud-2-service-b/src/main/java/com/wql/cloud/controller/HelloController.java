package com.wql.cloud.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private static Log logger = LogFactory.getLog(HelloController.class);
	@RequestMapping("/hi")
	public String hi(){
		logger.info("i am service B");
		if(1==1){
			throw new RuntimeException("service B error");
		}
		
		return "i am service B";
	}
}
