package efrei.td6.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.abstracts.DAOImpl;
import efrei.td6.models.Book;
import efrei.td6.models.Loan;
import efrei.td6.models.User;

public class Loans extends DAOImpl<Loan> {

	public Loans() {
		super("loans");
	}

	@Override
	protected Loan fromResultSet(ResultSet set) throws SQLException {
		int bookId = set.getInt("book_id");
		Book book = Books.getInstance().getById(bookId);
		int userId = set.getInt("user_id");
		User user = Users.getInstance().getById(userId);
		return new Loan(book, user);
	}

	@Override
	public boolean add(Loan e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int id, Loan e) {
		// TODO Auto-generated method stub
		return false;
	}

}
