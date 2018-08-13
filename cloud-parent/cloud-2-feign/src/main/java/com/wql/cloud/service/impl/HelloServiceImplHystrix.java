package com.wql.cloud.service.impl;

import org.springframework.stereotype.Service;

import com.wql.cloud.service.HelloService;

@Service
public class HelloServiceImplHystrix implements HelloService{

	@Override
	public String hi() {
		return "feign catch error";
	}

}
