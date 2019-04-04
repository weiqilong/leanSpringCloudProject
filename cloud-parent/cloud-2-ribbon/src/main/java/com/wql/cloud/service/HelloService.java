package com.wql.cloud.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;
	
	private static Log logger = LogFactory.getLog(HelloService.class);
	
	@HystrixCommand(fallbackMethod="ribbonhiError")
	public String ribbonhi(){
		String url = "http://service/hello/hi";
		String forObject = restTemplate.getForObject(url, String.class);
		return forObject;
	}
	
	public String ribbonhiError(){
		logger.info("-ribbon error go hystrix");
		return "-ribbon error go hystrix";
	}
}
