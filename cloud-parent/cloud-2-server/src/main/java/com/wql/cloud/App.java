package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心 8761
 * 访问地址 http://127.0.0.1:8761/
 * @author weiqilong
 * 创建时间:2018年7月31日 下午7:22:30
 */
@SpringBootApplication
@EnableEurekaServer
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
