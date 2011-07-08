package learn.spring25.di.propertyfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/di/propertyfiles/applicationContext_pre25_way.xml");

		System.out.println("Asking for bean");
		System.out.println(ctx.getBean("beanA"));

		ApplicationContext ctx1 = new ClassPathXmlApplicationContext(
				"learn/spring25/di/propertyfiles/applicationContext_25_way.xml");

		System.out.println("Asking for bean");
		System.out.println(ctx1.getBean("beanA"));
	}
}