package learn.spring25.jms.jmstemplate.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/jms/jmstemplate/consumer/jmsTemplateConsumer-AppContext.xml");
		
		JmsUserServiceImpl service = (JmsUserServiceImpl) ctx.getBean("UserService");
		
		while(true)
			service.processNextMessage();
	}
}