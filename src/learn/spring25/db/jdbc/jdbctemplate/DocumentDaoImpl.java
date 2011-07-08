package learn.spring25.db.jdbc.jdbctemplate;

import java.util.List;

import learn.spring25.Document;
import learn.spring25.DocumentDao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DocumentDaoImpl extends JdbcDaoSupport implements DocumentDao {
	public List<Document> getAllDocuments() {
		return (List<Document>) getJdbcTemplate().queryForList("SELECT * FROM documents");
	}
}