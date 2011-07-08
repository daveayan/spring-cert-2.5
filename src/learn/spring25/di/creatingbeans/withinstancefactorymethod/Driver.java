package learn.spring25.di.creatingbeans.withinstancefactorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/di/creatingbeans/withinstancefactorymethod/applicationContext.xml");

		System.out.println("Asking for bean");
		System.out.println(ctx.getBean("document"));		
	}
}