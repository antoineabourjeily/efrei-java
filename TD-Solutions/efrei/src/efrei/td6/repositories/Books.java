package efrei.td6.repositories;

import java.sql.PreparedStatement;
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

	@Override
	public boolean add(Book b) {
		String sql = String.format("Insert into %s(title, author, synopsis) values(?,?,?)", tableName);
		try {
			PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
			preparedStatement.setString(1, b.getTitle());
			preparedStatement.setString(2, b.getAuthor());
			preparedStatement.setString(3, b.getSynopsis());
			preparedStatement.execute();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(int id, Book e) {
		return false;
	}

}
