package com.spring.ioc.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Ajax {
  
	@Async//异步执行
	public void a(){
		try {
			Thread.sleep(1000);
			System.out.println("a被执行了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void test(){
		 a();
		 System.out.println("test被执行了");
	}
}
