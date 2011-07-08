package learn.spring25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/applicationContext.xml");

		WsUserDao dao = (WsUserDao) ctx.getBean("userClientDao");
		dao.registerUser("AAA");
		dao.loginUser("AAA", "BBB");
		dao.searchDocuments("AAA");
	}
}