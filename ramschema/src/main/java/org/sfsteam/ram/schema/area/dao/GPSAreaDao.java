package org.sfsteam.ram.schema.area.dao;

import org.sfsteam.ram.schema.area.model.GPSArea;

public interface GPSAreaDao {
	void save(GPSArea gps);
	void update(GPSArea gps);
	void delete(GPSArea gps);

}
