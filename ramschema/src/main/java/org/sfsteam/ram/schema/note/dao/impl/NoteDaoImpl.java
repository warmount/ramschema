package org.sfsteam.ram.schema.note.dao.impl;

import org.sfsteam.ram.schema.note.dao.NoteDao;
import org.sfsteam.ram.schema.note.model.Note;
import org.sfsteam.ram.schema.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("noteDao")
public class NoteDaoImpl extends CustomHibernateDaoSupport implements NoteDao {

	public void save(Note note) {
		getHibernateTemplate().save(note);
	}

	public void update(Note note) {
		getHibernateTemplate().update(note);
	}

	public void delete(Note note) {
		getHibernateTemplate().delete(note);
	}

}
