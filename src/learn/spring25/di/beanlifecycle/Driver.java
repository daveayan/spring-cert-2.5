package learn.spring25.di.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/di/beanlifecycle/applicationContext.xml");

		System.out.println("Asking for bean");
		ctx.getBean("beanImplementingInterfaces");
		ctx.getBean("beanWithCallbackMethods");
		ctx.getBean("beanWithAnnotations");
	}
}