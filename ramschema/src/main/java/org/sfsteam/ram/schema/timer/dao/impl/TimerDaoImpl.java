package org.sfsteam.ram.schema.timer.dao.impl;

import org.sfsteam.ram.schema.timer.dao.TimerDao;
import org.sfsteam.ram.schema.timer.model.Timer;
import org.sfsteam.ram.schema.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("timerDao")
public class TimerDaoImpl extends CustomHibernateDaoSupport implements TimerDao {

	public void save(Timer timer) {
		getHibernateTemplate().save(timer);
	}

	public void update(Timer timer) {
		getHibernateTemplate().update(timer);
	}

	public void delete(Timer timer) {
		getHibernateTemplate().delete(timer);
	}

}
