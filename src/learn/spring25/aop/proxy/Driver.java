package learn.spring25.aop.proxy;

import learn.spring25.UserService;
import learn.spring25.UserServiceImpl;

public class Driver {
	public static void main(String[] args) {
		try {
			UserService userService = (UserService) ValidationHandler
					.createProxy(LoggingHandler
							.createProxy(new UserServiceImpl()));
			userService.registerUser("AAA");
			System.out.println("----------------------------");
			userService.registerUser(null);
		} catch (Throwable th) {
			System.out.println("EXCEPTION : " + th.getMessage());
		}
		
		System.out.println("\n==========================\n");
		
		try {
			UserService userService = (UserService) LoggingHandler
					.createProxy(ValidationHandler
							.createProxy(new UserServiceImpl()));
			userService.registerUser("AAA");
			System.out.println("----------------------------");
			userService.registerUser(null);
		} catch (Throwable th) {
			System.out.println("EXCEPTION : " + th.getMessage());
		}
	}
}