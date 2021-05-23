package com.spring.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * aware的这些接口都是在后置处理器中判断并拿到set中的参数的
 * 通过实现aware接口，拿到对应的bean
 * @author pt -zhangxinxing
 *
 */
public class Plane implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
