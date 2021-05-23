import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.bean.config.Configration;
import com.spring.ioc.factoryBean.config.FactoryBeanConfigration;
import com.spring.ioc.vo.Dog;
import com.spring.ioc.vo.Person;
/**
 * app.getBean("getDog")，实际上是调用
 * getBeanFactory().getBean(name)
 *
 */
public class TestFactoryBeanAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = 
				new AnnotationConfigApplicationContext(FactoryBeanConfigration.class);
		System.out.println("--容器被创建--");		
		//Person dog = (Person)app.getBean("getDog");//@Bean默认的名字	
		Object dog = app.getBean("getDog");
		System.out.println(dog); 
		
		Object obj = app.getBean("&getDog");
		System.out.println(obj.getClass());
	}

}
