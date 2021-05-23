import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.config.AutowiredQualifierPrimaryAndResource;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.controllerResourceAndInject.TestController;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.serviceAutoWiredQulifierAndPrimary.TestService;
import com.spring.ioc.bean.config.Configration;

public class TestAutowiredQualifierPrimaryAndResourceAnno {

	@Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(AutowiredQualifierPrimaryAndResource.class);
		System.out.println("--ÈÝÆ÷±»´´½¨--");
		/*TestDao testDao = app.getBean(TestDao.class);
		System.out.println(testDao);*/
		TestService testService = app.getBean(TestService.class);
		testService.print();
		TestController testController = app.getBean(TestController.class);
		//System.out.println(testController);
		testController.print();
	}
}
