package learn.spring25;

import java.util.List;

public class WsUserDao {
	
	public void registerUser(String username) {
		this.someLocalMethod();
		userService.registerUser(username);
	}
	
	public void someLocalMethod () {
		System.out.println("This method is not traced");
	}
	
	public void loginUser (String username, String password) {
		userService.loginUser(username, password);
	}
	
	public List<Document> searchDocuments(String name) {
		return userService.searchDocuments(name);
	}
	
	public void setUserService(UserService userService) {
		System.out.println("In WsUserDao::setUserService");
		this.userService = userService;
	}

	public int factorial(int n) {
		int result = 0;
		if (n == 0)
			result = 1;
		else
			result = n * factorial(n - 1);

		return result;
	}
	
	public WsUserDao() {
		System.out.println("In WsUserDao::WsUserDao");
	}
	
	private UserService userService;
}
