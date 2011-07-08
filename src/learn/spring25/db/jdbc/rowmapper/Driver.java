package learn.spring25.db.jdbc.rowmapper;

import learn.spring25.DocumentDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"learn/spring25/db/rowmapper/dbRowMapper-AppContext.xml");

		DocumentDao dao = (DocumentDao) ctx.getBean("documentDao");
		
		System.out.println(dao.getAllDocuments());
	}
}