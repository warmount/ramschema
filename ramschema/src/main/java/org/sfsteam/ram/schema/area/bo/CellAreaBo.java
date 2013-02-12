package org.sfsteam.ram.schema.area.bo;

import org.sfsteam.ram.schema.area.model.CellArea;

public interface CellAreaBo {
	void save(CellArea cell);
	void update(CellArea cell);
	void delete(CellArea cell);
}
