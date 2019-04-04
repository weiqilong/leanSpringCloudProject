package com.wql.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wql.cloud.service.HelloService;

@RestController
@RequestMapping("/hello1")
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hi1")
	public String hi(){
		String hi = helloService.feignhi();
		return "feign-"+hi;
	}
}
