package learn.spring25.db.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import learn.spring25.Document;
import learn.spring25.DocumentDao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DocumentDaoImpl extends JdbcDaoSupport implements DocumentDao {
	public List<Document> getAllDocuments() {
		return (List<Document>) getJdbcTemplate().query("SELECT * FROM documents", new RowMapper () {
			public Object mapRow(ResultSet rs, int count) throws SQLException {
				Document d = new Document();
				d.setName(rs.getString("name"));
				return d;
			} });
	}
}