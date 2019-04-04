package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * turbin 8773
 * 聚合监控地址stream地址:http://127.0.0.1:8773/turbine.stream
 * 仪表盘地址:http://127.0.0.1:8773/hystrix，然后把stream地址写进去就可以了，title随便写
 * @author weiqilong
 * 创建时间:2018年8月1日 上午11:28:29
 */
@SpringBootApplication
@EnableEurekaClient
//启动聚合监控
@EnableTurbine
//启动熔断仪表盘
@EnableHystrixDashboard
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
