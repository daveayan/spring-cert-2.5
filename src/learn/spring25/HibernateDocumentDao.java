package learn.spring25;

import java.util.ArrayList;
import java.util.List;

public class HibernateDocumentDao implements DocumentDao {

	public List<Document> getAllDocuments() {
		List<Document> l = new ArrayList<Document>();
		l.add(new Document());
		l.add(new Document("ZXCVBN"));
		l.add(new Document("BETA"));
		
		return l;
	}
	
	public HibernateDocumentDao() {
		System.out.println("In HibernateDocumentDao::HibernateDocumentDao");
	}
}