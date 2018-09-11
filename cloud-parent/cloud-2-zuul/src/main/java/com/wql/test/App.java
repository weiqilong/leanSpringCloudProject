package com.wql.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul路由网关 8766
 * @author weiqilong
 * 创建时间:2018年8月3日 下午5:38:08
 */
@SpringBootApplication
@EnableEurekaClient
//开启路由
@EnableZuulProxy
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
