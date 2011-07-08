package learn.spring25;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

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
//		l.addAll(documentDao.getAllDocuments());
		return l;
	}
	
	public UserServiceImpl(){
		System.out.println("In UserServiceImpl::UserServiceImpl");
	}
	
	public void setDocumentDao(DocumentDao documentDao) {
		System.out.println("In UserServiceImpl::setDocumentDao");
		this.documentDao = documentDao;
	}

	private DocumentDao documentDao;
}