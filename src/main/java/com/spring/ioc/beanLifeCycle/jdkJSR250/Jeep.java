package com.spring.ioc.beanLifeCycle.jdkJSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Jeep {

	public Jeep(){
		System.out.println("------Jeep创建完成------");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("-----jeep由jdk注解@PostConstruct初始化----");
	}
	@PreDestroy
	public void destory(){
		System.out.println("-----jeep由jdk注解@PostConstruct销毁----");
	}
}
