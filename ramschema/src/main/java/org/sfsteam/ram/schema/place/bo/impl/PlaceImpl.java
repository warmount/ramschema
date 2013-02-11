package org.sfsteam.ram.schema.place.bo.impl;

import org.sfsteam.ram.schema.place.bo.PlaceBo;
import org.sfsteam.ram.schema.place.dao.PlaceDao;
import org.sfsteam.ram.schema.place.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("placeBo")
public class PlaceImpl implements PlaceBo {
	
	@Autowired
	PlaceDao placeDao;

	public void save(Place place) {
		placeDao.save(place);
	}

	public void update(Place place) {
		placeDao.update(place);
	}

	public void delete(Place place) {
		placeDao.delete(place);
	}
}
