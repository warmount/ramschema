package org.sfsteam.ram.schema.areatype.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.areatype.model.AreaType;
import org.sfsteam.ram.schema.common.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("areaTypeDao")
public class AreaTypeDaoImpl implements Dao<AreaType> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(AreaType at) {
		sessionFactory.getCurrentSession().save(at);
	}

	@Override
	public void update(AreaType at) {
		sessionFactory.getCurrentSession().update(at);
	}

	@Override
	public void delete(AreaType at) {
		sessionFactory.getCurrentSession().delete(at);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AreaType findById(Long id) {
		List<AreaType> list = sessionFactory.getCurrentSession().createQuery("from t_areatype where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AreaType> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_areatype").list();
	}

}
