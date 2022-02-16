package springdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerTest {
	
	

	@Test
	@DisplayName("ture method")
	void testgetName() {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Customer c1 = (Customer)context.getBean("customer");
		Customer c2 = (Customer)context.getBean("customer");
		assertEquals(c1,c2);
	}

}
