package org.sfsteam.ram.schema.area.dao;

import org.sfsteam.ram.schema.area.model.CellArea;

public interface CellAreaDao {
	void save(CellArea cell);
	void update(CellArea cell);
	void delete(CellArea cell);
}
