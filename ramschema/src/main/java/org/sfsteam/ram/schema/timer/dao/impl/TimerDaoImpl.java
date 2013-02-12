package org.sfsteam.ram.schema.timer.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.timer.dao.TimerDao;
import org.sfsteam.ram.schema.timer.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("timerDao")
public class TimerDaoImpl implements TimerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Timer timer) {
		sessionFactory.getCurrentSession().save(timer);
	}

	public void update(Timer timer) {
		sessionFactory.getCurrentSession().update(timer);
	}

	public void delete(Timer timer) {
		sessionFactory.getCurrentSession().delete(timer);
	}

}
