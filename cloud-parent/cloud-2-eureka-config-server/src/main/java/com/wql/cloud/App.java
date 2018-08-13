package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 8769
 * 高可用配置中心
 * @author weiqilong
 * CREATE TIME 2018年8月8日 下午4:48:28
 */
@SpringBootApplication
@EnableEurekaServer
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
