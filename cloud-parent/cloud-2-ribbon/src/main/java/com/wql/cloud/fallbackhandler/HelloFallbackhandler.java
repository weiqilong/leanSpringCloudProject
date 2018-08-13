package com.wql.cloud.fallbackhandler;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.netflix.hystrix.HystrixInvokableInfo;
import com.netflix.ribbon.hystrix.FallbackHandler;

import rx.Observable;

public class HelloFallbackhandler implements FallbackHandler<String>{
	
	private static Log logger = LogFactory.getLog(HelloFallbackhandler.class);
	
	@Override
	public Observable<String> getFallback(HystrixInvokableInfo<?> hystrixInfo, Map<String, Object> requestProperties) {
		logger.info("熔断handler"+hystrixInfo);
		logger.info("熔断handler"+requestProperties);
		return null;
	}

}
