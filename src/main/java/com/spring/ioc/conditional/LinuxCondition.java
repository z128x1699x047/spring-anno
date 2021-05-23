package com.spring.ioc.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
	
    /**
     * ConditionContext:判断条件可以使用的上下文（操作环境）
     * AnnotatedTypeMetadata：注解的信息
     */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO 是否为linux
		//能获取到IOC容器正在使用的BeanFactory
		ConfigurableListableBeanFactory configurableListableBeanFactory = 
				context.getBeanFactory();
		//获取当前环境变量（包括我们电脑的操作系统是Linxu还是其他的）
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		if(os_name.contains("Windows")){
			return true;
		}
		return false;
	}

}
