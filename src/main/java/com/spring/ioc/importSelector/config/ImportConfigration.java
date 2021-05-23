package com.spring.ioc.importSelector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.ioc.importBeanDefinitionRegistrar.MyImportBean;
import com.spring.ioc.importSelector.MyImportSelector;
import com.spring.ioc.vo.Dog;
import com.spring.ioc.vo.Person;

@Import({Dog.class/*,Person.class*/,MyImportSelector.class,MyImportBean.class})//此时的beanId是类的全名
@Configuration//配置类
public class ImportConfigration {
	/**除非指定，否则会根据方法名来取beanId   
	 * Aotuwird也是先根据属性名拿beanid，没有就根据属性的类型
	 */
	/*@Bean//("dog")
 	public Person getDog(){
		return new Person();
	}*/
	
	/*@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"丽丽");
	}*/
}
