package efrei.td6;

import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.repositories.Users;

public class TD6 {

	public static void main(String[] args) {
		DbConnection db = new DbConnection();
		db.initConnection();
		try {
			ResultSet set = db.executeQuery("SELECT * from USERS");
			while (set.next()) {
				int id = set.getInt("Id");
				String name = set.getString("Name");
				String lastName = set.getString("LastName");
				System.out.println(new User(id, name, lastName));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		Users users = new Users(db);
//		for (User user : users.list()) {
//			System.out.println(user);
//		}
	}

}
