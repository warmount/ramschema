package org.sfsteam.ram.schema.areatype.dao;

import org.sfsteam.ram.schema.areatype.model.AreaType;

public interface AreaTypeDao {
	void save(AreaType at);
	void update(AreaType at);
	void delete(AreaType at);
}
