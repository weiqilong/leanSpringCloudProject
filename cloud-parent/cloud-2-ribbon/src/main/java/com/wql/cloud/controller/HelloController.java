package com.wql.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wql.cloud.pojo.Student;
import com.wql.cloud.service.HelloService;

@RestController
@RequestMapping("/hello2")
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hi2")
	public String hi(){
		String hi = helloService.ribbonhi();
		return "ribbon "+hi;
	}
	
	@RequestMapping("/student")
	public Student student(){
		Student st = new Student();
		st.setId(1);
		st.setName("张三");
		return st;
	}
}
