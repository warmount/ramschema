package org.sfsteam.ram.schema.area.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.model.WFArea;
import org.sfsteam.ram.schema.common.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("wfAreaDao")
public class WFAreaDaoImpl implements Dao<WFArea> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(WFArea wf) {
		sessionFactory.getCurrentSession().save(wf);
	}

	@Override
	public void update(WFArea wf) {
		sessionFactory.getCurrentSession().update(wf);
	}

	@Override
	public void delete(WFArea wf) {
		sessionFactory.getCurrentSession().delete(wf);
	}

	@SuppressWarnings("unchecked")
	@Override
	public WFArea findById(Long id) {
		List<WFArea> list = sessionFactory.getCurrentSession().createQuery("from t_wfarea where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WFArea> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_wfarea").list();
	}

}
