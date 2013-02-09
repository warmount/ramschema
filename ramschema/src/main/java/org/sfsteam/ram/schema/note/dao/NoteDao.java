package org.sfsteam.ram.schema.note.dao;

import org.sfsteam.ram.schema.note.model.Note;

public interface NoteDao {
	void save(Note note);
	void update(Note note);
	void delete(Note note);

}
