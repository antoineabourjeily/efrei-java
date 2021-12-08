package efrei.td6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import efrei.td6.models.Book;
import efrei.td6.models.User;
import efrei.td6.repositories.Books;
import efrei.td6.repositories.Users;

public class TD6 {
	private static Scanner sc = new Scanner(System.in);

	public static void printSeparator() {
		System.out.printf("\n------------------\n");
	}

	public static int scanIdFor(String entity) {
		printSeparator();
		System.out.printf("Search %s by Id:\n", entity);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		DbConnection db = new DbConnection();
		db.initConnection();
		printSeparator();
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
		printSeparator();
		System.out.println("Books");
		Books books = new Books(db);
		for (Book book : books.list()) {
			System.out.println(book);
		}
		printSeparator();
		int userId = scanIdFor("User");
		User user = users.getById(userId);

		if (user == null) {
			System.out.printf("Non existing User with id %d\n", userId);
		} else {
			System.out.println(user);
		}

		printSeparator();

		int bookId = scanIdFor("Book");
		Book book = books.getById(bookId);

		if (book == null) {
			System.out.printf("Non existing Book with id %d\n", bookId);
		} else {
			System.out.println(book);
		}
	}

}
