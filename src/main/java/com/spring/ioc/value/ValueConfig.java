package com.spring.ioc.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:test.properties")
public class ValueConfig {

	@Bean
	public User user(){
		return new User();
	}
}
