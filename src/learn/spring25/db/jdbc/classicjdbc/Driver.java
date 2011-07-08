package learn.spring25.db.jdbc.classicjdbc;

public class Driver {
	public static void main(String[] args) {
		DocumentDaoImpl dao = new DocumentDaoImpl();
		System.out.println(dao.getAllDocuments());
	}
}