package org.sfsteam.ram.schema.common;

import java.util.List;

public interface Dao<T> {
	void save(T odj);
	void update(T obj);
	void delete(T obj);
	T findById(Long id);
	List<T> findAll();

}
