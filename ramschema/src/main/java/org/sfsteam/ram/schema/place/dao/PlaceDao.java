package org.sfsteam.ram.schema.place.dao;

import org.sfsteam.ram.schema.place.model.Place;

public interface PlaceDao {
	void save(Place place);
	void update(Place place);
	void delete(Place place);
}
