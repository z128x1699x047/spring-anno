package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * 计算
 * @author pt -zhangxinxing
 * 给下面的业务方法加日志
 */
//@Component
public class Calculator {

	public Calculator(){
		System.out.println("---Calculator被创建完成---");
	}
	public int cal(int i,int j){		
		System.out.println("-----业务计算------");
		return i/j;
	}
}
