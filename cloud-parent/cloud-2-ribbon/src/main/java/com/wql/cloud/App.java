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
 * @author weiqilong
 * 创建时间:2018年8月1日 上午11:28:29
 */
@SpringBootApplication
@EnableEurekaClient
//启用熔断
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
