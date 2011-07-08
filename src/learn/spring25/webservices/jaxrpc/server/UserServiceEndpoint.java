package learn.spring25.webservices.jaxrpc.server;

import java.util.ArrayList;
import java.util.List;

import learn.spring25.Document;
import learn.spring25.UserService;

import org.springframework.remoting.jaxrpc.ServletEndpointSupport;

public class UserServiceEndpoint extends ServletEndpointSupport implements UserService {
	public boolean loginUser(String username, String password) {
		if(username.equalsIgnoreCase("admin") && password.equals("password1")) {
			System.out.println("User Access Granted");
			return true;
		}
		System.out.println("User Access Denied");
		return false;
	}

	public void registerUser(String username) {
		System.out.println("User Registered");
	}

	public List<Document> searchDocuments(String name) {
		System.out.println("Searching for " + name);
		List<Document> l = new ArrayList<Document>();
		l.add(new Document());
		l.add(new Document("QWERTY"));
		l.add(new Document("ALPHA"));
		return l;
	}	
}
