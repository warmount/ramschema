package org.sfsteam.ram.schema.area.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.area.dao.WFAreaDao;
import org.sfsteam.ram.schema.area.model.WFArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("wfAreaDao")
public class WFAreaDaoImpl implements WFAreaDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(WFArea wf) {
		sessionFactory.getCurrentSession().save(wf);
	}

	public void update(WFArea wf) {
		sessionFactory.getCurrentSession().update(wf);
	}

	public void delete(WFArea wf) {
		sessionFactory.getCurrentSession().delete(wf);
	}

}
