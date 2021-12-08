package efrei.td6.abstracts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import efrei.td6.DbConnection;

public abstract class DAOImpl<TEntity> implements DAO<TEntity> {
	protected final DbConnection conn;
	protected final String tableName;

	public DAOImpl(DbConnection conn, String tableName) {
		this.conn = conn;
		this.tableName = tableName;
	}

	protected abstract TEntity fromResultSet(ResultSet set) throws SQLException;

	public abstract boolean add(TEntity e);
	public abstract boolean update(int id, TEntity e);

	@Override
	public TEntity getById(int id) {
		try {
			ResultSet resultset = conn.executeQuery(String.format("SELECT * FROM %s WHERE ID = %d", tableName, id));
			if (resultset.next()) {
				return fromResultSet(resultset);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<TEntity> list() {
		ArrayList<TEntity> result = new ArrayList<>();
		try {
			ResultSet resultset = conn.executeQuery(String.format("SELECT * FROM %s", tableName));
			while (resultset.next()) {
				result.add(this.fromResultSet(resultset));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean remove(int id) {
		return false;
	}

}
