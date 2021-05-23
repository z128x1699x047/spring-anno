import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.bean.config.Configration;
import com.spring.ioc.vo.Dog;

public class TestBeanAnnotation {

	public static void main(String[] args) {
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(Configration.class);
		System.out.println("--容器被创建--");
		/**
		 * Exception in thread "main" 
		 * org.springframework.beans.factory.NoSuchBeanDefinitionException:
		 *   No bean named 'dog' available
		 */
		//Dog dog = (Dog)app.getBean("dog");//这个会报上面的异常，原因  没有  dog这个beanId
		Dog dog = (Dog)app.getBean("getDog");//@Bean默认的名字
		Dog dog1 = (Dog)app.getBean("dog");//@Bean指定的名字
		String[] beanNames = app.getBeanNamesForType(Dog.class);
		for(String beanName:beanNames){
			System.out.println(Dog.class+"类的beanId是:"+beanName);
		}
		
		System.out.println(dog);
		System.out.println(dog1);//调用对象的toString方法
	}

}
