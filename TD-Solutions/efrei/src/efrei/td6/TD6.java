package efrei.td6;

import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.models.Book;
import efrei.td6.models.User;
import efrei.td6.repositories.Books;
import efrei.td6.repositories.Users;

public class TD6 {

	public static void main(String[] args) {
		DbConnection db = new DbConnection();
		db.initConnection();
//		try {
//			ResultSet set = db.executeQuery("SELECT * from USERS");
//			while (set.next()) {
//				int id = set.getInt("Id");
//				String name = set.getString("Name");
//				String lastName = set.getString("LastName");
//				System.out.println(new User(id, name, lastName));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		System.out.println("Users");
		Users users = new Users(db);
		for (User user : users.list()) {
			System.out.println(user);
		}
		System.out.println("Books");
		Books books = new Books(db);
		for (Book book : books.list()) {
			System.out.println(book);
		}
	}

}
