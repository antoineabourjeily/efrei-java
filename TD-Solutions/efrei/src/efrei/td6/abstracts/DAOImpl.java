package efrei.td6.abstracts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import efrei.td6.DbConnection;

public abstract class DAOImpl<TEntity> implements DAO<TEntity> {
	private final DbConnection conn;
	private final String tableName;

	public DAOImpl(DbConnection conn, String tableName) {
		this.conn = conn;
		this.tableName = tableName;
	}
	
	protected abstract TEntity fromResultSet(ResultSet set) throws SQLException;

	@Override
	public void add(TEntity e) {
		// TODO Auto-generated method stub

	}

	@Override
	public TEntity getById(int id) {

		return null;
	}

	@Override
	public ArrayList<TEntity> list() {
		ArrayList<TEntity> result = new ArrayList<>(); 
		try {
			ResultSet resultset = conn.executeQuery(String.format("SELECT * FROM %s", tableName));
			while(resultset.next()) {
				result.add(this.fromResultSet(resultset));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update(int id, TEntity e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub

	}

}
