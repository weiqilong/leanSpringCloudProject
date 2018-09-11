package com.wql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务a 8762
 * @author weiqilong
 * 创建时间:2018年7月31日 下午7:22:37
 */
//@SpringCloudApplication
@SpringBootApplication
@EnableEurekaClient
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
