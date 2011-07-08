package learn.spring25;

import java.util.List;

public interface UserService {
	public void registerUser(String username) ;
	
	public boolean loginUser(String username, String password) ;
	
	public List<Document> searchDocuments(String name) ;
}
