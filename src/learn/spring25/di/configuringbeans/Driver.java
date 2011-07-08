package learn.spring25.di.configuringbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/di/configuringbeans/applicationContext.xml");

		System.out.println("Asking for bean");
		System.out.println(ctx.getBean("documentBySetters"));
		System.out.println(ctx.getBean("documentByConstructor"));
		System.out.println(ctx.getBean("documentByPrefix"));
		System.out.println(ctx.getBean("documentByMix"));
		System.out.println(ctx.getBean("documentByMixRef"));
		System.out.println(ctx.getBean("documentBySettersInnerContent"));
		System.out.println(ctx.getBean("documentByContructorsInnerContent"));		
	}
}