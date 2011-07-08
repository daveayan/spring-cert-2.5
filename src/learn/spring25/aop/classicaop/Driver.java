package learn.spring25.aop.classicaop;

import learn.spring25.WsUserDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/aop/classicaop/applicationContext.xml");

		WsUserDao dao = (WsUserDao) ctx.getBean("userClientDao");
		dao.registerUser("AAA");
		
		dao.loginUser("AAA", "BBB");
		
		System.out.println("************** At this point aop would not trace super.toString()");
		System.out.println(dao.searchDocuments("AAA"));
		
		System.out.println("************** At this point aop would not trace recursive calls");
		System.out.println(dao.factorial(4));
		
		dao.searchDocuments(null);
	}
}