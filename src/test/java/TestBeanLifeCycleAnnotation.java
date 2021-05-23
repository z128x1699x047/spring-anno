import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.beanLifeCycle.config.BeanLifeCycleConfigration;
import com.spring.ioc.lazy.config.LazyConfig;

public class TestBeanLifeCycleAnnotation {
	@Test
	public void testMain(){
		AnnotationConfigApplicationContext app = 
				new AnnotationConfigApplicationContext(BeanLifeCycleConfigration.class);
		System.out.println("IOC容器创建完成");
		app.close();
	}

}
