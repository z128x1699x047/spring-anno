package com.spring.ioc.componentScan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.spring.ioc.vo.Dog;
/**
 * 扫描流程：refresh--invokeBeanFactoryPostProcessors--invokeBeanFactoryPostProcessors
 * --invokeBeanDefinitionRegistryPostProcessors--postProcessBeanDefinitionRegistry--
 * processConfigBeanDefinitions--parse--processConfigurationClass--doProcessConfigurationClass--
 * componentScanParser.parse--ClassPathBeanDefinitionScanner(componentScan.getBoolean("useDefaultFilters"), this.environment, this.resourceLoader))
 * --registerDefaultFilters--this.includeFilters.add(new AnnotationTypeFilter(Component.class));
 * @author pt -zhangxinxing
 *
 */
@Configuration//配置类   点进去
//@ComponentScan(value="com.crbank.componentScan")//把指定包及子包下的类注入包容器中来。配置容器中有的bean依然会有
@ComponentScan(value={"com.crbank.componentScan"},includeFilters={
				@Filter(type=FilterType.ANNOTATION,classes={Controller.class})
				//@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={OrderController.class})
		        },
		        useDefaultFilters=false)//useDefaultFilters=true会扫描所有被conponent注解  注解过的类和注解
public class Configration {
	/**除非指定，否则会根据方法名来取beanId   
	 * Aotuwird也是先根据属性名拿beanid，没有就根据属性的类型
	 */
	@Bean//("dog")
 	public Dog getDog(){
		return new Dog();
	}
	
	@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"丽丽");
	}
}
