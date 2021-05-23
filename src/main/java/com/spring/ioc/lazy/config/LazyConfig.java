package com.spring.ioc.lazy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.spring.ioc.vo.Dog;

@Configuration
public class LazyConfig {
	
    /**
     * 懒加载：针对单实例bean
     *         容器启动时不创建对象，当且仅当第一次获取bean是创建对象
     * @return
     */
	//@Lazy
	@Bean
	public Dog dog(){
		return new Dog();
	}
}
