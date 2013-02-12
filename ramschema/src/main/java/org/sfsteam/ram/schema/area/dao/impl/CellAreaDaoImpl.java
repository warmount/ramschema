package org.sfsteam.ram.schema.area.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.dao.CellAreaDao;
import org.sfsteam.ram.schema.area.model.CellArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cellAreaDao")
public class CellAreaDaoImpl implements CellAreaDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(CellArea cell) {
		sessionFactory.getCurrentSession().save(cell);
	}

	public void update(CellArea cell) {
		sessionFactory.getCurrentSession().update(cell);
	}

	public void delete(CellArea cell) {
		sessionFactory.getCurrentSession().delete(cell);
	}

}
