package com.spring.ioc.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.ioc.vo.Dog;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
public class ScopeConfig {
	/**
	 * ConfigurableBeanFactory.SCOPE_PROTOTYPE：容器启动后，每次被调用才创建一个新的bean
	 * ConfigurableBeanFactory.SCOPE_SINGLETON：容器启动前就创建好了，并放到缓存中去了
	 * WebApplicationContext.SCOPE_REQUEST
	 * WebApplicationContext.SCOPE_SESSION
	 * @return
	 */
    //@Scope("prototype")//多实例
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	public Dog dog(){
		return new Dog();
	}
}
