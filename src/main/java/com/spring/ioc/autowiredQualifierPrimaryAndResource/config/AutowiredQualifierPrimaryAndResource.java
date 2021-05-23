package com.spring.ioc.autowiredQualifierPrimaryAndResource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;

@Configuration
@ComponentScan("com.crbank.base.autowiredQualifierPrimaryAndResource")
public class AutowiredQualifierPrimaryAndResource {

	@Primary
	@Bean("testDao2")
	public TestDao testDao(){
		TestDao testDao = new TestDao();
		testDao.setFlag("2");
		return testDao;
	}
}
