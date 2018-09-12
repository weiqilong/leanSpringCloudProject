package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign 8765
 * @author weiqilong
 * 创建时间:2018年8月2日 下午3:49:49
 */
@EnableEurekaClient
@SpringBootApplication
//启用feign
@EnableFeignClients
@EnableHystrixDashboard
@EnableTurbine
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
