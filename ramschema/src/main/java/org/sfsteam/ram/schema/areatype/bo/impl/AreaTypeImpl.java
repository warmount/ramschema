package org.sfsteam.ram.schema.areatype.bo.impl;

import org.sfsteam.ram.schema.areatype.bo.AreaTypeBo;
import org.sfsteam.ram.schema.areatype.dao.AreaTypeDao;
import org.sfsteam.ram.schema.areatype.model.AreaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("areaTypeBo")
public class AreaTypeImpl implements AreaTypeBo {
	
	@Autowired
	AreaTypeDao atDao;

	public void save(AreaType at) {
		atDao.save(at);
	}

	public void update(AreaType at) {
		atDao.update(at);
	}

	public void delete(AreaType at) {
		atDao.delete(at);
	}
}
