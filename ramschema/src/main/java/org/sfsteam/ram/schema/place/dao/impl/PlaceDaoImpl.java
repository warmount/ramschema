package org.sfsteam.ram.schema.place.dao.impl;

import org.sfsteam.ram.schema.place.dao.PlaceDao;
import org.sfsteam.ram.schema.place.model.Place;
import org.sfsteam.ram.schema.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("placeDao")
public class PlaceDaoImpl extends CustomHibernateDaoSupport implements PlaceDao {

	public void save(Place place) {
		getHibernateTemplate().save(place);
	}

	public void update(Place place) {
		getHibernateTemplate().update(place);
	}

	public void delete(Place place) {
		getHibernateTemplate().delete(place);
	}

}
