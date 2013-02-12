package org.sfsteam.ram.schema.area.bo.impl;

import org.sfsteam.ram.schema.area.bo.CellAreaBo;
import org.sfsteam.ram.schema.area.dao.CellAreaDao;
import org.sfsteam.ram.schema.area.model.CellArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cellAreaBo")
public class CellAreaImpl implements CellAreaBo {

	@Autowired
	CellAreaDao cellAreaDao;

	public void save(CellArea cell) {
		cellAreaDao.save(cell);
	}

	public void update(CellArea cell) {
		cellAreaDao.update(cell);
	}

	public void delete(CellArea cell) {
		cellAreaDao.update(cell);
	}

}
