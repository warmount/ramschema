package org.sfsteam.ram.schema.area.bo;

import org.sfsteam.ram.schema.area.model.GPSArea;

public interface GPSAreaBo {
	void save(GPSArea gps);
	void update(GPSArea gps);
	void delete(GPSArea gps);

}
