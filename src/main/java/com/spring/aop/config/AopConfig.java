package com.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.aop.Calculator;
import com.spring.aop.LogAspects;
/**
 * 日志切面类的方法类，要动态通知到 对应的目标类的业务方法上运行
 * @author pt -zhangxinxing
 * 通知方法：//代理链
 *     前置通知：logStart();在执行cal()除法之前运行(@Before)
 *     后置通知：logEnd();  (@After)
 *     环绕通知：logAround();需要手动执行joinPoint.procced()--目标方法(@Around)
 *     异常通知：logExecption():在执行cal()出现异常时通知(@AfterThrowing)
 *     返回通知：logReturn();(@AfterReturning)
 */
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan("com.crbank.aop")
public class AopConfig {

	@Bean
	public Calculator calculator(){
		return new Calculator();
	}
	
	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}
