package learn.spring25.db.jdbc.classicjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import learn.spring25.Document;
import learn.spring25.DocumentDao;

public class DocumentDaoImpl implements DocumentDao {
	
	public List<Document> getAllDocuments() {
		List<Document> documents = new ArrayList<Document>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/springcert";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("[OUTPUT FROM SELECT]");
		String query = "SELECT * FROM documents";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				documents.add(new Document(rs.getString("name")));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return documents;
	}
}