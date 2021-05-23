import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.lazy.config.LazyConfig;

public class TestLazyAnnotation {
	@Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(LazyConfig.class);
		System.out.println("--容器被创建--");
		//拿到容器中的所有beanId 和 容器beanId
		String[] beanNames = app.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(beanName);
		}
	}

}
