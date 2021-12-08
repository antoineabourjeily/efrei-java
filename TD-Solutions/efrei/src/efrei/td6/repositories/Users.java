package efrei.td6.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import efrei.td6.DbConnection;
import efrei.td6.abstracts.DAOImpl;
import efrei.td6.models.User;

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

	@Override
	public boolean add(User user) {
		String sql = String.format("Insert into %s(Name, LastName) values(?,?)", tableName);
		try {
			PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.execute();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(int id, User user) {
		String sql = String.format("UPDATE %s SET Name = ?, LastName=? Where Id = ?", tableName);
		try {
			PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setInt(3, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
