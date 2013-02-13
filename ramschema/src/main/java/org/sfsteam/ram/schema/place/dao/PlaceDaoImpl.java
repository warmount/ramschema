package org.sfsteam.ram.schema.place.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.common.Dao;
import org.sfsteam.ram.schema.place.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("placeDao")
public class PlaceDaoImpl implements Dao<Place> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Place place) {
		sessionFactory.getCurrentSession().save(place);
	}

	@Override
	public void update(Place place) {
		sessionFactory.getCurrentSession().update(place);
	}

	@Override
	public void delete(Place place) {
		sessionFactory.getCurrentSession().delete(place);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Place findById(Long id) {
		List<Place> list = sessionFactory.getCurrentSession().createQuery("from t_place where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Place> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_place").list();
	}

}
