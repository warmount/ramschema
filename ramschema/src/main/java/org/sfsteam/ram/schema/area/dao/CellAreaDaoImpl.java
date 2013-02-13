package org.sfsteam.ram.schema.area.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.model.CellArea;
import org.sfsteam.ram.schema.common.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cellAreaDao")
public class CellAreaDaoImpl implements Dao<CellArea> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(CellArea cell) {
		sessionFactory.getCurrentSession().save(cell);
	}

	@Override
	public void update(CellArea cell) {
		sessionFactory.getCurrentSession().update(cell);
	}

	@Override
	public void delete(CellArea cell) {
		sessionFactory.getCurrentSession().delete(cell);
	}

	@SuppressWarnings("unchecked")
	@Override
	public CellArea findById(Long id) {
		List<CellArea> list = sessionFactory.getCurrentSession().createQuery("from t_cellarea where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CellArea> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_cellarea").list();
	}

}
