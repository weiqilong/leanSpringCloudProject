package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 8767
 * 配置中心
 * @author weiqilong
 * CREATE TIME 2018年8月7日 下午3:58:12
 */
@SpringBootApplication
//启用配置中心
@EnableConfigServer
//注册服务
@EnableEurekaClient
//配置中心-bus-refresh
@RefreshScope
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
