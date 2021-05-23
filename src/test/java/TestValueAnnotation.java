import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.spring.ioc.lazy.config.LazyConfig;
import com.spring.ioc.value.ValueConfig;

public class TestValueAnnotation {
	@Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(ValueConfig.class);
		System.out.println("--容器被创建--");
		//拿到容器中的所有beanId 和 容器beanId
		String[] beanNames = app.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(beanName);
			System.out.println(app.getBean(beanName));
		}
		Environment environment = app.getEnvironment();
		System.out.println(environment.getProperty("user.color"));
	}

}
