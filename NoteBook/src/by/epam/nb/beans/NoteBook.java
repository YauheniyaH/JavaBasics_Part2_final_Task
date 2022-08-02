package by.epam.nb.beans;

import java.util.ArrayList;
import java.util.List;





public class NoteBook {
	private List<Note> notes;

	public NoteBook() {
		notes = new ArrayList<Note>();
	}

	public Note getNote(int i) {
		return notes.get(i);
	}
	
	public void add(Note note) {
		notes.add(note);
	}

	public void add(String noteContent) {
		notes.add(new Note(noteContent));
	}
	public int size() {
		return notes.size();
	}

	public List<Note> getNotes() {
		return notes;
	}
	
	public boolean deleteNote (Note note) {
		return this.getNotes().remove(note);
	}
	


	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}
	
	

}
