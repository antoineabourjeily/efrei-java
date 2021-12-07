package efrei.td6.abstracts;

import java.util.ArrayList;

public interface DAO<TEntity> {
	/*
	 * CRUD
	 * CREATE (ADD)
	 * RETRIEVE (GET)
	 * UPDATE (UPDATE)
	 * DELETE (REMOVE)
	 */
	
	void add(TEntity e);
	TEntity getById(int id);
	ArrayList<TEntity> list();
	void update(int id, TEntity e);
	void remove(int id);
}
