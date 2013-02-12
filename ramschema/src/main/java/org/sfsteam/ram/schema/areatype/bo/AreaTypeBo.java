package org.sfsteam.ram.schema.areatype.bo;

import org.sfsteam.ram.schema.areatype.model.AreaType;

public interface AreaTypeBo {
	void save(AreaType at);
	void update(AreaType at);
	void delete(AreaType at);

}
