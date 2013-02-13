package org.sfsteam.ram.schema.area.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.model.GPSArea;
import org.sfsteam.ram.schema.common.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("gpsAreaDao")
public class GPSAreaDaoImpl implements Dao<GPSArea> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(GPSArea gps) {
		sessionFactory.getCurrentSession().save(gps);
	}

	@Override
	public void update(GPSArea gps) {
		sessionFactory.getCurrentSession().update(gps);
	}

	@Override
	public void delete(GPSArea gps) {
		sessionFactory.getCurrentSession().delete(gps);
	}

	@SuppressWarnings("unchecked")
	@Override
	public GPSArea findById(Long id) {
		List<GPSArea> list = sessionFactory.getCurrentSession().createQuery("from t_gpsarea where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GPSArea> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_gpsarea").list();
	}

}
