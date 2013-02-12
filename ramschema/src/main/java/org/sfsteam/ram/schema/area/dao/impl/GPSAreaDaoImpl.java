package org.sfsteam.ram.schema.area.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.dao.GPSAreaDao;
import org.sfsteam.ram.schema.area.model.GPSArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("gpsAreaDao")
public class GPSAreaDaoImpl implements GPSAreaDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(GPSArea gps) {
		sessionFactory.getCurrentSession().save(gps);
	}

	public void update(GPSArea gps) {
		sessionFactory.getCurrentSession().update(gps);
	}

	public void delete(GPSArea gps) {
		sessionFactory.getCurrentSession().delete(gps);
	}

}
