package com.spring.ioc.factoryBean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ioc.factoryBean.MyFactoryBean;
import com.spring.ioc.vo.Dog;

@Configuration//≈‰÷√¿‡
public class FactoryBeanConfigration {
	
	@Bean
 	public MyFactoryBean getDog(){
		return new MyFactoryBean();
	}
}
