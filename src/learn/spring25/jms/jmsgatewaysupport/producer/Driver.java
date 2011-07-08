package learn.spring25.jms.jmsgatewaysupport.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/jms/jmsgatewaysupport/producer/jmsGatewaySupport-AppContext.xml");
		
		JmsWsUserDao userDao = (JmsWsUserDao) ctx.getBean("userServiceDao");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Sending message AAA " + i);
			userDao.registerUser("AAA " + i);
		}
	}
}