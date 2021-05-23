package com.spring.ioc.beanLifeCycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.ioc.beanLifeCycle.Bike;
import com.spring.ioc.beanLifeCycle.beanPostProcessor.MyBeanPostProcessor;
import com.spring.ioc.vo.Dog;

@Configuration//≈‰÷√¿‡
@ComponentScan("com.crbank.beanLifeCycle")
public class BeanLifeCycleConfigration {
	
	/*@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"¿ˆ¿ˆ");
	}*/
	
	@Bean(initMethod="init",destroyMethod="destory")
 	public Bike bike(){
		return new Bike();
	}
	
	@Bean(initMethod="init")
 	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}
}
