package org.sfsteam.ram.schema.timer.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.common.Dao;
import org.sfsteam.ram.schema.timer.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("timerDao")
public class TimerDaoImpl implements Dao<Timer> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Timer timer) {
		sessionFactory.getCurrentSession().save(timer);
	}

	@Override
	public void update(Timer timer) {
		sessionFactory.getCurrentSession().update(timer);
	}

	@Override
	public void delete(Timer timer) {
		sessionFactory.getCurrentSession().delete(timer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Timer findById(Long id) {
		List<Timer> list = sessionFactory.getCurrentSession().createQuery("from t_timer where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Timer> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_timer").list();
	}

}
