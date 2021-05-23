package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 日志切面类@Aspect   @EnableAspectJAutoProxy使用aop的开关
 * @author pt -zhangxinxing
 *
 */
@Aspect
public class LogAspects {
    
	//execution   方法名 ：public int div(int,int)  具体时哪个目标类的方法：com.crbank.aop.Calculator.div
	//@Before("execution(public int com.crbank.aop.Calculator.div(int,int))")
	//@Before("execution(public int com.crbank.aop.Calculator.*(..))")
	@Before("pointCut()")
	public void logStart(){
		System.out.println("---除法运行前先进行参数校验：@Before---");
	}
	//@After("execution(public int com.crbank.aop.Calculator.div(int,int))")
	@After("pointCut()")
	public void logEnd(){
		System.out.println("---除法结束：@After---");
	}
	//@AfterReturning("execution(public int com.crbank.aop.Calculator.div(int,int))")
	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("---除法正常结束返回：@AfterReturning结果是：{}---");
	}   
	/**
	 * 注意：如果在环绕通知时抓住异常，就会程序异常
	 */
	//@AfterThrowing("execution(public int com.crbank.aop.Calculator.div(int,int))")
	@AfterThrowing("pointCut()")
	public void logExeception(){
		System.out.println("---除法出现异常：@AfterThrowing---");
	}
	//@Around("execution(public int com.crbank.aop.Calculator.div(int,int))")
	@Around("pointCut()")
	public /*void*/Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("---除法环绕通知之前：@Around---");
		Object obj = null;
		/*try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {			
			e.printStackTrace();
		}*/
		obj = joinPoint.proceed();
		System.out.println("---除法环绕通知之后：@Around---");
		return obj;
	}
	/**
	 * 或者定义一个切点，只写一个表达式，其他的通知引用切点
	 * public int cal(int i,int j)
	 */
	@Pointcut("execution(public int com.spring.aop.Calculator.cal(..))")
	public void pointCut(){}
}
