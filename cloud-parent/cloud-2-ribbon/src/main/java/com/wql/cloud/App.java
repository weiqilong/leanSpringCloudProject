package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon 8764
 * 监控地址stream地址:http://127.0.0.1:8764/actuator/hystrix.stream
 * 仪表盘地址:http://127.0.0.1:8764/hystrix，然后把stream地址写进去就可以了，title随便写
 * @author weiqilong
 * 创建时间:2018年8月1日 上午11:28:29
 */
@SpringBootApplication
@EnableEurekaClient
////使用熔断器监控，下面三个注解都要启动
@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
	
	/**
	 * @LoadBalanced可以负载均衡
	 * @author weiqilong
	 * CREATE TIME 2018年8月8日 下午5:49:36
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
