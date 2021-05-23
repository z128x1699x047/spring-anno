package com.spring.ioc.beanLifeCycle;

public class Bike {

	public Bike(){
		System.out.println("---无参构造Bike被添加入容器---");
	}
	
	public void init(){
		System.out.println("---Bike初始化完成---");
	}
	
    public void destory(){
    	System.out.println("---Bike已被销毁---");
	}
}
