package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 8768
 * 访问配置中心的配置文件
 * @author weiqilong
 * CREATE TIME 2018年8月7日 下午5:53:37
 */
@SpringBootApplication
@EnableEurekaClient
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
