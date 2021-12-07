package efrei.td6.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.DbConnection;
import efrei.td6.User;
import efrei.td6.abstracts.DAOImpl;

public class Users extends DAOImpl<User> {

	public Users(DbConnection conn) {
		super(conn, "Users");
	}

	@Override
	protected User fromResultSet(ResultSet set) throws SQLException {
		int id = set.getInt("Id");
		String name = set.getString("Name");
		String lastName = set.getString("LastName");
		return new User(id, name, lastName);
	}

}
