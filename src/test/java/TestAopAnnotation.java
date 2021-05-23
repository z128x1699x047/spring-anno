import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.Calculator;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.config.AutowiredQualifierPrimaryAndResource;
/**
 * 用aop时，如果目标类的方法像使用aop则，bean需要从容器中那，才有效
 * @author pt -zhangxinxing
 *
 */
public class TestAopAnnotation {
    @Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(com.spring.aop.config.AopConfig.class);
		System.out.println("-----Ioc容器创建完成----");
		Calculator calculator = app.getBean(Calculator.class);
		int count = calculator.cal(8, 4);//AOP的调用
	    System.out.println(count);
	    System.out.println("-----calculator抛出异常----");
		int count1 = calculator.cal(8, 0);
	    System.out.println(count1);
    }
	
}
