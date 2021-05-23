package com.spring.ioc.autowiredQualifierPrimaryAndResource.controllerResourceAndInject;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.serviceAutoWiredQulifierAndPrimary.TestService;
/**
 * @Resource是JDK-jsr250提供的规范
 * @author pt -zhangxinxing
 * @Resource和@Autowired效果一样，可以装配bean
 * @Resource不支持@Qulifier和@Primary
 * @Autowired（false），拿不到bean不会报错
 */
@Controller
public class TestController {
 
	/**
	 * @Inject需要引入第三方jar
	 * JDK-jsr330
	 * 基本等于@Autowired，只是缺少@Autowired（false）功能
	 * 同样可以被@@Qulifier和@Primary修饰
	 */
	@Inject
	//@Resource(name="testDao2")
	private TestDao testDao;
	
	public void print(){
		System.out.println(testDao);
	}
}
