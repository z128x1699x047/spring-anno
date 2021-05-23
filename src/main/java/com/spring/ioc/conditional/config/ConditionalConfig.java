package com.spring.ioc.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.spring.ioc.conditional.LinuxCondition;
import com.spring.ioc.conditional.WinCondition;
import com.spring.ioc.vo.Dog;
import com.spring.ioc.vo.Person;

@Configuration
public class ConditionalConfig {
	    
	@Bean
	public Dog dog(){
		return new Dog();
	}
	
	@Conditional(LinuxCondition.class)
	@Bean
	public Person lison(){
		return new Person("Lison",23);
	}
	
	@Conditional(WinCondition.class)
	@Bean
	public Person jemes(){
		return new Person("jemes",35);
	}
}
