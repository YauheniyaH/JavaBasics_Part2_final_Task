package by.epam.nb.view;

import java.util.List;

import by.epam.nb.beans.Note;
import by.epam.nb.beans.NoteBook;

public class PrintNoteView {
	public void print(List<Note> notes) {
		if (notes.size() == 0) {
			System.out.println("no notes");
		} else {
			for (int i = 0; i < notes.size(); i++) {
				System.out.println("note " + i + " " + notes.get(i));
			}
			System.out.println("------------------------------------");
			return;
		}
	}

	public void print(Note note) {
		System.out.println(note.toString());
		return;
	}

	public void print(NoteBook nb) {
		for (int i = 0; i < nb.size(); i++) {
			System.out.println("note " + i + " " + nb.getNote(i).toString());
		}
		System.out.println("------------------------------------");
		return;
	}

}
