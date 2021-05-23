package com.spring.ioc.beanLifeCycle.beanPostProcessor;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
/**
 * 对初始化的前后置增强
 * @author pt -zhangxinxing
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	
	public MyBeanPostProcessor(){
		System.out.println("---MyBeanPostProcessor被创建---");
	}
	
	public void init(){
		System.out.println("---MyBeanPostProcessor初始化完成---");
	}
     /**
      * 初始化前执行
      */
	 @Override
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("----MyBeanPostProcessor初始化前执行postProcessBeforeInitialization----");	
		 return bean;
	 }
	 /**
      * 初始化后执行
      */
	 @Override
	 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("----MyBeanPostProcessor初始化后执行postProcessAfterInitialization----");		
		 return bean;
	 }
}
