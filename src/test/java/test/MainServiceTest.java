package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.testare.config.ProjectConfig;
import com.testare.service.MainService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProjectConfig.class)

public class MainServiceTest {
	
	@Autowired
	private MainService service;
	
	@Test
	public void checkMainServiceInjection() {
		// vedem daca beanul este initializat
		Assert.notNull(service);
	}
	
	@Test	
	@Repeat(10) // daca vrem sa repetam de multe ori
	@Timed(millis = 10000) // nu ar trb sa dureze mai mult de 10 secunde
	public void checkHelloService() {
		String hello = service.helloService();
		Assert.isTrue("Hello".equals(hello), "HelloService does not return hellp");
	}
	
}
