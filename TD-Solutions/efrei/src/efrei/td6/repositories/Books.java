package efrei.td6.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.DbConnection;
import efrei.td6.abstracts.DAOImpl;
import efrei.td6.models.Book;

public class Books extends DAOImpl<Book> {

	public Books(DbConnection conn) {
		super(conn, "Books");
	}

	@Override
	protected Book fromResultSet(ResultSet set) throws SQLException {
		int id = set.getInt("id");
		String title = set.getString("title");
		String author = set.getString("author");
		String synopsis = set.getString("synopsis");
		return new Book(id, title, author, synopsis);
	}

}
