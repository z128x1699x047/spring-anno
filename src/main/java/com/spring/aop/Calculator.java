package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * ����
 * @author pt -zhangxinxing
 * �������ҵ�񷽷�����־
 */
//@Component
public class Calculator {

	public Calculator(){
		System.out.println("---Calculator���������---");
	}
	public int cal(int i,int j){		
		System.out.println("-----ҵ�����------");
		return i/j;
	}
}
