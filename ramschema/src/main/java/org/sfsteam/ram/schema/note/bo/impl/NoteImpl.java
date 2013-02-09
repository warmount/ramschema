package org.sfsteam.ram.schema.note.bo.impl;

import org.sfsteam.ram.schema.note.bo.NoteBo;
import org.sfsteam.ram.schema.note.dao.NoteDao;
import org.sfsteam.ram.schema.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("noteBo")
public class NoteImpl implements NoteBo {
	
	@Autowired
	NoteDao noteDao;

	public void save(Note note) {
		noteDao.save(note);
	}

	public void update(Note note) {
		noteDao.update(note);
	}

	public void delete(Note note) {
		noteDao.delete(note);
	}

}
