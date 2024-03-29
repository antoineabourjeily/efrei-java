package efrei.td6.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.abstracts.DAOImpl;
import efrei.td6.models.Book;

public class Books extends DAOImpl<Book> {
	
	private static final Books instance = new Books();
	
	public static Books getInstance() {
		return instance;
	}
	
	
	private Books() {
		super("Books");
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
	public boolean add(Book book) {
		String sql = String.format("Insert into %s(title, author, synopsis) values(?,?,?)", tableName);
		try {
			PreparedStatement preparedStatement = this.DB_CONN.createPreparedStatement(sql);
			preparedStatement.setString(1, book.getTitle());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getSynopsis());
			preparedStatement.execute();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(int id, Book book) {
		String sql = String.format("UPDATE %s SET Title=?, Author=?, Synopsis=?) Where Id = ?", tableName);
		try {
			PreparedStatement preparedStatement = this.DB_CONN.createPreparedStatement(sql);
			preparedStatement.setString(1, book.getTitle());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getSynopsis());
			preparedStatement.setInt(4, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}


}
