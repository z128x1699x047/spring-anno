package com.spring.ioc.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import com.spring.ioc.vo.Person;

public class MyFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---------MyFactoryBean¥¥Ω®¡À----------");
		return new Person("lisi",23);
	}
 
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Person.class;
	}

}
