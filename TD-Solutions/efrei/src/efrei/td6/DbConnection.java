package efrei.td6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private Connection conn = null;

	public void initConnection() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
//		}

		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/lms?user=root&password=password&allowPublicKeyRetrieval=true&useSSL=false");
			System.out.println("Connection successful");
		
		} catch (SQLException e) {
			System.out.printf("SQLException: %s \nSQLState: %s\nVendor Error: %s\n", e.getMessage(), e.getSQLState(),
					e.getErrorCode());
		}
	}
}
