package com.spring.ioc.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		//点击对应的Test方法--run as--run configrations--Arguments--VM--修改环境变量:-Dos.name=linux
		if(os_name.contains("linux")){
			return true;
		}
		return false;
	}

}
