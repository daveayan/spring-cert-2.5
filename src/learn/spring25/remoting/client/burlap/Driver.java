package learn.spring25.remoting.client.burlap;

import learn.spring25.WsUserDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("learn/spring25/remoting/client/burlap/burlapClient.xml");
		
		WsUserDao dao = (WsUserDao) ctx.getBean("userClientDao");
		dao.registerUser("admin");
		dao.loginUser("admin", "password");
		dao.loginUser("admin", "password1");
		System.out.println(dao.searchDocuments("ALL"));
	}
}