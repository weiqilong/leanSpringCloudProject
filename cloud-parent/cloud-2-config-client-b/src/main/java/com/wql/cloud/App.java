package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 8770
 * 访问配置中心的配置文件
 * @author weiqilong
 * CREATE TIME 2018年8月10日 上午10:23:51
 */
@SpringBootApplication
@EnableEurekaClient
//配置中心-bus-refresh
@RefreshScope
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
