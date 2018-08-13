package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务b
 * @author weiqilong
 * 创建时间:2018年8月1日 上午10:35:53
 */
@SpringBootApplication
@EnableEurekaClient
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
