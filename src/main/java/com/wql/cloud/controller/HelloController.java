package com.wql.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author weiqilong
 * CREATE TIME 2018年8月7日 下午6:15:59
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Value("${myname}")
	private String name;
	
	@RequestMapping("/hi")
	public String hi() {
		return "client propertey value="+name;
	}
}
