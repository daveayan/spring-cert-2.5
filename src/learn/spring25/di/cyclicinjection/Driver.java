package learn.spring25.di.cyclicinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/di/cyclicinjection/applicationContext.xml");

		System.out.println("Asking for bean");
		ctx.getBean("beanB");
		
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext(
				new String[] {
						"learn/spring25/di/cyclicinjection/applicationContext_A.xml",
						"learn/spring25/di/cyclicinjection/applicationContext_B.xml" });
		
		System.out.println("Asking for bean");
		ctx1.getBean("beanA");
	}
}