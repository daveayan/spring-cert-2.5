package learn.spring25.jms.mdpojo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(
				"learn/spring25/jms/mdpojo/consumer/jmsMessageDrivenPojo-AppContext.xml");
	}
}