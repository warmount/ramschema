package org.sfsteam.ram.schema.note.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.common.Dao;
import org.sfsteam.ram.schema.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("noteDao")
public class NoteDaoImpl implements Dao<Note> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Note note) {
		sessionFactory.getCurrentSession().save(note);
	}

	@Override
	public void update(Note note) {
		sessionFactory.getCurrentSession().update(note);
	}

	@Override
	public void delete(Note note) {
		sessionFactory.getCurrentSession().delete(note);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Note findById(Long id) {
		List<Note> list = sessionFactory.getCurrentSession().createQuery("from t_note where id=:id").setLong("id", id).list();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from t_note").list();
	}

}
