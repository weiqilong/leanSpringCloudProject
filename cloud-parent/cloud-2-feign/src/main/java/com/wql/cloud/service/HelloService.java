package com.wql.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wql.cloud.service.impl.HelloServiceImplHystrix;

/*@FeignClient(value="service",fallback=HelloServiceImplHystrix.class)
public interface HelloService {
	
	@RequestMapping("/hello/hi")
	public String hi();
}*/

/*
 * 上面注释的两种方式都可以
 */
@FeignClient(value="service/hello",fallback=HelloServiceImplHystrix.class)
public interface HelloService {
	/**
	 * 调用service的hi服务
	 * 作者:weiqilong
	 * 创建时间:2018年8月2日 下午3:54:17
	 * @return
	 */
	@RequestMapping("/hi")
	public String hi();
}