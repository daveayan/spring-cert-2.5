package learn.spring25.jms.transaction.consumer;

import learn.spring25.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/jms/transaction/consumer/jmsTemplateConsumer-AppContext.xml");
		
		UserService service = (UserService) ctx.getBean("UserService");
		
		while(true)
			service.registerUser("aaa");
	}
}