package learn.spring25.jmx.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/jmx/xml/appContext_With_MBeanServer.xml");
		System.in.read();
	}
}