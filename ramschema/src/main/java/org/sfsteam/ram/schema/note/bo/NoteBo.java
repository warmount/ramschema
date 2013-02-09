package org.sfsteam.ram.schema.note.bo;

import org.sfsteam.ram.schema.note.model.Note;

public interface NoteBo {
	void save(Note note);
	void update(Note note);
	void delete(Note note);

}
