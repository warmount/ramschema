package org.sfsteam.ram.schema.place.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.place.dao.PlaceDao;
import org.sfsteam.ram.schema.place.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("placeDao")
public class PlaceDaoImpl implements PlaceDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Place place) {
		sessionFactory.getCurrentSession().save(place);
	}

	public void update(Place place) {
		sessionFactory.getCurrentSession().update(place);
	}

	public void delete(Place place) {
		sessionFactory.getCurrentSession().delete(place);
	}

}
