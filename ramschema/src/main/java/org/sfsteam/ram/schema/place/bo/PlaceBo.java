package org.sfsteam.ram.schema.place.bo;

import org.sfsteam.ram.schema.place.model.Place;

public interface PlaceBo {
	void save(Place place);
	void update(Place place);
	void delete(Place place);

}
