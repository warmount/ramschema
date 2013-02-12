package org.sfsteam.ram.schema.area.bo.impl;

import org.sfsteam.ram.schema.area.bo.GPSAreaBo;
import org.sfsteam.ram.schema.area.dao.GPSAreaDao;
import org.sfsteam.ram.schema.area.model.GPSArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gpsAreaBo")
public class GPSAreaImpl implements GPSAreaBo {

	@Autowired
	GPSAreaDao gpsAreaDao;

	public void save(GPSArea gps) {
		gpsAreaDao.save(gps);
	}

	public void update(GPSArea gps) {
		gpsAreaDao.update(gps);
	}

	public void delete(GPSArea gps) {
		gpsAreaDao.update(gps);
	}

}
