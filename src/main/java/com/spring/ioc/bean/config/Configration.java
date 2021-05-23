package com.spring.ioc.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ioc.vo.Dog;

@Configuration//配置类
public class Configration {
	/**除非指定，否则会根据方法名来取beanId   
	 * Aotuwird也是先根据属性名拿beanid，没有就根据属性的类型
	 */
	@Bean//("dog")
 	public Dog getDog(){
		return new Dog();
	}
	
	@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"丽丽");
	}
}
