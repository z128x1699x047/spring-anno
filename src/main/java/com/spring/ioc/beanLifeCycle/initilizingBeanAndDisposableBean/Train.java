package com.spring.ioc.beanLifeCycle.initilizingBeanAndDisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {

	public Train(){
		System.out.println("train被创建完成");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----destroy-----");
	}
    //属性设值和初始化完成时调用
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
        System.out.println("----afterPropertiesSet-----");
	}

}
