package com.wql.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {
	
	
	//从git读取配置
	@Value("${myname}")
	private String name;
	
	//从配置中心本地读取配置
	@Value("${mynameiswho}")
	private String name2;
	
	@RequestMapping("/hi")
	public String hi() {
		return "client propertey value1="+name+",value2="+name2;
	}
}
