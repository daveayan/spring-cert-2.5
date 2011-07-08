package learn.spring25.remoting.server.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("learn/spring25/remoting/server/rmi/rmiServer.xml");
	}
}