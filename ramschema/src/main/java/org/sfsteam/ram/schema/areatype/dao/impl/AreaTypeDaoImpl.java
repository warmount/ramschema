package org.sfsteam.ram.schema.areatype.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.areatype.dao.AreaTypeDao;
import org.sfsteam.ram.schema.areatype.model.AreaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("areaTypeDao")
public class AreaTypeDaoImpl implements AreaTypeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(AreaType at) {
		sessionFactory.getCurrentSession().save(at);
	}

	public void update(AreaType at) {
		sessionFactory.getCurrentSession().update(at);
	}

	public void delete(AreaType at) {
		sessionFactory.getCurrentSession().delete(at);
	}

}
