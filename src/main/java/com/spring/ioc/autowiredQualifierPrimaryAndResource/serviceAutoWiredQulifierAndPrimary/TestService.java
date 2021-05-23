package com.spring.ioc.autowiredQualifierPrimaryAndResource.serviceAutoWiredQulifierAndPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;
/**
 * @Primary和@Qualifier都是用来修饰@Autowired的，表示优先级
 * 当@Primary一般在全局配置的bean上
 * 如果当前TestService中没有加@Qualifier，则使用配置文件中加了@Primary注解的哪个bean
 * 如果当前TestService中加了@Qualifier，则使用配置文件中加了@@Qualifier注解的哪个bean
 * @author pt -zhangxinxing
 *
 */
@Service
public class TestService {

	@Qualifier("testDao")//比@Autowired的优先级要高
	@Autowired//优先级比全局配置文件的@bean高，先找beanId=testDao，若果没有则按类型找,可以写在方法上和参数前
	private TestDao testDao;
	
	public void print(){
		System.out.println(testDao);
	}
}
