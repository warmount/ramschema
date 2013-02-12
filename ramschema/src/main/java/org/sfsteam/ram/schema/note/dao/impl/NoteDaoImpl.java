package org.sfsteam.ram.schema.note.dao.impl;

import org.hibernate.SessionFactory;
import org.sfsteam.ram.schema.note.dao.NoteDao;
import org.sfsteam.ram.schema.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("noteDao")
public class NoteDaoImpl implements NoteDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Note note) {
		sessionFactory.getCurrentSession().save(note);
	}

	public void update(Note note) {
		sessionFactory.getCurrentSession().update(note);
	}

	public void delete(Note note) {
		sessionFactory.getCurrentSession().delete(note);
	}

}
